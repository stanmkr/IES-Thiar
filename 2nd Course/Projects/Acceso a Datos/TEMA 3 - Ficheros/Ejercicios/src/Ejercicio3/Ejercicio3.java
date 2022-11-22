package Ejercicio3;

import java.io.File;
import java.util.Arrays;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios
 * FECHA: Noviembre / 2022
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        File directorioActual = new File("");
        String ruta = directorioActual.getAbsolutePath();
        File archivo;
        File [] listaArchivos = new File(ruta).listFiles();
        
        if (listaArchivos!=null){
            for (int i = 0; i < listaArchivos.length ; i++) {
                archivo = listaArchivos[i];
                if (archivo.isDirectory()){
                    System.out.println("\n"+archivo.getName() + " es un directorio");
                    File directorioActual2 = archivo.getAbsoluteFile();
                    File [] listaArchivos2 = directorioActual2.listFiles();
                    if (listaArchivos2!=null){
                        for (int j = 0; j < listaArchivos2.length ; j++) {
                            archivo= listaArchivos2[j];
                            if (archivo.isDirectory()) {
                                System.out.println("  "+archivo.getName() + " -> directorio");
                            } else if (archivo.isFile()) {
                                System.out.println("  "+archivo.getName() +" -> archivo");
                            }
                        }
                    }
                } else if (archivo.isFile()) {
                    System.out.println(archivo.getName() + " es un archivo");
                }
            }
        }
    }
}
