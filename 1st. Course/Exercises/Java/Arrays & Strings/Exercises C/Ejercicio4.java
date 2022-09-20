package EjerciciosC;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema6 - EjerciciosC
 * Date: NOVIEMBRE / 2021
 * <p>
 * Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas.
 * El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[4][5];
        double notas, sumaNotas = 0, media = 0, minima = Double.MAX_VALUE, maxima = Double.MIN_VALUE;
        // 2 bucles, el exterior para recorrer los alumnos, el interior para las notas
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Introduce la nota para el ALUMNO(%d) -- ASIGNATURA(%d): ", i + 1, j + 1);
                notas = scanner.nextDouble();
                array[i][j] = notas;
                sumaNotas += notas;
                media = sumaNotas / array[i].length;
                if (array[i][j] < minima) minima = array[i][j];
                if (array[i][j] > maxima) maxima = array[i][j];
            }
            System.out.printf("La media del ALUMNO(%d) es: %.2f%n", i + 1, media);
            System.out.printf("La nota mínima del ALUMNO(%d) es: %.2f%n", i + 1, minima);
            System.out.printf("La nota máxima del ALUMNO(%d) es: %.2f%n", i + 1, maxima);
            media = 0;
            sumaNotas = 0;
            minima = Double.MAX_VALUE;
            maxima = Double.MIN_VALUE;
            System.out.println();
        }

    }
}
