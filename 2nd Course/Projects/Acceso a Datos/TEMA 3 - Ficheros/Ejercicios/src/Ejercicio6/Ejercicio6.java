package Ejercicio6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio6
 * Date: Noviembre / 2022
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        File fichero = new File("D:/Home/d1/f21.txt");
        mostrandoInfo(fichero);
    }

    public static void mostrandoInfo(File archivoOdirectorio) {
        try {
            long milisegundos = archivoOdirectorio.lastModified();
            Date fechaUltimaModificacion = new Date(milisegundos);

            Path archivo = Paths.get(archivoOdirectorio.getAbsolutePath());
            System.out.println("Nombre del archivo " + archivoOdirectorio.getName() +
                    "\nRuta absoluta: " + archivoOdirectorio.getAbsolutePath() +
                    "\nTamaño en kilobytes: " + Files.size(archivo) / 1024.0 +
                    "\nEs un fichero: " + archivoOdirectorio.isFile() +
                    "\nEs un directorio: " + archivoOdirectorio.isDirectory() +
                    "\nÚltima modificación: " + fechaUltimaModificacion +
                    "\nTiene permiso de escritura: " + archivoOdirectorio.canWrite() +
                    "\nTiene permiso de lectura: " + archivoOdirectorio.canRead() +
                    "\nTiene permiso de ejecución: " + archivoOdirectorio.canExecute());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
