package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pregunta extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4;
    private JButton boton1, boton2;
    private float n1, n2;

    public Pregunta() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));
        n2 = Depositar.deposito;
        n1 = Retirar.retiro;
        

        ImageIcon imagen = new ImageIcon("images/bna1.png");
        label1 = new JLabel(imagen);
        label1.setBounds(25, 45, 300, 150);
        add(label1);

        ImageIcon imagen2 = new ImageIcon("images/bna2.png");
        label4 = new JLabel(imagen2);
        label4.setBounds(25, -10, 300, 150);
        add(label4);

        label2 = new JLabel("¿Estás seguro?");
        label2.setBounds(110, 190, 200, 30);
        label2.setFont(new Font("Tahoma", 0, 20));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("#Expo2018");
        label3.setBounds(135, 375, 300, 30);
        label3.setFont(new Font("Tahoma", 2, 16));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        boton1 = new JButton("SI");
        boton1.setBounds(50, 230, 100, 50);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Arial", 1, 20));
        boton1.setForeground(new Color(50, 115, 139));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("NO");
        boton2.setBounds(200, 230, 100, 50);
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Arial", 1, 20));
        boton2.setForeground(new Color(50, 115, 139));
        boton2.addActionListener(this);
        add(boton2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if (n1 == 0) {
                Registro.saldo = Registro.saldo + n2;
                Transaccion ventana = new Transaccion();
                ventana.setBounds(0, 0, 350, 450);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            } else if (n2 == 0) {
                Registro.saldo = Registro.saldo - n1;
                Retiro ventana = new Retiro();
                ventana.setBounds(0, 0, 350, 450);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        } else if (e.getSource() == boton2) {
            if (n1 == 0) {
                Depositar ventana = new Depositar();
                ventana.setBounds(0, 0, 350, 450);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            } else if (n2 == 0) {
                Retirar ventana = new Retirar();
                ventana.setBounds(0, 0, 350, 450);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        Pregunta ventana = new Pregunta();
        ventana.setBounds(0, 0, 350, 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}

