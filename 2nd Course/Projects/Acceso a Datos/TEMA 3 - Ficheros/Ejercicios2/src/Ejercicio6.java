import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - PACKAGE_NAME
 * Date: Noviembre / 2022
 * *********************************************
 * Desarrolla un programa que muestre un archivo en líneas de 80 caracteres, además
 * mostrará el texto pantalla a pantalla, en cada pantalla presenta 23 líneas. Después de
 * completar la pantalla el programa se para hasta que el usuario pulsa un tecla y entonces
 * muestra la página siguiente.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadCaracteres = 0;
        int cantidadLineas = 0;
        File archivo = new File("Documentos/texto6.txt");
        try {
            Scanner lectura = new Scanner(archivo);
            while (lectura.hasNextLine()) {
                String linea = lectura.nextLine();
                for (int i = 0; i < linea.length(); i++) {
                    if (cantidadCaracteres + 1 < 81) {
                        System.out.print(linea.charAt(i));
                        cantidadCaracteres++;

                    } else {
                        cantidadCaracteres = 0;
                        System.out.println();
                        cantidadLineas++;
                    }
                    if (cantidadLineas == 23){
                        System.out.print("\nPULSA UNA TECLA PARA MOSTRAR LA PÁGINA SIGUIENTE: ");
                        scanner.nextLine();
                        System.out.println();
                        cantidadLineas=0;
                    }

                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: no se encuentra el archivo.");
        }

    }
}
