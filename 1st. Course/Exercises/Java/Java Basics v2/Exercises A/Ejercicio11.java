package EjerciciosA;

import java.util.Scanner;

/**
 * @author stani
 * Tema5
 * @date octubre 2021
 * Realiza un programa que sume independientemente los pares y los impares
 * de los números comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 100; i <=200 ; i++) {
            if (i%2==0){
                sumaPares+=i;
            } else {
                sumaImpares+=i;
            }
        }
        System.out.printf("La suma de los números pares es: %d%n", sumaPares);
        System.out.printf("La suma de los números impares es: %d", sumaImpares);
    }
}
