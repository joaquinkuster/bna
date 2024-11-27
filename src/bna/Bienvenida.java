package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener {

    private JTextField textfield1;
    private JPasswordField textfield2;
    private JLabel label1, label2, label3, label4, label5;
    private JButton boton, boton2;
    private String nombre, contrasena;
    public static int ca;

    public Bienvenida() {
    	this.setUndecorated(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));

        ImageIcon imagen = new ImageIcon("images/bna1.png");
        label1 = new JLabel(imagen);
        label1.setBounds(55, 15, 300, 150);
        add(label1);

        ImageIcon imagen2 = new ImageIcon("images/bna2.png");
        label5 = new JLabel(imagen2);
        label5.setBounds(-100, 15, 300, 150);
        add(label5);

        label2 = new JLabel("Clave: ");
        label2.setBounds(45, 220, 200, 30);
        label2.setFont(new Font("Tahoma", 0, 18));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        label3 = new JLabel("#Expo2018");
        label3.setBounds(135, 375, 300, 30);
        label3.setFont(new Font("Tahoma", 2, 16));
        label3.setForeground(new Color(255, 255, 255));
        add(label3);

        label4 = new JLabel("Nombre: ");
        label4.setBounds(45, 180, 200, 30);
        label4.setFont(new Font("Tahoma", 0, 18));
        label4.setForeground(new Color(255, 255, 255));
        add(label4);

        textfield2 = new JPasswordField();
        textfield2.setBounds(125, 220, 175, 25);
        textfield2.setBackground(new Color(224, 224, 224));
        textfield2.setFont(new Font("Arial", 1, 14));
        textfield2.setForeground(new Color(0, 0, 0));
        add(textfield2);

        textfield1 = new JTextField();
        textfield1.setBounds(125, 180, 175, 25);
        textfield1.setBackground(new Color(224, 224, 224));
        textfield1.setFont(new Font("Arial", 0, 14));
        textfield1.setForeground(new Color(0, 0, 0));
        add(textfield1);

        boton = new JButton("Ingresar");
        boton.setBounds(200, 300, 100, 30);
        boton.setBackground(new Color(255, 255, 255));
        boton.setFont(new Font("Arial", 1, 16));
        boton.setForeground(new Color(50, 115, 139));
        boton.addActionListener(this);
        boton.setEnabled(true);
        add(boton);

        boton2 = new JButton("Registrarse");
        boton2.setBounds(50, 300, 125, 30);
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Arial", 1, 16));
        boton2.setForeground(new Color(50, 115, 139));
        boton2.addActionListener(this);
        add(boton2);

    }

    public void esconder() {
        this.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) {
            if (e.getSource() == boton) {
                if (ca == 1) {
                } else {
                    JOptionPane.showMessageDialog(null, "No posee ninguna cuenta activa.");
                }

                if (textfield1.getText().length() == 0 || textfield2.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos.");
                } else {
                    nombre = textfield1.getText().trim();
                    contrasena = textfield2.getText().trim();
                }
                if (Registro.nombre.equals(nombre)) {
                    if (Registro.contrasena.equals(contrasena)) {
                        this.setVisible(false);
                        Progreso ventana = new Progreso();
                        ventana.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error! Datos incorrectos.");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Error! Datos incorrectos.");
                }
            }
        }

        if (e.getSource() == boton2) {
            Registro ventana = new Registro();
            ventana.setBounds(0, 0, 500, 409);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0, 0, 350, 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
