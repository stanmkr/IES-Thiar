package MostrarArchivoTexto;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros1 - MostrarArchivoTexto
 * Date:  / 2022
 */
public class VerArchivo {
    private JPanel panelGeneral;
    private JPanel panel1;
    private JButton botonElegir;
    private JPanel panel2;
    private JTextArea textArea;
    private JButton botonSalir;
    private JTextField textFieldRuta;

    private File archivo;


    public VerArchivo() {
        System.out.println("Programa iniciado...");
        panel2.setVisible(false);

        botonElegir.addActionListener(e -> {
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
                    textFieldRuta.setText(archivo.getAbsolutePath());
                    panel2.setVisible(true);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        // LISTENER BOTÓN DE SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado correctamente.");
            System.exit(0);
        });

    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static void run() {
        VerArchivo formulario = new VerArchivo();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Mostrar Archivo Texto Practica 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}



