package Ejercicio11;

import java.io.File;
import java.util.Objects;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio11
 * Date: Noviembre / 2022
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String fich;
        File directorio = new File("D:/home");
        File[] listaFicheros = directorio.listFiles();
        if (listaFicheros != null) {
            for (File fichero : listaFicheros) {
                if (fichero.isDirectory()) {
                    if (Objects.requireNonNull(fichero.listFiles()).length==0){ // SI LA LONGITUD DE LA LISTA DE ARCHIVOS DE ESE DIRECTORIO ES 0 ES DECIR SI EL DIRECTORIO ESTA VACÍO SE BORRARÁ
                        fich = fichero.getAbsolutePath();
                        if (fichero.delete()){
                            System.out.println("El directorio " + fich + " borrado correctamente");
                        }
                    }else {
                        System.out.println("El directorio no esta vacío. No es posible borrar el directorio.");
                    }
                } else {
                    fich = fichero.getAbsolutePath();
                    if (fichero.delete()) {
                        System.out.println("Fichero " + fich + " borrado correctamente");
                    }
                }

            }
        }
    }
}
