package Ejercicio4;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class PruebaExcepcion4 {
    public static void main(String args[]) {
        Excepcion4.divide();
        System.out.println("FIN");
    }
}

class Excepcion4 {
    static void divide() {
        int num[] = {4, 8, 16, 32, 64, 128, 256};
        int den[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length + 1; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (ArithmeticException e) {
                System.out.println("Dividiendo por 0");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Accediendo a una posición fuera del vector");
            }
        }
    }
}
