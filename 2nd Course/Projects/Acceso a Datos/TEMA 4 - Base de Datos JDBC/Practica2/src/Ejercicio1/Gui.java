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

    public static void main(String[] args) {
        AccesoBD.prepararBaseDatos();
        AccesoBD.iniciarComponentes();
    }
}
