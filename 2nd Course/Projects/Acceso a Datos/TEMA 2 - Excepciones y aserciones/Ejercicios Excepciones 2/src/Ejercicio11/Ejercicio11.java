package Ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Escribe en numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Escribe en denominador: ");
            int denominador = scanner.nextInt();
            isValidNumeradorDenominador(numerador, denominador);
            System.out.println(numerador / denominador);
        } catch (ExcepcionIntervalo e) {
            System.err.println(e.getMessage());
        }catch (ArithmeticException e){
            System.err.println("ERROR división entre 0");
        }catch (InputMismatchException e){
            System.err.println("ERROR introducción de caracteres no permitidos");
        }
    }

    public static void isValidNumeradorDenominador(double numerador, double denominador) throws ExcepcionIntervalo {
        if (numerador > 100 || denominador < -5) {
            throw new ExcepcionIntervalo("ERROR el numerador debe de ser menor a 100 y el denominador mayor a -5");
        }
    }
}

class ExcepcionIntervalo extends Exception {

    ExcepcionIntervalo(String mensaje) {
        super(mensaje);
    }
}
