/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoui;

/**
 *
 * @author HCW
 */
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
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

        logoutButton = new javax.swing.JButton();
        user = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 687));

        logoutButton.setText("注销");

        user.setText("用户");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(858, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(18, 18, 18)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(user))
                .addGap(0, 666, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
