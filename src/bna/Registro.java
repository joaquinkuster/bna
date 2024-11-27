package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Registro extends JFrame implements ActionListener {

    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11, label12;
    private JButton boton1, boton2, boton3, boton4;
    private JComboBox combo1, combo2;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
    public static String nombre, apellido, contrasena, codigo, pais, sexo, dia, mes, ano;
    public static float saldo;

    public Registro() {
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));
        Bienvenida.ca = 1;

        ImageIcon imagen = new ImageIcon("images/logo.png");
        label10 = new JLabel(imagen);
        label10.setBounds(160, -65, 550, 250);
        add(label10);

        label12 = new JLabel("(Opcional)");
        label12.setBounds(225, 80, 200, 30);
        label12.setFont(new Font("Tahoma", 0, 14));
        label12.setForeground(new Color(0, 0, 0));
        add(label12);

        label12 = new JLabel("(Opcional)");
        label12.setBounds(335, 110, 200, 30);
        label12.setFont(new Font("Tahoma", 0, 14));
        label12.setForeground(new Color(0, 0, 0));
        add(label12);

        label12 = new JLabel("(Opcional)");
        label12.setBounds(355, 140, 200, 30);
        label12.setFont(new Font("Tahoma", 0, 14));
        label12.setForeground(new Color(0, 0, 0));
        add(label12);

        label1 = new JLabel("Nombre: ");
        label1.setBounds(15, 20, 200, 30);
        label1.setFont(new Font("Tahoma", 3, 16));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        txt1 = new JTextField();
        txt1.setBounds(105, 20, 110, 25);
        txt1.setBackground(new Color(224, 224, 224));
        txt1.setFont(new Font("Arial", 0, 14));
        txt1.setForeground(new Color(0, 0, 0));
        add(txt1);

        label2 = new JLabel("Apellido: ");
        label2.setBounds(15, 50, 200, 30);
        label2.setFont(new Font("Tahoma", 3, 16));
        label2.setForeground(new Color(0, 0, 0));
        add(label2);

        txt2 = new JTextField();
        txt2.setBounds(105, 50, 110, 25);
        txt2.setBackground(new Color(224, 224, 224));
        txt2.setFont(new Font("Arial", 0, 14));
        txt2.setForeground(new Color(0, 0, 0));
        add(txt2);

        label3 = new JLabel("Sexo: ");
        label3.setBounds(15, 80, 200, 30);
        label3.setFont(new Font("Tahoma", 3, 16));
        label3.setForeground(new Color(0, 0, 0));
        add(label3);

        combo1 = new JComboBox();
        combo1.setBounds(105, 80, 110, 25);
        combo1.setBackground(new java.awt.Color(224, 224, 224));
        combo1.setFont(new java.awt.Font("Arial", 2, 16));
        combo1.setForeground(new java.awt.Color(0, 0, 0));
        add(combo1);
        combo1.addItem("");
        combo1.addItem("Hombre");
        combo1.addItem("Mujer");

        label4 = new JLabel("Fecha de nacimiento: ");
        label4.setBounds(15, 110, 200, 30);
        label4.setFont(new Font("Tahoma", 3, 16));
        label4.setForeground(new Color(0, 0, 0));
        add(label4);

        txt3 = new JTextField();
        txt3.setBounds(203, 110, 23, 25);
        txt3.setBackground(new Color(224, 224, 224));
        txt3.setFont(new Font("Arial", 0, 14));
        txt3.setForeground(new Color(0, 0, 0));
        add(txt3);

        txt4 = new JTextField();
        txt4.setBounds(245, 110, 23, 25);
        txt4.setBackground(new Color(224, 224, 224));
        txt4.setFont(new Font("Arial", 0, 14));
        txt4.setForeground(new Color(0, 0, 0));
        add(txt4);

        txt5 = new JTextField();
        txt5.setBounds(289, 110, 40, 25);
        txt5.setBackground(new Color(224, 224, 224));
        txt5.setFont(new Font("Arial", 0, 14));
        txt5.setForeground(new Color(0, 0, 0));
        add(txt5);

        label8 = new JLabel("-");
        label8.setBounds(230, 110, 200, 30);
        label8.setFont(new Font("Tahoma", 3, 18));
        label8.setForeground(new Color(0, 0, 0));
        add(label8);

        label9 = new JLabel("-");
        label9.setBounds(273, 110, 200, 30);
        label9.setFont(new Font("Tahoma", 3, 18));
        label9.setForeground(new Color(0, 0, 0));
        add(label9);

        label5 = new JLabel("Nacionalidad: ");
        label5.setBounds(15, 140, 200, 30);
        label5.setFont(new Font("Tahoma", 3, 16));
        label5.setForeground(new Color(0, 0, 0));
        add(label5);

        combo2 = new JComboBox();
        combo2.setBounds(140, 140, 210, 25);
        combo2.setBackground(new java.awt.Color(224, 224, 224));
        combo2.setFont(new java.awt.Font("Arial", 2, 16));
        combo2.setForeground(new java.awt.Color(0, 0, 0));
        add(combo2);
        combo2.addItem("Selecciona el pais");
        combo2.addItem("Argentina");
        combo2.addItem("Brasil");
        combo2.addItem("Uruguay");
        combo2.addItem("Paraguay");
        combo2.addItem("Bolivia");
        combo2.addItem("Chile");
        combo2.addItem("Venezuela");
        combo2.addItem("Colombia");
        combo2.addItem("Ecuador");

        JPanel jPanel1 = new JPanel();
        Border bordejpanel = new TitledBorder(new EtchedBorder(), "Datos Personales");
        jPanel1.setBorder(bordejpanel);
        jPanel1.setSize(494, 185);
        add(jPanel1);

        label6 = new JLabel("Salario: ");
        label6.setBounds(15, 205, 200, 30);
        label6.setFont(new Font("Tahoma", 3, 16));
        label6.setForeground(new Color(0, 0, 0));
        add(label6);

        txt6 = new JTextField();
        txt6.setBounds(105, 205, 110, 25);
        txt6.setBackground(new Color(224, 224, 224));
        txt6.setFont(new Font("Arial", 0, 14));
        txt6.setForeground(new Color(0, 0, 0));
        add(txt6);

        /*
        boton1 = new JButton("Modificar");
        boton1.setBounds(240, 205, 93, 25);
        boton1.setBackground(new Color(224, 224, 224));
        boton1.setFont(new Font("Arial", 0, 14));
        boton1.setForeground(new Color(0, 0, 0));
        boton1.addActionListener(this);
        add(boton1);
         */
        
        JPanel jPanel2 = new JPanel();
        Border bordejpanel2 = new TitledBorder(new EtchedBorder(), "Salario");
        jPanel2.setBorder(bordejpanel2);
        jPanel2.setSize(494, 65);
        jPanel2.setLocation(0, 185);
        add(jPanel2);

        label7 = new JLabel("Código de seguridad: ");
        label7.setBounds(15, 270, 200, 30);
        label7.setFont(new Font("Tahoma", 3, 16));
        label7.setForeground(new Color(0, 0, 0));
        add(label7);

        txt7 = new JTextField();
        txt7.setBounds(210, 270, 40, 25);
        txt7.setBackground(new Color(224, 224, 224));
        txt7.setFont(new Font("Arial", 0, 14));
        txt7.setForeground(new Color(0, 0, 0));
        add(txt7);

        /*
        boton2 = new JButton("Cancelar");
        boton2.setBounds(270, 325, 95, 30);
        boton2.setBackground(new Color(224, 224, 224));
        boton2.setFont(new Font("Arial", 0, 14));
        boton2.setForeground(new Color(0, 0, 0));
        boton2.addActionListener(this);
        add(boton2);
         */
        boton3 = new JButton("Continuar");
        boton3.setBounds(380, 335, 100, 30);
        boton3.setBackground(new Color(224, 224, 224));
        boton3.setFont(new Font("Arial", 0, 14));
        boton3.setForeground(new Color(0, 0, 0));
        boton3.addActionListener(this);
        add(boton3);

        /*
        boton4 = new JButton("Ingresar");
        boton4.setBounds(275, 335, 90, 30);
        boton4.setBackground(new Color(224, 224, 224));
        boton4.setFont(new Font("Arial", 0, 14));
        boton4.setForeground(new Color(0, 0, 0));
        boton4.addActionListener(this);
        add(boton4);
        */
        
        JPanel jPanel3 = new JPanel();
        Border bordejpanel3 = new TitledBorder(new EtchedBorder(), "Tarjeta");
        jPanel3.setBorder(bordejpanel3);
        jPanel3.setSize(494, 65);
        jPanel3.setLocation(0, 250);
        add(jPanel3);

        label11 = new JLabel("Contraseña: ");
        label11.setBounds(15, 340, 200, 30);
        label11.setFont(new Font("Tahoma", 3, 16));
        label11.setForeground(new Color(0, 0, 0));
        add(label11);

        txt8 = new JTextField();
        txt8.setBounds(135, 340, 110, 25);
        txt8.setBackground(new Color(224, 224, 224));
        txt8.setFont(new Font("Arial", 0, 14));
        txt8.setForeground(new Color(0, 0, 0));
        add(txt8);

        JPanel jPanel4 = new JPanel();
        Border bordejpanel4 = new TitledBorder(new EtchedBorder(), "Seguridad");
        jPanel4.setBorder(bordejpanel4);
        jPanel4.setSize(494, 65);
        jPanel4.setLocation(0, 315);
        add(jPanel4);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton3) {
            if (txt1.getText().length() == 0 || txt2.getText().length() == 0 || txt6.getText().length() == 0 || txt7.getText().length() == 0 || txt8.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "Debes rellenar los campos más importantes.");
            } else {

                if (txt7.getText().length() == 4) {
                    if (txt8.getText().length() >= 6) {
                        pais = (String) combo2.getSelectedItem();
                        sexo = (String) combo1.getSelectedItem();
                        dia = txt3.getText().trim();
                        mes = txt4.getText().trim();
                        ano = txt5.getText().trim();
                        codigo = txt7.getText().trim();
                        contrasena = txt8.getText().trim();
                        nombre = txt1.getText().trim();
                        apellido = txt2.getText().trim();
                        saldo = Integer.parseInt(txt6.getText());
                        Bienvenida ventana = new Bienvenida();
                        ventana.setBounds(0, 0, 350, 450);
                        ventana.setVisible(true);
                        ventana.setResizable(false);
                        ventana.setLocationRelativeTo(null);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña debe tener un mínimo de 6 caracteres.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El código de seguridad debe tener 4 caracteres.");
                }
            }

        }
    }

    public void esconder() {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        Registro ventana = new Registro();
        ventana.setBounds(0, 0, 500, 409);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }
}
