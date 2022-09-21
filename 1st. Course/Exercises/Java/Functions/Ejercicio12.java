import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 *
 * Realiza un programa que dado un valor en kilómetros nos lo traduce a millas.
 * El programa debe tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en millas
 *
 */
public class Ejercicio12 {


    public static double pasoAmillas(double km) {
        final double milla = 0.621371;
        return km * milla;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce los km y te mostraré las millas: ");
        double km = scanner.nextDouble();
        System.out.printf("%.2f km son %.2f millas",km,pasoAmillas(km));


    }
}
