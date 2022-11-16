import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * Practica 2 - Excepciones - PACKAGE_NAME
 * Date:  / 2022
 */
public class Programa {
    private static JFrame ventana;
    private JPanel panelGeneral;
    private JPanel panel1;
    private JPanel panel2;
    private JButton botonLlenar;
    private JButton botonVaciar;
    private JButton botonSalir;
    private JButton botonEmpezar;
    private JComboBox<Double> desplegable;
    private JPanel panel3;
    private JSlider slider;
    private JTextArea areaTexto;
    private Piscina miPiscina;

    public Programa() {
        System.out.println("Iniciando programa... programa en funcionamiento.");
        panel2.setVisible(false);
        panel3.setVisible(false);
        desplegable.addItem(1.0);
        desplegable.addItem(1.1);
        desplegable.addItem(1.2);
        desplegable.addItem(1.3);
        desplegable.addItem(1.4);
        desplegable.addItem(1.5);
        desplegable.addItem(1.6);
        desplegable.addItem(1.7);
        desplegable.addItem(1.8);
        desplegable.addItem(1.9);
        desplegable.addItem(2.0);

        // BOTÓN QUE CREA LA PISCINA Y ARRANCA EL PROGRAMA
        botonEmpezar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                miPiscina = new Piscina((int) ((Double) desplegable.getSelectedItem() * 1000));
                System.out.println("Piscina creada con " + miPiscina.MAX_NIVEL + " litros de depósito.");
                ventana.setSize(600,600);
                slider.setMaximum(((int) ((Double) desplegable.getSelectedItem() * 1000)));
                panel2.setVisible(true);
                panel3.setVisible(true);
                areaTexto.append("La piscina está vacía, tiene " + (miPiscina.getNivel()) + " litros    |    Capacidad máxima: " + miPiscina.MAX_NIVEL + " litros.");
                botonEmpezar.setEnabled(false);
                desplegable.setEnabled(false);

            }
        });


        // BOTÓN PARA LLENAR LA PISCINA
        botonLlenar.addActionListener(e -> {
            try {
                int litros = ThreadLocalRandom.current().nextInt(1, 1001);
                miPiscina.llenar(litros);
                areaTexto.append("\n------------------------------------\n" +
                        "Llenando " + litros + " litros | Nivel actual de la piscina: " + miPiscina.getNivel() + " litros.");


                slider.setValue(miPiscina.getNivel());
                if (slider.getValue() == miPiscina.MAX_NIVEL) {
                    JOptionPane.showMessageDialog(panelGeneral, "La piscina esta completamente llena.");
                    areaTexto.append("\nLa piscina no se puede llenar más. (" + miPiscina.MAX_NIVEL + ")");
                }

            } catch (Exception ex) {
                areaTexto.append("\n------------------------------------\n" +
                        "" + ex.getMessage());
            }
        });

        // BOTÓN PARA VACIAR LA PISCINA
        botonVaciar.addActionListener(e -> {
            int litros = ThreadLocalRandom.current().nextInt(1, 1001);
            try {
                miPiscina.vaciar(litros);
                areaTexto.append("\n------------------------------------\nVaciando " + litros + " litros | Nivel actual de la piscina: " + miPiscina.getNivel() + " litros.");
                slider.setValue(miPiscina.getNivel());
                if (slider.getValue() == 0) {
                    JOptionPane.showMessageDialog(panelGeneral, "La piscina esta completamente vacía.");
                    areaTexto.append("\n------------------------------------\nLa piscina no se puede vaciar más.");
                }

            } catch (Exception ex) {
                areaTexto.append("\n------------------------------------\n" + ex.getMessage());
            }

        });

        // BOTÓN PARA SALIR DEL PROGRAMA
        botonSalir.addActionListener(e -> {
            int respuesta = JOptionPane.showConfirmDialog(panelGeneral, "¿ESTAS SEGURO?", "SALIR", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                System.out.println("Programa finalizado.");
                System.exit(0);
            }
        });

    }

    /**
     *
     * @return DEVUELVE EL OBJETO PANEL DE MI PANEL GENERAL
     */
    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    /**
     * MÉTODO QUE ARRANCA EL PROGRAMA
     */
    public static void run() {

        Programa formulario = new Programa();
        ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Piscina | Stanislav Krastev");
        ventana.setSize(600, 200);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}