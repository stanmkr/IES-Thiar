package ProgramaMedias;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros2 - ProgramaMedias
 * Date:  / 2022
 */
public class Medias {
    private JPanel panelGeneral;
    private JPanel panel1;
    private JButton botonAbrir;
    private JPanel panel2;
    private JTextField textFieldRuta;
    private JTextArea textArea;
    private JButton botonCalcular;
    private JTextField textFIeldAritmetica;
    private JTextField textFieldPonderada;
    private File archivo;


    // CONSTRUCTOR
    public Medias() {
        panel2.setVisible(false);

        // LISTENER BOTÓN ABRIR
        botonAbrir.addActionListener(e -> {
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setFileFilter(filtro);
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Abrir");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION){
                try {
                    archivo = jFileChooser.getSelectedFile();
                    Scanner lector = new Scanner(archivo);
                    panel1.setVisible(false);
                    while (lector.hasNextLine()){
                        textArea.append(lector.nextLine() + "\n");
                    }
                    lector.close();
                    textArea.setEditable(false);
                    textFieldRuta.setText(archivo.getAbsolutePath());
                    panel2.setVisible(true);
                    JOptionPane.showMessageDialog(getPanelGeneral(),"Se ha llegado al final del fichero.","Mensaje",JOptionPane.INFORMATION_MESSAGE);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        // LISTENER BOTÓN CALCULAR MEDIAS
        botonCalcular.addActionListener(e -> {
            int cantidadNumerosPorColumna = 0;
            double sumaColumna1 = 0;
            double sumaColumna2 = 0;
            double numerador = 0;
            double denominador = 0;
            try {
                Scanner scanner = new Scanner(archivo);
                while (scanner.hasNext()) {
                    double num1 = scanner.nextDouble();
                    sumaColumna1 += num1;
                    double num2 = scanner.nextDouble();
                    sumaColumna2 += num2;
                    numerador = numerador + (num1 * num2);
                    denominador = denominador + num2;
                    cantidadNumerosPorColumna++;
                }
            } catch (FileNotFoundException exception) {
                System.err.println("ERROR: fichero no existe.");
            }
            textFIeldAritmetica.setText(String.valueOf(sumaColumna1/cantidadNumerosPorColumna));
            textFieldPonderada.setText(String.valueOf(sumaColumna2/cantidadNumerosPorColumna));
            System.out.println("Media aritmética 1ª columna: " + sumaColumna1 / cantidadNumerosPorColumna);
            System.out.println("Media aritmética 2ª columna: " + sumaColumna2 / cantidadNumerosPorColumna);
            System.out.println("\nLa media ponderada de los números de la 1ª columna empleando como pesos los de la 2ª columna: " + numerador / denominador);
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public static void run() {
        Medias formulario = new Medias();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Media Aritmética y Ponderada | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}
