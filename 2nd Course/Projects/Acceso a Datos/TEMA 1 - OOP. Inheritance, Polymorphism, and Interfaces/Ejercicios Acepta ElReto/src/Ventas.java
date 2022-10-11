import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios Acepta el Reto
 * Date: Octubre / 2022
 * <p>
 * **************** EJERCICIO VENTAS ****************
 * www.aceptaelreto.com/problem/statement.php?id=105&cat=25
 */


public class Ventas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> diasDeLaSemana = new ArrayList<>(Arrays.asList("MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINMGO"));
        double sumaTotal = 0, valor = 0, diaMenor, diaMayor;

        while (valor != -1) {
            try {
                int indiceMayor = 0, indiceMenor = 0;
                valor = Double.parseDouble(scanner.nextLine());
                diaMenor = valor;
                diaMayor = valor;
                sumaTotal += valor;
                boolean esMayor = false, esMenor = false;

                for (int i = 1; i < diasDeLaSemana.size(); i++) {
                    valor = Double.parseDouble(scanner.nextLine());
                    sumaTotal += valor;
                    if (valor == diaMayor) {
                        esMayor = true;
                    } else if (valor > diaMayor) {
                        diaMayor = valor;
                        indiceMayor = i;
                        esMayor = false;
                    } else if (valor == diaMenor) {
                        esMenor = true;
                    } else if (valor < diaMenor) {
                        indiceMenor = i;
                        esMenor = false;
                    }
                }
                if (esMenor || esMayor) {
                    System.out.println("EMPATE");
                } else {
                    boolean domingoMasventas = false;
                    if (sumaTotal / 6 < valor) {
                        domingoMasventas = true;
                    }
                    if (domingoMasventas) {
                        System.out.println(diasDeLaSemana.get(indiceMayor) + " " + diasDeLaSemana.get(indiceMenor) + " SI");
                    } else {
                        System.out.println(diasDeLaSemana.get(indiceMayor) + " " + diasDeLaSemana.get(indiceMenor) + " NO");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes de introducir números.");
            }
        }
        scanner.close();
    }
}