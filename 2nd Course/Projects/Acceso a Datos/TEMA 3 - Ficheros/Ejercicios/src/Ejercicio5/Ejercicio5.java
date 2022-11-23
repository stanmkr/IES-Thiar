package Ejercicio5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio5
 * Date: Noviembre / 2022
 */
public class Ejercicio5 {
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
                            if (i == 1) {
                                System.out.println("Renombrando el archivo " + archivo.getName() + " a f12.txt........");
                                File archivo1Renombrado = new File(archivo.getParent() + "/f12.txt");
                                if (archivo.renameTo(archivo1Renombrado)) {
                                    System.out.println("Archivo renombrado correctamente -> " + archivo1Renombrado.getAbsolutePath());
                                } else {
                                    System.out.println("No ha sido posible renombrar el archivo" + archivo.getAbsolutePath());
                                }
                            } else {
                                File desde = new File(archivo.getAbsolutePath());
                                File a = new File(subDirectorio.getParent() + "/d1/" + archivo.getName());
                                System.out.println("Moviendo el archivo " + archivo.getAbsolutePath() + " a " + directorioPrincipal + "\\d1\\");
                                moveFile(desde, a);
                                System.out.println("El archivo " + archivo.getAbsolutePath() + " ha sido movido correctamente a " + directorioPrincipal + "\\d1\\" + archivo.getName());
                                System.out.println("Procediendo a eliminar el directorio " + subDirectorio.getName() + " .......");
                                if (subDirectorio.delete()) {
                                    System.out.println("El directorio ha sido borrado correctamente.");
                                } else {
                                    System.out.println("Fallo al borrar el directorio " + subDirectorio.getName());
                                }
                            }
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

    public static void moveFile(File src, File dest) throws IOException {
        Files.move(src.toPath(), dest.toPath());
    }

}

