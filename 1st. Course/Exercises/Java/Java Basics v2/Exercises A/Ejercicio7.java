package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema5
 * Date: 27/10/2021
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
 * indicando cuántos son positivos y cuantos negativos.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        System.out.println("Te voy a mostrar 10 números no nulos, y te dire el total de negativos y positivos.");
        boolean flag = false;
        for (int i = 1;  i<=5 ; i++) {
            System.out.print("Escribe el número: ");
            int numUser = Integer.parseInt(scanner.nextLine());
            if (numUser < 0){
                flag = true;
                negativos++;
            } else {
                positivos++;
            }
        }
        if (flag){
            System.out.printf("Se han introducido número/s negativo/s. El total de números positivos son %d y el total de negativos son %d", positivos, negativos);
        } else {
            System.out.printf("No ha habido ningún número negativo. El total de números positivos es: %d", positivos);
        }
    }
}
