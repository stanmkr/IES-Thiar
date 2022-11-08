package Ejercicio1;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class Excepcion1 {
    public static void main(String args[]) {
        int numero[] = new int[5];
        try {
            numero[7] = 0;
        }catch (IndexOutOfBoundsException e){
            System.out.println("No se encuentra el índice");
        }
    }
}