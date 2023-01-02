package org.example;

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

            try {
                if (!inputPulsaciones.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), diagnosticoPulso(Integer.parseInt(inputPulsaciones.getText())), "Pulsaciones", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir unas pulsaciones", "Atención", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException exception) {
                System.err.println("El usuario ha introducido un valor no entero en la casilla de Pulsaciones");
                JOptionPane.showMessageDialog(getPanelGeneral(), "Debes de introducir números enteros", "Atención", JOptionPane.ERROR_MESSAGE);
                inputPulsaciones.setText("");
            }

            try {
                if (!inputTemperatura.getText().equals("")) {
                    JOptionPane.showMessageDialog(getPanelGeneral(), diagnosticoTemperatura(Double.parseDouble(inputTemperatura.getText())), "Temperatura", JOptionPane.INFORMATION_MESSAGE);
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


    public  String diagnosticoPulso(int pulsaciones) {
        if (pulsaciones < 60 && !atletaCheckBox.isSelected()) {
            return "El paciente esta por debajo de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones > 100 && !this.atletaCheckBox.isSelected()) {
            return "El paciente esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones >= 60 && pulsaciones <= 100 && !atletaCheckBox.isSelected()) {
            return "El paciente esta en reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones < 40 && atletaCheckBox.isSelected()) {
            return "El paciente (Atleta) esta por debajo de las pulsaciones en reposo, tiene " + pulsaciones + " latidos por minuto";
        } else if (pulsaciones > 60 && atletaCheckBox.isSelected()) {
            return "El paciente (Atleta) esta por encima de las pulsaciones de reposo, tiene " + pulsaciones + " latidos por minuto";
        } else {
            return "El paciente (Atleta) esta en reposo con unas pulsaciones de " + pulsaciones + " latidos por minuto";
        }
    }

    /**
     * Método que dada una temperatura como parámetro calcula el estado en el que se encuentra el paciente según el rango de la temperatura
     *
     * @param temperatura la temperatura introducida por el usuario
     * @return Un texto con el estado del paciente
     */
    public static String diagnosticoTemperatura(double temperatura) {
        if (temperatura < 35.5) {
            return "El paciente sufre de hipotermia con una temperatura de " + temperatura + " ºC";
        } else if (temperatura >= 35.5 && temperatura < 37.5) {
            return "El paciente se encuentra en un rango normal temperatura, tiene " + temperatura + " ºC";
        } else if (temperatura >= 37.5 && temperatura <= 38.0) {
            return "El paciente sufre de febrícula, tiene una temperatura  de " + temperatura + " ºC";
        } else {
            return "El paciente tiene fiebre, la temperatura es de " + temperatura + " ºC";
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
