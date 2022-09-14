import java.util.Scanner;

/**
 * @author stani
 * Tema4
 * @date octubre 2021
 * Dibuja un ordinograma que calcula el salario neto semanal de un trabajador en función del número de horas
 * trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
 * <p>
 * • Las primeras 35 horas se pagan a tarifa normal.
 * * • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
 * * • Las tasas de impuestos son:
 * * • Los primeros 500 euros son libres de impuestos.
 * * • Los siguientes 400 tienen un 25% de impuestos.
 * * • Los restantes un 45% de impuestos.
 * <p>
 * * Escribir nombre, salario bruto, tasas y salario neto.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        double impuestos;
        double salarioNeto;
        System.out.print("Escribe nombre de operario: ");
        String nombre = scanner.nextLine();
        System.out.print("Escribe horas trabajadas esta semana: ");
        int horas = Integer.parseInt(scanner.nextLine());
        System.out.print("Escribe  el precio/hora Tarifa Normal: ");
        double precioTarifaNormal = Double.parseDouble(scanner.nextLine());

        if (horas <= 35) {
            salario = horas * precioTarifaNormal;
        } else {
            salario = 35 * precioTarifaNormal + (horas - 35) * precioTarifaNormal * 1.5;
        }
        impuestos = 0;
        if (salario > 500 && salario <= 900)  {
            impuestos = (salario - 500) * 0.25;
        } else if (salario > 900) {
            impuestos = (400 * 0.25) + (salario - 900) * 0.45;
        }
        salarioNeto = salario - impuestos;
        System.out.printf("El salario neto de %s asciende a %.2f€. Los impuestos son: %.2f€", nombre, salarioNeto, impuestos);
    }
}
