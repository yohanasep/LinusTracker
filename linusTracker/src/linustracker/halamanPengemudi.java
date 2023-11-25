package linustracker;

import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class halamanPengemudi extends javax.swing.JFrame {
    private String selectedHalte;
    private File file;
    private FileWriter writeFile;
    private String Vjam = "";

    public halamanPengemudi() {
        initComponents();
        jam();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        radioHalteGEMA = new javax.swing.JRadioButton();
        radioHaltePintu4 = new javax.swing.JRadioButton();
        radioHalteFEB = new javax.swing.JRadioButton();
        radioHalteFIB = new javax.swing.JRadioButton();
        radioHalteFarmasi = new javax.swing.JRadioButton();
        radioHalteFISIP = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        akhiriButton = new javax.swing.JButton();
        labelForJam = new javax.swing.JLabel();
        radioHalteFK = new javax.swing.JRadioButton();
        radioHalteFMIPA = new javax.swing.JRadioButton();
        okButton = new javax.swing.JButton();
        radioHalteFH = new javax.swing.JRadioButton();
        radioHalteFasilkomti = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pengemudi");
        setMinimumSize(new java.awt.Dimension(770, 550));
        setPreferredSize(new java.awt.Dimension(770, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 105, 30));
        jPanel1.setToolTipText("");

        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(661, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("List Halte");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        buttonGroup1.add(radioHalteGEMA);
        radioHalteGEMA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteGEMA.setText("Halte GEMA");
        getContentPane().add(radioHalteGEMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 140, 40));

        buttonGroup1.add(radioHaltePintu4);
        radioHaltePintu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHaltePintu4.setText("Halte Pintu 4");
        radioHaltePintu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHaltePintu4ActionPerformed(evt);
            }
        });
        getContentPane().add(radioHaltePintu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        buttonGroup1.add(radioHalteFEB);
        radioHalteFEB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFEB.setText("Halte FEB");
        getContentPane().add(radioHalteFEB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, 40));

        buttonGroup1.add(radioHalteFIB);
        radioHalteFIB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFIB.setText("Halte FIB");
        getContentPane().add(radioHalteFIB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 100, 40));

        buttonGroup1.add(radioHalteFarmasi);
        radioHalteFarmasi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFarmasi.setText("Halte Farmasi");
        radioHalteFarmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHalteFarmasiActionPerformed(evt);
            }
        });
        getContentPane().add(radioHalteFarmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 30));

        buttonGroup1.add(radioHalteFISIP);
        radioHalteFISIP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFISIP.setText("Halte FISIP");
        getContentPane().add(radioHalteFISIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("<HTML>*PERINGATAN! Hanya tekan tombol AKHIRI apabila linus sudah selesai beroperasi hari ini</HTML>");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 680, -1));

        akhiriButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        akhiriButton.setText("Akhiri");
        akhiriButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akhiriButtonActionPerformed(evt);
            }
        });
        getContentPane().add(akhiriButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 140, 50));

        labelForJam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelForJam.setText("00:00:00");
        getContentPane().add(labelForJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        buttonGroup1.add(radioHalteFK);
        radioHalteFK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFK.setText("Halte FK");
        getContentPane().add(radioHalteFK, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 100, 40));

        buttonGroup1.add(radioHalteFMIPA);
        radioHalteFMIPA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFMIPA.setText("Halte FMIPA");
        radioHalteFMIPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHalteFMIPAActionPerformed(evt);
            }
        });
        getContentPane().add(radioHalteFMIPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 140, 30));

        okButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 140, 50));

        buttonGroup1.add(radioHalteFH);
        radioHalteFH.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFH.setText("Halte FH");
        getContentPane().add(radioHalteFH, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 130, 40));

        buttonGroup1.add(radioHalteFasilkomti);
        radioHalteFasilkomti.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioHalteFasilkomti.setText("Halte Faslkomti");
        radioHalteFasilkomti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHalteFasilkomtiActionPerformed(evt);
            }
        });
        getContentPane().add(radioHalteFasilkomti, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 180, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Silakan pilih halte pemberhentian anda saat ini");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioHalteFMIPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHalteFMIPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHalteFMIPAActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        landing_page landingPage = new landing_page();
        landingPage.setVisible(true);
        landingPage.pack();
        landingPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

    getSelectedHalte();
    landing_page showLogLinus = new landing_page();
    showLogLinus.showLogLinus();
    }//GEN-LAST:event_okButtonActionPerformed

    private void akhiriButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akhiriButtonActionPerformed
        // TODO add your handling code here:
        landing_page landingPage = new landing_page();
        landingPage.setVisible(true);
        landingPage.pack();
        landingPage.setLocationRelativeTo(null);
        this.dispose();
        landingPage.setNullText();
        
        try{
            String filePath = "D:\\";
            String fileName = "logBus.txt";
            file = new File(filePath+fileName);
            boolean cekeksistensi = file.exists();
                if(cekeksistensi == true){
                    file.delete();
                    System.out.println("berhasil delete");                
                } 
        } catch (Exception e){
        e.printStackTrace();
        }

    }//GEN-LAST:event_akhiriButtonActionPerformed

    private void radioHaltePintu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHaltePintu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHaltePintu4ActionPerformed

    private void radioHalteFarmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHalteFarmasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHalteFarmasiActionPerformed

    private void radioHalteFasilkomtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHalteFasilkomtiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioHalteFasilkomtiActionPerformed
    private String getSelectedHalte () {
    String halte = "";
    
    //create file if not exist
    try{
        String filePath = "D:\\";
        String fileName = "logBus.txt";
        file = new File(filePath+fileName);
        boolean cekeksistensi = file.exists();
            if(cekeksistensi == false){
                file.createNewFile();
                writeFile = new FileWriter(file, true);
            } else {
                writeFile = new FileWriter(file, true);
            }
    } catch (Exception e){
    e.printStackTrace();
    }
    
    if (radioHaltePintu4.isSelected()) {
        halte = "Halte Pintu 4";
    } else if (radioHalteFarmasi.isSelected()) {
        halte = "Halte Farmasi ";
    } else if (radioHalteFMIPA.isSelected()) {
        halte = "Halte FMIPA ";
    } else if (radioHalteFEB.isSelected()) {
        halte = "Halte FEB ";
    } else if (radioHalteFISIP.isSelected()) {
        halte = "Halte FISIP ";
    } else if (radioHalteFH.isSelected()) {
        halte = "Halte FH ";
    } else if (radioHalteFIB.isSelected()) {
        halte = "Halte FIB ";
    } else if (radioHalteGEMA.isSelected()) {
        halte = "Halte GEMA ";
    } else if (radioHalteFK.isSelected()) {
        halte = "Halte 9 ";
    } else if (radioHalteFasilkomti.isSelected()) {
        halte = "Halte Fasilkomti ";
    } 
    
    try{
        if(halte != ""){
            writeFile.write(halte + " " + Vjam + " <br>");
            JOptionPane.showMessageDialog(null, "Halte berhasil ditandai!");
        } else {
            JOptionPane.showMessageDialog(null, "Pilih halte terlebih dahulu!");
        }
            writeFile.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    
    return halte;
    }
    
    public void jam(){
        try{
            java.awt.event.ActionListener taskPerformer = new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent ae){
            String noljam = "";
            String nolmenit = "";
            String noldetik = "";
            Calendar dt = Calendar.getInstance();
            int jam = dt.get(Calendar.HOUR_OF_DAY);
            int menit = dt.get(Calendar.MINUTE);
            int detik = dt.get(Calendar.SECOND);
            if(jam < 10){
                noljam = "0";
            } else if (menit < 10){
                nolmenit = "0";
            } else if (detik < 10) {
                noldetik = "0";

            }
            String Sjam = String.format("%02d", jam);
            String Smenit = String.format("%02d", menit);
            String Sdetik = String.format("%02d", detik);
            Vjam = Sjam + ":" + Smenit + ":" + Sdetik;
            labelForJam.setText(Vjam);
        }};
        new javax.swing.Timer(1000, taskPerformer).start();
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
       }
    
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
            java.util.logging.Logger.getLogger(halamanPengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanPengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanPengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanPengemudi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanPengemudi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akhiriButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelForJam;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton okButton;
    private javax.swing.JRadioButton radioHalteFEB;
    private javax.swing.JRadioButton radioHalteFH;
    private javax.swing.JRadioButton radioHalteFIB;
    private javax.swing.JRadioButton radioHalteFISIP;
    private javax.swing.JRadioButton radioHalteFK;
    private javax.swing.JRadioButton radioHalteFMIPA;
    private javax.swing.JRadioButton radioHalteFarmasi;
    private javax.swing.JRadioButton radioHalteFasilkomti;
    private javax.swing.JRadioButton radioHalteGEMA;
    private javax.swing.JRadioButton radioHaltePintu4;
    // End of variables declaration//GEN-END:variables
}