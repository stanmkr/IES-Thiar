package ContarVocales;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


/**
 * Created by Stanislav Krastev
 * PracticaFicheros1 - ContarVocales
 * Date:  / 2022
 */
public class ContarVocales {
    private JPanel panelGeneral;
    private JPanel panel1;
    private JButton botonElegir;
    private JPanel panel2;
    private JTextArea textArea;
    private JButton botonContar;
    private JTextField textFieldRuta;
    private JPanel panel3;
    private JTextField textFieldA;
    private JTextField textFieldE;
    private JTextField textFieldI;
    private JTextField textFieldO;
    private JTextField textFieldU;
    private JButton botonSalir;
    private File archivo;
    private HashMap<String, Integer> vocales;
    private Scanner lector;

    public ContarVocales() {
        System.out.println("Programa iniciado...");
        panel2.setVisible(false);
        panel3.setVisible(false);
        // LISTENER BOTON ABRIR
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
                    vocales = new HashMap<>();
                    vocales.put("A", 0);
                    vocales.put("E", 0);
                    vocales.put("I", 0);
                    vocales.put("O", 0);
                    vocales.put("U", 0);


                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // LISTENER BOTON CONTAR
        botonContar.addActionListener(e -> {
            try {
                lector = new Scanner(archivo);
                while (lector.hasNextLine()) {
                    String linea = lector.nextLine();
                    for (int i = 0; i < linea.length(); i++) {
                        char letraActual = linea.charAt(i);
                        if (esVocal(letraActual)){
                            String claveHash = String.valueOf(letraActual).toUpperCase();
                            vocales.put(claveHash, vocales.get(claveHash) + 1);
                        }
                    }
                    textFieldA.setText(vocales.get("A").toString());
                    textFieldE.setText(vocales.get("E").toString());
                    textFieldI.setText(vocales.get("I").toString());
                    textFieldO.setText(vocales.get("O").toString());
                    textFieldU.setText(vocales.get("U").toString());
                    botonContar.setEnabled(false);
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        });

        // LISTENER BOTON SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado.");
            System.exit(0);
        });
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    /**
     * Método para averiguara si una letra es vocal
     *
     * @param letra se pasa una letra
     * @return devuelve true si la letra se encuentra en el string "AEIOU"
     */
    public static boolean esVocal(char letra) {
        return "AEIOU".contains(String.valueOf(letra).toUpperCase());
    }

    public static void run() {
        ContarVocales formulario = new ContarVocales();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Contar Vocales Practica 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        run();
    }
}
