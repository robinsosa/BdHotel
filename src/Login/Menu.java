package Login;

import Menu.clientes;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(this);
        setImageLabel(jLabel1,"src/imagenes/fondopromo.jpeg");
    // Esto manda la imagen al fondo
    getContentPane().setComponentZOrder(jLabel1, getContentPane().getComponentCount() - 1);
    }
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnreservar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("imagen de portado, promocion del hotel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        btnreservar.setBackground(new java.awt.Color(255, 255, 0));
        btnreservar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnreservar.setForeground(new java.awt.Color(255, 255, 255));
        btnreservar.setText("RESERVA AHORA");
        btnreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservarActionPerformed(evt);
            }
        });
        getContentPane().add(btnreservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 150, 40));

        btnregresar.setBackground(new java.awt.Color(255, 255, 102));
        btnregresar.setFont(new java.awt.Font("Wide Latin", 1, 18)); // NOI18N
        btnregresar.setForeground(new java.awt.Color(255, 255, 255));
        btnregresar.setText("<");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservarActionPerformed
        // TODO add your handling code here:
        clientes cli = new clientes();
        cli.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnreservarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        login lo = new login();
            lo.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnregresarActionPerformed
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
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
    private javax.swing.JButton btnregresar;
    private javax.swing.JButton btnreservar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
