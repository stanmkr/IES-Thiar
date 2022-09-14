import java.util.Scanner;

/**
 * @author  stani
 * Tema4
 * @date  octubre 2021
 * Dibuja un ordinograma de un programa que lee dos números y los visualiza en orden ascendente
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número.");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce el segundo número.");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 < num2) {
            System.out.printf("%d %d", num1, num2);
        } else {
            System.out.printf("%d %d", num2 , num1);
        }
    }
}
