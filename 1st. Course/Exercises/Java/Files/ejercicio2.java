package EjerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosA
 * Date: abril / 2022
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nIntroduce una ruta del sistema: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            }
            File ruta = new File(userInput);
            try {
                muestraInfoRuta(ruta, true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

    public static void muestraInfoRuta(File ruta, Boolean masInfo) throws FileNotFoundException {
        //  Si es un archivo, mostrará por pantalla el nombre del archivo
        if (!ruta.exists())
            throw new FileNotFoundException("El directorio no existe"); // si el path no existe lanzo excepción
        if (ruta.isFile()) System.out.println("[A] " + ruta.getName());

        //  Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus nombres).
        //  Deberá mostrar primero los directorios y luego los archivos.
        if (ruta.isDirectory()) {
            File[] lista = ruta.listFiles();
            System.out.println("Ruta: " + ruta.getAbsolutePath());

            if (!masInfo) {
                for (File f : lista) {
                    if (f.isDirectory()) {
                        Arrays.sort(lista);
                        System.out.println("* " + f.getName());
                    }
                }
                for (File f : lista) {
                    if (f.isFile()) System.out.println("[A] " + f.getName());
                }
            } else {
                for (File f : lista) {
                    if (f.isDirectory()) {
                        Arrays.sort(lista);
                        long milisegundos = f.lastModified();
                        Date fecha = new Date(milisegundos);
                        System.out.println("* " + f.getName() + " | Tamaño en bytes: " + f.length() + " | Ult. modificación: "  + fecha);
                    }
                }
                for (File f : lista) {
                    long milisegundos = f.lastModified();
                    Date fecha = new Date(milisegundos);
                    if (f.isFile())
                        System.out.println("[A] " + f.getName() + " | Tamaño en bytes: " + f.length() + " | Fecha ult. modificación: " + fecha);
                }
            }

        }
    }
}
