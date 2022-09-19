package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6 - PACKAGE_NAME
 * noviembre - 2021
 * Crea un programa que pida diez números reales por teclado,
 * los almacene en un array, y luego muestre todos sus valores
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numeroUser;
        double[] miArray = new double[10];
        for (int i = 0; i < miArray.length; i++) {
            do {
                System.out.printf("Escribe un número para introducirlo en la array en índice %d: ",i);
                if(scanner.hasNextDouble()){
                } else {
                    scanner.nextLine();
                }
            } while (!scanner.hasNextDouble());
            numeroUser = scanner.nextDouble();
            miArray[i] = numeroUser;
        }
        for (double valor : miArray) {
            System.out.printf("%f ", valor);
        }


    }
}
