package Ejercicio7;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class PruebaExcepcion7 {
    public static void main(String[] args) {
        Excepcion7.generaExcepcion(0);
        System.out.println();
        Excepcion7.generaExcepcion(1);
        System.out.println();
        Excepcion7.generaExcepcion(2);
    }
}

class Excepcion7 {
    public static void generaExcepcion(int i) {
        int t;
        int num[] = {2, 4, 6};
        System.out.println("Recibiendo " + i);
        try {
            switch (i) {
                case 0:
                    t = 10 / i; //division por cero
                    break;
                case 1:
                    num[4] = 4; //genera un error
                    break;
                case 2:
                    return;
            }
        } catch (ArithmeticException e) {
            System.out.println("Estas dividiendo entre 0");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Estas accediendo a una posición fuera del array");
        } finally {
            System.out.println("Ejecutando código de limpieza");
        }
    }
}
