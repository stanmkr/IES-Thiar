package Ejercicio9;

import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class PruebaMail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            try {
                validarEnteroPositivo(numero = scanner.nextInt());
            } catch (MailException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static void validarEnteroPositivo(int valor) throws MailException {
        try {
            if (valor < 0) {
                throw new MailException("VALOR INCORRECTO");
            }
        } catch (Exception e) {
            System.err.print(new MailException(e.getMessage(), "El valor introducido debe de ser un número mayor a 0. ").getDescripcion() + e.getMessage()+"\n");

        }
    }
}
