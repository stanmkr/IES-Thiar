import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Escribe un programa que muestre un menú con 2 opciones:
 * <p>
 * “1. Circunferencia” y
 * “2. Área”.
 * <p>
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno. Implementa las funciones:
 * int menu() // Muestra el menú y devuelve el número elegido
 * double pideRadio() // Pide que se introduzca el radio y lo devuelve
 * double circunferencia(double r) // Calcula la circunferencia y la devuelve
 * double área(double r) // Calcula el área y la devuelve
 * <p>
 * <p>
 * <p>
 * Modifica el programa anterior de modo que el proceso se repita una y otra vez
 * (mostrar menú → realizar el cálculo → volver a mostrar menú).
 * Añade una opción más llamada “Salir” que terminará el programa si es elegida.
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean noTerminado = false;
        do {
            switch (menu()) {
                case 1 -> {  // circunferencia
                    System.out.println("Has elegido ver la circunferencia.");
                    System.out.printf("La circunferencia es: %.2f%n", circunferencia(pideRadio()));
                }
                case 2 -> { // area
                    System.out.println("Has elegido ver el área.");
                    System.out.printf("El área es: %.2f%n", area(pideRadio()));
                }
                case 3 -> { // volumen
                    System.out.println("Has elegido ver el volumen.");
                    System.out.printf("El volumen es: %.2f%n", volumen(pideRadio()));
                }
                case 0 -> {
                    System.out.println("HAS DECIDIDO SALIR");
                    noTerminado = true;
                }
                default -> System.out.println("La opción no se encuentra en el menú\n");
            }
        } while (noTerminado);
    }

    /**
     * imprime un menú y pide al usuario que introduzca un valor entero
     *
     * @return devuelve el valor introducido por el usuario
     */
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- BIENVENIDO AL MENU -----\n");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("0. SALIR");

        System.out.print("\nElige una opción: ");
        return scanner.nextInt();
    }

    /**
     * pide al usuario que introduzca un valor
     *
     * @return devuelve el valor introducido por el usuario
     */
    public static double pideRadio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        return scanner.nextDouble();
    }

    /**
     * función que calcula la circunferencia de una esfera dado un radio
     *
     * @param radio parámetro que recibe la función, es el radio de la esfera
     * @return devuelve la circunferencia
     */
    public static double circunferencia(double radio) {
        return 2 * Math.PI * radio;

    }

    /**
     * función que calcula el área de una esfera dado un radio
     *
     * @param radio parámetro a recibir, el valor del radio
     * @return devuelve el área
     */
    public static double area(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
    // Modifica el programa añadiendo otra opción llamada “Volumen”,
    // permitiendo que el usuario también pueda solicitar el cálculo del volumen. Añade la función:

    /**
     * función que calcula el volumen de una esfera dado el radio
     *
     * @param radio parámetro que es el valor del radio
     * @return devuelve el volumen de la circunferencia
     */
    public static double volumen(double radio) {
        return 4.0 / 3 * Math.PI * Math.pow(radio, 3);
    }
}
