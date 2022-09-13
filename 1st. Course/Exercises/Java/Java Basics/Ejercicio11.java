import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor.
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.printf("%d es el mayor", num1);
        } else if (num1 == num2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.printf("%d es el mayor", num2);
        }
    }
}
