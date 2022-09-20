package EjerciciosC;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - PACKAGE_NAME
 * Date: NOVIEMBRE / 2021
 * <p>
 * Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe brecha salarial entre ambos.
 * El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado).
 * Para cada persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo.
 * Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada género.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPersonas;
        System.out.print("¿De cuántas personas quieres saber la información?: ");
        numPersonas = scanner.nextInt();
        int[][] matriz = new int[numPersonas][2];
        for (int i = 0; i < matriz.length; i++) {
            do {
                System.out.printf("Introduce el género de la persona %d (varón = 0 / mujer = 1): ", i + 1);
                matriz[i][0] = scanner.nextInt();
                System.out.printf("Introduce el sueldo de la persona %d: ", i + 1);
                matriz[i][1] = scanner.nextInt();

            } while (matriz[i][0] != 0 && matriz[i][0] != 1);
        }
        double[] sumaDeSueldos = new double[2];
        int[] contadorSexo = new int[2];
        for (int[] persona : matriz) {
            sumaDeSueldos[persona[0]] += persona[1];
            contadorSexo[persona[0]]++;
        }
        System.out.printf("La media de los sueldos de los varones es %.2f y la de las mujeres es %.2f", sumaDeSueldos[0]/contadorSexo[0], sumaDeSueldos[1]/contadorSexo[1]);
    }
}
