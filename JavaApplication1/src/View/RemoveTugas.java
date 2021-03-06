/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author user
 */
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class RemoveTugas extends javax.swing.JPanel {

    /**
     * Creates new form RemoveTugas
     */
    public RemoveTugas() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txRemoveTugas = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        tfNomorTugas = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        jLabel1.setText("Remove Tugas");

        txRemoveTugas.setEditable(false);
        txRemoveTugas.setColumns(20);
        txRemoveTugas.setRows(5);
        jScrollPane1.setViewportView(txRemoveTugas);

        jLabel2.setText("Nomor Tugas");

        btnBack.setText("Back");

        btnRemove.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(238, 238, 238)
                        .addComponent(btnRemove))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomorTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomorTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRemove))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfNomorTugas;
    private javax.swing.JTextArea txRemoveTugas;
    // End of variables declaration//GEN-END:variables

    public Object getBtnBack(){
        return btnBack;
    }
    
    public Object getBtnRemove(){
        return btnRemove;
    }
    
    public void setDetailTugas(String s){
        txRemoveTugas.setText(s);
    }
    
    public String getNomorTugas(){
        return tfNomorTugas.getText();
    }
    
    public void reset(){
        tfNomorTugas.setText("");
    }
    
    public void showMessage(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    
    public int showConfirmDialog(String m, String t){
        return JOptionPane.showConfirmDialog(null, m, t, JOptionPane.YES_NO_OPTION);
    }
    
    public void addListener(ActionListener e){
        btnBack.addActionListener(e);
        btnRemove.addActionListener(e);
    }
}
