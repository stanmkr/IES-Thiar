import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * EXAMEN_ARRAY_STRING - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String ASOC_NIF="TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;
        System.out.print("Introduce tu DNI: ");
        dni = scanner.nextInt();
        int division = dni%23;         // obtengo el resto
        // muestro el caracter almacenado en el string, en la posicion del valor del resto
        System.out.printf("La letra de tu DNI es %s",ASOC_NIF.charAt(division));

    }
}
