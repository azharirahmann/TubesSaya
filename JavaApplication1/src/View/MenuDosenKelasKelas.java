/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class MenuDosenKelasKelas extends javax.swing.JPanel {

    /**
     * Creates new form MenuDosenKelasKelas
     */
    public MenuDosenKelasKelas() {
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

        jButton1 = new javax.swing.JButton();
        btnSetMatkul = new javax.swing.JButton();
        btnCreateTgs = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnViewTugas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAddMhs = new javax.swing.JButton();
        btnRemoveMhs = new javax.swing.JButton();

        jButton1.setText("jButton1");

        btnSetMatkul.setText("Set Mata Kuliah");
        btnSetMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetMatkulActionPerformed(evt);
            }
        });

        btnCreateTgs.setText("Create Tugas");
        btnCreateTgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTgsActionPerformed(evt);
            }
        });

        btnBack.setText("Back");

        btnViewTugas.setText("View Tugas");
        btnViewTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTugasActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAMA KELAS : ");

        btnAddMhs.setText("Add Mahasiswa");

        btnRemoveMhs.setText("Remove Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnBack)
                                .addGap(51, 51, 51))
                            .addComponent(btnRemoveMhs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSetMatkul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnViewTugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCreateTgs, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddMhs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnSetMatkul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateTgs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewTugas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddMhs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveMhs)
                .addGap(10, 10, 10)
                .addComponent(btnBack)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetMatkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetMatkulActionPerformed

    private void btnCreateTgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTgsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTgsActionPerformed

    private void btnViewTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewTugasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMhs;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateTgs;
    private javax.swing.JButton btnRemoveMhs;
    private javax.swing.JButton btnSetMatkul;
    private javax.swing.JButton btnViewTugas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddMhs() {
        return btnAddMhs;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public JButton getBtnCreateTgs() {
        return btnCreateTgs;
    }

    public JButton getBtnRemoveMhs() {
        return btnRemoveMhs;
    }

    public JButton getBtnSetMatkul() {
        return btnSetMatkul;
    }

    public JButton getBtnViewTugas() {
        return btnViewTugas;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(String s) {
        jLabel1.setText(jLabel1.getText()+s);
    }
    
    public void addListener(ActionListener e){
        btnAddMhs.addActionListener(e);
        btnBack.addActionListener(e);
        btnCreateTgs.addActionListener(e);
        btnRemoveMhs.addActionListener(e);
        btnSetMatkul.addActionListener(e);
        btnViewTugas.addActionListener(e);
    }
    
}
