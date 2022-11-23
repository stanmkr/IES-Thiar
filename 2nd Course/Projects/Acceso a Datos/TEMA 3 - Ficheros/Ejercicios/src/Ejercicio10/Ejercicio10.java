package Ejercicio10;

import java.io.File;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio10
 * Date: Noviembre / 2022
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        File directorio = new File("D:/Home");
        File[] listaFicheros = directorio.listFiles();
        if (listaFicheros != null) {
            for (File fichero : listaFicheros) {
                if (fichero.isDirectory()){
                    System.out.println("\n<DIRECTORIO --> "+ fichero.getPath());
                    File [] listaArchivos2 = fichero.listFiles();
                    if (listaArchivos2!=null){
                        for (File fichero2 : listaArchivos2) {
                            if (fichero2.isFile()){
                                System.out.println("    <FICHERO --> "+ fichero2.getPath());
                            }else {
                                System.out.println("<DIRECTORIO --> "+ fichero2.getPath());
                            }
                        }
                    }

                }else {
                    System.out.println("    <FICHERO --> "+ fichero.getPath());
                }
            }
        }

    }
}
