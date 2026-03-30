package Login;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    public login() {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(jlabel1,"src/imagenes/LOGIN.png");
    // Esto manda la imagen al fondo
    getContentPane().setComponentZOrder(jlabel1, getContentPane().getComponentCount() - 1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jtxtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 330));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jtxtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 150, 20));

        jtxtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 150, -1));

        btnlogin.setBackground(new java.awt.Color(51, 0, 255));
        btnlogin.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 140, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        String usuario  = jtxtusername.getText();
    String password = jtxtpassword.getText();
    
    if (usuario.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Algún campo está vacío");
        return; // detiene la ejecución
    }
    
    // Conexión
    try {
        Connection con = Conexion.conectar();
        
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, password);
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            // Usuario
            String nombre = rs.getString("nombre");
            JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
            
        } else {
            // No existe 
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            JOptionPane.showMessageDialog(null, "RESERVAR");
            
            Menu me = new Menu();
            me.setVisible(true);
            this.dispose();
        }
        
        con.close(); 
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btnloginActionPerformed

    private void jtxtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpasswordActionPerformed

    private void jtxtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusernameActionPerformed
 public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
     private void setImageLabel(JLabel labelName, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
