import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea un valor correspondiente a una
 * distancia en millas marinas y escriba la distancia en metros.
 * Sabiendo que una milla marina equivale a 1.852 metros.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor en millas: ");
        double millas = Double.parseDouble(scanner.nextLine());
        double conversion = millas * 1.852;
        System.out.printf("La distancia en km es: %.4f km", conversion);

    }
}
