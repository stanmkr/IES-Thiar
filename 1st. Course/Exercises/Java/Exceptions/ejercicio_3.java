import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[5];

        for (int i = 1; i <= vector.length; i++) {
            try {
                System.out.print("Introduce valor para el número " + i + ": ");
                vector[i-1] = scanner.nextDouble();
                //i++;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir números");
                scanner.nextLine();
                i--;
            }
        }

        // mostrando el vector
        for (double valor : vector) {
            System.out.println(valor);
        }
    }
}
