/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import classes.Conexao;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Brandon Carlos
 */
public class RegistrarUsuarios extends javax.swing.JFrame {
    
    String user;

    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
        user = Login.user;
        
        setTitle("Registrar novo usuário - sessão de " + user);
        setSize(630, 350);
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
                ImageIcon wallpaper = new ImageIcon("src/imagens/wallpaperPrincipal.jpg");
        Icon icone = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icone);
        this.repaint();
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagens/iconehawk.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        cmb_niveis = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_footer = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrando Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_nome.setBackground(new java.awt.Color(153, 153, 255));
        txt_nome.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_nome.setForeground(new java.awt.Color(255, 255, 255));
        txt_nome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 210, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("em@il:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("permissão de:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 210, -1));

        txt_telefone.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefone.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_telefone.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefone.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 210, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 210, -1));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        cmb_niveis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturar", "Tecnico" }));
        getContentPane().add(cmb_niveis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 100));

        jLabel_footer.setText("Criado por Brandon");
        getContentPane().add(jLabel_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int permissao_cmb, validacao = 0;
        String nome, mail, telefone, username, password, permissao_string = "";
        
        mail = txt_mail.getText().trim();
        username = txt_username.getText().trim();
        password = txt_password.getText().trim();
        nome = txt_nome.getText().trim();
        telefone = txt_telefone.getText().trim();
        permissao_cmb = cmb_niveis.getSelectedIndex() + 1;
        
        if(mail.equals("")){
            txt_mail.setBackground(Color.red);
            validacao++;
        }
        if(username.equals("")){
            txt_username.setBackground(Color.red);
            validacao++;
        }
        if(password.equals("")){
            txt_password.setBackground(Color.red);
            validacao++;
        }
        if(nome.equals("")){
            txt_nome.setBackground(Color.red);
            validacao++;
        }
        if(telefone.equals("")){
            txt_telefone.setBackground(Color.red);
            validacao++;
        }
        
        if(permissao_cmb == 1){
            permissao_string = "Administrador";
        } else if(permissao_cmb == 2){
            permissao_string = "Capturar";
        } else if(permissao_cmb == 3){
            permissao_string = "Tecnico";
        }
        
        try {
            
            Connection cn = Conexao.conectar();
            PreparedStatement pst = cn.prepareStatement(
                "select username from usuarios where username = '" + username + "'");
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_username.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, "Nome de usuário não disponivel");
                cn.close();
            } else{
                
                cn.close();
                
                if(validacao == 0){
                    
                    try {
                        
                        Connection cn2 = Conexao.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement(
                            "insert into usuarios values(?,?,?,?,?,?,?,?,?)");
                        
                        pst2.setInt(1, 0);
                        pst2.setString(2, nome);
                        pst2.setString(3, mail);
                        pst2.setString(4, telefone);
                        pst2.setString(5, username);
                        pst2.setString(6, password);
                        pst2.setString(7, permissao_string);
                        pst2.setString(8, "Online");
                        pst2.setString(9, user);
                        
                        pst2.executeUpdate();
                        cn2.close();
                        
                        limpar();
                        
                        txt_mail.setBackground(Color.green);
                        txt_username.setBackground(Color.green);
                        txt_password.setBackground(Color.green);
                        txt_nome.setBackground(Color.green);
                        txt_telefone.setBackground(Color.green);
                        
                        JOptionPane.showMessageDialog(null, "Registrado com sucesso.");
                        this.dispose();
                        
                    } catch (SQLException e) {
                    
                        System.err.println("Erro ao registrar usuário." + e);
                        JOptionPane.showMessageDialog(null, "Erro ao registrar, contacte ao administrador.");
                        
                    }
                    
                } else{
                    JOptionPane.showMessageDialog(null, "Preecha todos os campos");
                }
                
            }
             
        } catch (Exception e) {
           
            System.err.println("Erro ao validar nome de usuário." + e);
            JOptionPane.showMessageDialog(null, "Erro ao comparar usuário!, contacte ao administrador.");
            
        }
        
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveis;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_footer;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_telefone;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

    public void limpar(){
        
        txt_mail.setText("");
        txt_nome.setText("");
        txt_password.setText("");
        txt_telefone.setText("");
        txt_username.setText("");
        cmb_niveis.setSelectedIndex(0);
        
    }

}
