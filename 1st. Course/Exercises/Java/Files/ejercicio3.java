package EjerciciosA;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosA
 * Date: abril / 2022
 */
public class ejercicio3 {
    public static void main(String[] args) {
        renombrar("Documentos", "DOCS");
        renombrar("DOCS/Fotografias", "DOCS/FOTOS");
        renombrar("DOCS/Libros", "DOCS/LECTURAS");
        eliminarExtensión("DOCS/FOTOS");
        eliminarExtensión("DOCS/LECTURAS");
    }

    public static void renombrar(String original, String nuevo) {
        System.out.println(new File(original).renameTo(new File(nuevo)));
    }


    public static void eliminarExtensión (String ruta){
        File f = new File(ruta);
        if (f.isDirectory()){
            File [] lista = f.listFiles();
            for (File archivo : lista) {
                if (archivo.isFile()){
                    String archivoNuevo = archivo.getName().substring(0,archivo.getName().lastIndexOf("."));
                    File rutaDestino = new File(archivo.getParent()+"\\"+archivoNuevo);
                    archivo.renameTo(rutaDestino);
                }
            }

        }

    }
}
