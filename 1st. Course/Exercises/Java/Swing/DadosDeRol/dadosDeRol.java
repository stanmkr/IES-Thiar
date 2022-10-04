package Ejercicios.Ejercicio6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio6
 * Date: mayo / 2022
 */
public class dadosDeRol {
    private JPanel panelPrincipal;
    private JTextField resultado;
    private JPanel panelDados;
    private JButton boton6caras;
    private JButton boton8caras;
    private JButton boton10caras;
    private JButton boton12caras;
    private JButton boton20caras;


    public dadosDeRol() {



        botones miBoton = new botones();
        boton6caras.addActionListener(miBoton);
        boton8caras.addActionListener(miBoton);
        boton10caras.addActionListener(miBoton);
        boton12caras.addActionListener(miBoton);
        boton20caras.addActionListener(miBoton);

    }

    class botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (Objects.equals(e.getActionCommand(), 6 + "")) {
                resultado.setText(lanzarDado(6) + "");
            } else if (Objects.equals(e.getActionCommand(), 8 + "")) {
                resultado.setText(lanzarDado(8) + "");
            } else if (Objects.equals(e.getActionCommand(), 10 + "")) {
                resultado.setText(lanzarDado(10) + "");
            } else if (Objects.equals(e.getActionCommand(), 12 + "")) {
                resultado.setText(lanzarDado(12) + "");
            } else {
                resultado.setText(lanzarDado(20) + "");
            }
        }
    }


    // Devuelve número aleatorio entre 1 y dado
    private int lanzarDado(int dado) {
        return 1 + (int) (Math.random() * dado);
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        dadosDeRol formulario = new dadosDeRol();
        JFrame ventana = new JFrame();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Dados de rol | Stanislav Krastev");
        ventana.setSize(700, 250);
        ventana.setContentPane(formulario.getPanelPrincipal());
        ventana.setResizable(false);
        ventana.setVisible(true);

    }
}
