package org.example;

import javax.swing.*;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica
 * FECHA: Enero / 2023
 */
public class ConstantesVitales {
    static CVVista vista = new CVVista();


    /**
     * Método que dada una presión arterial sistólica y diastólica como s calcula el grado de tensión que tiene el paciente
     * Este método se usará para los tests
     *
     * @param sistolica  la presión sistólica introducida por el usuario
     * @param diastolica la presión diastólica introducida por el usuario
     * @return un número según el grado de tensión en el que se encuentra el usuario
     */
    public static int diagnosticoPresionArterial(int sistolica, int diastolica) {
        if (sistolica >= 90 && sistolica <= 120 && diastolica >= 60 && diastolica <= 80) {
            return 1;
            // Presión arterial normal: hasta 120 mm/Hg y hasta 80 de presión diastólica.
        } else if (sistolica > 120 && sistolica <= 140 && diastolica > 80 && diastolica <= 90) {
            return 2;
            // Presión arterial: hasta 140 de presión sistólica y 90 de presión diastólica.
        } else if (sistolica >= 140 && sistolica <= 159 && diastolica >= 91 && diastolica <= 99) {
            return 3;
            // Hipertensión grado 1: entre 140-159 de presión sistólica y 91-99 de presión diastólica.
        } else if (sistolica >= 160 && sistolica <= 180 && diastolica >= 100 && diastolica <= 110) {
            return 4;
            // Hipertensión grado 2: entre 160-179 de presión sistólica y 100 a 109 de presión diastólica.
        } else if (sistolica > 180 && diastolica > 110) {
            // Hipertensión grado 3: más de 180 de presión sistólica y más de 110 de la diastólica.
            return 5;
        } else {
            return 0;
        }
    }

    public static void switchPresionArterial(int inputUser, int sistolica, int diastolica) {
        switch (inputUser) {
            case 1:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene una presión arterial normal " + sistolica + "/" + diastolica, "Presión Normal", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene presión arterial " + sistolica + "/" + diastolica, "Presión Arterial", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene Hipertensión (grado 1) " + sistolica + "/" + diastolica, "Hipertensión GRADO 1", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene Hipertensión (grado 2) " + sistolica + "/" + diastolica, "Hipertensión GRADO 2", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene Hipertensión (grado 3) " + sistolica + "/" + diastolica, "Hipertensión GRADO 3", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 0:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene presión arterial " + sistolica + "/" + diastolica, "Tensión", JOptionPane.INFORMATION_MESSAGE);
                vista.inputSistolica.setText("");
                vista.inputDiastolica.setText("");
                break;
            default:
        }
    }


    /**
     * Método que dada unas pulsaciones como parámetro calcula el estado en el que se encuentra el paciente según el rango.
     * Este método se usará para los tests
     *
     * @param pulsaciones    las pulsaciones introducidas por el usuario
     * @param atletaCheckBox el estado de la casilla Atleta (boolean)
     * @return un número según el rango en el que se encuentran las pulsaciones
     */

    public static int diagnosticoPulso(int pulsaciones, boolean atletaCheckBox) {
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
     * Método que según el valor que se le pasa muestra una ventana Pop Up al usuario.
     *
     * @param inputUser   el valor que introduce el usuario que se obtendrá del método de medir las pulsaciones
     * @param pulsaciones la cantidad de pulsaciones
     */
    public static void switchPulso(int inputUser, int pulsaciones) {
        switch (inputUser) {
            case 0:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente esta por debajo de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente esta en reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente (Atleta) esta por debajo de las pulsaciones en reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente (Atleta) esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente (Atleta) esta en reposo con unas pulsaciones de " + pulsaciones + " latidos por minuto", "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:

        }
    }

    /**
     * Método que dada una temperatura como parámetro calcula el estado en el que se encuentra el paciente según el rango de la temperatura.
     * Este método se usará para los tests
     *
     * @param temperatura la temperatura introducida por el usuario
     * @return un número según el rango en el que se encuentra la temperatura
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
     * Método que según el valor que se le pasa muestra una ventana Pop Up al usuario.
     *
     * @param inputUser el valor que introduce el usuario que se obtendrá del método de medir la temperatura
     */
    public static void switchTemperatura(int inputUser, double temperatura) {
        switch (inputUser) {
            case 0:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente sufre de hipotermia con una temperatura de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente se encuentra en un rango normal temperatura, tiene " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente sufre de febrícula, tiene una temperatura  de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(vista.getPanelGeneral(), "El paciente tiene fiebre, la temperatura es de " + temperatura + " ºC", "Temperatura", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
        }
    }




}
