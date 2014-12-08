package vo;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;

import utility.MyTreeNode;


public class GoodsSortVO extends MyTreeNode {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<GoodsSortVO> children;
	MyTreeNode parent;
	MyTreeNode oldParent;
	String name;
	boolean allowsChildren;
	
	public GoodsSortVO(String name) throws RemoteException {
		super(name);
		this.name = name;
		children = new ArrayList<GoodsSortVO>();
		allowsChildren = true;
	}

	public void addChild(MyTreeNode child) {
		children.add((GoodsSortVO) child);
		((GoodsSortVO) child).setParent(this);
	}

	public GoodsSortVO(String name, boolean allowsChildren) throws RemoteException {
		super(name);
		this.name = name;
		children = new ArrayList<GoodsSortVO>();
		this.allowsChildren = allowsChildren;
	}

	public void setObject(Object o) {
		this.name = (String) o;
	}

	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return children.get(childIndex);
	}

	public int getChildCount() {
		// TODO Auto-generated method stub
		if (children == null) {
			return 0;
		} else {
			return children.size();
		}
	}

	public TreeNode getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return children.indexOf(node);
	}

	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return allowsChildren;
	}

	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return children.isEmpty();
	}

	@SuppressWarnings("rawtypes")
	public Enumeration children() {
		// TODO Auto-generated method stub
		return Collections.enumeration(children);
	}

	@Override
	public String toString() {
		return this.name;
	}

	/**
	 * Builds the parents of node up to and including the root node, where the
	 * original node is the last element in the returned array. The length of
	 * the returned array gives the node's depth in the tree.
	 * 
	 * @param aNode
	 *            the TreeNode to get the path for
	 * @param depth
	 *            an int giving the number of steps already taken towards the
	 *            root (on recursive calls), used to size the returned array
	 * @return an array of TreeNodes giving the path from the root to the
	 *         specified node
	 */
	protected TreeNode[] getPathToRoot(TreeNode aNode, int depth) {
		TreeNode[] retNodes;

		/*
		 * Check for null, in case someone passed in a null node, or they passed
		 * in an element that isn't rooted at root.
		 */
		// or we reach the root
		if (aNode == null) {
			if (depth == 0)
				return null;
			else
				retNodes = new TreeNode[depth];
		} else {
			depth++;
			retNodes = getPathToRoot(aNode.getParent(), depth);
			retNodes[retNodes.length - depth] = aNode;
		}
		return retNodes;
	}

	public TreeNode[] getPath() {
		return getPathToRoot(this, 0);
	}

	public void setParent(MyTreeNode newParent) {
		parent = newParent;
	}

	public ArrayList<GoodsSortVO> getChildren() {
		return children;
	}

	public boolean remove(MyTreeNode node) {
		return children.remove(node);
	}

	public void insert(MyTreeNode newChild, int childIndex) {
		if (!allowsChildren) {
			throw new IllegalStateException("node does not allow children");
		} else if (newChild == null) {
			throw new IllegalArgumentException("new child is null");
		}

		((GoodsSortVO) newChild).oldParent = (MyTreeNode) newChild.getParent();
		/*
		 * if (((GoodsSortVO)newChild).oldParent != null) {
		 * ((GoodsSortVO)newChild).oldParent.remove(newChild); }
		 */
		newChild.setParent(this);
		if (children == null) {
			children = new ArrayList<GoodsSortVO>();
		}
		children.add(childIndex, (GoodsSortVO) newChild);
	}

	public MyTreeNode getOldParent() {
		return oldParent;
	}

	public int getLevel() {
		TreeNode ancestor;
		int levels = 0;

		ancestor = this;
		while ((ancestor = ancestor.getParent()) != null) {
			levels++;
		}

		return levels;
	}

	public boolean isNodeAncestor(TreeNode anotherNode) {
		if (anotherNode == null) {
			return false;
		}

		TreeNode ancestor = this;

		do {
			if (ancestor == anotherNode) {
				return true;
			}
		} while ((ancestor = ancestor.getParent()) != null);

		return false;
	}

}
