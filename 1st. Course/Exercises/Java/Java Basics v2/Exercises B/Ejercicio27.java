package EjerciciosB;

import java.util.Scanner;

/**
 * Created by STANISLAV KRASTEV
 * 1º DAM
 * TEMA5 EJERCICIOS-B
 * Date: NOVIEMBRE
 * Realiza un programa que pida dos número enteros A y B, siendo B mayor que A.
 * Luego visualiza los números desde A hasta B e indicar cuantos hay que sean pares.
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1, num2;
        int contadorPares = 0;
        do {
            System.out.print("Escribe el primer número: ");
            num1 = scanner.nextInt();
            System.out.print("Dime otro número mayor al anterior: ");
            num2 = scanner.nextInt();
            if (num2 <= num1) {
                System.out.println("¡Te he dicho que el 2º número tiene que ser mayor al primero!\n");
            }
            for (int i = num1; i <= num2; i++) {
                System.out.printf("%d ",i);
                if (i % 2 == 0) {
                    contadorPares++;
                }
            }
        } while (num2 <= num1);
        System.out.printf("%nLa cantidad de pares son: %d", contadorPares);
    }
}
