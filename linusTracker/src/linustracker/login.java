package linustracker;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {

    static String username;
    private String password;
   
    Connection connect;
    public login() {
        initComponents();
        createConnection();
    }
    
    void createConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/linus", "root", "");
        } catch(ClassNotFoundException ex){
            System.out.println ("gagal " + ex.getMessage());        
        } catch(SQLException ex){
            System.out.println("gagal2 " + ex.getMessage());    
        }
        }
    
    public void setSavedUname(){
        this.username = username_login.getText();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new java.awt.TextField();
        jPanel1 = new javax.swing.JPanel();
        username_login = new javax.swing.JTextField();
        button_login = new javax.swing.JButton();
        password_login = new javax.swing.JTextField();
        backButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        textField1.setText("textField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("loginFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(800, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(210, 105, 30));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username_login.setCaretColor(new java.awt.Color(1, 1, 1));
        username_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_loginActionPerformed(evt);
            }
        });
        jPanel1.add(username_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 190, 20));

        button_login.setBackground(new java.awt.Color(204, 102, 0));
        button_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("Login");
        button_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });
        jPanel1.add(button_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 70, 30));

        password_login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        password_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_loginActionPerformed(evt);
            }
        });
        jPanel1.add(password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 190, 20));

        backButton.setBackground(new java.awt.Color(204, 102, 0));
        backButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<- Kembali");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 520));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 520));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 520));
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_loginActionPerformed

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
            if(username_login.getText().equals("") || password_login.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Username dan Password harus diisi!");
            } else {
                // Query untuk mengambil data dari database untuk login sebagai supir
                String supirQuery = "SELECT * FROM user_bus WHERE username=? AND password=?";

                // Query untuk mengambil data dari database untuk login sebagai admin
                String adminQuery = "SELECT * FROM admin WHERE username=? AND password=?";

                try {
                    // Check login as supir
                    if (checkLogin(supirQuery, username_login.getText(), password_login.getText())) {
                        String username = username_login.getText();

                        JOptionPane.showMessageDialog(null, "Login sebagai supir berhasil!");
                        setSavedUname();
                        
                        halamanPengemudi pengemudiPage = new halamanPengemudi();
                        pengemudiPage.setVisible(true);
                        pengemudiPage.pack();
                        pengemudiPage.setLocationRelativeTo(null);
                        pengemudiPage.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
                        this.dispose();
                       } 
                    
                    // Check login as admin
                    else if (checkLogin(adminQuery, username_login.getText(), password_login.getText())) {
                        JOptionPane.showMessageDialog(null, "Login sebagai admin berhasil!");
                        halamanAdmin adminPage = new halamanAdmin();
                        adminPage.setVisible(true);
                        adminPage.pack();
                        adminPage.setLocationRelativeTo(null);
                        adminPage.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
                        this.dispose();
                    } 
                    // Invalid login
                    else {
                        JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
             }

    private boolean checkLogin(String query, String username, String password) throws SQLException {
        try (PreparedStatement preparedStatement = connect.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // Jika query mengembalikan hasil, login berhasil
            return resultSet.next();
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void password_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_loginActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        landing_page lp = new landing_page();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton backButton;
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField password_login;
    private java.awt.TextField textField1;
    private javax.swing.JTextField username_login;
    // End of variables declaration//GEN-END:variables
}
