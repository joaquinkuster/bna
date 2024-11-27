package bna;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Progreso2 extends javax.swing.JFrame {

    private Timer tiempo;
    int c;
    public final static int TWO_SECOND = 5;
    private JLabel label2;

    public Progreso2() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(50, 115, 139));
        barra.setVisible(false);
        setTitle("Banco Nación");

        ImageIcon imagen = new ImageIcon("images/tarjeta.png");
        label2 = new JLabel(imagen);
        label2.setBounds(-35, -10, 350, 200);
        add(label2);

        boton1.setBackground(new Color(255, 255, 255));
        boton1.setForeground(new Color(30, 115, 139));
        boton1.setFont(new Font("Tahoma", 1, 18));
        boton1.setBounds(90, 230, 110, 40);
        add(boton1);

        label1.setFont(new Font("Tahoma", 0, 18));
        label1.setBounds(45, 190, 200, 30);
        add(label1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        boton1 = new javax.swing.JButton();
        barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("        Retire Tarjeta");

        boton1.setText("Retirar");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label1)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            c++;
            barra.setValue(c);
            if (c == 100) {
                tiempo.stop();
                esconder();
                retirar();
            }
        }
    }

    public void accion() {

    }

    public void activacion() {
        c = -1;
        barra.setValue(0);
        barra.setStringPainted(true);
        tiempo = new Timer(TWO_SECOND, new TimerListener());
        barra.setVisible(true);
        activar();
    }

    public void esconder() {
        Progreso2 ventana = new Progreso2();
        ventana.setVisible(false);
    }

    public void retirar() {
        if (Menu.n == 1) {
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0, 0, 350, 450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        } else {
            System.exit(0);
        }
    }

    public void activar() {
        tiempo.start();
    }

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if (evt.getSource() == boton1) {
            activacion();
        }
    }//GEN-LAST:event_boton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Progreso2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton boton1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}
