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
public class Helicopter extends javax.swing.JFrame  implements Observer{
    MainContraller mainContraller;

    /**
     * Creates new form Helicopter
     */
    public Helicopter(MainContraller mainContraller) {
        this.mainContraller = mainContraller;
        initComponents();
        setVisible( true);
           
    }
       
      @Override
    public void  areaMsg(boolean area){
        HeliArea.setText(area ?"Area cleared" : "Area Not Cleared");
        
    }
    
    @Override
    public void  sendMsg(String Msg){
         jTextArea1heli.setText(Msg);
    } 
    @Override
      public int[] passDetails(){
        int Ammo=(Integer)AmmoCountMeter.getValue();
        int Soldier =(Integer)SoldierCountMeter.getValue();
        int Energy = jSlider1.getValue();
       
        int[] ar ={Ammo,Soldier,Energy};
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

        jSlider1 = new javax.swing.JSlider();
        HeliMainMsg = new javax.swing.JTextField();
        HeliTextSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1heli = new javax.swing.JTextArea();
        AmmoCountMeter = new javax.swing.JSpinner();
        SoldierCountMeter = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnHeliLastOperation = new javax.swing.JButton();
        btnHeliShoot = new javax.swing.JButton();
        btnHelicopterMissileOperation = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CheckBoxHeli = new javax.swing.JCheckBox();
        jProgressBar2 = new javax.swing.JProgressBar();
        HeliArea = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSlider1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jSlider1.setMajorTickSpacing(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.setValue(0);
        jSlider1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 75, 240));

        HeliMainMsg.setBackground(new java.awt.Color(204, 204, 204));
        HeliMainMsg.setText(" ");
        HeliMainMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeliMainMsgActionPerformed(evt);
            }
        });
        getContentPane().add(HeliMainMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 326, 320, -1));

        HeliTextSend.setBackground(new java.awt.Color(51, 51, 51));
        HeliTextSend.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HeliTextSend.setForeground(new java.awt.Color(51, 255, 51));
        HeliTextSend.setText(" Send");
        HeliTextSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeliTextSendActionPerformed(evt);
            }
        });
        getContentPane().add(HeliTextSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jTextArea1heli.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1heli.setColumns(20);
        jTextArea1heli.setRows(5);
        jScrollPane1.setViewportView(jTextArea1heli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 139, 400, 175));

        AmmoCountMeter.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(AmmoCountMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 58, 43, -1));

        SoldierCountMeter.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(SoldierCountMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 32, 43, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("                 Helicopter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 269, -1));

        btnHeliLastOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHeliLastOperation.setText(" Last Operation");
        btnHeliLastOperation.setEnabled(false);
        btnHeliLastOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeliLastOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnHeliLastOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 157, -1));

        btnHeliShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHeliShoot.setText(" Shoot");
        btnHeliShoot.setEnabled(false);
        btnHeliShoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeliShootActionPerformed(evt);
            }
        });
        getContentPane().add(btnHeliShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 157, -1));

        btnHelicopterMissileOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHelicopterMissileOperation.setText(" Missile Operation");
        btnHelicopterMissileOperation.setEnabled(false);
        btnHelicopterMissileOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelicopterMissileOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelicopterMissileOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 52, 139, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("  soldier count  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 34, 97, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("  Ammo count  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 55, 88, -1));

        CheckBoxHeli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CheckBoxHeli.setText(" Position");
        CheckBoxHeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxHeliActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBoxHeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 85, -1));

        jProgressBar2.setBackground(new java.awt.Color(102, 255, 0));
        jProgressBar2.setForeground(new java.awt.Color(153, 255, 0));
        jProgressBar2.setValue(50);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, -1, 10));

        HeliArea.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        HeliArea.setForeground(new java.awt.Color(255, 0, 0));
        HeliArea.setText(" Area Not Cleared");
        getContentPane().add(HeliArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, 157, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText(" Energy");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 64, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helicopter.jpg"))); // NOI18N
        jLabel4.setText("helipoto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 370));

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeliTextSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeliTextSendActionPerformed
            String msg = ( HeliMainMsg.getText());
            mainContraller.setMsg(msg);
    }//GEN-LAST:event_HeliTextSendActionPerformed

    private void HeliMainMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeliMainMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeliMainMsgActionPerformed

    private void btnHelicopterMissileOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelicopterMissileOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHelicopterMissileOperationActionPerformed

    private void btnHeliLastOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeliLastOperationActionPerformed
          
    }//GEN-LAST:event_btnHeliLastOperationActionPerformed

    private void CheckBoxHeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxHeliActionPerformed
       
    }//GEN-LAST:event_CheckBoxHeliActionPerformed

    private void btnHeliShootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeliShootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHeliShootActionPerformed

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
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Helicopter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AmmoCountMeter;
    private javax.swing.JCheckBox CheckBoxHeli;
    private javax.swing.JLabel HeliArea;
    private javax.swing.JTextField HeliMainMsg;
    private javax.swing.JButton HeliTextSend;
    private javax.swing.JSpinner SoldierCountMeter;
    private javax.swing.JButton btnHeliLastOperation;
    private javax.swing.JButton btnHeliShoot;
    private javax.swing.JButton btnHelicopterMissileOperation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1heli;
    // End of variables declaration//GEN-END:variables

     
 

   

    @Override
    public void Strenght(int strength) {
     if (CheckBoxHeli.isSelected()){
           if(strength>60){
               btnHeliShoot.setEnabled(true);
               btnHelicopterMissileOperation.setEnabled(true);
               btnHeliLastOperation.setEnabled(true);   
           }else if (strength>40){
               btnHeliShoot.setEnabled(true);
               btnHelicopterMissileOperation.setEnabled(true);
                btnHeliLastOperation.setEnabled(false);
           }else if(strength>20){
               btnHeliShoot.setEnabled(true);
               btnHelicopterMissileOperation.setEnabled(false);
               btnHeliLastOperation.setEnabled(false);
           }else{
                btnHeliShoot.setEnabled(false);
                btnHelicopterMissileOperation.setEnabled(false);
                btnHeliLastOperation.setEnabled(false);           
            }
        }
    }
}     
    





