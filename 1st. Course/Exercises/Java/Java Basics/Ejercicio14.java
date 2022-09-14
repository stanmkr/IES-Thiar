import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lee dos números y nos dice cuál es el mayor o si son iguales.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2) {
            System.out.printf("%d %n", num1);
        } else if (num1 < num2) {
            System.out.printf("%d %n", num2);
        } else {
            System.out.println("Son iguales");
        }
    }
}
