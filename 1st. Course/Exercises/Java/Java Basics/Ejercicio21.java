import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea un número entero y diga si es par y/o divisible entre 7.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
        if (num % 7 == 0) {
            System.out.println("El número es divisible entre 7");
        } else {
            System.out.println("No es divisible entre 7");
        }
    }
}
