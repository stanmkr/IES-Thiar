import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - PACKAGE_NAME
 * Date: Noviembre / 2022
 * ************************************************
 * Realizar un programa en Java que cuente las haches intercaladas de un texto de varias líneas
 * que se encuentra en un fichero. Repetir el problema de forma que cuente solo las palabras con
 * hache intercalada. En este segundo caso una palabra con varias haches intercaladas debe ser
 * contada una sola vez.
 * NOTA: No son hache intercalada las que son comienzo de palabra ni las que aparecen formando
 * 'ch'
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        char hache = 'H';
        int contadorH = 0;
        File fichero = new File("Documentos/textoHintercalada.txt");
        try {
            Scanner scanner = new Scanner(fichero);
            while (scanner.hasNext()) {
                String palabra = scanner.next();
                char primeraLetra = palabra.toUpperCase().charAt(0);
                if (palabra.length() > 1) {
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.toUpperCase().charAt(i);
                        if (i < palabra.length() - 1) {
                            char letraSiguiente = palabra.toUpperCase().charAt(i + 1);
                            if (i > 0) {
                                char letraAnterior = palabra.toUpperCase().charAt(i - 1);
                                if (primeraLetra != hache && letra == hache && letraAnterior != 'C' && Character.isAlphabetic(letraSiguiente)) {
                                    contadorH++;
                                }
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Haches intercaladas en el texto " + contadorH);
        System.out.println("****************** VERSIÓN 2 ******************");
        contadorH = 0;

        try {
            Scanner scanner = new Scanner(fichero);
            while (scanner.hasNext()) {
                String palabra = scanner.next();
                char primeraLetra = palabra.toUpperCase().charAt(0);
                if (palabra.length() > 1) {
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.toUpperCase().charAt(i);
                        if (i < palabra.length() - 1) {
                            char letraSiguiente = palabra.toUpperCase().charAt(i + 1);
                            if (i > 0) {
                                char letraAnterior = palabra.toUpperCase().charAt(i - 1);
                                if (primeraLetra != hache && letra == hache && letraAnterior != 'C' && Character.isAlphabetic(letraSiguiente)) {
                                    contadorH++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Palabras con una única hache intercalada: " + contadorH);
    }
}
