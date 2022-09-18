import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_ARRAY_STRING - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;
        do {
            System.out.print("INTRODUCE UN NÚMERO ENTERO DEL RANGO 1-10: ");
            if (scanner.hasNextInt()) { // compruebo si el valor introducido es un número entero ( respuesta es booleana)
                System.out.println("El número es entero.");
                numeroUsuario = scanner.nextInt(); // si es entero lo almaceno en variable
                if ( numeroUsuario < 1 || numeroUsuario > 10){ // si cumple no esta en el rango
                    System.out.println("No estas en el rango 1-10");
                } else {
                    System.out.println("Estas en el rango correcto"); // en aso de que no cumpla
                    break;
                }
            } else {
                System.out.println("El número introducido no es un número entero");
                scanner.nextLine();
            }
        } while (!scanner.hasNextInt()); // mientras lo que se introduce es falso

    }
}
