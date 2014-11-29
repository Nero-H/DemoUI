/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui.importui;

import businesslogicservice.importblservice.ImportBLService;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.ClientStart;

/**
 *
 * @author HCW
 */
public class ImportUI extends javax.swing.JPanel {

    /**
     * Creates new form ImportUI
     */
    public ImportUI() {
        initComponents();
        //controller = ClientStart.getImportBLService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        importManagerLable = new javax.swing.JLabel();
        clientLable = new javax.swing.JLabel();
        clientTextField = new javax.swing.JTextField();
        clientAddButton = new javax.swing.JButton();
        clientRemoveButton = new javax.swing.JButton();
        storehouseLable = new javax.swing.JLabel();
        storehouseTextField = new javax.swing.JTextField();
        operatorLable = new javax.swing.JLabel();
        operatorTextField = new javax.swing.JTextField();
        totalLable = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        notesTextField = new javax.swing.JTextField();
        notesLable = new javax.swing.JLabel();
        importGoodsListLable = new javax.swing.JLabel();
        importGoodsListjScrollPane1 = new javax.swing.JScrollPane();
        importGoodsListTable = new javax.swing.JTable();
        addGoodsButton = new javax.swing.JButton();
        deleteGoodsButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        importManagerLable.setBackground(new java.awt.Color(255, 255, 255));
        importManagerLable.setFont(new java.awt.Font("楷体", 0, 36)); // NOI18N
        importManagerLable.setText("进货管理");

        clientLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        clientLable.setText("客户：");

        clientTextField.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N

        clientAddButton.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        clientAddButton.setText("a");

        clientRemoveButton.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        clientRemoveButton.setText("12");

        storehouseLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        storehouseLable.setText("仓库：");

        storehouseTextField.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        storehouseTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        operatorLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        operatorLable.setText("操作员：");

        operatorTextField.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N

        totalLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        totalLable.setText("总额合计：");

        totalTextField.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N

        notesTextField.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N

        notesLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        notesLable.setText("备注：");

        importGoodsListLable.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        importGoodsListLable.setText("进货商品列表：");

        importGoodsListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        importGoodsListjScrollPane1.setViewportView(importGoodsListTable);

        addGoodsButton.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        addGoodsButton.setText("添加商品");

        deleteGoodsButton.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        deleteGoodsButton.setText("删除商品");

        jButton1.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        jButton1.setText("确认进货");

        jButton2.setFont(new java.awt.Font("楷体", 0, 12)); // NOI18N
        jButton2.setText("取消进货");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(importManagerLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(notesLable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(notesTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(importGoodsListLable)
                                        .addGap(470, 470, 470)
                                        .addComponent(addGoodsButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteGoodsButton))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(importGoodsListjScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(clientLable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clientAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(clientRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(storehouseLable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(storehouseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(operatorLable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(operatorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(totalLable)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(38, 38, 38))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {clientTextField, operatorTextField, storehouseTextField, totalTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(importManagerLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLable)
                    .addComponent(clientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientAddButton)
                    .addComponent(clientRemoveButton)
                    .addComponent(storehouseLable)
                    .addComponent(storehouseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operatorLable)
                    .addComponent(operatorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalLable)
                    .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notesLable)
                    .addComponent(notesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importGoodsListLable)
                    .addComponent(addGoodsButton)
                    .addComponent(deleteGoodsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(importGoodsListjScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {clientTextField, operatorTextField, storehouseTextField, totalTextField});

    }// </editor-fold>//GEN-END:initComponents

    private ImportBLService controller;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGoodsButton;
    private javax.swing.JButton clientAddButton;
    private javax.swing.JLabel clientLable;
    private javax.swing.JButton clientRemoveButton;
    private javax.swing.JTextField clientTextField;
    private javax.swing.JButton deleteGoodsButton;
    private javax.swing.JLabel importGoodsListLable;
    private javax.swing.JTable importGoodsListTable;
    private javax.swing.JScrollPane importGoodsListjScrollPane1;
    private javax.swing.JLabel importManagerLable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel notesLable;
    private javax.swing.JTextField notesTextField;
    private javax.swing.JLabel operatorLable;
    private javax.swing.JTextField operatorTextField;
    private javax.swing.JLabel storehouseLable;
    private javax.swing.JTextField storehouseTextField;
    private javax.swing.JLabel totalLable;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
