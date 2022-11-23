package Ejercicio4;

import java.io.File;
import java.io.IOException;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio4
 * Date: Noviembre / 2022
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String ruta;
        File archivo;
        File directorioPrincipal = new File("D:/Home");
        if (directorioPrincipal.mkdir()) {
            System.out.println("Directorio " + directorioPrincipal.getAbsolutePath() + " creado correctamente ");
            for (int i = 1; i <= 2; i++) {
                ruta = directorioPrincipal.getAbsolutePath() + "/d" + i;
                File subDirectorio = new File(ruta);
                if (subDirectorio.mkdir()) {
                    System.out.println("Directorio " + subDirectorio.getAbsolutePath() + " creado correctamente ");
                    ruta = subDirectorio.getAbsolutePath() + "/f" + i + "1.txt";
                    archivo = new File(ruta);
                    try {
                        if (archivo.createNewFile()) {
                            System.out.println("Archivo " + archivo.getAbsolutePath() + " creado correctamente ");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("No ha sido posible crear el subdirectorio" + subDirectorio.getAbsolutePath());
                }
            }
        } else {
            System.out.println("No ha sido posible crear el directorio " + directorioPrincipal.getAbsolutePath());
        }
    }
}
