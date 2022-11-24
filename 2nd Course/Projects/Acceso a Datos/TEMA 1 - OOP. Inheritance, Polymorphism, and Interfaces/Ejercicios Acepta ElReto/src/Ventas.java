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
        double sumaTotal = 0, valor = 0, diaMenosVentas, diaMasVentas;

        while (valor != -1) {
            try {
                int indiceMayor = 0, indiceMenor = 0;
                System.out.print("Introduce una cantidad para el " + diasDeLaSemana.get(0) + ": ");
                valor = Double.parseDouble(scanner.nextLine());
                diaMenosVentas = valor;
                diaMasVentas = valor;
                sumaTotal += valor;
                boolean esMayor = false, esMenor = false;

                for (int i = 1; i < diasDeLaSemana.size(); i++) {
                    System.out.print("Introduce una cantidad para el " + diasDeLaSemana.get(i) + ": ");

                    valor = Double.parseDouble(scanner.nextLine());
                    sumaTotal += valor;
                    if (valor == diaMasVentas) {
                        esMayor = true;
                    } else if (valor == diaMenosVentas) {
                        esMenor = true;
                    } else if (valor > diaMasVentas) {
                        diaMasVentas = valor;
                        indiceMayor = i;
                        esMayor = false;

                    } else if (valor < diaMenosVentas) {
                        diaMenosVentas = valor;
                        indiceMenor = i;
                        esMenor = false;
                    }
                }
                if (esMenor || esMayor) { // si los dos son true hay empate
                    System.out.println("EMPATE");
                } else {
                    boolean domingoMasventas = false;
                    double mediaSemanal = sumaTotal / 6;
                    if (mediaSemanal < valor) {
                        domingoMasventas = true;
                    }
                    if (domingoMasventas) {
                        System.out.printf("\nDia de más ventas: %s\nDía de menos ventas: %s\nSe han hecho más ventas el domingo que la media semanal (%.2f): SI\n", diasDeLaSemana.get(indiceMayor), diasDeLaSemana.get(indiceMenor), mediaSemanal);
                    } else {
                        System.out.printf("\nDia de más ventas: %s\nDía de menos ventas: %s\nSe han hecho más ventas el domingo que la media semanal (%.2f): NO\n", diasDeLaSemana.get(indiceMayor), diasDeLaSemana.get(indiceMenor), mediaSemanal);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("\nDebes de introducir números.\nEmpecemos de nuevo.\n");
                sumaTotal = 0;
            }
        }
        scanner.close();
    }
}