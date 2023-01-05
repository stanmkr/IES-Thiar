package org.example;

import javax.print.DocFlavor;
import javax.swing.*;

/**
 * Created by Stanislav Krastev
 * Practica - org.example
 * Date:  / 2023
 */
public class AppPresionArterial {


    private JPanel panelGeneral;
    private JTextField inputSistolica;
    private JTextField inputDiastolica;
    private JCheckBox atletaCheckBox;
    private JPanel panelPresion;
    private JPanel panelPulsasiones;
    private JPanel panelTemperatura;
    private JTextField inputPulsaciones;
    private JTextField inputTemperatura;
    private JButton botonCalcular;


    public AppPresionArterial() {


        // LISTENER DEL BOTÓN "CALCULAR"
        botonCalcular.addActionListener(e -> {

            // PULSO CARDÍACO ---------------------------------------------------------
            try {
                if (!inputPulsaciones.getText().equals("") && Integer.parseInt(inputPulsaciones.getText()) > 0) {
                    switchPulso(diagnosticoPulso(Integer.parseInt(inputPulsaciones.getText()), atletaCheckBox.isSelected()), Integer.parseInt(inputPulsaciones.getText()));
                    //JOptionPane.showMessageDialog(getPanelGeneral(), diagnosticoPulso(Integer.parseInt(inputPulsaciones.getText())), "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                } else if (!inputPulsaciones.getText().equals("") && Integer.parseInt(inputPulsaciones.getText()) < 0) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, pulsaciones negativas", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputPulsaciones.setText("");
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir unas pulsaciones", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no entero en la casilla de Pulsaciones");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números enteros", "Atención", JOptionPane.ERROR_MESSAGE);
                inputPulsaciones.setText("");
            }

            // TEMPERATURA ---------------------------------------------------------
            try {
                if (!inputTemperatura.getText().equals("") && Double.parseDouble(inputTemperatura.getText()) > 0) {
                    switchTemperatura(diagnosticoTemperatura(Double.parseDouble(inputTemperatura.getText())), Double.parseDouble(inputTemperatura.getText()));
                    //JOptionPane.showMessageDialog(getPanelGeneral(), diagnosticoTemperatura(Double.parseDouble(inputTemperatura.getText())), "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                } else if (!inputTemperatura.getText().equals("") && Integer.parseInt(inputTemperatura.getText()) < 0) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Atención, temperatura negativa", "Atención", JOptionPane.ERROR_MESSAGE);
                    inputTemperatura.setText("");
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir una temperatura", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no numérico en la casilla de Temperatura");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números", "Atención", JOptionPane.ERROR_MESSAGE);
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


    public void switchPulso(int inputUser, int pulsaciones) {
        switch (inputUser) {
            case 0:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente esta por debajo de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente esta en reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente (Atleta) esta por debajo de las pulsaciones en reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente (Atleta) esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente (Atleta) esta en reposo con unas pulsaciones de " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:

        }
    }


    public void switchTemperatura(int inputUser, double temperatura) {
        switch (inputUser) {
            case 0:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente sufre de hipotermia con una temperatura de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente se encuentra en un rango normal temperatura, tiene " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente sufre de febrícula, tiene una temperatura  de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(getPanelGeneral(), "El paciente tiene fiebre, la temperatura es de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
        }
    }

    public int diagnosticoPulso(int pulsaciones, boolean atletaCheckBox) {
        if (pulsaciones < 60 && !atletaCheckBox) {
            return 0;
            // return "El paciente esta por debajo de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones > 100 && !atletaCheckBox) {
            return 1;
            // return "El paciente esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones >= 60 && pulsaciones <= 100 && !atletaCheckBox) {
            return 2;
            // return "El paciente esta en reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones < 40 && atletaCheckBox) {
            return 3;
            // return "El paciente (Atleta) esta por debajo de las pulsaciones en reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones > 60 && atletaCheckBox) {
            return 4;
            // return "El paciente (Atleta) esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else {
            return 5;
            // return "El paciente (Atleta) esta en reposo con unas pulsaciones de " + pulsaciones + " latidos por minuto";
        }
    }


    /**
     * Método que dada una temperatura como parámetro calcula el estado en el que se encuentra el paciente según el rango de la temperatura
     *
     * @param temperatura la temperatura introducida por el usuario
     * @return Un texto con el estado del paciente
     */
    public static int diagnosticoTemperatura(double temperatura) {
        if (temperatura < 35.5) {
            return 0;
            //return "El paciente sufre de hipotermia con una temperatura de " + temperatura + " ºC";
        } else if (temperatura >= 35.5 && temperatura < 37.5) {
            return 1;
            //return "El paciente se encuentra en un rango normal temperatura, tiene " + temperatura + " ºC";
        } else if (temperatura >= 37.5 && temperatura <= 38.0) {
            return 2;
            //return "El paciente sufre de febrícula, tiene una temperatura  de " + temperatura + " ºC";
        } else {
            return 3;
            //return "El paciente tiene fiebre, la temperatura es de " + temperatura + " ºC";
        }
    }


    /**
     * Método que instancia todo lo necesario para arrancar el programa
     */
    public static void run() {
        AppPresionArterial formulario = new AppPresionArterial();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Constantes Vitales | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);

    }

    /**
     * El método main del programa
     */
    public static void main(String[] args) {
        run();
    }
}
