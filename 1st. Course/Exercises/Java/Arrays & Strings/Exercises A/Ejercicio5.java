package EjerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema6
 * noviembre - 2021
 * Crea un programa que pida veinte números reales por teclado,
 * los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumaNumeros = 0;
        double numeroUsuario;
        double [] miArray = new double[10];
        for (int i = 0; i < miArray.length ; i++) {
            System.out.print("Por favor, introduce número y lo almacenaré en la array: ");
            numeroUsuario = scanner.nextDouble();
            miArray[i] = numeroUsuario;
            sumaNumeros += miArray[i];
        }
        System.out.printf("La media es: %.2f", sumaNumeros / miArray.length);

    }
}
