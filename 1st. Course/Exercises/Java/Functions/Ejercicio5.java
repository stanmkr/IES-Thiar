import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double millas;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce las millas, mostraré cuántos km son: ");
        millas = scanner.nextDouble();
        System.out.printf("%.2f millas son %f km", millas, millasAKilometros(millas));
    }

    /**
     * hace la conversion de millas a km
     * @param valor las millas en double
     * @return devuelve la conversión a km
     */
    public static double millasAKilometros(double valor) {
        final double millaPorKM = 1.60934;
        return valor * millaPorKM;
    }
}
