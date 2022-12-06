package MenuTexto;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * PracticaFicheros1 - MenuTexto
 * Date:  / 2022
 */
public class MenuTexto {
    private JPanel panelGeneral;
    private JPanel panelCrear;
    private JButton botonAnyadirTexto;
    private JTextArea textArea;
    private JTextField textFieldRuta;
    private JPanel panelMostrar;
    private JLabel bienvenida;
    private JTextArea areaMostrar;
    private JButton botonContar;
    private JPanel panelContar;
    private JTextField cantidadPalabras;
    private JPanel panelVocales;
    private JTextField textFieldA;
    private JTextField textFieldE;
    private JTextField textFieldI;
    private JTextField textFieldO;
    private JTextField textFieldU;
    private JButton botonContarVocales;
    static JMenuBar barraMenu = new JMenuBar();
    static JMenu menuArchivos = new JMenu("Archivos");
    static JMenu menuOperaciones = new JMenu("Operaciones");
    static JMenu menuSalir = new JMenu("Salir");

    static JMenuItem itemCrear = new JMenuItem("Crear");
    static JMenuItem itemMostrar = new JMenuItem("Mostrar");
    static JMenuItem itemContarVocales = new JMenuItem("Contar Vocales");
    static JMenuItem itemContarPalabras = new JMenuItem("Contar Palabras");
    static JMenuItem itemExit = new JMenuItem("Exit");
    static PrintWriter fichero;
    static File archivo;
    private int contadorPalabras = 0;
    private Scanner lector;
    private HashMap<String, Integer> vocales;


    public MenuTexto() {
        panelCrear.setVisible(false);
        panelMostrar.setVisible(false);
        panelContar.setVisible(false);
        panelVocales.setVisible(false);
        botonContarVocales.setVisible(false);
        itemCrear.addActionListener(e -> crear());
        itemMostrar.addActionListener(e -> mostrar());
        itemContarVocales.addActionListener(e -> contarVocales());
        itemContarPalabras.addActionListener(e -> contarPalabras());
        itemExit.addActionListener(e -> salir());


        botonAnyadirTexto.addActionListener(e -> {
            String texto = textArea.getText();
            fichero.print(texto);
            fichero.flush();
            fichero.close();
            System.out.println("Archivo "+ "Texto ingresado correctamente.");
            JOptionPane.showMessageDialog(getPanelGeneral(),"Texto ingresado correctamente.");
            botonAnyadirTexto.setEnabled(false);
            textArea.setEditable(false);
        });


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
        botonContarVocales.addActionListener(e -> {
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
                    botonContarVocales.setEnabled(false);
                }
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        });
    }


    public JPanel getPanelGeneral() {
        return panelGeneral;
    }


    public static boolean esVocal(char letra) {
        return "AEIOU".contains(String.valueOf(letra).toUpperCase());
    }

    // MÉTODOS +++++++++++++++++++++++++++++++++++++++++++++

    public void contarVocales(){
        mostrar();
        vocales = new HashMap<>();
        vocales.put("A", 0);
        vocales.put("E", 0);
        vocales.put("I", 0);
        vocales.put("O", 0);
        vocales.put("U", 0);
        textFieldA.setText("");
        textFieldE.setText("");
        textFieldI.setText("");
        textFieldO.setText("");
        textFieldU.setText("");

        botonContarVocales.setVisible(true);
        panelVocales.setVisible(true);
        botonContarVocales.setEnabled(true);



    }

    public void contarPalabras(){
        mostrar();
        contadorPalabras=0;
        cantidadPalabras.setText("");
        botonContar.setEnabled(true);
        panelContar.setVisible(true);
    }

    /**
     * método que crea un archivo vacio
     */
    public void crear(){
        panelMostrar.setVisible(false);
        panelContar.setVisible(false);
        bienvenida.setVisible(false);
        panelVocales.setVisible(false);
        botonContarVocales.setVisible(false);
        textArea.setEditable(true);
        botonAnyadirTexto.setEnabled(true);
        textArea.setText("");
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new File("."));
        jFileChooser.setApproveButtonText("CREAR");
        int seleccion = jFileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION){
            try {
                fichero = new PrintWriter(jFileChooser.getSelectedFile()+".txt");
                archivo = new File(jFileChooser.getSelectedFile()+".txt");
                System.out.println("Archivo "+ archivo.getName() +" guardado en ''" + archivo.getAbsolutePath()+"''");
                JOptionPane.showMessageDialog(null,"RUTA DEL ARCHIVO CREADO: "+archivo.getAbsolutePath());
                panelCrear.setVisible(true);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void mostrar(){
        bienvenida.setVisible(false);
        panelCrear.setVisible(false);
        panelContar.setVisible(false);
        panelVocales.setVisible(false);
        botonContarVocales.setVisible(false);
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
                areaMostrar.setText("");
                while (lector.hasNextLine()){
                    areaMostrar.append(lector.nextLine() + "\n");
                }
                lector.close();
                areaMostrar.setEditable(false);
                textFieldRuta.setText(archivo.getAbsolutePath());
                panelMostrar.setVisible(true);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }



    /**
     * Finaliza el programa
     */
    public static void salir(){
        System.out.println("Programa finalizado.");
        System.exit(0);
    }

    /**
     * Método que añade un menú
     *
     * @return La barra de menú
     */
    public static JMenuBar agregarMenu() {
        barraMenu.add(menuArchivos);
        barraMenu.add(menuOperaciones);
        barraMenu.add(menuSalir);
        menuArchivos.add(itemCrear);
        menuArchivos.add(itemMostrar);
        menuOperaciones.add(itemContarVocales);
        menuOperaciones.add(itemContarPalabras);
        menuSalir.add(itemExit);

        return barraMenu;
    }


    /**
     * Inicia el programa
     */
    public static void run() {
        MenuTexto formulario = new MenuTexto();
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Menu Practica 1 | Stanislav Krastev");
        ventana.setSize(700, 500);
        ventana.setMaximizedBounds(new Rectangle(460, 230));
        ventana.setJMenuBar(agregarMenu());
        ventana.setLocationRelativeTo(null);
        ventana.getContentPane().add(formulario.getPanelGeneral());
        ventana.setVisible(true);
    }

    public static void main(String[] args) {
        run();
    }


}


