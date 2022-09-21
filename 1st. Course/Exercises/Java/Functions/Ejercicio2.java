import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edadUsuario;
        System.out.print("Por favor, introduce la edadUsuario: ");
        edadUsuario = scanner.nextInt();
        if (esMayorEdad(edadUsuario)){
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor crece un poco");
        }

    }

    /**
     * comprueba si el parámetro introducido (int) es mayor o menor que 18
     * @param edad la edad del usuario
     * @return devuelve verdadero o falso si es mayor o menor
     */
    public static boolean esMayorEdad (int edad){
        boolean mayor = false;
        if (edad >= 18){
            mayor = true;
        }
        return mayor;
    }
}
