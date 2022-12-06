package ContarPalabras;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros1 - ContarPalabras
 * Date:  / 2022
 */
public class ContarPalabras {
    private JPanel panelGeneral;
    private JPanel panel1;
    private JButton botonElegir;
    private JPanel panel2;
    private JTextArea textArea;
    private JButton botonContar;
    private JTextField textFieldRuta;
    private JButton botonSalir;
    private JPanel panel3;
    private JTextField cantidadPalabras;
    private File archivo;
    private Scanner lector;
    private int contadorPalabras = 0;


    public ContarPalabras() {
        panel2.setVisible(false);
        panel3.setVisible(false);


        // LISTENER BOTON DE CONTAR
        botonContar.addActionListener(e -> {
            try {
                lector = new Scanner(archivo);
                while (lector.hasNext()) {
                    lector.next();
                    contadorPalabras++;
                }
                lector.close();
                cantidadPalabras.setText(String.valueOf(contadorPalabras));
                botonContar.setEnabled(false);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        });


        botonElegir.addActionListener(e -> {
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setFileFilter(filtro);
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Abrir");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    archivo = jFileChooser.getSelectedFile();
                    lector = new Scanner(archivo);
                    panel1.setVisible(false);

                    while (lector.hasNextLine()) {
                        textArea.append(lector.nextLine() + "\n");
                    }
                    lector.close();
                    textArea.setEditable(false);
                    textFieldRuta.setText(archivo.getAbsolutePath());
                    panel2.setVisible(true);
                    panel3.setVisible(true);


                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // LISTENER BOTON SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado");
            System.exit(0);
        });

    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public static void run() {
        ContarPalabras formulario = new ContarPalabras();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Contar Palabras Practica 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        run();
    }
}
