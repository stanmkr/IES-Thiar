package EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema12_Ficheros - EjerciciosB.B7
 * Date: Abril / 2022
 */
public class B7_Estadisticas {
    public static void main(String[] args) {
        int lineas = 0;
        int cantPalabras = 0;
        int cantCaracteres = 0;
        Hashtable<String, Integer> palabrasComunes = new Hashtable<String, Integer>();

        try {
            File file = new File("Documentos/Mis cosas/Libros/lazarillo.txt");
            Scanner archivo = new Scanner(file);
            //  contamos líneas
            while (archivo.hasNext()) {
                // lineas
                String linea = archivo.nextLine();
                lineas++;

                // palabras
                String[] palabras = linea.split(" ");
                cantPalabras += palabras.length;

                for (String palabra : palabras) {
                    char[] letras = palabra.toCharArray();
                    cantCaracteres += letras.length;
                    if (palabrasComunes.containsKey(palabra)) {
                        palabrasComunes.put(palabra, palabrasComunes.get(palabra) + 1);
                    } else {
                        palabrasComunes.put(palabra, 1);
                    }
                }

            }

            System.out.println("Número de líneas: " + lineas);
            System.out.println("Número de palabras: " + cantPalabras);
            System.out.println("Número de caracteres: " + cantCaracteres);
            System.out.println("Las 10 palabras más comunes: ");

            ArrayList<Map.Entry<String, Integer>> lista = new ArrayList<>(palabrasComunes.entrySet());
            lista.sort(Collections.reverseOrder(new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            }));
            for (int i = 0; i < 10; i++) {
                System.out.println(lista.get(i));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error");
        }
    }
}
