/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Miche
 */
public class Programa_de_Tareas extends javax.swing.JFrame {
    
    public static LinkedList contenedor = new LinkedList();
    public int buscar;
    
    //DefaultTableModel Modelo = new DefaultTableModel();

    //String usuario;

    /**
     * Creates new form Programa_de_Tareas
     */
    //ArrayList<Datos_Tarea> ArrayTareas;

    public Programa_de_Tareas() {
        initComponents();
        
        //ArrayTareas = new ArrayList<Datos_Tarea>();
        //Modelo.addColumn("Tarea");
        //Modelo.addColumn("Responsable de la tarea");
        //Modelo.addColumn("Fecha");
        //Tabla_Agregar_Tareas.setModel(Modelo);

    }

    //public Programa_de_Tareas(String usuario) {
        //this.usuario = usuario;
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        Panel_Ventana_Tareas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Agregar_Tarea = new javax.swing.JTextField();
        Txt_Responsable = new javax.swing.JTextField();
        Txt_Fecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Button_Guardar_Tarea = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenu1.setText("Enviar a tareas pendientes");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_Ventana_Tareas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 107, 173));
        jLabel1.setText("Tareas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tarea:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Responsable de la tarea:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        Button_Guardar_Tarea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button_Guardar_Tarea.setText("Guardar tarea");
        Button_Guardar_Tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Guardar_TareaActionPerformed(evt);
            }
        });

        jButton1.setText("Ir a tareas pendientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_Ventana_TareasLayout = new javax.swing.GroupLayout(Panel_Ventana_Tareas);
        Panel_Ventana_Tareas.setLayout(Panel_Ventana_TareasLayout);
        Panel_Ventana_TareasLayout.setHorizontalGroup(
            Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ventana_TareasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(Panel_Ventana_TareasLayout.createSequentialGroup()
                        .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Agregar_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(130, 165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Ventana_TareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Ventana_TareasLayout.createSequentialGroup()
                        .addComponent(Button_Guardar_Tarea)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Ventana_TareasLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39))))
        );
        Panel_Ventana_TareasLayout.setVerticalGroup(
            Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Ventana_TareasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txt_Agregar_Tarea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txt_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_Ventana_TareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(Button_Guardar_Tarea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Ventana_Tareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Ventana_Tareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_Guardar_TareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Guardar_TareaActionPerformed

        String Tarea = Txt_Agregar_Tarea.getText();
        String Responsable = Txt_Responsable.getText();
        String Fecha = Txt_Fecha.getText();
        
        Datos_Tarea Datos = new Datos_Tarea(Tarea, Responsable, Fecha);
        contenedor.add(Datos);
        
        Txt_Agregar_Tarea.setText("");
        Txt_Responsable.setText("");
        Txt_Fecha.setText("");
        
        //String[] Datos = new String [3];
        
        //Datos[0] = Txt_Agregar_Tarea.getText();
        //Datos[1] = Txt_Responsable.getText();
        //Datos[2] = Txt_Fecha.getText();
        
        //Modelo.addRow(Datos);
        
        
        /*Datos_Tarea D = new Datos_Tarea();

        JOptionPane.showMessageDialog(rootPane, "Tarea agregada correctamente");

        Tareas_Pendientes T;
        try {

            T = new Tareas_Pendientes();
            T.setVisible(true);
            this.dispose();

        } catch (IOException ex) {
            Logger.getLogger(Programa_de_Tareas.class.getName()).log(Level.SEVERE, null, ex);
        }

        D.setTarea(Txt_Agregar_Tarea.getText());
        D.setResponsable(Txt_Responsable.getText());
        D.setFecha(Txt_Fecha.getText());

        ArrayTareas.add(D);

        //String Datos[] = {Txt_Agregar_Tarea.getText(), Txt_Responsable.getText(), Txt_Fecha.getText()};
        //Tareas_Pendientes.Tabla.addRow(D);
        Tabla.addRow(new Object[]{
            D.getTarea(),
            D.getResponsable(),
            D.getFecha(),});
        */

    }//GEN-LAST:event_Button_Guardar_TareaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        Tareas_Pendientes T;
        T = new Tareas_Pendientes();
        T.setVisible(true);    
        
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
            java.util.logging.Logger.getLogger(Programa_de_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa_de_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa_de_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa_de_Tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa_de_Tareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Guardar_Tarea;
    private javax.swing.JPanel Panel_Ventana_Tareas;
    public static javax.swing.JTextField Txt_Agregar_Tarea;
    public static javax.swing.JTextField Txt_Fecha;
    public static javax.swing.JTextField Txt_Responsable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
