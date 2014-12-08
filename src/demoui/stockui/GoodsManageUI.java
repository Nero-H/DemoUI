/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.stockui;

import businesslogicservice.financialblservice.AccountBLService;
import businesslogicservice.stockblservice.GoodsManageBLService;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.TreePath;
import server.ClientStart;
import server.ServerInterface;
import utility.MyTreeModel;
import utility.MyTreeNode;
import utility.TreeTransferHandler;
import vo.AccountVO;
import vo.GoodsVO;

/**
 *
 * @author administrasion
 */
public class GoodsManageUI extends javax.swing.JPanel {
    GoodsManageBLService goodsManageBLService;
    public static MyTreeNode root;
    /**
     * Creates new form GoodsManageUI
     */
    public GoodsManageUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addSortDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        goodsSortTextField = new javax.swing.JTextField();
        addSortEnsureButton = new javax.swing.JButton();
        addSortCancelButton = new javax.swing.JButton();
        addGoodsDialog = new javax.swing.JDialog();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        goodsNumberTextField = new javax.swing.JTextField();
        goodsNameTextField = new javax.swing.JTextField();
        goodInPriceTextField = new javax.swing.JTextField();
        goodOutPriceTextField = new javax.swing.JTextField();
        goodModelTextField = new javax.swing.JTextField();
        addGoodsEnsureButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        goodsTree = new javax.swing.JTree();
        addSortButton = new javax.swing.JButton();
        addGoodsButton = new javax.swing.JButton();
        nameLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Label26 = new javax.swing.JLabel();
        goodsNumberLabel = new javax.swing.JLabel();
        goodsModelLabel = new javax.swing.JLabel();
        goodsInPriceLabel = new javax.swing.JLabel();
        goodsRecentInPriceLabel = new javax.swing.JLabel();
        goodsNameLabel = new javax.swing.JLabel();
        goodsStockNumberLabel = new javax.swing.JLabel();
        goodsOutPriceLabel = new javax.swing.JLabel();
        goodsRecentOutPriceLabel = new javax.swing.JLabel();

        addSortDialog.setSize(new java.awt.Dimension(309, 120));

        jLabel1.setText("商品分类名：");

