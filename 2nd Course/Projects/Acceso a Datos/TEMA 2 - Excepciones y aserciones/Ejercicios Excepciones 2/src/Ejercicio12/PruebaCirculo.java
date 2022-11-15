package Ejercicio12;

import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class PruebaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor del radio del círculo: ");
        Circulo miCirculo = new Circulo(scanner.nextDouble());
        System.out.println(miCirculo.calculaArea());
    }
}
