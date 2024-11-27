package bna;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Menu extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JButton boton1, boton2, boton3, boton4;
    private JMenu menuOpciones, menuAcercaDe, menuConfiguracion;
    private JMenuItem miCuenta, miCerrarSesion, miElCreador;
    private JMenuBar mb;
    private String nombre = "", apellido = "";
    private float dinero = 0;
    public static int n;

    public Menu() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Banco Nación");
        getContentPane().setBackground(new Color(50, 115, 139));
        n = 0;
        
        nombre = Registro.nombre;
        dinero = Registro.saldo;
        Depositar.deposito = 0;
        Retirar.retiro = 0;

        mb = new JMenuBar();
        mb.setBackground(new Color(20, 123, 148));
        setJMenuBar(mb);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setFont(new Font("Arial", 1, 14));
        menuOpciones.setForeground(new Color(255, 255, 255));
        mb.add(menuOpciones);

        menuAcercaDe = new JMenu("Acerca de");
        menuAcercaDe.setBackground(new Color(255, 0, 0));
        menuAcercaDe.setFont(new Font("Arial", 1, 14));
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        mb.add(menuAcercaDe);

        menuConfiguracion = new JMenu("Configuración");
        menuConfiguracion.setFont(new Font("Arial", 1, 14));
        menuConfiguracion.setForeground(new Color(0, 0, 0));
        menuOpciones.add(menuConfiguracion);

        miCuenta = new JMenuItem("Cuenta");
        miCuenta.setFont(new Font("Arial", 1, 14));
        miCuenta.setForeground(new Color(0, 0, 0));
        menuConfiguracion.add(miCuenta);
        miCuenta.addActionListener(this);

        miCerrarSesion = new JMenuItem("Cerrar sesión");
        miCerrarSesion.setFont(new Font("Arial", 1, 14));
        miCerrarSesion.setForeground(new Color(0, 0, 0));
        menuOpciones.add(miCerrarSesion);
        miCerrarSesion.addActionListener(this);

        miElCreador = new JMenuItem("Desarrolladores");
        miElCreador.setFont(new Font("Arial", 1, 14));
        miElCreador.setForeground(new Color(0, 0, 0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        ImageIcon imagen = new ImageIcon("images/bna1.png");
        label1 = new JLabel(imagen);
        label1.setBounds(55, -25, 300, 150);
        add(label1);

        ImageIcon imagen2 = new ImageIcon("images/bna2.png");
        label3 = new JLabel(imagen2);
        label3.setBounds(-100, -25, 300, 150);
        add(label3);

        label2 = new JLabel("#Expo2018");
        label2.setBounds(135, 365, 300, 30);
        label2.setFont(new Font("Tahoma", 2, 16));
        label2.setForeground(new Color(255, 255, 255));
        add(label2);

        boton1 = new JButton("Depositar");
        boton1.setBounds(100, 165, 150, 40);
        boton1.setBackground(new Color(255, 255, 255));
        boton1.setFont(new Font("Arial", 1, 18));
        boton1.setForeground(new Color(50, 115, 139));
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("Retirar");
        boton2.setBounds(100, 220, 150, 40);
        boton2.setBackground(new Color(255, 255, 255));
        boton2.setFont(new Font("Arial", 1, 18));
        boton2.setForeground(new Color(50, 115, 139));
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("Salir");
        boton3.setBounds(100, 275, 150, 40);
        boton3.setBackground(new Color(255, 255, 255));
        boton3.setFont(new Font("Arial", 1, 18));
        boton3.setForeground(new Color(50, 115, 139));
        boton3.addActionListener(this);
        add(boton3);

        boton4 = new JButton("Saldo");
        boton4.setBounds(100, 110, 150, 40);
        boton4.setBackground(new Color(255, 255, 255));
        boton4.setFont(new Font("Arial", 1, 18));
        boton4.setForeground(new Color(50, 115, 139));
        boton4.addActionListener(this);
        add(boton4);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            Depositar ventana = new Depositar();
            ventana.setBounds(0, 0, 350, 450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == boton2) {
            Retirar ventana = new Retirar();
            ventana.setBounds(0, 0, 350, 450);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (e.getSource() == boton3) {
            Progreso2 ventana = new Progreso2();
            ventana.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == boton4) {
            JOptionPane.showMessageDialog(null, nombre + " " + Registro.apellido + ", tu saldo actual es de: $" + dinero);
        }

        if (e.getSource() == miCerrarSesion) {
            n = 1;
            Progreso2 ventana = new Progreso2();
            ventana.setVisible(true);
            this.setVisible(false);
        }
        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por alumnos de 3° E de la E.P.E.T. N°4 OEA");
        }
        if (e.getSource() == miCuenta) {
            Cuenta ventana = new Cuenta();
            ventana.setBounds(0, 0, 500, 470);
            ventana.setVisible(true);
            ventana.setResizable(false);
            ventana.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        Menu ventana = new Menu();
        ventana.setBounds(0, 0, 350, 450);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

}
