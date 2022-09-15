package EjerciciosA;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * 1º DAM
 * Tema 5
 * Date: Noviembre
 * 17. Realiza un programa que muestre la tabla de multiplicar de un número que se pide por teclado entre el 1 y el 9. Se debe controlar que el número se encuentra entre el rango permitido y volver
 * a pedirlo mientras que no sea correcto. Realiza la solución de mostrar la tabla utilizando un bucle do-while
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numUser;
        do {
            System.out.print("Escribe un número en el rango 1-9 para ver su tabla de multiplicar: ");
            numUser = scanner.nextInt();
            if (numUser <1 || numUser >9){
                System.out.println("Estas fuera de rango, vuelve a introducir un número dentro del rango.");
            }
        } while (numUser < 1 || numUser > 9);

        do {
            System.out.printf("%d * %d = %d %n", numUser, contador, numUser * contador);
            contador++;
        } while (contador <= 10);

    }
}
