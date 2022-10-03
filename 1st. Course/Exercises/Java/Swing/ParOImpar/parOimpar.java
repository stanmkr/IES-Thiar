package Ejercicios.Ejercicio1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio1
 * Date: mayo / 2022
 */
public class parOimpar {
    private JPanel panelPrincipal;
    private JTextField numero;
    private JButton botonParImpar;
    private JLabel respuesta;

    public parOimpar() {
        botonParImpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numero.getText().matches("[0-9]+")) {
                    System.out.println("hola");
                    int num = Integer.parseInt(numero.getText());
                    if (num % 2 == 0) {
                        respuesta.setText(num + " ES PAR");
                    } else {
                        respuesta.setText(num + " ES IMPAR");
                    }
                } else {
                    System.out.println("jeeje");
                    JOptionPane.showMessageDialog(panelPrincipal, "El valor introducido debe de ser un número entero");
                    numero.setText("");
                    respuesta.setText("");

                }

            }
        });
    }

    public JPanel getPanelGeneral() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        parOimpar formulario = new parOimpar();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setTitle("Par o impar | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setSize(250, 250);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
