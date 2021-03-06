/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

/**
 *
 * @author TOFIT
 */
public class PlazoFijo extends javax.swing.JFrame {

    /**
     * Creates new form PlazoFijo
     */
    public PlazoFijo() {
        initComponents();
          this.ListaMeses.addItemListener(new ItemListener(){
          public void itemStateChanged(ItemEvent e){
             if (e.getStateChange()== ItemEvent.SELECTED){
                 switch(e.getItem().toString()){
                     case "3 meses":
                     Interes.setText("1");
                     break;
                     
                     case "6 meses":
                     Interes.setText("3");
                     break;
                     
                     case "12 meses":
                     Interes.setText("9");
                     break;
                
                  }
                 }
                 }
          });
    }
                    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        IconUser = new javax.swing.JLabel();
        returnboton = new javax.swing.JButton();
        Bienvenido = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PlazoFijotxt = new javax.swing.JLabel();
        CalculoPf = new javax.swing.JLabel();
        Mesestxt = new javax.swing.JLabel();
        ListaMeses = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        Cantidadtxt = new javax.swing.JLabel();
        SimboloCashtxt = new javax.swing.JLabel();
        PorcentajeInterestxt = new javax.swing.JLabel();
        Interes = new javax.swing.JTextField();
        InteresGeneradotxt = new javax.swing.JLabel();
        InteresGenerado = new javax.swing.JTextField();
        Interesboton = new javax.swing.JButton();
        SimboloPorcentaje = new javax.swing.JLabel();
        SimboloCashtxt1 = new javax.swing.JLabel();
        Aceptarboton = new javax.swing.JButton();
        Guiatxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/IconUseer.PNG"))); // NOI18N
        IconUser.setText("IconUser");

