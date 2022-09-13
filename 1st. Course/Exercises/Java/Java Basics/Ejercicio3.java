import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que calcule el área de un cuadrado cuyo lado se introduce por teclado
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lado;
        System.out.print("Introduce el lado del cuadrado: ");
        lado = scanner.nextInt();
        int area = lado * lado;
        //int lado = Integer.parseInt(scanner.nextLine());
        System.out.println("El área del cuadrado es: " + area);
    }
}
