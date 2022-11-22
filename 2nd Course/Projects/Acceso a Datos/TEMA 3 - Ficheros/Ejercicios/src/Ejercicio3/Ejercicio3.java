package Ejercicio3;

import java.io.File;
/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios
 * FECHA: Noviembre / 2022
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        File directorioActual = new File("");
        String ruta = directorioActual.getAbsolutePath();
        File [] listaArchivos = new File(ruta).listFiles();
        
        if (listaArchivos!=null){
            for (File file : listaArchivos) {
                if (file.isDirectory()) {
                    System.out.println("\n" + file.getName() + " es un directorio");
                    File directorioActual2 = file.getAbsoluteFile();
                    File[] listaArchivos2 = directorioActual2.listFiles();
                    if (listaArchivos2 != null) {
                        for (File file2 : listaArchivos2) {
                            if (file2.isDirectory()) {
                                System.out.println("  " + file2.getName() + " -> directorio");
                            } else if (file.isFile()) {
                                System.out.println("  " + file2.getName() + " -> archivo");
                            }
                        }
                    }
                } else if (file.isFile()) {
                    System.out.println(file.getName() + " es un archivo");
                }
            }
        }
    }
}
