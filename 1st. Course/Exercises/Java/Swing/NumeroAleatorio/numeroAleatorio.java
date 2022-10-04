package Ejercicios.Ejercicio5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio5
 * Date: mayo / 2022
 */
public class numeroAleatorio {
    private JPanel panelPrincipal;
    private JSlider sliderNumMaximo;
    private JPanel panelBotones;
    private JButton botonRandom;
    private JTextField resultado;
    private JTextField valorSlider;


    public numeroAleatorio() {
        resultado.setHorizontalAlignment(0);
        valorSlider.setHorizontalAlignment(0);
        valorSlider.setText(sliderNumMaximo.getValue()+"");

        botonRandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int aleatorio = ThreadLocalRandom.current().nextInt(0, sliderNumMaximo.getValue()+1);
                resultado.setText(aleatorio+"");
            }
        });

        sliderNumMaximo.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                valorSlider.setText(sliderNumMaximo.getValue()+"");
            }
        });
    }

    JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public static void main(String[] args) {
        numeroAleatorio formulario = new numeroAleatorio();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Numero aleatorio | Stanislav Krastev");
        ventana.setSize(400, 200);
        ventana.setContentPane(formulario.getPanelPrincipal());
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
