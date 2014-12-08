package utility;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.tree.TreeNode;


public class MyTreeNode implements Serializable,TreeNode,Comparable<MyTreeNode>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3911557590397274204L;
	ArrayList<MyTreeNode> children;
    MyTreeNode parent;
    MyTreeNode oldParent;
    String goodsNumber;
    boolean allowsChildren;
    public MyTreeNode(String goodsNumber){
        this.goodsNumber = goodsNumber;
        children = new ArrayList<MyTreeNode>();
        allowsChildren = true;
    }
    
    public String getGoodsNumber(){
    	return goodsNumber;
    }
    
    public void addChild(MyTreeNode child){
        children.add((MyTreeNode)child);
        ((MyTreeNode)child).setParent(this);
    }
    
    
    public MyTreeNode(String goodsNumber,boolean  allowsChildren){
        this.goodsNumber = goodsNumber;
        children = new ArrayList<MyTreeNode>();
        this.allowsChildren = allowsChildren;
    }
    
    public void setObject(Object o){
        this.goodsNumber = (String)o;
    }
    
    public void setAllowChildren(boolean allowChildren){
        this.allowsChildren = allowChildren;
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
    public String toString(){
        return this.goodsNumber;
    }
    
    /**
     * Builds the parents of node up to and including the root node,
     * where the original node is the last element in the returned array.
     * The length of the returned array gives the node's depth in the
     * tree.
     *
     * @param aNode  the TreeNode to get the path for
     * @param depth  an int giving the number of steps already taken towards
     *        the root (on recursive calls), used to size the returned array
     * @return an array of TreeNodes giving the path from the root to the
     *         specified node
     */
    protected TreeNode[] getPathToRoot(TreeNode aNode, int depth) {
        TreeNode[]              retNodes;
        
        /* Check for null, in case someone passed in a null node, or
        they passed in an element that isn't rooted at root. */
        //or we reach the root
        if(aNode == null) {
            if(depth == 0)
                return null;
            else
                retNodes = new TreeNode[depth];
        }
        else {
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
    
    public boolean remove(MyTreeNode node){
        return children.remove(node);
    }

     public void insert(MyTreeNode newChild, int childIndex) {
        if (!allowsChildren) {
            throw new IllegalStateException("node does not allow children");
        } else if (newChild == null) {
            throw new IllegalArgumentException("new child is null");
        }

        ((MyTreeNode)newChild).oldParent = (MyTreeNode)newChild.getParent();
        /*
            if (((GoodSort)newChild).oldParent != null) {
            	((GoodSort)newChild).oldParent.remove(newChild);       
            }
            */
            newChild.setParent(this);
            if (children == null) {
                children = new ArrayList<MyTreeNode>();
            }
            children.add(childIndex,(MyTreeNode)newChild);
    }


     public MyTreeNode getOldParent() {
       return oldParent;
    }

    public int getLevel() {
        TreeNode ancestor;
        int levels = 0;

        ancestor = this;
        while((ancestor = ancestor.getParent()) != null){
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
        } while((ancestor = ancestor.getParent()) != null);

        return false;
    }

	public int compareTo(MyTreeNode o) {
		// TODO Auto-generated method stub
		return toString().compareTo(o.toString());
	}

	public void sort() {
		// TODO Auto-generated method stub
		Collections.sort(children);
	}
    
}
