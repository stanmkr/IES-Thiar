package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * noviembre - 2021
 * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
 * Luego mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad, contadorPersonasEncima = 0, contadorPersonasDebajo = 0;
        double alturaMaxima = Double.MIN_VALUE, alturaMinima = Double.MAX_VALUE;
        System.out.print("Por favor, introduce cantidad de alturas que quieres almacenar: ");
        cantidad = scanner.nextInt();
        double altura, totalAlturas = 0;
        double[] miArray = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce altura, que almacenaré en la array: ");
            altura = scanner.nextDouble();
            miArray[i] = altura;
            totalAlturas += miArray[i];
            if (miArray[i] < alturaMinima) {
                alturaMinima = miArray[i];
            }
            if (miArray[i] > alturaMaxima) {
                alturaMaxima = miArray[i];
            }
        }
        double media = totalAlturas / cantidad;
        System.out.printf("%nLa altura media es %.2f/%d = %.2f metros %n", totalAlturas, cantidad, media);
        System.out.printf("La altura máxima es: %.2f metros %n", alturaMaxima);
        System.out.printf("La altura mínima es: %.2f metros %n", alturaMinima);
        for (int i = 0; i < cantidad; i++) {
            if (miArray[i] > media) {
                contadorPersonasEncima++;
            } else if (miArray[i] < media) {
                contadorPersonasDebajo++;
            }
        }
        System.out.printf("Hay %d personas por encima de la media(%.2f)%n", contadorPersonasEncima, media);
        System.out.printf("Hay %d personas por debajo de la media(%.2f)%n", contadorPersonasDebajo, media);

    }
}
