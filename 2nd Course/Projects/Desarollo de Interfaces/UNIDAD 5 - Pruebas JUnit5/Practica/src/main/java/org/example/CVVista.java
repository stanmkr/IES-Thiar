package org.example;

import javax.swing.*;
import static org.example.CVControlador.run;

/**
 * Created by Stanislav Krastev
 * Practica - org.example
 * Date:  / 2023
 */
public class CVVista {


    private JPanel panelGeneral;
    JTextField inputSistolica;
    JTextField inputDiastolica;
     JCheckBox atletaCheckBox;
    private JPanel panelPresion;
    private JPanel panelPulsasiones;
    private JPanel panelTemperatura;
     JTextField inputPulsaciones;
    private JTextField inputTemperatura;
    private JButton botonCalcular;


    public CVVista() {


        // LISTENER DEL BOTÓN "CALCULAR"
        botonCalcular.addActionListener(e -> {
            // PRESIÓN ARTERIAL ---------------------------------------------------------
            try {
                if (!inputSistolica.getText().equals("") && !inputDiastolica.getText().equals("") && Integer.parseInt(inputSistolica.getText()) >= 90 && Integer.parseInt(inputDiastolica.getText()) >= 60) {
                    ConstantesVitales.switchPresionArterial(ConstantesVitales.diagnosticoPresionArterial(Integer.parseInt(inputSistolica.getText()), Integer.parseInt(inputDiastolica.getText())), Integer.parseInt(inputSistolica.getText()), Integer.parseInt(inputDiastolica.getText()));
                } else if (!inputSistolica.getText().equals("") && !inputDiastolica.getText().equals("") && Integer.parseInt(inputSistolica.getText()) < 90) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, no estas en rango, la presión arterial mínima es 90/60", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputSistolica.setText("");
                    inputDiastolica.setText("");
                } else if (!inputSistolica.getText().equals("") && !inputDiastolica.getText().equals("") && Integer.parseInt(inputDiastolica.getText()) < 60) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, no estas en rango, la presión arterial mínima es 90/60", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputSistolica.setText("");
                    inputDiastolica.setText("");
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir las presiones arteriales", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no válido en las casillas de Presión Arterial");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números enteros en las casillas de Presión Arterial", "Atención", JOptionPane.ERROR_MESSAGE);
                inputSistolica.setText("");
                inputDiastolica.setText("");
            }

            // PULSO CARDÍACO ---------------------------------------------------------
            try {
                if (!inputPulsaciones.getText().equals("") && Integer.parseInt(inputPulsaciones.getText()) > 0) {
                    ConstantesVitales.switchPulso(ConstantesVitales.diagnosticoPulso(Integer.parseInt(inputPulsaciones.getText()), atletaCheckBox.isSelected()), Integer.parseInt(inputPulsaciones.getText()));
                } else if (!inputPulsaciones.getText().equals("") && Integer.parseInt(inputPulsaciones.getText()) < 0) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, pulsaciones negativas", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputPulsaciones.setText("");
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir unas pulsaciones", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no entero en la casilla de Pulsaciones");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números enteros en la casilla de Pulsaciones", "Atención", JOptionPane.ERROR_MESSAGE);
                inputPulsaciones.setText("");
            }

            // TEMPERATURA ---------------------------------------------------------
            try {
                if (!inputTemperatura.getText().equals("") && Double.parseDouble(inputTemperatura.getText()) > 0) {
                    ConstantesVitales.switchTemperatura(ConstantesVitales.diagnosticoTemperatura(Double.parseDouble(inputTemperatura.getText())), Double.parseDouble(inputTemperatura.getText()));
                } else if (!inputTemperatura.getText().equals("") && Integer.parseInt(inputTemperatura.getText()) < 0) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, temperatura negativa", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputTemperatura.setText("");
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir una temperatura", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no numérico en la casilla de Temperatura");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números en la casilla de Temperatura", "Atención", JOptionPane.ERROR_MESSAGE);
                inputTemperatura.setText("");
            }
        });
    }


    /**
     * @return devuelve el objeto JPanel "panelGeneral"
     */
    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    /**
     * El método main del programa
     */
    public static void main(String[] args) {
        run();
    }
}
