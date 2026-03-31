package Menu;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class clientes extends javax.swing.JFrame {
    public clientes() {
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
        jLabel6 = new javax.swing.JLabel();
        jtxtnombre = new javax.swing.JTextField();
        jtxtapellido = new javax.swing.JTextField();
        jtxtdni = new javax.swing.JTextField();
        jtxtcorreo = new javax.swing.JTextField();
        jtxttelefono = new javax.swing.JTextField();
        btnsiguienteC = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtusername = new javax.swing.JTextField();
        jtxtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 102, 0));
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel5.setText("Correo:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jtxtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombreActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        jtxtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtapellidoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, -1));

        jtxtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdniActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, -1));

        jtxtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtcorreoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, -1));

        jtxttelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttelefonoActionPerformed(evt);
            }
        });
        jPanel3.add(jtxttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 20));

        btnsiguienteC.setBackground(new java.awt.Color(255, 255, 0));
        btnsiguienteC.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnsiguienteC.setForeground(new java.awt.Color(255, 255, 255));
        btnsiguienteC.setText("SIGUIENTE");
        btnsiguienteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiguienteCActionPerformed(evt);
            }
        });
        jPanel3.add(btnsiguienteC, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 237, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Username:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel8.setText("Password:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));
        jPanel3.add(jtxtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 130, -1));
        jPanel3.add(jtxtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 130, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreActionPerformed

    private void jtxtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtapellidoActionPerformed

    private void jtxtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdniActionPerformed

    private void jtxtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcorreoActionPerformed

    private void jtxttelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttelefonoActionPerformed

    private void btnsiguienteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiguienteCActionPerformed
        // TODO add your handling code here:
        String nombre = jtxtnombre.getText();
        String apellido = jtxtapellido.getText();
        String dni = jtxtdni.getText();
        String telefono = jtxttelefono.getText();
        String correo = jtxtcorreo.getText();
        String username = jtxtusername.getText();
        String password = new String(jtxtpassword.getPassword());
        
        if (nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() || telefono.isEmpty() || correo.isEmpty() 
                || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null , "Todos los campos son obligatorios");
            return; 
        }
        if (dni.length() != 8) {
            JOptionPane.showMessageDialog(null, "El DNI debe tener 8 digitos");
            return;
        }
        if (telefono.length() != 9) {
            JOptionPane.showMessageDialog(null, "El Telefono debe tener 9 digitos");
            return;
        }
        try {
        Connection con = Conexion.conectar();
        
        String sqlCliente = "INSERT INTO clientes (nombre, apellido, dni, telefono, correo) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement psCliente = con.prepareStatement(sqlCliente, Statement.RETURN_GENERATED_KEYS);
        psCliente.setString(1, nombre);
        psCliente.setString(2, apellido);
        psCliente.setString(3, dni);
        psCliente.setString(4, telefono);
        psCliente.setString(5, correo);
        psCliente.executeUpdate();
        
        // Obtener el ID  
        ResultSet rs = psCliente.getGeneratedKeys();
        int idCliente = 0;
        if (rs.next()) {
            idCliente = rs.getInt(1);
        }
         // Guardar usuario 
        String sqlUsuario = "INSERT INTO usuarios (usuario, password, nombre, id_cliente) VALUES (?, ?, ?, ?)";
        PreparedStatement psUsuario = con.prepareStatement(sqlUsuario);
        psUsuario.setString(1, username);
        psUsuario.setString(2, password);
        psUsuario.setString(3, nombre + " " + apellido);
        psUsuario.setInt(4, idCliente);
        psUsuario.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Cliente registrado correctamente");
        con.close();
        
        // Abrir siguiente ventana
        Habitacion hab = new Habitacion();
        hab.setVisible(true);
        this.dispose();
        
    } catch (Exception e) {
        if (e.getMessage().contains("Duplicate")) {
            JOptionPane.showMessageDialog(null, "El DNI o username ya existe");
        } else {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnsiguienteCActionPerformed
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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsiguienteC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtxtapellido;
    private javax.swing.JTextField jtxtcorreo;
    private javax.swing.JTextField jtxtdni;
    private javax.swing.JTextField jtxtnombre;
    private javax.swing.JPasswordField jtxtpassword;
    private javax.swing.JTextField jtxttelefono;
    private javax.swing.JTextField jtxtusername;
    // End of variables declaration//GEN-END:variables
}
