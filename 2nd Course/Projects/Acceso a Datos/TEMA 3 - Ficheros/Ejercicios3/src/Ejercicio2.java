import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios3
 * FECHA: Noviembre / 2022
 * **************************************
 * Se tiene un fichero que contiene dos números enteros en cada línea. Se pide hacer un
 * programa que lea el fichero y realice los siguientes cálculos:
 * - La media aritmética de los números que están en la primera columna.
 * - La media ponderada de los números de la primera columna empleando como
 * pesos los de la segunda.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        File fichero = new File("Documentos/ejercicio2.txt");
        int cantidadNumerosPorColumna = 0;
        double sumaColumna1 = 0;
        double sumaColumna2 = 0;
        double numerador = 0;
        double denominador = 0;
        try {
            Scanner scanner = new Scanner(fichero);
            while (scanner.hasNext()) {
                double num1 = scanner.nextDouble();
                sumaColumna1 += num1;
                double num2 = scanner.nextDouble();
                sumaColumna2 += num2;

                numerador = numerador + (num1 * num2);
                denominador = denominador + num2;
                cantidadNumerosPorColumna++;

            }


        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el fichero no existe");
        }

        System.out.println("Media aritmética 1ª columna: " + sumaColumna1 / cantidadNumerosPorColumna);
        System.out.println("Media aritmética 2ª columna: " + sumaColumna2 / cantidadNumerosPorColumna);
        System.out.println("\nLa media ponderada de los números de la 1ª columna empleando como pesos los de la 2ª columna: " + numerador / denominador);
    }
}
