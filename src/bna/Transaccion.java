package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Transaccion extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JButton boton1;

    public Transaccion() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));
        

        ImageIcon imagen = new ImageIcon("images/ticket.png");
        label1 = new JLabel(imagen);
        label1.setBounds(15, 25, 350, 200);
        add(label1);

        label2 = new JLabel("Transacción exitosa");
        label2.setBounds(100, 210, 200, 30);
        label2.setFont(new Font("Tahoma", 0, 20));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("#Expo2018");
        label3.setBounds(140, 375, 300, 30);
        label3.setFont(new Font("Tahoma", 2, 16));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        boton1 = new JButton("Menu");
        boton1.setBounds(115, 255, 140, 60);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Arial", 1, 20));
        boton1.setForeground(new Color(50, 115, 139));
        boton1.addActionListener(this);
        add(boton1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Menu ventana = new Menu();
            ventana.setBounds(0, 0, 350, 450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Transaccion ventana = new Transaccion();
        ventana.setBounds(0, 0, 350, 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}