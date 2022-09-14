import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja el ordinograma de un programa que lee un número
 * y me dice si es positivo o negativo, consideraremos el cero como positivo.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}
