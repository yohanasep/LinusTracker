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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        logHaltePanel = new javax.swing.JPanel();
        logHalteText = new javax.swing.JLabel();
        panelAnnouncement = new javax.swing.JPanel();
        announcement_body = new javax.swing.JLabel();
        buttonRefreshLogLinus = new javax.swing.JButton();
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
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 6, 70, 20));

        logHalteText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout logHaltePanelLayout = new javax.swing.GroupLayout(logHaltePanel);
        logHaltePanel.setLayout(logHaltePanelLayout);
        logHaltePanelLayout.setHorizontalGroup(
            logHaltePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logHaltePanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
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
    login loginPage = new login();
    
    loginPage.setVisible(true);
    loginPage.pack();
    loginPage.setLocationRelativeTo(null);
    loginPage.setDefaultCloseOperation(landing_page.EXIT_ON_CLOSE);
    this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void buttonRefreshLogLinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshLogLinusActionPerformed
        // TODO add your handling code here:
        showLogLinus();
    }//GEN-LAST:event_buttonRefreshLogLinusActionPerformed
        
    public void announcementController(){
    boolean showAnnouncemennt = false;
    if(showAnnouncemennt){
    panelAnnouncement.setVisible(true);
        
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
        String showAnnouncement = "SELECT announcement_body FROM announcement ORDER BY date DESC LIMIT 1";
                 
        // Menjalankan query
        ResultSet rs = statement.executeQuery(showAnnouncement);

        while(rs.next()){
            String announcement = rs.getString("announcement_body");
            announcement_body.setText(announcement);
            System.out.println(announcement);

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
        } else {
            panelAnnouncement.setVisible(false);
        }
    }
    
    public void setNullText(){
        logHalteText.setText("<HTML>Maaf, linus belum beroperasi saat ini<HTML>");
    }
        
    public void showLogLinus() {
        String filePath = "D:\\";
        String fileName = "logBus.txt";

        File fileLog = new File(filePath + fileName);
        
        boolean cekeksistensi = fileLog.exists();
        if(cekeksistensi == false){
            setNullText();
        }
           
        try(BufferedReader reader = new BufferedReader(new FileReader(fileLog))){
            StringBuilder content= new StringBuilder();
            String text;
         
            while ((text = reader.readLine()) != null) {
                content.append(text);
            }  

            logHalteText.setText("<HTML>" + content.toString() + "</HTML>"); 
        } catch (IOException e) {
            System.out.println("file not exist");
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel announcement_body;
    private javax.swing.JButton buttonRefreshLogLinus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logHaltePanel;
    private javax.swing.JLabel logHalteText;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel panelAnnouncement;
    // End of variables declaration//GEN-END:variables
}
