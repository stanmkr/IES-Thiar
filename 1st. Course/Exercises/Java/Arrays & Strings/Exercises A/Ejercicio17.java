package EjerciciosA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6
 * Date: NOVIEMBRE/ 2021
 * <p>
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un array
 * y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario si son iguales o no.
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] miArray = new int[10];
        int[] miArray2 = new int[10];
        int valor;

        System.out.print("Introduce 20 números: ");
        for (int i = 0; i < 20; i++) {
            valor = scanner.nextInt();
            if (i < 10) {
                miArray[i] = valor;
            }
            if (i >= 10) {
                miArray2[i - 10] = valor;
            }
        }
        if (Arrays.equals(miArray, miArray2)) {
            System.out.println("SON iguales");
        } else {
            System.out.println("NO son iguales");
        }

    }
}