        returnboton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        returnboton.setForeground(new java.awt.Color(204, 0, 0));
        returnboton.setText("REGRESAR");
        returnboton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        returnboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbotonActionPerformed(evt);
            }
        });

        Bienvenido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bienvenido.setText("Bienvenido,");

        NombreUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        NombreUsuario.setText("Pillajo De La Cruz Johan Ariel");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));

        PlazoFijotxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PlazoFijotxt.setForeground(new java.awt.Color(204, 0, 0));
        PlazoFijotxt.setText("Plazo Fijo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(PlazoFijotxt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(PlazoFijotxt)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        CalculoPf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CalculoPf.setForeground(new java.awt.Color(204, 0, 0));
        CalculoPf.setText("C??lculo de Plazos Fijos");

        Mesestxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mesestxt.setForeground(new java.awt.Color(204, 0, 0));
        Mesestxt.setText("Meses:");

        ListaMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 meses", "6 meses", "12 meses", "" }));
        ListaMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaMesesActionPerformed(evt);
            }
        });

        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });

        Cantidadtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cantidadtxt.setForeground(new java.awt.Color(204, 0, 0));
        Cantidadtxt.setText("Cantidad:");

        SimboloCashtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SimboloCashtxt.setForeground(new java.awt.Color(204, 0, 0));
        SimboloCashtxt.setText("$");

        PorcentajeInterestxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PorcentajeInterestxt.setForeground(new java.awt.Color(204, 0, 0));
        PorcentajeInterestxt.setText("Porcentaje de Inter??s:");

        Interes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresActionPerformed(evt);
            }
        });

        InteresGeneradotxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InteresGeneradotxt.setForeground(new java.awt.Color(204, 0, 0));
        InteresGeneradotxt.setText("Inter??s Generado: ");

        InteresGenerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresGeneradoActionPerformed(evt);
            }
        });

        Interesboton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Interesboton.setForeground(new java.awt.Color(204, 0, 0));
        Interesboton.setText("Generar Interes");
        Interesboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InteresbotonActionPerformed(evt);
            }
        });

        SimboloPorcentaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SimboloPorcentaje.setForeground(new java.awt.Color(204, 0, 0));
        SimboloPorcentaje.setText("%");
        SimboloPorcentaje.setToolTipText("");

        SimboloCashtxt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SimboloCashtxt1.setForeground(new java.awt.Color(204, 0, 0));
        SimboloCashtxt1.setText("$");

        Aceptarboton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Aceptarboton.setForeground(new java.awt.Color(204, 0, 0));
        Aceptarboton.setText("ACEPTAR");
        Aceptarboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarbotonActionPerformed(evt);
            }
        });

        Guiatxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Guiatxt.setText("<html><b>PLANES DE INTER??S FIJO <b><p>\n" +
            "\n " +
            "\n Con nosotros usted va a obtener la tasa de inter??s m??s alta del mercado.<p>\n" +
            "\n" +
            "\n <b>1.- PLAN DE INTER??S FIJO A 3 MESES <b> <p>" +
            "\n Genera 1% en inter??s en su dinero, si es mandado a plazo fijo por 3 meses.<p>\n" +
            "\n" +
            "\n <b>2.- PLAN DE INTER??S FIJO A 6 MESES <b> <p>" +
            "\n Genera 3% en inter??s en su dinero, si es mandado a plazo fijo por 6 meses.<p>\n" +
            "\n" +
            "\n <b>3.-PLAN DE INTER??S FIJO A 12 MESES <b> <p>" +
            "\n Genera 9% en inter??s en su dinero, si es mandado a plazo fijo por 12 meses.<p>\n" +
            "\n" +
            "\n <b>ESTE ??LTIMO ES EL PLAN M??S RECOMENDADO POR NUESTRO BANCO Y POR EL C??AL SEGUIMOS SIENDO L??DER A NIVEL MUNDIAL.<b><html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CalculoPf, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidadtxt)
                            .addComponent(InteresGeneradotxt))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Aceptarboton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(InteresGenerado)
                                    .addComponent(Cantidad))
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SimboloCashtxt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Interesboton))
                            .addComponent(SimboloCashtxt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mesestxt)
                            .addComponent(PorcentajeInterestxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ListaMeses, 0, 118, Short.MAX_VALUE)
                            .addComponent(Interes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SimboloPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Guiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(CalculoPf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Mesestxt)
                            .addComponent(ListaMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PorcentajeInterestxt)
                            .addComponent(SimboloPorcentaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cantidadtxt)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SimboloCashtxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InteresGeneradotxt)
                            .addComponent(InteresGenerado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SimboloCashtxt1)
                            .addComponent(Interesboton))
                        .addGap(14, 14, 14)
                        .addComponent(Aceptarboton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Guiatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(488, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(returnboton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(returnboton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbotonActionPerformed
        MenuCuentas pre= new MenuCuentas();
        pre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnbotonActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void ListaMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaMesesActionPerformed
        String meses = ListaMeses.getSelectedItem().toString();
    }//GEN-LAST:event_ListaMesesActionPerformed

    private void InteresGeneradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresGeneradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InteresGeneradoActionPerformed

    private void InteresbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresbotonActionPerformed
           //Lee el valor y almacena la variable
        Integer i= Integer.parseInt(Interes.getText());
        Integer v=Integer.parseInt(Cantidad.getText());
        //Calculamos el interes
        Integer interesG = (v/100)*(i);
        InteresGenerado.setText(Integer.toString(interesG));
    }//GEN-LAST:event_InteresbotonActionPerformed

    private void AceptarbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarbotonActionPerformed
    JOptionPane.showMessageDialog(this," Plazo Fijo Generado");
      InteresGenerado.setText(null);
       Interes.setText("");
       Cantidad.setText(null);
    }//GEN-LAST:event_AceptarbotonActionPerformed

    private void InteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InteresActionPerformed

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
           char validar=evt.getKeyChar();
     if (Character.isLetter(validar)){
         getToolkit().beep();
         evt.consume();
         
         JOptionPane.showMessageDialog(rootPane, "Ingresar solo n??meros");
     }
    }//GEN-LAST:event_CantidadKeyTyped

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
            java.util.logging.Logger.getLogger(PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlazoFijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlazoFijo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Aceptarboton;
    public javax.swing.JLabel Bienvenido;
    public javax.swing.JLabel CalculoPf;
    public javax.swing.JTextField Cantidad;
    public javax.swing.JLabel Cantidadtxt;
    public javax.swing.JLabel Guiatxt;
    public javax.swing.JLabel IconUser;
    public javax.swing.JTextField Interes;
    public javax.swing.JTextField InteresGenerado;
    public javax.swing.JLabel InteresGeneradotxt;
    public javax.swing.JButton Interesboton;
    public javax.swing.JComboBox<String> ListaMeses;
    public javax.swing.JLabel Mesestxt;
    public javax.swing.JLabel NombreUsuario;
    public javax.swing.JLabel PlazoFijotxt;
    public javax.swing.JLabel PorcentajeInterestxt;
    public javax.swing.JLabel SimboloCashtxt;
    public javax.swing.JLabel SimboloCashtxt1;
    public javax.swing.JLabel SimboloPorcentaje;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JButton returnboton;
    // End of variables declaration//GEN-END:variables
}


