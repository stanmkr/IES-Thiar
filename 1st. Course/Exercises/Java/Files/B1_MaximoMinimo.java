package EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosB
 * Date: abril / 2022"
 */
public class B1_MaximoMinimo {
    public static void main(String[] args) throws FileNotFoundException {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        File f = new File("Documentos/numeros.txt");
        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                int numero = scanner.nextInt();
                if (numero < min) {
                    min = numero;
                }
                if (numero > max) {
                    max = numero;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("El mínimo es %d y el máximo es %d ",min,max);
    }
}
