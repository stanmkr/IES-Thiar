package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema5
 * Date: 27/10/2021
 * Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0,
 * y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNums = 0;
        int positivos = 0;
        int negativos = 0;
        boolean flag = false;
        int numUser;

        do {
            System.out.print("Introduce número: ");
            numUser = scanner.nextInt();
            totalNums++;
            if (numUser > 0) {
                positivos++;
            } else if (numUser <0 && numUser != 0){
                negativos++;
                flag = true;
            }
        } while (numUser != 0);

        if (flag) {
            System.out.printf("%nSe han introducido número/s negativo/s. El total de números positivos son %d y el total de negativos son %d", positivos, negativos);
        } else {
            System.out.printf("%nNo ha habido ningún número negativo. El total de números positivos es: %d", positivos);
        }
        System.out.printf("%nEl total de números introducidos ha sido: %d", totalNums);
    }
}
