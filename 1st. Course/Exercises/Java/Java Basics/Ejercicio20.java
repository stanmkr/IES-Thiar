import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea por teclado un número y muestre el último dígito del número.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.printf("El último dígito del número es: %d", num%10 );
    }
}
