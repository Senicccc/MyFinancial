/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author HP
 */
public class Menu1 extends javax.swing.JFrame {

    /**
     * Creates new form Menu1
     */
    public Menu1() {
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

        iconPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginAuthBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        passwordLoginTF = new javax.swing.JPasswordField();
        usernameLoginTF = new javax.swing.JTextField();
        registerPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namaLengkapRegisterTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usernameRegisterTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        passwordRegisterTF = new javax.swing.JPasswordField();
        registerAuthBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyFinancial");
        setMinimumSize(new java.awt.Dimension(800, 500));

        iconPanel.setBackground(new java.awt.Color(89, 140, 88));

        loginBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon("D:\\Semester 3\\Pemrograman Berorientasi Objek\\UAS\\src\\Icon\\Logo.png")); // NOI18N

        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 0, 0));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout iconPanelLayout = new javax.swing.GroupLayout(iconPanel);
        iconPanel.setLayout(iconPanelLayout);
        iconPanelLayout.setHorizontalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(96, 96, 96))
        );
        iconPanelLayout.setVerticalGroup(
            iconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iconPanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn)
                .addGap(18, 18, 18))
        );

        parentPanel.setBackground(new java.awt.Color(255, 255, 255));
        parentPanel.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(89, 140, 88));
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Username");

        loginAuthBtn.setBackground(new java.awt.Color(89, 140, 88));
        loginAuthBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginAuthBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginAuthBtn.setText("Login");
        loginAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginAuthBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Belum punya akun? silakan klik Register!");

        passwordLoginTF.setMinimumSize(new java.awt.Dimension(64, 26));
        passwordLoginTF.setPreferredSize(new java.awt.Dimension(64, 26));

        usernameLoginTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameLoginTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLoginTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(loginAuthBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLoginTF, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                            .addComponent(passwordLoginTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(usernameLoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(passwordLoginTF, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(loginAuthBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );

        parentPanel.add(loginPanel, "card2");

        registerPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(89, 140, 88));
        jLabel2.setText("REGISTER");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Password");

        namaLengkapRegisterTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        namaLengkapRegisterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLengkapRegisterTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        usernameRegisterTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameRegisterTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameRegisterTFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nama Lengkap");

        registerAuthBtn.setBackground(new java.awt.Color(89, 140, 88));
        registerAuthBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerAuthBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerAuthBtn.setText("Register");
        registerAuthBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerAuthBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("Sudah punya akun? silakan klik Login");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel9)
                            .addGap(155, 155, 155))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(usernameRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(namaLengkapRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(passwordRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(registerAuthBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(157, 157, 157))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaLengkapRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordRegisterTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerAuthBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(26, 26, 26))
        );

        parentPanel.add(registerPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        parentPanel.removeAll();
        parentPanel.add(registerPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        parentPanel.removeAll();
        parentPanel.add(loginPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginAuthBtnActionPerformed
        String Username, Password, query, fname = null, passdb = null;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/myfinancial";
        SUser = "root";
        SPass = "";
        int notFound = 0;
        int idUser = 0;
        
          try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
        Statement st = con.createStatement();

        if ("".equals(usernameLoginTF.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Username Harus di Isi", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(passwordLoginTF.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Password Harus di Isi", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Username = usernameLoginTF.getText();
            Password = passwordLoginTF.getText();

            query = "SELECT * FROM user WHERE Username='" + Username + "'";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                passdb = rs.getString("Password");
                fname = rs.getString("NamaLengkap");
                idUser = rs.getInt("id_user"); 
                notFound = 1;
            }

            if (notFound == 1 && Password.equals(passdb)) {
                Menu2 Home = new Menu2(idUser);
                Home.setUser(fname, idUser); 
                Home.setVisible(true);
                Home.pack();
                Home.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Username atau Password Salah!", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            passwordRegisterTF.setText(""); 
        }
    } catch (Exception e) {
        System.out.println("Error!" + e.getMessage());
    }
    }//GEN-LAST:event_loginAuthBtnActionPerformed

    private void usernameRegisterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameRegisterTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameRegisterTFActionPerformed

    private void namaLengkapRegisterTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaLengkapRegisterTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLengkapRegisterTFActionPerformed

    private void registerAuthBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerAuthBtnActionPerformed

        String Username, NamaLengkap, Password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3306/myfinancial";
        SUser = "root";
        SPass = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(usernameRegisterTF.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Username Harus di Isi", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(namaLengkapRegisterTF.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Nama Lengkap Harus di Isi", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(passwordRegisterTF.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password Harus di Isi", 
                        "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Username = usernameRegisterTF.getText();
                NamaLengkap = namaLengkapRegisterTF.getText(); 
                Password = passwordRegisterTF.getText();
                
                query = "INSERT INTO user(Username, NamaLengkap, Password)" +
                        "VALUES ('"+Username+"', '"+NamaLengkap+"', '"+Password+"')";
                
                st.execute(query);
                usernameRegisterTF.setText("");
                namaLengkapRegisterTF.setText(""); 
                passwordRegisterTF.setText("");
                showMessageDialog(null, "Akun Berhasil di Buat!");
                
            }
        } catch (Exception e){
            System.out.println("Error!" + e.getMessage());
        } 
    }//GEN-LAST:event_registerAuthBtnActionPerformed

    private void usernameLoginTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLoginTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameLoginTFActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginAuthBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField namaLengkapRegisterTF;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPasswordField passwordLoginTF;
    private javax.swing.JPasswordField passwordRegisterTF;
    private javax.swing.JButton registerAuthBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField usernameLoginTF;
    private javax.swing.JTextField usernameRegisterTF;
    // End of variables declaration//GEN-END:variables
}