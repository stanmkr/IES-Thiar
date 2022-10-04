package Ejercicios.Ejercicio10;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * .org.eclipse.egit.core.cmp - Ejercicios.Ejercicio10
 * Date:  / 2022
 */
public class miniEditor {
    private JPanel panelGeneral;
    private JPanel panelSuperior;
    private JButton botonAbrir;
    private JButton botonGuardar;
    private JSlider sliderTamanyoTexto;
    private JTextArea areaTexto;
    private JPanel panelTexto;
    private JLabel valorTexto;
    private int tamanyoFuente = 16;

    private File fichero;

    public miniEditor() {
        areaTexto.setFont(new Font("Serif", Font.PLAIN, tamanyoFuente));
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.selectAll();
                areaTexto.replaceSelection("");
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(filtro);
                int seleccion = fileChooser.showOpenDialog(panelGeneral);
                // si el user pincha en aceptar
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    // seleccionamos el fichero
                    fichero = fileChooser.getSelectedFile();

                    //Ecribe la ruta del fichero seleccionado en el campo de texto
                    //areaTexto.setText(fichero.getAbsolutePath());
                    try {
                        Scanner lectura = new Scanner(fichero);
                        while (lectura.hasNext()) {
                            areaTexto.append(lectura.nextLine() + "\n");
                        }
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        });
        botonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fichero != null) {
                    try {
                        FileWriter fileWriter = new FileWriter(fichero);
                        fileWriter.write(areaTexto.getText());
                        fileWriter.close();
                        JOptionPane.showMessageDialog(panelGeneral,"Fichero guardado correctamente","Guardar",JOptionPane.INFORMATION_MESSAGE);

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }else {
                    JOptionPane.showMessageDialog(panelGeneral,"No se ha abierto ningún fichero","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        sliderTamanyoTexto.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                valorTexto.setText(sliderTamanyoTexto.getValue() + "");
                tamanyoFuente = sliderTamanyoTexto.getValue();
                areaTexto.setFont(new Font("Serif", Font.PLAIN, tamanyoFuente));
            }
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static void main(String[] args) {
        miniEditor formulario = new miniEditor();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setContentPane(formulario.getPanelGeneral());
        ventana.setTitle("Mini editor de texto | Stanislav Krastev");
        ventana.setSize(600, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);

        ventana.setVisible(true);
    }
}
