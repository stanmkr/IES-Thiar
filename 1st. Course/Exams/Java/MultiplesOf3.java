import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_4y5 - PROGRAMACIÓN
 * noviembre - 2021
 * La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres.
 * Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000 números enteros positivos.
 * El programa únicamente mostrará el mensaje "La afirmación es correcta" o "La afirmación no es correcta" dependiendo si se cumple o no.
 */
public class MULTIPLOS_DE_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0) {
                numero = i;
                while (numero > 0) {
                    suma = suma + numero % 10;
                    numero = numero / 10;
                }
                if (suma % 3 == 0) {
                    System.out.printf("El número es: %d %n", i);
                    System.out.println("la afirmación es correcta");
                } else {
                    System.out.printf("La suma de los dígitos de %d que es %d .... %d dividido entre 3 != 0 %n", i, suma, suma);
                    System.out.println("La afirmación NO es correcta");
                }
                suma = 0;
            }

        }
    }
}

