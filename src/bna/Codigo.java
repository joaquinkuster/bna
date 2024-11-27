package bna;

import java.awt.*;
import javax.swing.*;

public class Codigo extends javax.swing.JFrame {

    public Codigo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 115, 139));
        setTitle("Banco Nación");
        

        boton1.setBackground(new Color(255, 255, 255));
        boton1.setForeground(new Color(50, 115, 139));
        boton1.setFont(new Font("Tahoma", 1, 18));
        boton1.setSize(244, 45);
        add(boton1);

        label1.setFont(new Font("Tahoma", 0, 18));
        add(label1);

        txt1.setFont(new Font("Tahoma", 0, 16));
        add(txt1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Codigo de Seguridad:");

        txt1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        boton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton1.setText("Continuar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(boton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (evt.getSource() == boton1) {
            if (txt1.getText().length() < 4 || txt1.getText().length() > 4) {
                JOptionPane.showMessageDialog(null, "El código de seguridad debe tener 4 caracteres.");
            } else {
                if (txt1.getText().equals(Registro.codigo)) {
                    Menu ventana = new Menu();
                    ventana.setBounds(0, 0, 350, 450);
                    ventana.setVisible(true);
                    ventana.setResizable(false);
                    ventana.setLocationRelativeTo(null);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Error! Datos incorrectos.");
                }
            }
        }
    }//GEN-LAST:event_boton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JLabel label1;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
