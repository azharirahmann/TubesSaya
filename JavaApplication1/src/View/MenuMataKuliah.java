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
public class MenuMataKuliah extends javax.swing.JPanel {

    /**
     * Creates new form MenuMataKuliah
     */
    public MenuMataKuliah() {
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

        btnBack = new javax.swing.JButton();
        btnViewMatkul = new javax.swing.JButton();
        btnRemoveMatkul = new javax.swing.JButton();
        btnSearchMatkul = new javax.swing.JButton();
        btnAddMatkul = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnBack.setText("Back");

        btnViewMatkul.setText("View Mata Kuliah");

        btnRemoveMatkul.setText("Remove Mata Kuliah");

        btnSearchMatkul.setText("Search Mata Kuliah");
        btnSearchMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMatkulActionPerformed(evt);
            }
        });

        btnAddMatkul.setText("Add Mata Kuliah");
        btnAddMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMatkulActionPerformed(evt);
            }
        });

        jLabel1.setText("MATA KULIAH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(42, 42, 42))
                        .addComponent(btnAddMatkul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnRemoveMatkul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchMatkul, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnViewMatkul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnBack)
                        .addGap(50, 50, 50)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(btnAddMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(52, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchMatkulActionPerformed

    private void btnAddMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMatkulActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMatkul;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemoveMatkul;
    private javax.swing.JButton btnSearchMatkul;
    private javax.swing.JButton btnViewMatkul;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public Object getBtnAddMatkul(){
        return btnAddMatkul;
    }
    
    public Object getBtnSearchMatkul(){
        return btnSearchMatkul;
    }
    
    public Object getBtnRemoveMatkul(){
        return btnRemoveMatkul;
    }
    
    public Object getBtnViewMatkul(){
        return btnViewMatkul;
    }
    
    public Object getBtnBack(){
        return btnBack;
    }
    
    public void addListener(ActionListener e){
        btnAddMatkul.addActionListener(e);
        btnSearchMatkul.addActionListener(e);
        btnRemoveMatkul.addActionListener(e);
        btnViewMatkul.addActionListener(e);
        btnBack.addActionListener(e);
    }
}
