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
public class Submarin extends javax.swing.JFrame implements Observer{
    MainContraller mainContraller;

    /**
     * Creates new form Submarin
     */
    public Submarin(MainContraller mainContraller) {
        this.mainContraller = mainContraller;
        initComponents();
        setVisible( true);
    }
@Override
    public void  areaMsg(boolean area){
        sub1.setText(area ?"Area cleared" : "Area Not Cleared");
    }
    
 
 @Override
    public void  sendMsg(String Msg){
        jTextArea1submari.setText(Msg);
    } 
    @Override
    public int[] passDetails(){
        int Ammo=(Integer)AmmoCountMeter.getValue();
        int Soldier =(Integer)SoldierCountMeter.getValue();
        int Energy = SubmarinEnergy.getValue();
       
        int[] ar ={Ammo,Soldier,Energy,};
        return ar;
    }
    @Override
    public void Strenght(int strength) {
            if (CheckBoxSubmarinposition.isSelected()){
                  if(strength>80){
                       btnsubmarinShoot.setEnabled(true);
                       btnSonarOperation.setEnabled(true);
                       btnTomahawk.setEnabled(true);
                       btnTrident2Missile.setEnabled(true);
                  }else if(strength>60){
                       btnsubmarinShoot.setEnabled(true);
                       btnSonarOperation.setEnabled(true);
                       btnTomahawk.setEnabled(true);
                       btnTrident2Missile.setEnabled(false);
                  }else if (strength>40){
                       btnsubmarinShoot.setEnabled(true);
                       btnSonarOperation.setEnabled(true);
                       btnTomahawk.setEnabled(false);
                       btnTrident2Missile.setEnabled(false);
                  }else if(strength>20){
                       btnsubmarinShoot.setEnabled(true);
                       btnSonarOperation.setEnabled(false);
                       btnTomahawk.setEnabled(false);
                       btnTrident2Missile.setEnabled(false);
                  }else{
                       btnsubmarinShoot.setEnabled(false);
                       btnSonarOperation.setEnabled(false);
                       btnTomahawk.setEnabled(false);
                       btnTrident2Missile.setEnabled(false);
                  }
               }
         } 
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btnTomahawk = new javax.swing.JButton();
        btnsubmarinShoot = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSonarOperation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CheckBoxSubmarinposition = new javax.swing.JCheckBox();
        jProgressBar2 = new javax.swing.JProgressBar();
        OxygenMeter = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1submari = new javax.swing.JTextArea();
        AmmoCountMeter = new javax.swing.JSpinner();
        SoldierCountMeter = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        SubmarinEnergy = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sub1 = new javax.swing.JLabel();
        btnTrident2Missile = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTomahawk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTomahawk.setText(" Tomahawk Missile");
        btnTomahawk.setEnabled(false);
        btnTomahawk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomahawkActionPerformed(evt);
            }
        });
        getContentPane().add(btnTomahawk, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 113, 125, -1));

        btnsubmarinShoot.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsubmarinShoot.setText(" Shoot");
        btnsubmarinShoot.setEnabled(false);
        getContentPane().add(btnsubmarinShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 79, 125, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("  soldier count  :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 97, 22));

        btnSonarOperation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSonarOperation.setText(" sonar Operation");
        btnSonarOperation.setEnabled(false);
        btnSonarOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonarOperationActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonarOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 79, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("  Ammo count  :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 88, -1));

        CheckBoxSubmarinposition.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CheckBoxSubmarinposition.setText(" Position");
        CheckBoxSubmarinposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSubmarinpositionActionPerformed(evt);
            }
        });
        getContentPane().add(CheckBoxSubmarinposition, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 85, -1));

        jProgressBar2.setBackground(new java.awt.Color(51, 255, 51));
        jProgressBar2.setForeground(new java.awt.Color(102, 255, 102));
        jProgressBar2.setValue(50);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 141, 136, 10));

        OxygenMeter.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        OxygenMeter.setMajorTickSpacing(20);
        OxygenMeter.setMinorTickSpacing(5);
        OxygenMeter.setOrientation(javax.swing.JSlider.VERTICAL);
        OxygenMeter.setPaintLabels(true);
        OxygenMeter.setPaintTicks(true);
        OxygenMeter.setValue(0);
        OxygenMeter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(OxygenMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 59, 220));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 358, 280, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 255, 51));
        jButton1.setText(" Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jTextArea1submari.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1submari.setColumns(20);
        jTextArea1submari.setRows(5);
        jTextArea1submari.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1submari);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 165, 360, 175));
        getContentPane().add(AmmoCountMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 43, -1));

        SoldierCountMeter.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SoldierCountMeterAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(SoldierCountMeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 43, -1));

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("                Submarin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 268, -1));

        SubmarinEnergy.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        SubmarinEnergy.setMajorTickSpacing(20);
        SubmarinEnergy.setMinorTickSpacing(5);
        SubmarinEnergy.setOrientation(javax.swing.JSlider.VERTICAL);
        SubmarinEnergy.setPaintLabels(true);
        SubmarinEnergy.setPaintTicks(true);
        SubmarinEnergy.setValue(0);
        SubmarinEnergy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(SubmarinEnergy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 64, 220));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText(" Energy");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 64, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText(" Oxygen");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 59, -1));

        sub1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        sub1.setForeground(new java.awt.Color(255, 0, 0));
        sub1.setText(" Area Not Cleared");
        getContentPane().add(sub1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 50, 157, -1));

        btnTrident2Missile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTrident2Missile.setText(" Trident 2 Missile");
        btnTrident2Missile.setEnabled(false);
        btnTrident2Missile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrident2MissileActionPerformed(evt);
            }
        });
        getContentPane().add(btnTrident2Missile, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 113, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/submarin.jpg"))); // NOI18N
        jLabel6.setText("subpoto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTomahawkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomahawkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomahawkActionPerformed

    private void btnSonarOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonarOperationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSonarOperationActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msg = jTextField1.getText();
        mainContraller.setMsg(msg);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SoldierCountMeterAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SoldierCountMeterAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_SoldierCountMeterAncestorAdded

    private void btnTrident2MissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrident2MissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrident2MissileActionPerformed

    private void CheckBoxSubmarinpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxSubmarinpositionActionPerformed
  
    }//GEN-LAST:event_CheckBoxSubmarinpositionActionPerformed

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
            java.util.logging.Logger.getLogger(Submarin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Submarin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Submarin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Submarin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AmmoCountMeter;
    private javax.swing.JCheckBox CheckBoxSubmarinposition;
    private javax.swing.JSlider OxygenMeter;
    private javax.swing.JSpinner SoldierCountMeter;
    private javax.swing.JSlider SubmarinEnergy;
    private javax.swing.JButton btnSonarOperation;
    private javax.swing.JButton btnTomahawk;
    private javax.swing.JButton btnTrident2Missile;
    private javax.swing.JButton btnsubmarinShoot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1submari;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel sub1;
    // End of variables declaration//GEN-END:variables

    

         
    }
