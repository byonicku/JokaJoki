/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.PenjokiControl;
import entity.Penjoki;
import exception.EmptyInputException;
import exception.NotNumberException;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class ViewPenjoki extends javax.swing.JFrame {
    private int selectedId = 0;
    private PenjokiControl pc;
    private String action = "";
    /**
     * Creates new form ViewPenjoki
     */
    public ViewPenjoki() {
        pc = new PenjokiControl();
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        setSaveCancelBtn(false);
        setTitle("Penjoki Page");
        showPenjoki();
    }
    
    public void clearText(){
        inputNamaJoki.setText("");
        radioBtnDota.setSelected(false);
        radioBtnML.setSelected(false);
        inputPengalamanJoki.setText("");
    }
    
    public void setComponent(boolean val){
        inputNamaJoki.setEnabled(val);
        inputPengalamanJoki.setEnabled(val);
        radioBtnDota.setEnabled(val);
        radioBtnML.setEnabled(val);
    }
    
    public void setSaveCancelBtn(boolean val){
        saveBtn.setEnabled(val);
        cancelBtn.setEnabled(val);
    }
    
    public void setEditDeleteBtn(boolean val){
        deleteBtn.setEnabled(val);
        ubahBtn.setEnabled(val);
    }
    
    public void showPenjoki(){
       tablePenjoki.setModel(pc.getTablePenjoki());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupGame = new javax.swing.ButtonGroup();
        contentHeader = new javax.swing.JPanel();
        labelJoki = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        labelNamaJoki = new javax.swing.JLabel();
        inputNamaJoki = new javax.swing.JTextField();
        radioBtnDota = new javax.swing.JRadioButton();
        iconDota = new javax.swing.JLabel();
        radioBtnML = new javax.swing.JRadioButton();
        iconML = new javax.swing.JLabel();
        labelPengeluaranJoki = new javax.swing.JLabel();
        inputPengalamanJoki = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePenjoki = new javax.swing.JTable();
        ubahBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        tambahBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contentHeader.setBackground(new java.awt.Color(0, 153, 255));

        labelJoki.setFont(new java.awt.Font("MS UI Gothic", 0, 48)); // NOI18N
        labelJoki.setForeground(new java.awt.Color(255, 255, 255));
        labelJoki.setText("Page Joki");

        javax.swing.GroupLayout contentHeaderLayout = new javax.swing.GroupLayout(contentHeader);
        contentHeader.setLayout(contentHeaderLayout);
        contentHeaderLayout.setHorizontalGroup(
            contentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeaderLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(labelJoki)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentHeaderLayout.setVerticalGroup(
            contentHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentHeaderLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelJoki)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        backBtn.setFont(new java.awt.Font("MS UI Gothic", 0, 18)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        labelNamaJoki.setBackground(new java.awt.Color(51, 51, 51));
        labelNamaJoki.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        labelNamaJoki.setForeground(new java.awt.Color(51, 51, 51));
        labelNamaJoki.setText("Nama");

        inputNamaJoki.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        groupGame.add(radioBtnDota);
        radioBtnDota.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        radioBtnDota.setForeground(new java.awt.Color(51, 51, 51));
        radioBtnDota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDotaActionPerformed(evt);
            }
        });

        iconDota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JokiMLIcon/Dota 2_65px.png"))); // NOI18N

        groupGame.add(radioBtnML);
        radioBtnML.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        radioBtnML.setForeground(new java.awt.Color(51, 51, 51));
        radioBtnML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMLActionPerformed(evt);
            }
        });

        iconML.setFont(new java.awt.Font("MS UI Gothic", 0, 36)); // NOI18N
        iconML.setForeground(new java.awt.Color(51, 51, 51));
        iconML.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JokiMLIcon/ml 100 1.png"))); // NOI18N

        labelPengeluaranJoki.setBackground(new java.awt.Color(51, 51, 51));
        labelPengeluaranJoki.setFont(new java.awt.Font("MS UI Gothic", 0, 24)); // NOI18N
        labelPengeluaranJoki.setForeground(new java.awt.Color(51, 51, 51));
        labelPengeluaranJoki.setText("Total Pengalaman");

        inputPengalamanJoki.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        saveBtn.setBackground(new java.awt.Color(0, 102, 255));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        tablePenjoki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "nama", "nama_game", "total_pengalaman"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePenjoki.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablePenjoki.getTableHeader().setReorderingAllowed(false);
        tablePenjoki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePenjokiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePenjoki);
        if (tablePenjoki.getColumnModel().getColumnCount() > 0) {
            tablePenjoki.getColumnModel().getColumn(0).setResizable(false);
            tablePenjoki.getColumnModel().getColumn(1).setResizable(false);
            tablePenjoki.getColumnModel().getColumn(2).setResizable(false);
        }

        ubahBtn.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        ubahBtn.setText("Ubah");
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        tambahBtn.setBackground(new java.awt.Color(0, 153, 255));
        tambahBtn.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        tambahBtn.setForeground(new java.awt.Color(255, 255, 255));
        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(255, 51, 51));
        cancelBtn.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contentHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelPengeluaranJoki)
                                    .addComponent(labelNamaJoki)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnDota)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iconDota)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnML)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(iconML))
                                    .addComponent(inputNamaJoki, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(inputPengalamanJoki))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tambahBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ubahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(ubahBtn)
                    .addComponent(deleteBtn)
                    .addComponent(tambahBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNamaJoki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNamaJoki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(iconML))
                            .addComponent(radioBtnML, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iconDota)
                                    .addComponent(radioBtnDota))))
                        .addGap(24, 24, 24)
                        .addComponent(labelPengeluaranJoki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputPengalamanJoki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(cancelBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnDotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnDotaActionPerformed

    private void radioBtnMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMLActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        
        switch (getAnswer) {
            case 0 :
                try {
                    pc.deletePenjoki(selectedId);
                    clearText();
                    setComponent(false);
                    setEditDeleteBtn(false);
                    groupGame.clearSelection();
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
                break;
            case 1 :
                groupGame.clearSelection();
                clearText();
                setComponent(false);
                setEditDeleteBtn(false);
                break;
        }
        
        showPenjoki();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
        clearText();
        setEditDeleteBtn(false);
        setComponent(true);
        setSaveCancelBtn(true);
        groupGame.clearSelection();
        action = "tambah";
        showPenjoki();
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        ViewAdmin VA = new ViewAdmin();
        this.dispose();
        VA.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void tablePenjokiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePenjokiMouseClicked
        // TODO add your handling code here:
        String game = null;
        
        clearText();
        setEditDeleteBtn(true);
        setComponent(false);
        setSaveCancelBtn(false);
        
        int clickedRow = tablePenjoki.getSelectedRow();
        TableModel tableModel = tablePenjoki.getModel();
        
        selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 3).toString());
        inputNamaJoki.setText(tableModel.getValueAt(clickedRow, 0).toString());
        game = tableModel.getValueAt(clickedRow, 1).toString();
        inputPengalamanJoki.setText(tableModel.getValueAt(clickedRow, 2).toString());
        
        if(game.equalsIgnoreCase("Dota 2")) radioBtnDota.setSelected(true);
        else if (game.equalsIgnoreCase("Mobile Legends")) radioBtnML.setSelected(true);
    }//GEN-LAST:event_tablePenjokiMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        clearText();
        setEditDeleteBtn(false);
        setComponent(false);
        setSaveCancelBtn(false);
        groupGame.clearSelection();
        showPenjoki();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        try{
            String game = "";
            
            if(radioBtnDota.isSelected()) game = "Dota 2";
            else if(radioBtnML.isSelected()) game = "Mobile Legends";
            
            if(!inputPengalamanJoki.getText().matches("^[0-9]+")) throw new NotNumberException();
            
            Penjoki p = new Penjoki(inputNamaJoki.getText(), game, Integer.parseInt(inputPengalamanJoki.getText()));
            
            if(action.equals("tambah")){
                pc.insertPenjoki(p);
            }
            else if(action.equals("ubah")){
                p.setId(selectedId);
                pc.updatePenjoki(p);
            }
            
            clearText();
            setComponent(false);
            setEditDeleteBtn(false);
            setSaveCancelBtn(false);
            showPenjoki();
        }catch(EmptyInputException e){
            JOptionPane.showConfirmDialog(null, e.message(), "Konfirmasi", JOptionPane.DEFAULT_OPTION);
        }catch(NotNumberException e){
            JOptionPane.showConfirmDialog(null, e.message("Total Pengalaman"), "Konfirmasi", JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        // TODO add your handling code here:
        action = "ubah";
        setComponent(true);
        setSaveCancelBtn(true);
        radioBtnDota.setEnabled(false);
        radioBtnML.setEnabled(false);
    }//GEN-LAST:event_ubahBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPenjoki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPenjoki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPenjoki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPenjoki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPenjoki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel contentHeader;
    private javax.swing.JButton deleteBtn;
    private javax.swing.ButtonGroup groupGame;
    private javax.swing.JLabel iconDota;
    private javax.swing.JLabel iconML;
    private javax.swing.JTextField inputNamaJoki;
    private javax.swing.JTextField inputPengalamanJoki;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelJoki;
    private javax.swing.JLabel labelNamaJoki;
    private javax.swing.JLabel labelPengeluaranJoki;
    private javax.swing.JRadioButton radioBtnDota;
    private javax.swing.JRadioButton radioBtnML;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tablePenjoki;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JButton ubahBtn;
    // End of variables declaration//GEN-END:variables
}