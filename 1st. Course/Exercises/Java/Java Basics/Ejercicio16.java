import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea una calificación numérica entre 0 y 10
 * y la transforma en calificación alfabética, escribiendo el resultado.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la calificación (0-10): ");
        int num = Integer.parseInt(scanner.nextLine());
        if (num >= 0 && num < 3) {
            System.out.println("Muy deficiente.");
       } else if (num >= 3 && num < 5) {
            System.out.println("Insuficiente.");
        } else if (num == 5) {
            System.out.println("Bien.");
        } else if (num >= 6 && num < 9) {
            System.out.println("Notable.");
        } else if (num >= 9 && num <= 10) {
            System.out.println("Sobresaliente.");
        }
    }
}
