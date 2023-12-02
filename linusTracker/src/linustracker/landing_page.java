package linustracker;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class landing_page extends javax.swing.JFrame {
    static private String showLogLinus;
    
    public landing_page() {
        initComponents();
        announcementController();
        showLogLinus();
        hideBtnPilihLinus();
    }
    
    public void hideBtnPilihLinus(){
        halamanAdmin hadm = new halamanAdmin();
        hadm.countLinusToday();
        int banyakLinus = Integer.parseInt(halamanAdmin.countLinus);

        if (banyakLinus > 1){
            System.out.println("ok");
        } else {
            btnLinus1.setVisible(false);
            btnLinus2.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        logHaltePanel = new javax.swing.JPanel();
        logHalteText = new javax.swing.JLabel();
        buttonRefreshLogLinus = new javax.swing.JButton();
        btnLinus1 = new javax.swing.JButton();
        btnLinus2 = new javax.swing.JButton();
        btnAnnouncement = new javax.swing.JButton();
        panelAnnouncement = new javax.swing.JPanel();
        announcement_body = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linus Tracker");
        setBackground(new java.awt.Color(0, 0, 0));
        setSize(new java.awt.Dimension(800, 520));

        jPanel1.setBackground(new java.awt.Color(210, 105, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(153, 0, 0));
        loginButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setToolTipText("");
        loginButton.setBorderPainted(false);
        loginButton.setFocusable(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 6, 70, 20));

        logHalteText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout logHaltePanelLayout = new javax.swing.GroupLayout(logHaltePanel);
        logHaltePanel.setLayout(logHaltePanelLayout);
        logHaltePanelLayout.setHorizontalGroup(
            logHaltePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logHaltePanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(logHalteText, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        logHaltePanelLayout.setVerticalGroup(
            logHaltePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logHaltePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logHalteText, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(logHaltePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, 400));

        buttonRefreshLogLinus.setBackground(new java.awt.Color(153, 51, 0));
        buttonRefreshLogLinus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        buttonRefreshLogLinus.setForeground(new java.awt.Color(255, 255, 255));
        buttonRefreshLogLinus.setText("Refresh lokasi linus");
        buttonRefreshLogLinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshLogLinusActionPerformed(evt);
            }
        });
        jPanel1.add(buttonRefreshLogLinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 30));

        btnLinus1.setBackground(new java.awt.Color(153, 51, 0));
        btnLinus1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnLinus1.setForeground(new java.awt.Color(255, 255, 255));
        btnLinus1.setText("Linus 1");
        btnLinus1.setMaximumSize(new java.awt.Dimension(70, 23));
        btnLinus1.setMinimumSize(new java.awt.Dimension(70, 23));
        btnLinus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinus1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLinus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 6, -1, 20));

        btnLinus2.setBackground(new java.awt.Color(153, 51, 0));
        btnLinus2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnLinus2.setForeground(new java.awt.Color(255, 255, 255));
        btnLinus2.setText("Linus 2");
        btnLinus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinus2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnLinus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 6, -1, 20));

        btnAnnouncement.setBackground(new java.awt.Color(153, 0, 0));
        btnAnnouncement.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnAnnouncement.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnouncement.setText("Tutup pengumuman");
        btnAnnouncement.setBorderPainted(false);
        btnAnnouncement.setMaximumSize(new java.awt.Dimension(72, 23));
        btnAnnouncement.setMinimumSize(new java.awt.Dimension(72, 23));
        btnAnnouncement.setPreferredSize(new java.awt.Dimension(72, 23));
        btnAnnouncement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnouncementActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 6, 150, 20));

        panelAnnouncement.setBackground(new java.awt.Color(0, 0, 0));

        announcement_body.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        announcement_body.setForeground(new java.awt.Color(255, 255, 255));
        announcement_body.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelAnnouncementLayout = new javax.swing.GroupLayout(panelAnnouncement);
        panelAnnouncement.setLayout(panelAnnouncementLayout);
        panelAnnouncementLayout.setHorizontalGroup(
            panelAnnouncementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnnouncementLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(announcement_body, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelAnnouncementLayout.setVerticalGroup(
            panelAnnouncementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAnnouncementLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(announcement_body, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(panelAnnouncement, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 560, 450));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/peta.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
    login lg = new login();
    
    lg.setVisible(true);
    lg.pack();
    lg.setLocationRelativeTo(null);
    lg.setDefaultCloseOperation(landing_page.EXIT_ON_CLOSE);
    this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void buttonRefreshLogLinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshLogLinusActionPerformed
        // TODO add your handling code here:
        showLogLinus();
    }//GEN-LAST:event_buttonRefreshLogLinusActionPerformed

    private void btnLinus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinus1ActionPerformed
        // TODO add your handling code here:
        logHalteText.setText("");
        logHalteText.setText("Linus1");
        
        String filePath = "D:\\";
        File directory = new File(filePath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith("LogBus.txt"));
        File fileLog = files[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLog))) {
            StringBuilder content = new StringBuilder();
            String text;

            while ((text = reader.readLine()) != null) {
                content.append(text);
            }

            logHalteText.setText("<HTML>" + content.toString() + "</HTML>");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

    }//GEN-LAST:event_btnLinus1ActionPerformed

    private void btnLinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinus2ActionPerformed
        // TODO add your handling code here:
        logHalteText.setText("");
        logHalteText.setText("Linus2");
        
        String filePath = "D:\\";
        File directory = new File(filePath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith("LogBus.txt"));
        File fileLog = files[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileLog))) {
            StringBuilder content = new StringBuilder();
            String text;

            while ((text = reader.readLine()) != null) {
                content.append(text);
            }

            logHalteText.setText("<HTML>" + content.toString() + "</HTML>");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }//GEN-LAST:event_btnLinus2ActionPerformed

    private void btnAnnouncementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnouncementActionPerformed
        // TODO add your handling code here:
        if(!panelAnnouncement.isVisible()){
            announcementController();
            btnAnnouncement.setText("Tutup pengumuman");
        } else {
            btnAnnouncement.setText("Lihat pengumuman");
            announcement_body.setText("");
            panelAnnouncement.setVisible(false);
        }
    }//GEN-LAST:event_btnAnnouncementActionPerformed
        
    public void announcementController(){
    Connection connection = null;
    Statement statement = null;
    
    try {
        // URL, username, dan password untuk koneksi ke database MySQL
        String url = "jdbc:mysql://localhost:3306/linus";
        String user = "root";
        String passwordDb = "";

        // Membuat koneksi ke database
        connection = DriverManager.getConnection(url, user, passwordDb);

        // Membuat statement SQL
        statement = connection.createStatement();

        // Query SQL
        String showAnnouncement = "SELECT announcement_body FROM announcement WHERE date = CURDATE() ORDER BY id DESC LIMIT 1";
        
        // Menjalankan query
        ResultSet rs = statement.executeQuery(showAnnouncement);

        if(rs.next()){
            btnAnnouncement.setVisible(true);
            panelAnnouncement.setVisible(true);
            String announcement = rs.getString("announcement_body");
            announcement_body.setText("<HTML>" + announcement);
        } else {
            panelAnnouncement.setVisible(false);
            announcement_body.setText("");
            btnAnnouncement.setVisible(false);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Menutup statement dan koneksi
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }
    
    public void setNullText(){
        logHalteText.setText("<HTML>Maaf, linus belum beroperasi saat ini<HTML>");
    }
        
    public void showLogLinus() {
        String filePath = "D:\\";
        File directory = new File(filePath);

        File[] files = directory.listFiles();

        File fileLog = null;

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("LogBus.txt")) {
                    fileLog = file;
                    break;
                }
            }
        }

        if (fileLog != null) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileLog))) {
                StringBuilder content = new StringBuilder();
                String text;

                while ((text = reader.readLine()) != null) {
                    content.append(text);
                }

                logHalteText.setText("<HTML>" + content.toString() + "</HTML>");
            } catch (IOException e) {
                System.out.println("Error reading file");
            }
        } else {
            setNullText();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new landing_page().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel announcement_body;
    private javax.swing.JButton btnAnnouncement;
    private javax.swing.JButton btnLinus1;
    private javax.swing.JButton btnLinus2;
    private javax.swing.JButton buttonRefreshLogLinus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logHaltePanel;
    private javax.swing.JLabel logHalteText;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel panelAnnouncement;
    // End of variables declaration//GEN-END:variables
}
