import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera:
 * Se divide el número de DNI entre 23 y el resto es codificado por una letra según la siguiente equivalencia:
 * <p>
 * 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X"
 * 11: "B", 12: "N", 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".
 * <p>
 * Escribe un programa que pida el DNI y muestre por pantalla la letra asociada.
 * Para ello se deberá crear una función a la que se le pase el número y devuelva la letra.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu número de DNI, sin escribir la letra: ");
        int dniUser = scanner.nextInt();
        System.out.printf("Tu DNI con su respectiva letra es: %d%s", dniUser, letraDni(dniUser));
    }

    /**
     * función que obtiene la letra al introducir un número de DNI
     * @param dni el parámetro que se le pasa a la función, el dni del que se quiere saber la letra
     * @return devuelve la letra del DNI introducido
     */
    public static char letraDni(int dni) {
        char[] letrasDni = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letrasDni[dni%23];
    }
}
