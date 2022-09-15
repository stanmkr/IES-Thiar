package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 *Realiza un programa que lea un número entero positivo y escriba los divisores de ese número.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Escribe el número para ver sus divisores: ");
            num = scanner.nextInt();
        } while (num <=0);
        for (int i = num; i >=1 ; i--) {
            if (num % i == 0){
                System.out.printf("%d es divisor de %d %n",i,num);
            }
        }

    }
}
