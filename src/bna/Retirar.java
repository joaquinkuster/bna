package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Retirar extends JFrame implements ActionListener {

    private JLabel label1, label2;
    private JTextField textfield1;
    private JButton boton1, boton2;
    public static float retiro = 0;
    private float dinero = 0;

    public Retirar() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));
        dinero = Registro.saldo;
        

        ImageIcon imagen = new ImageIcon("images/operacion.png");
        label1 = new JLabel(imagen);

        label1.setBounds(
                25, 15, 300, 150);
        add(label1);

        label2 = new JLabel("Dinero a retirar: ");

        label2.setBounds(
                115, 170, 200, 30);
        label2.setFont(
                new Font("Tahoma", 0, 18));
        label2.setForeground(
                new Color(255, 255, 255));
        add(label2);

        textfield1 = new JTextField();

        textfield1.setBounds(
                90, 200, 175, 25);
        textfield1.setBackground(
                new Color(224, 224, 224));
        textfield1.setFont(
                new Font("Arial", 1, 14));
        textfield1.setForeground(
                new Color(0, 0, 0));
        add(textfield1);

        boton1 = new JButton("Retirar");

        boton1.setBounds(
                107, 235, 140, 55);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(
                new Font("Arial", 1, 20));
        boton1.setForeground(
                new Color(50, 115, 139));
        boton1.addActionListener(
                this);
        add(boton1);

        boton2 = new JButton("Atrás");

        boton2.setBounds(
                125, 350, 110, 40);
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Arial", 1, 18));
        boton2.setForeground(new Color(50, 115, 139));
        boton2.addActionListener(this);
        add(boton2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if (textfield1.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos.");

            } else {
                retiro = Integer.parseInt(textfield1.getText());
            }
            if (retiro > dinero) {
                JOptionPane.showMessageDialog(null, "Error! Dinero excedido.");
            } else {
                retiro = Integer.parseInt(textfield1.getText());
                Pregunta ventana = new Pregunta();
                ventana.setBounds(0, 0, 350, 450);
                ventana.setVisible(true);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                this.setVisible(false);
            }
        } else if (e.getSource() == boton2) {
            Menu ventana = new Menu();
            ventana.setBounds(0, 0, 350, 450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Retirar ventana = new Retirar();
        ventana.setBounds(0, 0, 350, 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}

