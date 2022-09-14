package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema5
 * Date: 27/10/2021
 * Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
 * de si ha leído algún número negativo o no.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Te voy a mostrar 10 números no nulos, si hay negativo, te mostraré un mensaje.");
        boolean flag = false;
        for (int i = 1;  i<=5 ; i++) {
            System.out.print("Escribe el número: ");
            int numUser = Integer.parseInt(scanner.nextLine());
            if (numUser < 0){
                flag = true;
            }
        }
        if (flag){
            System.out.println("Se han introducido número/s negativo/s.");
        } else {
            System.out.println("No ha habido ningún número negativo.");
        }

    }
}
