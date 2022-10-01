package EjerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosA
 * Date: abril / 2022
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("\nIntroduce una ruta del sistema: ");
            String userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            File ruta = new File(userInput);
            try {
                muestraInfoRuta(ruta);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

    }

    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
        //  Si es un archivo, mostrará por pantalla el nombre del archivo
        if (!ruta.exists()) throw new FileNotFoundException("El directorio no existe"); // si el path no existe lanzo excepción
        if (ruta.isFile()) System.out.println(ruta.getName());

        //  Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus nombres).
        //  Deberá mostrar primero los directorios y luego los archivos.
        if (ruta.isDirectory()) {
            File[] lista = ruta.listFiles();
            System.out.println("Ruta: " + ruta.getAbsolutePath());

            for (File f : lista) {
                if (f.isDirectory()) System.out.println("* " + f.getName());
            }

            for (File f : lista) {
                if (f.isFile()) System.out.println("[A] " + f.getName());
            }
        }
    }
}
