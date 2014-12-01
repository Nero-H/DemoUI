package utility;

import demoui.stockui.GoodsManageUI;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComponent;
import javax.swing.JTree;
import javax.swing.TransferHandler;
import javax.swing.tree.TreePath;
import server.ClientStart;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrasion
 */
public class TreeTransferHandler extends TransferHandler {
	DataFlavor nodesFlavor;
	DataFlavor[] flavors = new DataFlavor[1];
	MyTreeNode[] nodesToRemove;
	public TreeTransferHandler() {
		try {
			String mimeType = DataFlavor.javaJVMLocalObjectMimeType
					+ ";class=\"" + MyTreeNode.class.getName() + "\"";
			nodesFlavor = new DataFlavor(mimeType);
			flavors[0] = nodesFlavor;
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound: " + e.getMessage());
		}
	}

	public boolean canImport(TransferHandler.TransferSupport support) {
		if (!support.isDrop()) {
			return false;
		}
		support.setShowDropLocation(true);// 无论此时能否拖拽成功都显示拖拽目标位置
		if (!support.isDataFlavorSupported(nodesFlavor)) {
			return false;
		}
		
		int action = support.getDropAction();
		if (action != MOVE) {
			return false;
		}

			
		JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
		JTree tree = (JTree) support.getComponent();
		
		//选中节点之间有一个节点存在于另一个节点的子树中 不许拖拽
		if(bloodConnect(tree)){
			return false;
		}
		
		int dropRow = tree.getRowForPath(dl.getPath());

	
		TreePath thisNodePath = tree.getSelectionPath();
		MyTreeNode thisNode = (MyTreeNode)thisNodePath.getLastPathComponent();
		
		TreePath dropNodePah = tree.getPathForRow(dropRow);
                if(dropNodePah == null){
                    return true;
                }
                MyTreeNode dropNode = (MyTreeNode) dropNodePah.getLastPathComponent();

		// 选中的节点是有商品分类节点也有商品节点 不许拖拽
		if(hasBothNodeTypeOrDropNodeIsChild(tree, dropNode)){
			return false;
		}
		
		//不能拖到原父节点下
		if(dropNode.getIndex(thisNode) != -1){
			return false;
		}
		
		// 只有叶节点才能添加商品,已有商品子节点的父节点不能添加商品分类
		if ((!dropNode.getAllowsChildren()) || (dropNode.getChildCount() != 0 && (dropNode.getChildAt(0).getAllowsChildren() != thisNode.getAllowsChildren()))) {
			return false;
		}
		
		
		return true;
	}

	private boolean hasBothNodeTypeOrDropNodeIsChild(JTree tree,MyTreeNode dropNode) {
		int[] selRows = tree.getSelectionRows();
		
		TreePath path = tree.getPathForRow(selRows[0]);
		boolean type = ((MyTreeNode) path.getLastPathComponent()).getAllowsChildren();
		for (int i = 0; i < selRows.length; i++) {
			path = tree.getPathForRow(selRows[i]);
			MyTreeNode node = (MyTreeNode) path.getLastPathComponent();
			if((node.getAllowsChildren() != type)||(dropNode.isNodeAncestor(node))){
				return true;
			}
		}
		
		return false;
	}

	private boolean bloodConnect(JTree tree) {
        int[] selRows = tree.getSelectionRows();
        MyTreeNode[] nodeList = new MyTreeNode[selRows.length];
        for(int i = 0 ; i < selRows.length ; i ++){
	        TreePath path = tree.getPathForRow(selRows[i]);
        	nodeList[i] =  (MyTreeNode)path.getLastPathComponent();
        }
        for(int i = 0 ; i < selRows.length ; i ++){
        	for(int j = i + 1 ; j < selRows.length ; j ++){
        		if((nodeList[i].isNodeAncestor(nodeList[j]))||(nodeList[j].isNodeAncestor(nodeList[i]))){
        			return true;
        		}
        	}
        }
        return false;
    }

	
	@Override
	protected Transferable createTransferable(JComponent c) {
		JTree tree = (JTree) c;
		TreePath[] paths = tree.getSelectionPaths();
		if (paths != null) {
			// Make up a node array of copies for transfer and
			// another for/of the nodes that will be removed in
			// exportDone after a successful drop.
			MyTreeNode[] nodes = new MyTreeNode[paths.length];
			for (int i = 0; i < paths.length; i++) {
				MyTreeNode node = (MyTreeNode) paths[i].getLastPathComponent();
				nodes[i] = node;
				
			}
			nodesToRemove = nodes;
			return new NodesTransferable(nodes);
		}
		return null;
	}

	protected void exportDone(JComponent source, Transferable data, int action) {
		if ((action & MOVE) == MOVE) {
			JTree tree = (JTree) source;
			MyTreeModel model = (MyTreeModel) tree.getModel();
			// Remove nodes saved in nodesToRemove in createTransferable.
			for (int i = 0; i < nodesToRemove.length; i++) {
				model.removeNodeFromExparent(nodesToRemove[i]);
				((MyTreeNode)nodesToRemove[i].getParent()).sort();
				model.nodeStructureChanged((MyTreeNode)nodesToRemove[i].getParent());
			}
                    try {
                        ClientStart.getGoodsManageBLService().setRoot(GoodsManageUI.root);
                    } catch (RemoteException ex) {
                        Logger.getLogger(TreeTransferHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

	}

	public int getSourceActions(JComponent c) {
		return COPY_OR_MOVE;
	}

	public boolean importData(TransferHandler.TransferSupport support) {
		if (!canImport(support)) {
			return false;
		}
		// Extract transfer data.
		MyTreeNode[] nodes = null;
		try {
			Transferable t = support.getTransferable();
			nodes = (MyTreeNode[]) t.getTransferData(nodesFlavor);
		} catch (UnsupportedFlavorException ufe) {
			System.out.println("UnsupportedFlavor: " + ufe.getMessage());
		} catch (java.io.IOException ioe) {
			System.out.println("I/O error: " + ioe.getMessage());
		}
		// Get drop location info.
		JTree.DropLocation dl = (JTree.DropLocation) support.getDropLocation();
		int childIndex = dl.getChildIndex();
		TreePath dest = dl.getPath();
		MyTreeNode parent = (MyTreeNode) dest.getLastPathComponent();
		JTree tree = (JTree) support.getComponent();
		MyTreeModel model = (MyTreeModel) tree.getModel();
		// Configure for drop mode.
		int index = childIndex; // DropMode.INSERT
		if (childIndex == -1) { // DropMode.ON
			index = parent.getChildCount();
		}
		// Add data to model.
		for (int i = 0; i < nodes.length; i++) {
			model.insertNodeInto(nodes[i], parent, index++);
		}
		return true;
	}

	public String toString() {
		return getClass().getName();
	}

	public class NodesTransferable implements Transferable {
		MyTreeNode[] nodes;

		public NodesTransferable(MyTreeNode[] nodes) {
			this.nodes = nodes;
		}

		public Object getTransferData(DataFlavor flavor)
				throws UnsupportedFlavorException {
			if (!isDataFlavorSupported(flavor))
				throw new UnsupportedFlavorException(flavor);
			return nodes;
		}

		public DataFlavor[] getTransferDataFlavors() {
			return flavors;
		}

		public boolean isDataFlavorSupported(DataFlavor flavor) {
			return nodesFlavor.equals(flavor);
		}
	}
}
