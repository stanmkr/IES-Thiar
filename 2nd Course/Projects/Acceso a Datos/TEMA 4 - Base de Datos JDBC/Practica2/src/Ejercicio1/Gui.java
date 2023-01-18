package Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica2
 * FECHA:  / 2023
 */
public class Gui {
    private JPanel panelGeneral;
    private JButton btnTrabajadores;
    private JPanel panelCampoTexto;
    private JTextPane panelTexto;
    private JPanel panelAlta;
    private JTextField txtDNI;
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtSueldo;
    private JTextField txtDia;
    private JTextField txtMatricula;
    private JButton altaButton;
    private JTextField txtAnio;
    private JTextField txtMes;
    private JPanel panelBajas;
    private JButton btnEliminar;
    private JTextField txtDNIEliminar;
    private JPanel panelModificar;
    private JButton btnModficar;
    private JTextField txtModDNI;
    private JTextField txtModNombre;
    private JTextField txtModApellidos;
    private JTextField txtModSueldo;
    private JTextField txtModDia;
    private JTextField txtModMes;
    private JTextField txtModAnio;
    private JTextField txtModMatricula;
    private JButton btnBuscar;
    static JFrame ventanaPrincipal;

    public JTextPane getPanelTexto() {
        return panelTexto;
    }

    public Gui() {
        btnTrabajadores.addActionListener(e -> {
            AccesoBD.btnTrabajadoresActionPerformed(e);
        });


        altaButton.addActionListener(e -> {
            AccesoBD.btnAltaActionPerformed(e);
        });


        btnEliminar.addActionListener(e -> {
            AccesoBD.btnEliminarActionPerformed(e);
        });


        btnModficar.addActionListener(e -> {
            AccesoBD.btnModificarActionPerformed(e);
        });


        btnBuscar.addActionListener(e -> {
            AccesoBD.btnBuscarActionPerformed(e);
        });
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public JTextField getTxtDNI() {
        return txtDNI;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellidos() {
        return txtApellidos;
    }

    public JTextField getTxtSueldo() {
        return txtSueldo;
    }

    public JTextField getTxtDia() {
        return txtDia;
    }

    public JTextField getTxtMatricula() {
        return txtMatricula;
    }

    public JTextField getTxtAnio() {
        return txtAnio;
    }

    public JTextField getTxtMes() {
        return txtMes;
    }


    public JTextField getTxtModDNI() {
        return txtModDNI;
    }

    public JTextField getTxtModNombre() {
        return txtModNombre;
    }

    public JTextField getTxtModApellidos() {
        return txtModApellidos;
    }

    public JTextField getTxtModSueldo() {
        return txtModSueldo;
    }

    public JTextField getTxtModDia() {
        return txtModDia;
    }

    public JTextField getTxtModMes() {
        return txtModMes;
    }

    public JTextField getTxtModAnio() {
        return txtModAnio;
    }

    public JTextField getTxtModMatricula() {
        return txtModMatricula;
    }

    public JTextField getTxtDNIEliminar() {
        return txtDNIEliminar;
    }

    public static void main(String[] args) {
        AccesoBD.prepararBaseDatos();
        AccesoBD.iniciarComponentes();
    }
}
