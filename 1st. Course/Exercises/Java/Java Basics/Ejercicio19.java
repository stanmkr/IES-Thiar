import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que lea un año como dato de entrada y diga si es año es bisiesto o no.
 * Un año es bisiesto si es divisible entre 4, pero no es divisible por 100, excepto que también sea divisible por 400.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el año: ");
        int anyo = Integer.parseInt(scanner.nextLine()); // pedimos al usuario un numero entero
        if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) { //hacemos un condicional If, en el que evaluamos varias situaciones con un && y con un ||
            System.out.printf("El año %d es bisiesto", anyo); // si se cumplen las condiciones imprimimos
        } else {
            System.out.printf("El %d NO es bisiesto", anyo); // si no se cumplen las condiciones imprimimos
        }
    }
}
