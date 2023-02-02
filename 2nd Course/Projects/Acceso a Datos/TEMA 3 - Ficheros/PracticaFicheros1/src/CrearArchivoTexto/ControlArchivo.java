package CrearArchivoTexto;

import javax.swing.*;
import java.io.*;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros1 - CrearArchivoTexto
 * Date:  / 2022
 */
public class ControlArchivo {
    private JPanel PanelGeneral;
    private JPanel panel1;
    private JButton botonElegir;
    private JPanel panel2;
    private JTextArea textArea;
    private JButton botonCrear;
    private JPanel panel3;
    private JButton botonSalir;
    private File archivo;
    private PrintWriter fichero;


    // LISTENER DEL BOTÓN DE ELEGIR NOMBRE Y RUTA
    public ControlArchivo() {
        System.out.println("Programa iniciado...");
        panel2.setVisible(false);
        panel3.setVisible(false);



        // LISTENER AL BOTóN DE CREAR ARCHIVO
        botonElegir.addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Guardar");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION){
                try {
                    fichero = new PrintWriter(jFileChooser.getSelectedFile()+".txt");
                    archivo = new File(jFileChooser.getSelectedFile()+".txt");
                    System.out.println("Archivo "+ archivo.getName() +" guardado en ''" + archivo.getAbsolutePath()+"''");
                    JOptionPane.showMessageDialog(getPanelGeneral(),archivo.getAbsolutePath());
                    panel1.setVisible(false);
                    panel2.setVisible(true);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        // LISTENER BOTON CREAR
        botonCrear.addActionListener(e -> {
            String texto = textArea.getText();
            fichero.print(texto);
            fichero.flush();
            fichero.close();
            panel2.setVisible(false);
            System.out.println("Archivo "+ "Texto ingresado correctamente.");
            JOptionPane.showMessageDialog(getPanelGeneral(),"Texto ingresado correctamente.");
            panel3.setVisible(true);
        });


        // LISTENER BOTÓN DE SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado correctamente.");
            System.exit(0);
        });
    }

    /**
     *
     * @return el panel general
     */
    public JPanel getPanelGeneral() {
        return PanelGeneral;
    }

    public static void run() {
        ControlArchivo formulario = new ControlArchivo();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Practica 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}