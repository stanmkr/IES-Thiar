package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado (múltiplo de 5 €)
 * mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5).
 * Hay que indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo número de billetes posible).
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int bill500 = 0;
        int bill200 = 0;
        int bill100 = 0;
        int bill50 = 0;
        int bill20 = 0;
        int bill10 = 0;
        int bill5 = 0;
        int cantidadUser;
        do {
            System.out.print(" Por favor, escribe la cantidad de dinero siendo ésta múltiplo de 5: ");
            cantidadUser = scanner.nextInt();
            if (cantidadUser % 5 != 0) {
                System.out.println("El número introducido no es múltiplo de 5");
            }
            while (cantidadUser > 0 && cantidadUser % 5 == 0) {
                if (cantidadUser - 500 >= 0) {
                    cantidadUser -= 500;
                    bill500++;
                } else if (cantidadUser - 200 >= 0) {
                    cantidadUser -= 200;
                    bill200++;
                } else if (cantidadUser - 100 >= 0) {
                    cantidadUser -= 100;
                    bill100++;
                } else if (cantidadUser - 50 >= 0) {
                    cantidadUser -= 50;
                    bill50++;
                } else if (cantidadUser - 20 >= 0) {
                    cantidadUser -= 20;
                    bill20++;
                } else if (cantidadUser - 10 >= 0) {
                    cantidadUser -= 10;
                    bill10 += 1;
                } else if (cantidadUser - 5 >= 0) {
                    cantidadUser -= 5;
                    bill5 += 1;
                }
            }
        } while (cantidadUser % 5 != 0);
        System.out.printf("%d billete/s de 500€ %n", bill500);
        System.out.printf("%d billete/s de 200€ %n", bill200);
        System.out.printf("%d billete/s de 100€ %n", bill100);
        System.out.printf("%d billete/s de 50€ %n", bill50);
        System.out.printf("%d billete/s de 20€ %n",bill20);
        System.out.printf("%d billete/s de 10€ %n",bill10);
        System.out.printf("%d billete/s de 5€",bill5);
    }
}
