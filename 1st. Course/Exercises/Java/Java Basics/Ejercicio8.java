import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma de un programa que pide la edad por
 * teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad.");
        edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
