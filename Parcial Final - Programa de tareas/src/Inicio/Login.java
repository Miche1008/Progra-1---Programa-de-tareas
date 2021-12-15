/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Miche
 */
public class Login extends javax.swing.JFrame {
    
    public static ArrayList<Datos_Usuarios> Array = new ArrayList<Datos_Usuarios>();

    /**
     * Creates new form Login
     */
    public Login() {
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

        Panel_Login = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre_Login = new javax.swing.JTextField();
        Txt_Apellidos_Login = new javax.swing.JTextField();
        Txt_Correo_Login = new javax.swing.JTextField();
        Txt_Usuario_Login = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Panel_Crear_Usuario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Panel_Iniciar_Sesión = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Password_Field = new javax.swing.JPasswordField();
        CheckBox_VerContraseña = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Login.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Panel Login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Registre su nuevo usuario");

        Txt_Nombre_Login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Txt_Nombre_Login.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Nombre_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Nombre_Login.setText("Nombre");
        Txt_Nombre_Login.setBorder(null);
        Txt_Nombre_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_Nombre_LoginMousePressed(evt);
            }
        });

        Txt_Apellidos_Login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Txt_Apellidos_Login.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Apellidos_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Apellidos_Login.setText("Apellidos");
        Txt_Apellidos_Login.setBorder(null);
        Txt_Apellidos_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_Apellidos_LoginMousePressed(evt);
            }
        });

        Txt_Correo_Login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Txt_Correo_Login.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Correo_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Correo_Login.setText("Correo");
        Txt_Correo_Login.setBorder(null);
        Txt_Correo_Login.setPreferredSize(new java.awt.Dimension(51, 19));
        Txt_Correo_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_Correo_LoginMousePressed(evt);
            }
        });
        Txt_Correo_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_Correo_LoginActionPerformed(evt);
            }
        });

        Txt_Usuario_Login.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Txt_Usuario_Login.setForeground(new java.awt.Color(204, 204, 204));
        Txt_Usuario_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Txt_Usuario_Login.setText("Usuario");
        Txt_Usuario_Login.setBorder(null);
        Txt_Usuario_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Txt_Usuario_LoginMousePressed(evt);
            }
        });

        Panel_Crear_Usuario.setBackground(new java.awt.Color(56, 107, 173));
        Panel_Crear_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Crear_Usuario.setPreferredSize(new java.awt.Dimension(144, 42));
        Panel_Crear_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Crear_UsuarioMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Crear usuario");

        javax.swing.GroupLayout Panel_Crear_UsuarioLayout = new javax.swing.GroupLayout(Panel_Crear_Usuario);
        Panel_Crear_Usuario.setLayout(Panel_Crear_UsuarioLayout);
        Panel_Crear_UsuarioLayout.setHorizontalGroup(
            Panel_Crear_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Crear_UsuarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Panel_Crear_UsuarioLayout.setVerticalGroup(
            Panel_Crear_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Crear_UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Panel_Iniciar_Sesión.setBackground(new java.awt.Color(56, 107, 173));
        Panel_Iniciar_Sesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Iniciar_Sesión.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_Iniciar_SesiónMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar sesión");

        javax.swing.GroupLayout Panel_Iniciar_SesiónLayout = new javax.swing.GroupLayout(Panel_Iniciar_Sesión);
        Panel_Iniciar_Sesión.setLayout(Panel_Iniciar_SesiónLayout);
        Panel_Iniciar_SesiónLayout.setHorizontalGroup(
            Panel_Iniciar_SesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Iniciar_SesiónLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        Panel_Iniciar_SesiónLayout.setVerticalGroup(
            Panel_Iniciar_SesiónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Iniciar_SesiónLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Password_Field.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Password_Field.setForeground(new java.awt.Color(204, 204, 204));
        Password_Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password_Field.setText("****");
        Password_Field.setBorder(null);
        Password_Field.setMinimumSize(new java.awt.Dimension(48, 20));
        Password_Field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Password_FieldMousePressed(evt);
            }
        });

        CheckBox_VerContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBox_VerContraseña.setText("Ver contraseña");
        CheckBox_VerContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CheckBox_VerContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckBox_VerContraseñaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CheckBox_VerContraseñaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Panel_LoginLayout = new javax.swing.GroupLayout(Panel_Login);
        Panel_Login.setLayout(Panel_LoginLayout);
        Panel_LoginLayout.setHorizontalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Panel_Iniciar_Sesión, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Correo_Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Txt_Nombre_Login, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jSeparator4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Txt_Apellidos_Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Txt_Usuario_Login))))))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(Password_Field, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(CheckBox_VerContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(Panel_Crear_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel_LoginLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_LoginLayout.setVerticalGroup(
            Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_LoginLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_LoginLayout.createSequentialGroup()
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Apellidos_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nombre_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Txt_Usuario_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Correo_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(Password_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CheckBox_VerContraseña, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_Crear_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(Panel_Iniciar_Sesión, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_Nombre_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Nombre_LoginMousePressed

        Txt_Nombre_Login.setText("");
        Txt_Nombre_Login.setForeground(Color.black);
        
    }//GEN-LAST:event_Txt_Nombre_LoginMousePressed

    private void Txt_Apellidos_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Apellidos_LoginMousePressed

        Txt_Apellidos_Login.setText("");
        Txt_Apellidos_Login.setForeground(Color.black);
        
    }//GEN-LAST:event_Txt_Apellidos_LoginMousePressed

    private void Txt_Correo_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Correo_LoginMousePressed

        Txt_Correo_Login.setText("");
        Txt_Correo_Login.setForeground(Color.black);
        
    }//GEN-LAST:event_Txt_Correo_LoginMousePressed

    private void Txt_Usuario_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_Usuario_LoginMousePressed

        Txt_Usuario_Login.setText("");
        Txt_Usuario_Login.setForeground(Color.black);
        
    }//GEN-LAST:event_Txt_Usuario_LoginMousePressed

    private void Panel_Iniciar_SesiónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Iniciar_SesiónMouseClicked

        Inicio_de_Sesión I = new Inicio_de_Sesión();
        I.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Panel_Iniciar_SesiónMouseClicked

    private void Password_FieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Password_FieldMousePressed

        Password_Field.setText("");
        Password_Field.setForeground(Color.black);
        
    }//GEN-LAST:event_Password_FieldMousePressed

    private void CheckBox_VerContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBox_VerContraseñaMouseClicked

        if (CheckBox_VerContraseña.isSelected()) {
            Password_Field.setEchoChar((char) 0);
        } else {
            Password_Field.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBox_VerContraseñaMouseClicked

    private void CheckBox_VerContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckBox_VerContraseñaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBox_VerContraseñaMousePressed

    private void Panel_Crear_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_Crear_UsuarioMouseClicked
        
        try {
            
            Datos_Usuarios U = new Datos_Usuarios(Txt_Nombre_Login.getText(), Txt_Apellidos_Login.getText(), Txt_Correo_Login.getText(), Txt_Usuario_Login.getText(), Password_Field.getText());

            Array.add(U);
            
            Envío_de_Correos C = new Envío_de_Correos(Txt_Correo_Login.getText(), Txt_Nombre_Login.getText(), Txt_Usuario_Login.getText(), Password_Field.getText());
            C.Envio_de_Correos();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error, verifique sus datos");
        }

    }//GEN-LAST:event_Panel_Crear_UsuarioMouseClicked

    private void Txt_Correo_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_Correo_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_Correo_LoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_VerContraseña;
    private javax.swing.JPanel Panel_Crear_Usuario;
    private javax.swing.JPanel Panel_Iniciar_Sesión;
    private javax.swing.JPanel Panel_Login;
    private javax.swing.JPasswordField Password_Field;
    private javax.swing.JTextField Txt_Apellidos_Login;
    private javax.swing.JTextField Txt_Correo_Login;
    private javax.swing.JTextField Txt_Nombre_Login;
    private javax.swing.JTextField Txt_Usuario_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
