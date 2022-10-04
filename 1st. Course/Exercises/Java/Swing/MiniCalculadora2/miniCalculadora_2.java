package Ejercicios.Ejercicio3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio3
 * Date: mayo / 2022
 */
public class miniCalculadora_2 {
    private JPanel panelPrincipal;
    private JLabel resultado;
    private JTextField numero1;
    private JTextField numero2;
    private JRadioButton sumatorio;
    private JRadioButton productorio;
    private JRadioButton exponencial;
    private JButton calcular;
    int num1, num2;


    public miniCalculadora_2() {
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isEntero(numero1, numero2)) {
                    if (sumatorio.isSelected()) {
                        int resSumatorio = 0;
                        for (int i = num1; i <= num2; i++) {
                            resSumatorio += i;
                        }
                        resultado.setText(resSumatorio + "");
                    } else if (productorio.isSelected()) {
                        int resProductorio = 1;
                        for (int i = num1; i <= num2; i++) {
                            resProductorio *= num2;
                        }
                        resultado.setText(resProductorio + "");
                    } else if (exponencial.isSelected()) {
                        int resExponencial = (int) Math.pow(num1,num2);
                        resultado.setText(resExponencial+"");
                    }else {
                        JOptionPane.showMessageDialog(panelPrincipal, "Elige una función a realizar");

                    }
                } else {
                    JOptionPane.showMessageDialog(panelPrincipal, "Los valores deben de ser números reales");

                }

            }
        });
    }


    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        miniCalculadora_2 formulario = new miniCalculadora_2();
        JFrame ventana = new JFrame();
        ventana.setContentPane(formulario.getPanelPrincipal());
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Mini Calculadora 2 | Stanislav Krastev");
        ventana.setSize(400, 250);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(formulario.productorio);
        bg.add(formulario.sumatorio);
        bg.add(formulario.exponencial);

    }

    public boolean isEntero(JTextField numero1, JTextField numero2) {
        if (numero1.getText().matches("\\d+$") && numero2.getText().matches("\\d+$")) {
            this.num1 = Integer.parseInt(this.numero1.getText());
            this.num2 = Integer.parseInt(this.numero2.getText());
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
