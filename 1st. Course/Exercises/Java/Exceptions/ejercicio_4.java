import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: Febrero / 2022
 */
public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aleatorio = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int[] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        }

        for (int valor : vector) {
            System.out.println(valor);
        }

        int posicion = 0;
        do {
            try {
                System.out.print("¿Qué posición del vector quieres mostrar por pantalla?: ");
                posicion = scanner.nextInt();
                System.out.println("El valor de la posición " + posicion + " es: " + vector[posicion]);
            } catch (ArrayIndexOutOfBoundsException e) {
                if (posicion < 0) System.out.println("Has introducido un valor negativo, ADIOS.");
                else System.out.println("Has introducido un valor fuera de rango");
            } catch (InputMismatchException e) {
                System.out.println("Debes de introducir números y tienen que ser enteros");
                scanner.nextLine();
            }
        } while (posicion >= 0);


    }
}
