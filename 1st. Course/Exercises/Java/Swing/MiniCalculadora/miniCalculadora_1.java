package Ejercicios.Ejercicio2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio2
 * Date: mayo / 2022
 */
public class miniCalculadora_1 {
    private JPanel panelPrincipal;
    private JLabel resultado;
    private JPanel panelBotones;
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    private JTextField numero1;
    private JTextField numero2;
    private JPanel panelNumeros;
    double num1,num2;


    public miniCalculadora_1() {
        suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isReal(numero1,numero2)){
                    resultado.setText(num1 + num2 + "");
                }else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Los valores deben de ser números reales");
                }
            }
        });
        resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isReal(numero1,numero2)){
                    resultado.setText(num1 - num2 + "");
                }else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Los valores deben de ser números reales");
                }
            }
        });
        multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isReal(numero1,numero2)){
                    resultado.setText(num1 * num2 + "");
                }else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Los valores deben de ser números reales");
                }
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isReal(numero1,numero2)){
                    resultado.setText(num1 / num2 + "");
                }else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Los valores deben de ser números reales");
                }
            }
        });

    }


    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        miniCalculadora_1 formulario = new miniCalculadora_1();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Mini Calculadora | Stanislav Krastev");
        ventana.setContentPane(formulario.getPanelPrincipal());
        ventana.setSize(300, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);


    }

    public boolean isReal(JTextField numero1, JTextField numero2) {
        if (this.numero1.getText().matches("^[+-]?\\d+(\\.\\d+)?") && this.numero2.getText().matches("^[+-]?\\d+(\\.\\d+)?")) {
            this.num1 = Double.parseDouble(this.numero1.getText());
            this.num2 = Double.parseDouble(this.numero2.getText());

            return true;
            // "\\d+(\\.\\d+)?"
        } else {
            this.numero1.setText("");
            this.numero2.setText("");
            resultado.setText("");
            return false;

        }

    }
}

