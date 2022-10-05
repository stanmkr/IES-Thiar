package Proyecto_Ahorcado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Stanislav Krastev
 * Proyecto_Ahorcado
 * Date: mayo / 2022
 */
public class Juego {
    Ventana ventana;

    public static void main(String[] args) {
        new Juego().iniciar();
    }

    public void iniciar() {
        ventana = new Ventana();
        ventana.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    }


    // clase LaminaPrincipal, la clase que contendrá todos los métodos principales
    class LaminaPrincipal extends JPanel {
        int opcion;
        private JLabel imagen, respuesta;
        private JPanel panelLetras, panelTitulo, panelCentro;
        private String secreta = palabraSecreta();
        private int fallos = 0;
        private final int MAX_FALLOS = 6;
        private ArrayList<Character> letrasPulsadas = new ArrayList<>();
        JButton botonPulsado;
        private File ficheroPalabras;

        //  CONSTRUCTOR
        public LaminaPrincipal() {

            setLayout(new BorderLayout()); // la distribución de la lámina principal
            JLabel etiqueta = new JLabel("Stanislav Krastev | 1º DAM Thiar");
            etiqueta.setFont(new Font("Ubuntu", Font.BOLD, 24));
            etiqueta.setForeground(new Color(0, 0, 0));
            etiqueta.setIcon(new ImageIcon("src/Proyecto_Ahorcado/imagenes/ahorcado.png"));


            //  panel para el titulo
            panelTitulo = new JPanel();
            panelTitulo.setBackground(new Color(218, 171, 98));
            panelTitulo.add(etiqueta); //   al panel del titulo añado la etiqueta
            add(panelTitulo, BorderLayout.NORTH); // añado al panel principal el panel titulo


            imagen = new JLabel();
            imagen.setIcon(new ImageIcon("src/Proyecto_Ahorcado/imagenes/Hangman-0.png"));
            //add(imagen, BorderLayout.LINE_START);

            JPanel panelRespuesta = new JPanel(); // creo un panel
            panelRespuesta.setBackground(new Color(218, 171, 98));
            respuesta = new JLabel("PALABRA");
            respuesta.setFont(new Font("Ubuntu", Font.BOLD, 48));
            respuesta.setForeground(new Color(255, 0, 0));
            panelRespuesta.add(respuesta, BorderLayout.PAGE_END);
            add(panelRespuesta, BorderLayout.PAGE_END); // añado el panel a la lámina principal

            panelLetras = new JPanel(); //  otro panel para las letras
            ponerBotones(); // llamando al método

            // panel central
            panelCentro = new JPanel();
            panelCentro.setLayout(new BorderLayout());
            add(panelCentro, BorderLayout.CENTER); //   añado el panel a la lámina principal
            imagen.setHorizontalAlignment(JLabel.CENTER);
            panelCentro.add(imagen, BorderLayout.NORTH);
            panelCentro.add(panelLetras); //    añado el panel a la lámina principal


            // método para formar la palabra secreta
            formaLetrasSecretas();

        }

        /**
         * Método para añadir un botón al panel principal por cada letra del abecedario
         */
        public void ponerBotones() {
            String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            TeclaPulsada gestor = new TeclaPulsada();
            for (int i = 0; i < letras.length(); i++) {
                JButton boton = new JButton("" + letras.charAt(i));
                boton.addActionListener(gestor);
                panelLetras.add(boton);
            }
        }

        /**
         * método que forma un string de " _ " según la cantidad de caracteres que tiene el atributo <secreta>
         */
        public void formaLetrasSecretas() {
            String formaSecreto = "";
            for (int i = 0; i < secreta.length(); i++) {
                formaSecreto += "_ ";
            }
            respuesta.setText(formaSecreto.trim());
        }

