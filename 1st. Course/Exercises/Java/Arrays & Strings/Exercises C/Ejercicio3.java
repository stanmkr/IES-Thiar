package EjerciciosC;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer
 * la matriz y al final mostrar por pantalla cuántos valores son mayores que cero,
 * cuántos son menores que cero y cuántos son igual a cero
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int posicionesPrimera, posicionesSegunda, valorUsuario, mayores = 0, menores = 0, iguales = 0;
        System.out.println("VOY A CREAR UNA MATRIZ BIDIMENSIONAL");
        System.out.print("Introduce cuantas posiciones tendrá la 1ª matriz: ");
        posicionesPrimera = scanner.nextInt();
        System.out.print("Introduce cuantas posiciones tendrá la 2ª matriz: ");
        posicionesSegunda = scanner.nextInt();

        int[][] miMatriz = new int[posicionesPrimera][posicionesSegunda];
        for (int i = 0; i < miMatriz.length; i++) {
            for (int j = 0; j < miMatriz[i].length; j++) {
                System.out.printf("Introduce valor para la posición %d:%d de la matriz: ", i + 1, j + 1);
                valorUsuario = scanner.nextInt();
                miMatriz[i][j] = valorUsuario;
                if (miMatriz[i][j] < 0) {
                    menores++;
                } else if (miMatriz[i][j] == 0) {
                    iguales++;
                } else {
                    mayores++;
                }
            }
        }
        System.out.printf("%nNúmeros = 0: %d%n", iguales);
        System.out.printf("Números < 0: %d%n", menores);
        System.out.printf("Números > 0: %d%n", mayores);
    }
}
