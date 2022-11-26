import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - PACKAGE_NAME
 * Date: Noviembre / 2022
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int palabrasCantidad = 0;
        try {
            Scanner scanner = new Scanner(new File("Documentos/texto.txt"));
            while (scanner.hasNext()) {
                scanner.next();
                palabrasCantidad++;
            }
            System.out.println("Palabras en el archivo de texto: " + palabrasCantidad);
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el archivo no existe");

        }


    }
}
