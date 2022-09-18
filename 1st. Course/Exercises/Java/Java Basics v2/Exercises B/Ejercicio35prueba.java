package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * Date: Noviembre / 2021
 */
public class Ejercicio35prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int compradorMaximo = 0;
        int stockEntradas;
        System.out.print("Por favor, introduce la cantidad de entradas que se van a vender: ");
        stockEntradas = scanner.nextInt();
        do {
            int entradasCompradas;
            System.out.print("Introduce cuantas entradas quieres comprar: ");
            entradasCompradas = scanner.nextInt();

            if (entradasCompradas > stockEntradas) {
                System.out.println("La cantidad que quieres comprar es superior al stock de entradas.");
            } else if (entradasCompradas > 10 || entradasCompradas <= 0) {
                System.out.println("Cantidad errónea de entradas, el rango de del 0 al 10");
            } else {
                stockEntradas -= entradasCompradas;
                if (entradasCompradas > compradorMaximo) {
                    compradorMaximo = entradasCompradas;
                    System.out.printf("Quedan disponibles %d entradas %n", stockEntradas);
                }
            }

        } while (stockEntradas > 0);
        System.out.printf("La cantidad máxima de entradas que un cliente ha comprado ha sido de %d entradas", compradorMaximo);


    }
}
