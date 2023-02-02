package ParejasNumeros;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros2 - ParejasNumeros
 * Date:  / 2022
 */
public class ParejaNumeros {
    private JPanel panelGeneral;
    private JButton botonAnyadir;
    private JPanel panelInferior;
    private JButton botonCrear;
    private JTextArea areaTexto;
    private JButton botonSalir;
    private JTextField campoValor;
    private JTextField campoFrecuencia;
    private JPanel panelSuperior;

    private File archivo;
    private PrintWriter fichero;

    // CONSTRUCTOR
    public ParejaNumeros() {

        // LISTENER BOTÓN CREAR
        botonCrear.addActionListener(e -> {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.setCurrentDirectory(new File("."));
            jFileChooser.setApproveButtonText("Guardar");
            int seleccion = jFileChooser.showOpenDialog(getPanelGeneral());
            if (seleccion == JFileChooser.APPROVE_OPTION){
                try {
                    fichero = new PrintWriter(jFileChooser.getSelectedFile()+".txt");
                    archivo = new File(jFileChooser.getSelectedFile()+".txt");

                    String texto = areaTexto.getText().replaceAll("\\.",",");

                    fichero.print(texto);
                    fichero.flush();
                    fichero.close();

                    System.out.println("Archivo "+ archivo.getName() +" guardado en ''" + archivo.getAbsolutePath()+"''");
                    JOptionPane.showMessageDialog(getPanelGeneral(),"Archivo creado correctamente.");
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });



        // LISTENER BOTÓN DE AÑADIR
        botonAnyadir.addActionListener(e -> {
            try {
                double valor = Double.parseDouble(campoValor.getText());
                double frecuencia = Double.parseDouble(campoFrecuencia.getText());
                areaTexto.append(String.valueOf(valor));
                areaTexto.append(" ");
                areaTexto.append(String.valueOf(frecuencia));
                areaTexto.append("\n");
            }catch (NumberFormatException exception){
                System.err.println("ERROR: introducción de valores no numéricos.");
                JOptionPane.showMessageDialog(getPanelGeneral(),"COMPRUEBA LOS VALORES INTRODUCIDOS :)","ERROR",JOptionPane.ERROR_MESSAGE);
                campoValor.setText("");
                campoFrecuencia.setText("");
            }
        });



        // LISTENER BOTÓN DE SALIR
        botonSalir.addActionListener(e -> {
            System.out.println("Programa finalizado.");
            System.exit(0);
        });


    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static void run() {
        ParejaNumeros formulario = new ParejaNumeros();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 350);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Parejas Números | Stanislav Krastev");
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }
}
