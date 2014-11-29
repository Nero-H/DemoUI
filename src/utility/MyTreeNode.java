package utility;


import javax.swing.tree.TreeNode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrasion
 */
public interface MyTreeNode extends TreeNode{
     public void setObject(Object o);//重新设定该节点的值
     public void insert(MyTreeNode child,int index);//在当前节点下插入制定index的子节点
     public boolean remove(MyTreeNode o);//移除当前节点的某一特定子节点
     public void setParent(MyTreeNode newParent);//设置当前节点的新节点
     public MyTreeNode getOldParent();
     public int getLevel();
     public void addChild(MyTreeNode child);
     public boolean isNodeAncestor(TreeNode anotherNode);
}