        addSortEnsureButton.setText("确定");
        addSortEnsureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addSortEnsureButtonMousePressed(evt);
            }
        });

        addSortCancelButton.setText("取消");

        javax.swing.GroupLayout addSortDialogLayout = new javax.swing.GroupLayout(addSortDialog.getContentPane());
        addSortDialog.getContentPane().setLayout(addSortDialogLayout);
        addSortDialogLayout.setHorizontalGroup(
            addSortDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSortDialogLayout.createSequentialGroup()
                .addGroup(addSortDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addSortDialogLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(goodsSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addSortDialogLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(addSortEnsureButton)
                        .addGap(43, 43, 43)
                        .addComponent(addSortCancelButton)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        addSortDialogLayout.setVerticalGroup(
            addSortDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSortDialogLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addSortDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(goodsSortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addSortDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSortEnsureButton)
                    .addComponent(addSortCancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addGoodsDialog.setSize(new java.awt.Dimension(541, 265));

        nameLabel.setFont(new java.awt.Font("KaiTi", 0, 24)); // NOI18N
        nameLabel.setText("添加商品");

        jLabel2.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel2.setText("编号：");

        jLabel3.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel3.setText("名称：");

        jLabel4.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel4.setText("型号：");

        jLabel6.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel6.setText("零售价：");

        jLabel7.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel7.setText("进价：");

        addGoodsEnsureButton.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        addGoodsEnsureButton.setText("确定");
        addGoodsEnsureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addGoodsEnsureButtonMousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jButton2.setText("取消");

        javax.swing.GroupLayout addGoodsDialogLayout = new javax.swing.GroupLayout(addGoodsDialog.getContentPane());
        addGoodsDialog.getContentPane().setLayout(addGoodsDialogLayout);
        addGoodsDialogLayout.setHorizontalGroup(
            addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGoodsDialogLayout.createSequentialGroup()
                .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addGoodsDialogLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goodsNumberTextField)
                            .addComponent(goodInPriceTextField)
                            .addComponent(goodModelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGoodsDialogLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goodsNameTextField)
                            .addComponent(goodOutPriceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                    .addGroup(addGoodsDialogLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(addGoodsEnsureButton)
                        .addGap(80, 80, 80)
                        .addComponent(jButton2)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGoodsDialogLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(210, 210, 210))
        );
        addGoodsDialogLayout.setVerticalGroup(
            addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addGoodsDialogLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(goodsNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(goodsNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(goodInPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goodOutPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(goodModelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(addGoodsDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGoodsEnsureButton)
                    .addComponent(jButton2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        goodsTree.setModel(new MyTreeModel(getRoot(),true));
        goodsTree.setDragEnabled(true);
        goodsTree.setDropMode(javax.swing.DropMode.ON_OR_INSERT);
        goodsTree.setEditable(true);
        goodsTree.setInvokesStopCellEditing(true);
        goodsTree.setRootVisible(false);
        goodsTree.setShowsRootHandles(true);
        goodsTree.putClientProperty("JTree.lineStyle", "Angled");

        goodsTree.setTransferHandler(new TreeTransferHandler());
        goodsTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                goodsTreeMousePressed(evt);
            }
        });
        goodsTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                goodsTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(goodsTree);

        addSortButton.setText("添加商品分类");
        addSortButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addSortButtonMousePressed(evt);
            }
        });

        addGoodsButton.setText("添加商品");
        addGoodsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addGoodsButtonMousePressed(evt);
            }
        });

        nameLabel1.setFont(new java.awt.Font("KaiTi", 0, 24)); // NOI18N
        nameLabel1.setText("商品信息");

        jLabel10.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel10.setText("编号：");

        jLabel11.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel11.setText("型号：");

        jLabel12.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel12.setText("进价：");

        jLabel13.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel13.setText("最近进价：");

        jLabel14.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel14.setText("名称：");

        jLabel15.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel15.setText("库存数量：");

        jLabel16.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        jLabel16.setText("零售价：");

        Label26.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N
        Label26.setText("最近零售价：");

        goodsNumberLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsModelLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsInPriceLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsRecentInPriceLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsNameLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsStockNumberLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsOutPriceLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        goodsRecentOutPriceLabel.setFont(new java.awt.Font("KaiTi", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Label26)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goodsNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsModelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsStockNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsInPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsOutPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsRecentInPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(goodsRecentOutPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(addSortButton)
                        .addGap(52, 52, 52)
                        .addComponent(addGoodsButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(571, 571, 571)
                        .addComponent(nameLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {goodsInPriceLabel, goodsModelLabel, goodsNameLabel, goodsNumberLabel, goodsOutPriceLabel, goodsRecentInPriceLabel, goodsRecentOutPriceLabel, goodsStockNumberLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(nameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(goodsNumberLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(goodsNameLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(goodsModelLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goodsStockNumberLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goodsInPriceLabel)
                            .addComponent(jLabel12))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(goodsOutPriceLabel))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(goodsRecentInPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label26)
                            .addComponent(goodsRecentOutPriceLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSortButton)
                    .addComponent(addGoodsButton))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {goodsInPriceLabel, goodsModelLabel, goodsNameLabel, goodsNumberLabel, goodsOutPriceLabel, goodsRecentInPriceLabel, goodsRecentOutPriceLabel, goodsStockNumberLabel, jLabel10});

    }// </editor-fold>//GEN-END:initComponents

    private void addSortButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSortButtonMousePressed
        addSortDialog.setVisible(true);
    }//GEN-LAST:event_addSortButtonMousePressed

    private void addSortEnsureButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSortEnsureButtonMousePressed
        if(goodsSortTextField.getText().equals("")){
            addSortDialog.setVisible(false);
            return;
        }
        MyTreeNode parentNode = null;
        TreePath parentPath = goodsTree.getSelectionPath();
        
        if (parentPath == null) {
            // There is no selection. Default to the root node.
            parentNode = (MyTreeNode) goodsTree.getModel().getRoot();
        } else {
            parentNode = (MyTreeNode) (parentPath.getLastPathComponent());
        }
        addObject(parentNode, new MyTreeNode(goodsSortTextField.getText()), true);
        addSortDialog.setVisible(false);
    }//GEN-LAST:event_addSortEnsureButtonMousePressed

    private void addGoodsEnsureButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGoodsEnsureButtonMousePressed
        MyTreeNode parentNode = null;
        TreePath parentPath = goodsTree.getSelectionPath();
        
        if (parentPath == null) {
            // There is no selection. Default to the root node.
            parentNode = (MyTreeNode) goodsTree.getModel().getRoot();
        } else {
            parentNode = (MyTreeNode) (parentPath.getLastPathComponent());
        }
        
        GoodsVO goods = null;
        try {
            goods = new GoodsVO(goodsNumberTextField.getText(), goodsNameTextField.getText(), goodModelTextField.getText(), Double.parseDouble(goodInPriceTextField.getText()), Double.parseDouble(goodOutPriceTextField.getText()));
        } catch (RemoteException ex) {
            Logger.getLogger(GoodsManageUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        goods.setAllowChildren(false);
        addObject(parentNode, goods,
                true);
    }//GEN-LAST:event_addGoodsEnsureButtonMousePressed

    private void goodsTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_goodsTreeValueChanged
        MyTreeNode node = (MyTreeNode)goodsTree.getLastSelectedPathComponent();
        if(node == null){
            return;
        }
        //叶节点
        if(!node.getAllowsChildren()){
            GoodsVO good = (GoodsVO)node;
            goodsNumberLabel.setText(good.getGoodsNumber());
            goodsNameLabel.setText(good.getGoodsName());
            goodsModelLabel.setText(good.getGoodsModelNumber());
            goodsStockNumberLabel.setText(good.getStockNumber() + "");
            goodsInPriceLabel.setText(good.getInPrice() + "");
            goodsOutPriceLabel.setText(good.getRetailPrice() + "");
            goodsRecentInPriceLabel.setText(good.getRecentPrice() + "");
            goodsRecentOutPriceLabel.setText(good.getRecentRetailPrice() + "");
        }
    }//GEN-LAST:event_goodsTreeValueChanged

    private void addGoodsButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addGoodsButtonMousePressed
        addGoodsDialog.setVisible(true);
    }//GEN-LAST:event_addGoodsButtonMousePressed

    private void goodsTreeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goodsTreeMousePressed
        int row=goodsTree.getRowForLocation(evt.getX(),evt.getY());
        if(row == -1){
            goodsTree.clearSelection();
        }
    }//GEN-LAST:event_goodsTreeMousePressed

    public void addObject(MyTreeNode parent, Object child,
            boolean shouldBeVisible) {
        
        MyTreeNode childNode = (MyTreeNode) child;
       
        if(parent == null){
            parent = (MyTreeNode)goodsTree.getModel().getRoot();
        }
        
        if((parent.getChildCount() == 0)
                || (parent.getChildAt(0).getAllowsChildren() == childNode.getAllowsChildren())){
            ((MyTreeModel) (goodsTree.getModel())).insertNodeInto(childNode,
                    parent, parent.getChildCount());
            
            if (shouldBeVisible) {
                goodsTree.scrollPathToVisible(new TreePath(childNode.getPath()));
            }
            try {
                goodsManageBLService.setRoot(root);
            } catch (RemoteException ex) {
                Logger.getLogger(GoodsManageUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("就不给你加");
        }
        
    }
    
    public MyTreeNode getRoot(){
        ClientStart.main();
        ServerInterface serverInterface = ClientStart.server;
        if(serverInterface != null){
            try {
                goodsManageBLService = serverInterface.getGoodsManageBLService();
                root = goodsManageBLService.getRoot();
               
                return root;
            } catch (RemoteException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label26;
    private javax.swing.JButton addGoodsButton;
    private javax.swing.JDialog addGoodsDialog;
    private javax.swing.JButton addGoodsEnsureButton;
    private javax.swing.JButton addSortButton;
    private javax.swing.JButton addSortCancelButton;
    private javax.swing.JDialog addSortDialog;
    private javax.swing.JButton addSortEnsureButton;
    private javax.swing.JTextField goodInPriceTextField;
    private javax.swing.JTextField goodModelTextField;
    private javax.swing.JTextField goodOutPriceTextField;
    private javax.swing.JLabel goodsInPriceLabel;
    private javax.swing.JLabel goodsModelLabel;
    private javax.swing.JLabel goodsNameLabel;
    private javax.swing.JTextField goodsNameTextField;
    private javax.swing.JLabel goodsNumberLabel;
    private javax.swing.JTextField goodsNumberTextField;
    private javax.swing.JLabel goodsOutPriceLabel;
    private javax.swing.JLabel goodsRecentInPriceLabel;
    private javax.swing.JLabel goodsRecentOutPriceLabel;
    private javax.swing.JTextField goodsSortTextField;
    private javax.swing.JLabel goodsStockNumberLabel;
    private javax.swing.JTree goodsTree;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    // End of variables declaration//GEN-END:variables
}