        /**
         * Método principal del programa, que comprobara si una letra se encuentra en la palabra secreta y mostrarla. Si no la encuentra añadirá imagen al muñeco
         *
         * @param c una letra del abecedario
         */
        public void comprobarLetra(String c) {
            boolean acertada = true; // para saber si la palabra esta completa
            letrasPulsadas.add(c.charAt(0)); // añadimos la letra a la lista
            if (secreta.contains(c)) { //    la letra pulsada esta en la palabra, ponemos el texto de la etiqueta ocultando las letras que todavia no se han pulsado
                String formaSecreto = "";
                for (int i = 0; i < secreta.length(); i++) {
                    if (letrasPulsadas.contains(secreta.charAt(i))) {
                        formaSecreto = formaSecreto + secreta.charAt(i) + " ";
                    } else {
                        //  si alguna no esta no esta completa la palabra
                        acertada = false;
                        formaSecreto += "_ ";
                    }
                }
                respuesta.setText(formaSecreto.trim());
            } else {
                //   la letra pulsada no está en la palabra
                fallos++;
                acertada = false;
                //  usamos el número de fallos para cambiar la imagen
                imagen.setIcon(new ImageIcon("src/Proyecto_Ahorcado/imagenes/Hangman-" + fallos + ".png"));
            }
            if (acertada) {
                opcion = JOptionPane.showConfirmDialog(null, "¡¡¡HAS GANADO!!!\n¿Quiéres jugar de nuevo?", "¡HAS GANADO!", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    ventana.dispose();
                    new Juego().iniciar();

                } else if (opcion == JOptionPane.NO_OPTION) {
                    System.out.println("Programa finalizado");
                    System.exit(0);
                }

            }
            if (fallos == MAX_FALLOS) {
                Component[] botonesLetras = panelLetras.getComponents();
                for (Component botonesLetra : botonesLetras) {
                    botonesLetra.setEnabled(false);
                }
                ImageIcon icon = new ImageIcon("src/Proyecto_Ahorcado/imagenes/cry.png");
                JOptionPane.showMessageDialog(null, "Lo siento amigo, has perdido. La próxima vez será.", "El juego del Ahorcado", JOptionPane.INFORMATION_MESSAGE, icon);

                opcion = JOptionPane.showConfirmDialog(null, "¿Quieres intentarlo otra vez?", "Has sido ahorcado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    ventana.dispose();
                    new Juego().iniciar();
                } else if (opcion == JOptionPane.NO_OPTION) {
                    System.out.println("Programa finalizado");
                    System.exit(0);
                }
            }
        }


        /**
         * método que capturará la pulsación de un botón
         */
        class TeclaPulsada implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                botonPulsado = (JButton) e.getSource(); // obtenemos el valor del botón (una letra del abecedario)
                botonPulsado.setEnabled(false); // una vez pulsado un botón lo desactivamos
                comprobarLetra(e.getActionCommand());
            }
        }

        /**
         * método para generar una palabra al azar dentro de una lista de palabras
         *
         * @return una palabra al azar
         */
        public String palabraSecreta() {

            ArrayList<String> palabras = new ArrayList<>();
            ficheroPalabras = new File("src/Proyecto_Ahorcado/palabras/diccionario.txt");
            try {
                Scanner scanner = new Scanner(ficheroPalabras);
               String palabra;
                while (scanner.hasNext()) {
                    palabra = scanner.next();
                    if (palabra.length() >= 5 && palabra.length() <= 7)
                        palabras.add(palabra.toUpperCase());
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
//            palabras.add("GATO");
//            palabras.add("PERRO");
//            palabras.add("COHETE");
//            palabras.add("MONTAÑA");
//            palabras.add("PORTATIL");
//            palabras.add("ORDENADOR");
//            palabras.add("PANTALLA");
//            palabras.add("ROUTER");
//            palabras.add("TECLADO");
//            palabras.add("BOMBILLA");
//            palabras.add("TELEFONO");
            int aleatorio = ThreadLocalRandom.current().nextInt(0, palabras.size());
            System.out.println("PALABRA SECRETA: " + palabras.get(aleatorio));
            return palabras.get(aleatorio);
        }

    }

    /**
     * clase que hereda de WindowAdapter para capturar el evento de cerrar el programa
     */
    class AdaptadorVentana extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            if (JOptionPane.showConfirmDialog(ventana, "¿Salir del juego?", "Juego del Ahorcado", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                System.out.println("Saliendo del programa...");
                ventana.dispose();
            }

        }

        public void windowClosed(WindowEvent e) {
            super.windowClosed(e);
            System.out.println("Ventana cerrada");
        }

        public void windowActivated(WindowEvent e) {
            super.windowActivated(e);
            System.out.println("Programa ejecutado");
        }
    }

    // nuestro FRAME para visualizar el programa
    class Ventana extends JFrame {
        //  CONSTRUCTOR
        public Ventana() {
            setSize(750, 750);
            setLocationRelativeTo(null);
            setTitle("Juego del Ahorcado");

            LaminaPrincipal laminaPrincipal = new LaminaPrincipal();
            add(laminaPrincipal);
            addWindowListener(new AdaptadorVentana());
            setVisible(true);
        }
    }
}
