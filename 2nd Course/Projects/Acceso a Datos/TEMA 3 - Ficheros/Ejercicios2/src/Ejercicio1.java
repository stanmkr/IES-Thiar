import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - Ejercicio1
 * Date: Noviembre / 2022
 * ******************************
 * Escriba un programa en Java que lea un fichero de texto con varias líneas y cuente cuantas
 * vocales hay de cada tipo (a,e,i,o,u). Para almacenar el número de vocales usa un array de 5
 * posiciones
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        HashMap<String, Integer> vocales = new HashMap<>();
        vocales.put("A", 0);
        vocales.put("E", 0);
        vocales.put("I", 0);
        vocales.put("O", 0);
        vocales.put("U", 0);
        try {
            Scanner scanner = new Scanner(new File("Documentos/texto.txt"));
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                for (int i = 0; i < linea.length(); i++) {
                    char letraActual = linea.charAt(i);
                    if (esVocal(letraActual)) {
                        String claveHash = String.valueOf(letraActual).toUpperCase();
                        vocales.put(claveHash, vocales.get(claveHash) + 1);
                    }
                }

            }
            for (HashMap.Entry<String, Integer> entry : vocales.entrySet()) {
                System.out.printf("Vocal: %s se ha encontrado %d veces %n", entry.getKey(), entry.getValue());
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el archivo no existe");
        }


    }

    public static boolean esVocal(char letra) {
        return "AEIOU".contains(String.valueOf(letra).toUpperCase());
    }
}
