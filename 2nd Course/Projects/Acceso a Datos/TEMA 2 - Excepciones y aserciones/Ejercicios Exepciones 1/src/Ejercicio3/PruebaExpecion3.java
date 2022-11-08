package Ejercicio3;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */


public class PruebaExpecion3 {
    public static void main(String[] args) {
        Excepcion.divide();
    }
}

class Excepcion{
    static void divide() {
        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8, 16};
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (java.lang.ArithmeticException excepcion) {
                System.out.println("Dividiendo por cero");
            }
        }
    }
}
/*
¿Qué ocurre después de que el programa responde a un error?
    El programa imprime mensaje de error y sigue su curso
 */
