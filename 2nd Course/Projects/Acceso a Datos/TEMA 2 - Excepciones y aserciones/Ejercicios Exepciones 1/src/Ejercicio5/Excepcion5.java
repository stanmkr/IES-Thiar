package Ejercicio5;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class Excepcion5 {
    public static void main(String[] args) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int den[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + den[i] + "=" + num[i] / den[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Estas fuera de los límites del vector");

            } catch (Throwable e) {
                System.err.print("ERROR: " + e.getMessage()+"\n");
            }
        }
    }
}
