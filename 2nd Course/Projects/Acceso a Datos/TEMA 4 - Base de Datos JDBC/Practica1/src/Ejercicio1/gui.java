package Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1
 * FECHA:  / 2023
 */
public class gui {
    private JPanel panelSuperior;
    private JButton btnVerDatosActionPerformed;
    private JButton btnServiciosActionPerformed;
    private JButton btnClientes;
    private JButton btnTodosActionPerformed;
    private JTextPane txtPanel;
    private JPanel panelGeneral;
    private JPanel panelSueldo;
    private JTextField txtSueldo;
    private JButton btnIgual;
    private JButton btnMayor;
    private JButton btnMenor;
    private JPanel panelNombre;
    private JButton btnNombreIgual;
    private JButton btnContiene;
    private JTextField txtNombre;
    private JPanel panelFecha;
    private JTextField txtDia;
    private JTextField txtMes;
    private JTextField txtAnio;
    private JButton btnAnterior;
    private JButton btnDespues;
    static JFrame ventana;

    public JTextField getTxtNombre (){
        return txtNombre;
    }
    public JTextPane getTxtPanel() {
        return txtPanel;
    }

    public JTextField getTxtSueldo() {
        return txtSueldo;
    }

    public JTextField getTxtDia() {
        return txtDia;
    }

    public JTextField getTxtMes() {
        return txtMes;
    }

    public JTextField getTxtAnio() {
        return txtAnio;
    }

    public gui() {
        btnVerDatosActionPerformed.addActionListener(e -> {
            AccesoBD.btnVerDatosActionPerformed(e);
        });

        btnServiciosActionPerformed.addActionListener(e -> {
            AccesoBD.btnServiciosActionPerfomed(e);
        });
        btnClientes.addActionListener(e -> {
            AccesoBD.btnClientesActionPerformed(e);
        });
        btnTodosActionPerformed.addActionListener(e -> {
            AccesoBD.btnTodosActionPerformed(e);

        });


        btnIgual.addActionListener(e -> {
            AccesoBD.btnIgualActionPerformed(e);
        });


        btnMayor.addActionListener(e -> {
            AccesoBD.btnMayorActionPerformed(e);
        });
        btnMenor.addActionListener(e -> {
            AccesoBD.btnMenorActionPerformed(e);
        });


        btnNombreIgual.addActionListener(e -> {
            AccesoBD.btnNombreIgualActionPerformed(e);
        });


        btnContiene.addActionListener(e -> {
            AccesoBD.btnContieneActionPerformed(e);
        });


        btnAnterior.addActionListener(e -> {
            AccesoBD.btnAnteriorActionPerformed(e);
        });


        btnDespues.addActionListener(e -> {
            AccesoBD.btnDespuesActionPerformed(e);
        });
    }

    public JPanel getPanelGeneral() {
        return panelSuperior;
    }


    public static void main(String[] args) {
        AccesoBD.initComponents();
        AccesoBD.prepararBaseDatos();


    }
}
