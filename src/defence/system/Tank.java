/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package defence.system;

import Main.MainContraller;

/**
 *
 * @author Saluka
 */
public class Tank extends javax.swing.JFrame implements Observer{
    MainContraller mainContraller;

    /**
     * Creates new form Tank
     */
    public Tank(MainContraller mainContraller) {
        this.mainContraller = mainContraller;
        initComponents();
        setVisible(true);
    }
    @Override
    public void  areaMsg(boolean area){
        TankArea.setText(area ?"Area cleared" : "Area Not Cleared");
    }
    
     @Override
    public void  sendMsg(String Msg){
          jTextArea1Tank.setText(Msg);
    } 

    /**
     *
     * @return
     */
    @Override
    public int[] passDetails(){
        int Soldier = (Integer)jSpinner2.getValue();
        int Ammo = (Integer)jSpinner1.getValue();
        int Enregy = jSlider1.getValue();
        int[] ar = {Soldier, Ammo, Enregy};
        
        return ar;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTankLastOperation = new javax.swing.JButton();
        BtnTankShoot = new javax.swing.JButton();
        btnTankMissileOperation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chekboxTankposition = new javax.swing.JCheckBox();
        jProgressBar2 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        TankTxtMainMsg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Tank = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        TankArea = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTankLastOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTankLastOperation.setText(" Last Operation");
        btnTankLastOperation.setEnabled(false);
        btnTankLastOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankLastOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnTankLastOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 157, -1));

        BtnTankShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnTankShoot.setText(" Shoot");
        BtnTankShoot.setEnabled(false);
        getContentPane().add(BtnTankShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 157, -1));

        btnTankMissileOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTankMissileOperation.setText(" Missile Operation");
        btnTankMissileOperation.setEnabled(false);
        btnTankMissileOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankMissileOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnTankMissileOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 70, 139, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("  soldier count  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 97, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("  Ammo count  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 88, -1));

        chekboxTankposition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chekboxTankposition.setText(" Position");
        getContentPane().add(chekboxTankposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 85, -1));

        jProgressBar2.setBackground(new java.awt.Color(102, 255, 0));
        jProgressBar2.setForeground(new java.awt.Color(153, 255, 0));
        jProgressBar2.setValue(50);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 129, -1, 10));

        jSlider1.setBackground(new java.awt.Color(204, 204, 204));
        jSlider1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 127, 75, 220));

        TankTxtMainMsg.setBackground(new java.awt.Color(204, 204, 204));
        TankTxtMainMsg.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        TankTxtMainMsg.setText(" ");
        TankTxtMainMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TankTxtMainMsgActionPerformed(evt);
            }
        });
        getContentPane().add(TankTxtMainMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 310, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText(" Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jTextArea1Tank.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1Tank.setColumns(20);
        jTextArea1Tank.setRows(5);
        jTextArea1Tank.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1Tank);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 380, 175));

        jSpinner1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 43, -1));

        jSpinner2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 43, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("                   Tank");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 281, -1));

        TankArea.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        TankArea.setForeground(new java.awt.Color(255, 0, 0));
        TankArea.setText(" Area Not Cleared");
        getContentPane().add(TankArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 38, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText(" Energy");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 51, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tank3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));
        jLabel4.getAccessibleContext().setAccessibleName(" tank poto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTankLastOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankLastOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankLastOperationActionPerformed

    private void btnTankMissileOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankMissileOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankMissileOperationActionPerformed

    private void TankTxtMainMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TankTxtMainMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TankTxtMainMsgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                   String msg = (TankTxtMainMsg.getText());
                   mainContraller.setMsg(msg);
                                   
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTankShoot;
    private javax.swing.JLabel TankArea;
    private javax.swing.JTextField TankTxtMainMsg;
    private javax.swing.JButton btnTankLastOperation;
    private javax.swing.JButton btnTankMissileOperation;
    private javax.swing.JCheckBox chekboxTankposition;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextArea jTextArea1Tank;
    // End of variables declaration//GEN-END:variables

    

    

    @Override
    
    public void Strenght(int strength) {
     if (chekboxTankposition.isSelected()){
           if(strength>60){
                BtnTankShoot.setEnabled(true);
                btnTankMissileOperation.setEnabled(true);
                btnTankLastOperation.setEnabled(true);
           }else if (strength>40){
                BtnTankShoot.setEnabled(true);
                btnTankMissileOperation.setEnabled(true);
                btnTankLastOperation.setEnabled(false);
           }else if(strength>20){
                BtnTankShoot.setEnabled(true);
                btnTankMissileOperation.setEnabled(false);
                btnTankLastOperation.setEnabled(false);
           }else{
                BtnTankShoot.setEnabled(false);
                btnTankMissileOperation.setEnabled(false);
                btnTankLastOperation.setEnabled(false);
           }
     }
    }     
}


    

   

   
    

