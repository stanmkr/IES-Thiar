package org.example;

import javax.swing.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica
 * FECHA: Enero / 2023
 */
public class CVControlador {
    /**
     * Método que instancia todo lo necesario para arrancar el programa
     */
    public static void run() {

        CVVista formulario = new CVVista();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Constantes Vitales | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);

    }



}
