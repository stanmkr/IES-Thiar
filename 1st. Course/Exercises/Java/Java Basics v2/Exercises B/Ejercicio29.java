package EjerciciosB;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema5 - EjerciciosB
 * noviembre - {YEAR}
 * Existen varios algoritmos para calcular el día de la semana en que cae una fecha cualquiera.
 * El que se utiliza en este ejercicio lo cuenta el danés Claus Tøndering en su web The Calendar FAQ.
 * Escriba un programa que calcule el día de la semana en que cae una fecha cualquiera posterior a 1582
 * (es decir, desde que se utiliza el calendario gregoriano).
 */
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anyo, mes, dia;
        do {
            System.out.println("CÁLCULO DEL DÍA DE LA SEMANA");
            System.out.print("Escriba el número de día: ");
            dia = scanner.nextInt();
            System.out.print("Escriba el número de mes: ");
            mes = scanner.nextInt();
            System.out.print("Escriba el número de año (a partir de 1582): ");
            anyo = scanner.nextInt();
            if (anyo < 1582){
                System.out.println("¡Le he pedido un año posterior a 1582!");
            }
        } while (anyo <= 1582);


        int a = (14 - mes) / 12;
        int b = anyo - a;
        int c = mes + (a * 12) - 2;
        int d = b / 4;
        int e = b / 100;
        int f = b / 400;
        int g = (c * 31) / 12;
        int h = dia + b + d - e + f + g;
        int i = h % 7;
        switch (i) {
            case 0 -> System.out.printf("El dia %d del mes %d de %d es Domingo", dia, mes, anyo);
            case 1 -> System.out.printf("El dia %d del mes %d de %d es Lunes", dia, mes, anyo);
            case 2 -> System.out.printf("El dia %d del mes %d de %d es Martes", dia, mes, anyo);
            case 3 -> System.out.printf("El dia %d del mes %d de %d es Miércoles", dia, mes, anyo);
            case 4 -> System.out.printf("El dia %d del mes %d de %d es Jueves", dia, mes, anyo);
            case 5 -> System.out.printf("El dia %d del mes %d de %d es Viernes", dia, mes, anyo);
            case 6 -> System.out.printf("El dia %d del mes %d de %d es Sábado", dia, mes, anyo);
        }

    }
}
