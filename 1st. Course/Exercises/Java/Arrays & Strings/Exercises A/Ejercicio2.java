package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - PACKAGE_NAME
 * noviembre - 2021
 * Crea un programa que pida diez números reales por teclado,
 * los almacene en un array, y luego muestre la suma de todos los valores.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroUser;
        double sumaNumeros = 0;
        double[] miArray = new double[10];

        for (int i = 0; i < miArray.length ; i++) {
            System.out.print("Introduce número, lo almacenaré en la array: ");
            numeroUser = scanner.nextDouble();
            miArray [i] = numeroUser;
            sumaNumeros += miArray[i];
        }
        System.out.printf("La suma de los valores de la array es: %.2f", sumaNumeros);


    }
}
