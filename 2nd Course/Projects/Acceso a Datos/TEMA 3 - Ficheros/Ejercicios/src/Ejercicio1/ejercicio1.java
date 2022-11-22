package Ejercicio1;

import java.io.File;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios
 * FECHA: Noviembre / 2022
 */
public class ejercicio1 {
    public static void main(String[] args) {
        File directorioWindows = new File("C:\\Windows");
        String[] lista = directorioWindows.list();
        if (lista !=null){
            for (String f : lista) {
                System.out.println(f);
            }
        }
    }
}
