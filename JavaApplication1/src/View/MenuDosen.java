/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class MenuDosen extends javax.swing.JPanel {

    /**
     * Creates new form MenuDosen
     */
    public MenuDosen() {
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

        btnViewDosen = new javax.swing.JButton();
        btnRemoveDosen = new javax.swing.JButton();
        btnSearchDosen = new javax.swing.JButton();
        btnAddDosen = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnViewDosen.setText("View Dosen");

        btnRemoveDosen.setText("Remove Dosen");
        btnRemoveDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDosenActionPerformed(evt);
            }
        });

        btnSearchDosen.setText("Search Dosen");
        btnSearchDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDosenActionPerformed(evt);
            }
        });

        btnAddDosen.setText("Add Dosen");
        btnAddDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDosenActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        jLabel1.setText("DOSEN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50))
                    .addComponent(btnAddDosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRemoveDosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchDosen, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnViewDosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(btnAddDosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchDosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveDosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewDosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveDosenActionPerformed

    private void btnSearchDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchDosenActionPerformed

    private void btnAddDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDosenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDosen;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveDosen;
    private javax.swing.JButton btnSearchDosen;
    private javax.swing.JButton btnViewDosen;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddDosen(){
        return btnAddDosen;
    }
    
    public Object getBtnSearchDosen(){
        return btnSearchDosen;
    }
    
    public Object getBtnRemoveDosen(){
        return btnRemoveDosen;
    }
    
    public Object getBtnViewDosen(){
        return btnViewDosen;
    }
    
    public Object getBtnBack(){
        return btnBack;
    }
    
    public void addListener(ActionListener e){
        btnAddDosen.addActionListener(e);
        btnSearchDosen.addActionListener(e);
        btnRemoveDosen.addActionListener(e);
        btnViewDosen.addActionListener(e);
        btnBack.addActionListener(e);
    }
}
