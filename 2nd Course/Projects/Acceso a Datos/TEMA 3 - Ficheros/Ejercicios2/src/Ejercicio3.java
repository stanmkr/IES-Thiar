import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - PACKAGE_NAME
 * Date: Noviembre / 2022
 * ********************************
 * Tenemos un fichero de texto que contiene varias líneas y necesitamos imprimir las iniciales de
 * todas las palabras que aparecen en el mismo. Realizar el análisis y obtener un programa en
 * lenguaje Java que imprima en pantalla las iniciales separadas por un espacio. Una letra es inicial
 * de palabra si va precedida de blanco u otro carácter que no sea letra o es la primera de una línea.
 * Téngase en cuenta que las palabras del fichero, están separadas por uno o más espacios en blanco
 * o final de línea. Puedes ayudarte de la clase StringTokenize
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        File fichero = new File("Documentos/texto.txt");
        try {
            Scanner scanner = new Scanner(fichero);
            while (scanner.hasNextLine()) {
                String palabra = scanner.next();
                StringTokenizer palabras = new StringTokenizer(palabra);

                while (palabras.hasMoreTokens()) {
                    palabra = palabras.nextToken();

                    if (palabra.length() > 1) {
                        char segundaLetra = palabra.charAt(1);
                        if (noEsLetra(segundaLetra)) {
                            System.out.print(palabra.charAt(0) + " ");
                            break;
                        }
                    } else {
                        char segundaLetra = palabra.charAt(0);
                        System.out.print(segundaLetra + " ");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el archivo no existe");
        }
    }

    public static boolean noEsLetra(char letra) {
        return !"ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(String.valueOf(letra).toUpperCase());
    }
}
