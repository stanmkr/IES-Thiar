import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta a la ecuación de Pitágoras: x ² + y ² = z ².
 * El programa solicita al usuario los valores x, y, z.
 * Se deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.print("Introduce el primer valor: ");
        x = scanner.nextInt();
        System.out.print("Introduce el segundo valor: ");
        y = scanner.nextInt();
        System.out.print("Introduce el tercer valor: ");
        z = scanner.nextInt();
        if (pitagoras(x,y,z)){
            System.out.println("Son iguales");
            System.out.printf("FUNCIÓN: %.2f² + %.2f² = %.2f² -------> %.2f + %.2f = %.2f",x,y,z,Math.pow(x,2),Math.pow(y,2),Math.pow(z,2));
        } else {
            System.out.println("NO son iguales");
            System.out.printf("FUNCIÓN: %.2f² + %.2f² = %.2f² -------> %.2f + %.2f NO es igual a %.2f",x,y,z,Math.pow(x,2),Math.pow(y,2),Math.pow(z,2));
        }




    }

    /**
     * función que comprueba dado 3 parámetros, si se cumple la ecuación de Pitágoras x ² + y ² = z
     * @param valor1 primer parámetro x
     * @param valor2 segundo parámetro y
     * @param valor3 tercer parámetro z
     * @return devuelve si se cumple o no (true/false)
     */
    public static boolean pitagoras(double valor1, double valor2, double valor3) {
        boolean cumplePitagoras = true;
        double sumaValor1Valor2 = Math.pow(valor1, 2) + Math.pow(valor2, 2);
        if (sumaValor1Valor2 != Math.pow(valor3, 2)) cumplePitagoras = false;
        return cumplePitagoras;
    }
}
