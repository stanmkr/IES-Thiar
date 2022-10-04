package Ejercicios.Ejercicio4;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio4
 * Date: mayo / 2022
 */
public class valirdadNIF {
    private  JFormattedTextField textoNIF;
    private JPanel panelGeneral;
    private JButton botonComprobar;
    private  JLabel resultado;


    public valirdadNIF() {
        resultado.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));



        botonComprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonComprobarActionPerformed(e);
            }

            private void botonComprobarActionPerformed(ActionEvent e) {
                try {
                    // Obtenemos número y letra del DNI introducido
                    String dni = textoNIF.getText().toUpperCase();
                    int num = Integer.valueOf(dni.substring(0, 8));
                    char letraDni = dni.charAt(9);

                    // Calculamos la letra correcta
                    String letrasValidas = "TRWAGMYFPDXBNJZSQVHLCKE";
                    char letraValida = letrasValidas.charAt(num % 23);

                    // Comprobamos si la letra es válida y lo mostramos
                    if (letraDni == letraValida) {
                        resultado.setText("Letra válida");
                    }
                    else {
                        resultado.setText("Letra NO válida");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Por favor introduce 8 números y una letra", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public static void main(String[] args) {
        valirdadNIF formulario = new valirdadNIF();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Validar NIF | Stanislav Krastev");
        ventana.setSize(400, 250);
        ventana.setContentPane(formulario.getPanelGeneral());
        ventana.setResizable(false);
        ventana.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        MaskFormatter maskDNI = null;

        try {
            maskDNI = new MaskFormatter("########-?");
        } catch (Exception e) {
            e.printStackTrace();
        }
        textoNIF = new JFormattedTextField(maskDNI);
    }
}
