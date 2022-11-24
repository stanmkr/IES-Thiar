package Ejercicio8;

import java.io.File;
import java.io.IOException;

/**
 * Created by Stanislav Krastev
 * Ejercicios - Ejercicio8
 * Date: Noviembre / 2022
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        String ruta;
        int cantidadArchivos = 1;
        File archivo;
        File directorioPrincipal = new File("C:/Home");
        if (directorioPrincipal.mkdir()) {
            System.out.println("Directorio " + directorioPrincipal.getAbsolutePath() + " creado correctamente ");
            for (int i = 1; i <= 2; i++) {
                ruta = directorioPrincipal.getAbsolutePath() + "/usr" + i;
                File directorioUsuario = new File(ruta);
                if (directorioUsuario.mkdir()) {
                    System.out.println("Directorio " + directorioUsuario.getAbsolutePath() + " creado correctamente ");
                    if (i == 1) {
                        ruta = directorioUsuario.getAbsolutePath() + "/f" + i;
                        archivo = new File(ruta);
                        try {
                            if (archivo.createNewFile()) {
                                System.out.println("Archivo " + archivo.getAbsolutePath() + " creado correctamente ");
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        for (int j = 1; j <= 3; j++) {
                            ruta = directorioUsuario.getAbsolutePath() + "/d" + j;
                            archivo = new File(ruta);
                            if (archivo.mkdir()) {
                                System.out.println("Directorio " + archivo.getAbsolutePath() + " creado correctamente ");
                                if (j == 2) {
                                    ruta = archivo.getAbsolutePath() + "/f" + (j + 1);
                                    archivo = new File(ruta);
                                    try {
                                        if (archivo.createNewFile()) {
                                            System.out.println("Archivo " + archivo.getAbsolutePath() + " creado correctamente ");
                                        }
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }
                                    while (cantidadArchivos < 2) {
                                        ruta = archivo.getParent() + "/f" + (j + 2);
                                        archivo = new File(ruta);
                                        try {
                                            if (archivo.createNewFile()) {
                                                System.out.println("Archivo " + archivo.getAbsolutePath() + " creado correctamente ");
                                                cantidadArchivos++;
                                            }
                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                }
                                if (cantidadArchivos == 2) {
                                    ruta = directorioUsuario.getAbsolutePath() + "/d" + (j + 1);
                                    archivo = new File(ruta);
                                    if (archivo.mkdir()) {
                                        System.out.println("Directorio " + archivo.getAbsolutePath() + " creado correctamente ");
                                        j++;
                                        continue;
                                    }
                                }
                                ruta = archivo.getAbsolutePath() + "/f" + (j + 1);
                                archivo = new File(ruta);
                                try {
                                    if (archivo.createNewFile()) {
                                        System.out.println("Archivo " + archivo.getAbsolutePath() + " creado correctamente ");
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            } else {
                                System.out.println("No ha sido posible crear el directorio " + archivo.getAbsolutePath());

                            }
                        }
                    }
                } else {
                    System.out.println("No ha sido posible crear el directorio " + directorioUsuario.getAbsolutePath());
                }
            }
        } else {
            System.out.println("El directorio " + directorioPrincipal.getAbsolutePath() + " ya existe.");
        }
    }
}
