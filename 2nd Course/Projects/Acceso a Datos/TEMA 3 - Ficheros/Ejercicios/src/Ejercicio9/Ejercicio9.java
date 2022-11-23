package Ejercicio9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio9
 * Date: Noviembre / 2022
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        File directorio = new File("C://");
        listarContenido(directorio);

    }

    public static void listarContenido(File directorioAlistar) {
        File[] listaFicheros = directorioAlistar.listFiles();
        if (listaFicheros != null) {
            for (File fichero : listaFicheros) {
                if (fichero.isDirectory()) {
                    System.out.println("<DIRECTORIO> " + fichero.getName());
                } else {
                    Path archivo = Paths.get(fichero.getAbsolutePath());
                    try {
                        System.out.println("<FICHERO> " + fichero.getName() + " | TAMAÑO (kilobytes): "+ Files.size(archivo) / 1024.0);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }


    }
}
