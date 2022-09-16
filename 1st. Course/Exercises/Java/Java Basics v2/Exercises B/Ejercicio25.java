package EjerciciosB;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces igual al valor numérico leído.
 * En aquellos casos en que el valor leído no sea positivo se deberá escribir un único asterisco.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos asteriscos quiere ver señor/a? Escriba el número: ");
        int userNumber = Integer.parseInt(scanner.nextLine());
        if (userNumber < 0){
            userNumber = 1;
        }

        for (int i = 1; i <= userNumber ; i++) {
            System.out.print("* ");
        }

    }
}
