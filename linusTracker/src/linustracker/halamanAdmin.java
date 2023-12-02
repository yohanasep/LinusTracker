package linustracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class halamanAdmin extends javax.swing.JFrame {

    static String countLinus;

    public halamanAdmin() {
        initComponents();
        hideFields();
        jam();

        countLinusToday();
        showListBusAccount();
    }

    private void hideFields() {
        buttonHapus.setVisible(false);
    }

    private void showFieldsTambahBus() {
        jLabel10.setVisible(true);
        inputUsername.setVisible(true);
        jLabel1.setVisible(true);
        inputPass.setVisible(true);
        buttonTambah.setVisible(true);
    }

    private void showFieldsHapusBus() {
        jLabel1.setVisible(false);
        inputPass.setVisible(false);
        buttonTambah.setVisible(false);
        buttonHapus.setVisible(true);
    }

    public void countLinusToday() {
        String filePath = "D:\\";
        File directory = new File(filePath);

        File[] files = directory.listFiles();
        int count = 0;

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("LogBus.txt")) {
                    count++;
                }
            }
            banyakLinusBeroperasi.setText(String.valueOf(count));
        }

        this.countLinus = String.valueOf(count);
    }

    private void showListBusAccount() {
        listBus.setVisible(true);

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
            String showListBusQuery = "SELECT username FROM user_bus";

            // Menjalankan query
            ResultSet rs = statement.executeQuery(showListBusQuery);

            StringBuilder usernames = new StringBuilder();

            boolean isLast = false;
            while (rs.next()) {
                String username = rs.getString("username");
                isLast = rs.isLast();
                usernames.append(username);
                if (!isLast) {
                    usernames.append(", \n");
                }
            }

            listBus.setText(usernames.toString());
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelForJam = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        listBus = new javax.swing.JLabel();
        buttonHapusBus = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        inputPass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        buttonTambahBus = new javax.swing.JButton();
        buttonBuatPengumuman = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        announcementContainer = new javax.swing.JTextArea();
        buttonHapus = new javax.swing.JButton();
        buttonKirimPengumuman = new javax.swing.JButton();
        banyakLinusBeroperasi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setBackground(new java.awt.Color(153, 102, 0));
        setMinimumSize(new java.awt.Dimension(770, 650));
        setPreferredSize(new java.awt.Dimension(770, 650));
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
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 90, -1));

        labelForJam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelForJam.setText("00:00:00");
        getContentPane().add(labelForJam, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Data Bus");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Selamat datang, Admin!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Banyak linus yang sedang beroperasi : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        listBus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(listBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 690, 50));

        buttonHapusBus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHapusBus.setText("Hapus Bus");
        buttonHapusBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusBusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHapusBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 130, 50));

        buttonTambah.setBackground(new java.awt.Color(210, 105, 30));
        buttonTambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, 110, 40));

        inputPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPassActionPerformed(evt);
            }
        });
        getContentPane().add(inputPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 300, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Username");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        inputUsername.setActionCommand("<Not Set>");
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 300, 50));

        buttonTambahBus.setBackground(new java.awt.Color(153, 102, 0));
        buttonTambahBus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonTambahBus.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambahBus.setText("Tambah Bus");
        buttonTambahBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahBusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonTambahBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 50));

        buttonBuatPengumuman.setBackground(new java.awt.Color(153, 102, 0));
        buttonBuatPengumuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBuatPengumuman.setForeground(new java.awt.Color(255, 255, 255));
        buttonBuatPengumuman.setText("Buat Pengumuman");
        buttonBuatPengumuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuatPengumumanActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBuatPengumuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 180, 50));

        announcementContainer.setColumns(20);
        announcementContainer.setRows(5);
        announcementContainer.setCaretColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(announcementContainer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 330, 150));

        buttonHapus.setBackground(new java.awt.Color(210, 105, 30));
        buttonHapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 110, 40));

        buttonKirimPengumuman.setBackground(new java.awt.Color(210, 105, 30));
        buttonKirimPengumuman.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonKirimPengumuman.setForeground(new java.awt.Color(255, 255, 255));
        buttonKirimPengumuman.setText("Kirim");
        buttonKirimPengumuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKirimPengumumanActionPerformed(evt);
            }
        });
        getContentPane().add(buttonKirimPengumuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 110, 40));

        banyakLinusBeroperasi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(banyakLinusBeroperasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHapusBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusBusActionPerformed
        hideFields();
        showFieldsHapusBus();
    }//GEN-LAST:event_buttonHapusBusActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        // TODO add your handling code here:
        String username = inputUsername.getText();
        String password = inputPass.getText();

        if (!username.isEmpty() && !password.isEmpty()) {
            // Jika kedua kolom diisi, simpan data ke database
            saveUserBusToDatabase();
        } else {
            JOptionPane.showMessageDialog(this, "Username dan password harus diisi!");
        }
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonTambahBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahBusActionPerformed
        // TODO add your handling code here:
        hideFields();
        showFieldsTambahBus();
    }//GEN-LAST:event_buttonTambahBusActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        landing_page landingPage = new landing_page();

        landingPage.setVisible(true);
        landingPage.pack();
        landingPage.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPassActionPerformed

    private void buttonBuatPengumumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuatPengumumanActionPerformed
        // TODO add your handling code here:
        announcementContainer.setLineWrap(true);
        announcementContainer.setWrapStyleWord(true);
        buttonKirimPengumuman.setVisible(true);
    }//GEN-LAST:event_buttonBuatPengumumanActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        DeleteDataSupir();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonKirimPengumumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKirimPengumumanActionPerformed
        // TODO add your handling code here:
        String announcement = announcementContainer.getText();

        if (!announcement.isEmpty()) {
            saveAnnouncementToDatabase();
        } else {
            JOptionPane.showMessageDialog(this, "Tulis pengumuman terlebih dahulu!");
        }
    }//GEN-LAST:event_buttonKirimPengumumanActionPerformed

    private void saveUserBusToDatabase() {
        // Ambil data dari JTextField
        String username = inputUsername.getText();
        String password = inputPass.getText();

        // Menjalankan koneksi ke database
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

            // Query SQL untuk menambahkan data bus ke dalam tabel
            String query = "INSERT INTO user_bus (username, password) VALUES ('" + username + "', '" + password + "')";

            // Menjalankan query
            statement.executeUpdate(query);

            // Notifikasi bahwa data berhasil ditambahkan
            JOptionPane.showMessageDialog(this, "Data supir berhasil ditambahkan ke dalam database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

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

    private void DeleteDataSupir() {
        String username = inputUsername.getText();

        if (!username.isEmpty()) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus data linus '" + username + "'?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

            if (dialogResult == JOptionPane.YES_OPTION) {
                // Menjalankan koneksi ke database
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

                    // Query SQL untuk menghapus data bus dari tabel
                    String query = "DELETE FROM user_bus WHERE username = '" + username + "' ";

                    // Menjalankan query
                    int rowsAffected = statement.executeUpdate(query);

                    // Cek apakah data berhasil dihapus
                    if (rowsAffected > 0) {
                        // Notifikasi bahwa data berhasil dihapus
                        JOptionPane.showMessageDialog(this, "Data bus berhasil dihapus di database!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        // Notifikasi bahwa data tidak ditemukan
                        JOptionPane.showMessageDialog(this, "Data bus tidak ditemukan.", "Error", JOptionPane.ERROR_MESSAGE);
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

        } else {
            JOptionPane.showMessageDialog(this, "Masukkan username yang ingin dihapus terlebih dahulu!");
        }
    }

    private void saveAnnouncementToDatabase() {
        String announcement = announcementContainer.getText();
        LocalDate today = LocalDate.now();

        // Menjalankan koneksi ke database
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
            String query = "INSERT INTO announcement (announcement_body, date) VALUES ('" + announcement + "', '" + today + "')";

            // Menjalankan query
            statement.executeUpdate(query);

            // Notifikasi bahwa data berhasil ditambahkan
            JOptionPane.showMessageDialog(this, "Pengumuman berhasil dibuat!", "Sukses", JOptionPane.INFORMATION_MESSAGE);

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

    public void jam() {
        try {
            ActionListener taskPerformer = new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    String Vjam;
                    String noljam = "";
                    String nolmenit = "";
                    String noldetik = "";
                    Calendar dt = Calendar.getInstance();
                    int jam = dt.get(Calendar.HOUR_OF_DAY);
                    int menit = dt.get(Calendar.MINUTE);
                    int detik = dt.get(Calendar.SECOND);
                    if (jam < 10) {
                        noljam = "0";
                    } else if (menit < 10) {
                        nolmenit = "0";
                    } else if (detik < 10) {
                        noldetik = "0";

                    }
                    String Sjam = String.format("%02d", jam);
                    String Smenit = String.format("%02d", menit);
                    String Sdetik = String.format("%02d", detik);
                    Vjam = Sjam + ":" + Smenit + ":" + Sdetik;
                    labelForJam.setText(Vjam);
                }
            };
            new javax.swing.Timer(1000, taskPerformer).start();
        } catch (Exception e) {
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
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanAdmin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea announcementContainer;
    private javax.swing.JLabel banyakLinusBeroperasi;
    private javax.swing.JButton buttonBuatPengumuman;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonHapusBus;
    private javax.swing.JButton buttonKirimPengumuman;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JButton buttonTambahBus;
    private javax.swing.JTextField inputPass;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelForJam;
    private javax.swing.JLabel listBus;
    private javax.swing.JButton logoutButton;
    // End of variables declaration//GEN-END:variables

}
