package EjerciciosA;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosA
 * Date: abril / 2022
 */
public class ejercicio5 {
    public static void main(String[] args) {
        File borroFotografias = new File("Documentos/Fotografias");
        File borroLibros = new File("Documentos/Libros");
        File borroDocumentos = new File("Documentos");
        try {
            borraTodo(borroFotografias);
            borraTodo(borroLibros);
            borraTodo(borroDocumentos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static boolean borraTodo(File f) throws FileNotFoundException {
        if (!f.exists()) {
            throw new FileNotFoundException("No se encuentra " + f.getName());
        } else if (f.isFile()) {
            return f.delete();
        } else {
            //  guardo los archivos del directorio en una lista  y recorro la lista para borrar cada archivo del directorio
            File[] listaArchivos = f.listFiles();
            for (File archivo : listaArchivos) {
                archivo.delete();
                if (archivo.isDirectory()){
                    borraTodo(archivo);
                }
            }
            //  una vez borrados los archivos el directorio está vacío, ya puedo borrarlo
            return f.delete();
        }

    }
}
