import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma de un programa que pide la edad por teclado y nos
 * muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad.");
        edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else if (edad <= 0){
            System.out.println("Error has roto el programa.");
        } else {
            System.out.println("Eres menor de edad, crece un poco.");
        }
    }
}
