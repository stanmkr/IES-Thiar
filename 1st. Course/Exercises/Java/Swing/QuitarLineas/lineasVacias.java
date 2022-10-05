package Proyecto_QuitarLineasVacias;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * .org.eclipse.egit.core.cmp - Proyecto_QuitarLineasVacias
 * Date:  / 2022
 */
public class lineasVacias {
    private JPanel panelGeneral;
    private JPanel panelSuperior;
    private JTextField campoOrigen;
    private JTextField campoDestino;
    private JButton botonAbrir;
    private JPanel panelBotones;
    private JButton botonAceptar;
    private JButton botonSalir;
    private JTextArea areaTexto;
    private File fichero, directorioActual, ficheroSinBlancos;
    private static JFrame ventana;
    private JLabel mensaje;

    public lineasVacias() {
        ventana = new JFrame();
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setFileFilter(filtro);
                directorioActual = new File(".");
                jFileChooser.setCurrentDirectory(directorioActual);
                int seleccionar = jFileChooser.showOpenDialog(panelGeneral);
                // si el usuario pulsa en aceptar
                if (seleccionar == JFileChooser.APPROVE_OPTION) {
                    fichero = jFileChooser.getSelectedFile();
                    String nombreFichero = jFileChooser.getSelectedFile().getAbsolutePath();
                    //Ecribe la ruta del fichero seleccionado en el campo de origen
                    campoOrigen.setText(nombreFichero);
                    int posicionPunto = nombreFichero.lastIndexOf(".");
                    if (posicionPunto < 0)
                        campoDestino.setText(nombreFichero + "_sinBlancos");
                    else {
                        String extension = nombreFichero.substring(posicionPunto);
                        nombreFichero = nombreFichero.substring(0, posicionPunto);
                        campoDestino.setText(nombreFichero + "_sinBlancos" + extension);
                        ficheroSinBlancos = new File(nombreFichero + "_sinBlancos" + extension);
                    }
                    botonAceptar.setEnabled(true);

                    try {
                        Scanner lectorFichero = new Scanner(fichero);
                        while (lectorFichero.hasNext()) {
                            areaTexto.append(lectorFichero.nextLine() + "\n");
                        }

                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }


            }
        });
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Scanner scanner = new Scanner(fichero);
                    FileWriter fw = new FileWriter(ficheroSinBlancos);
                    String linea;
                    while (scanner.hasNext()){
                        linea= scanner.nextLine();
                        if (!linea.equals("")){
                            fw.write(linea+"\n");
                        }
                    }
                    fw.close();
                    scanner.close();
                    JOptionPane.showMessageDialog(panelGeneral,"¡Ya tienes tu nuevo archivo listo!","Eliminación exitosa",JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static void main(String[] args) {
        lineasVacias formulario = new lineasVacias();

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Quitar líneas vacías | Stanislav Krastev");
        ventana.setSize(600, 350);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setContentPane(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

}

