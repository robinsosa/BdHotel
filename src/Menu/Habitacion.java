package Menu;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Habitacion extends javax.swing.JFrame {
    public Habitacion() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxttipo = new javax.swing.JTextField();
        jtxtnumero = new javax.swing.JTextField();
        jtxtpiso = new javax.swing.JTextField();
        jtxtestado = new javax.swing.JTextField();
        btnsiguienteH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Habitacion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DE HABITACION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel2.setText("Tipo:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 55, -1, -1));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel3.setText("Piso:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 105, -1, -1));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel4.setText("Numero:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 145, -1, -1));

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 185, -1, -1));

        jtxttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttipoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 51, 168, -1));

        jtxtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnumeroActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 141, 168, -1));

        jtxtpiso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpisoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 101, 167, -1));

        jtxtestado.setForeground(new java.awt.Color(204, 204, 204));
        jtxtestado.setText("Procesando...");
        jtxtestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtestadoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 181, 164, -1));

        btnsiguienteH.setBackground(new java.awt.Color(255, 255, 0));
        btnsiguienteH.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnsiguienteH.setForeground(new java.awt.Color(255, 255, 255));
        btnsiguienteH.setText("SIGUIENTE");
        btnsiguienteH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteHActionPerformed(evt);
            }
        });
        jPanel3.add(btnsiguienteH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttipoActionPerformed

    private void jtxtpisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpisoActionPerformed

    private void jtxtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnumeroActionPerformed

    private void jtxtestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtestadoActionPerformed

    private void btnsiguienteHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteHActionPerformed
        // TODO add your handling code here:
        String tipo   = jtxttipo.getText();
        String piso   = jtxtpiso.getText();
        String numero = jtxtnumero.getText();
    
    if (tipo.isEmpty() || piso.isEmpty() || numero.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        return;
    }
    try {
        Integer.parseInt(piso);
        Integer.parseInt(numero);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Piso y Número deben ser valores numericos");
        return;
    }
    
    // Guardar en base de datos
    try {
        Connection con = Conexion.conectar();
        
        String sql = "INSERT INTO habitaciones (tipo, piso, numero) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tipo);
        ps.setInt(2, Integer.parseInt(piso));
        ps.setInt(3, Integer.parseInt(numero));
        
        ps.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Habitación registrada correctamente");
        con.close();
        
        // Abrir siguiente ventana
        Reserva res = new Reserva();
        res.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        if (e.getMessage().contains("Duplicate")) {
            JOptionPane.showMessageDialog(null, "Este numero de habitación ya existe");
        } else {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
    }//GEN-LAST:event_btnsiguienteHActionPerformed
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
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsiguienteH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtxtestado;
    private javax.swing.JTextField jtxtnumero;
    private javax.swing.JTextField jtxtpiso;
    private javax.swing.JTextField jtxttipo;
    // End of variables declaration//GEN-END:variables
}
