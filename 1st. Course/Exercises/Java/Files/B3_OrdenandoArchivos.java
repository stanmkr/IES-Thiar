package EjerciciosB;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosB
 * Date: abril / 2022
 *
 * Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’).
 * Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’).
 */
public class B3_OrdenandoArchivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo para lectura: ");
        String archivoA = scanner.nextLine();
        File f = new File("Documentos/" + archivoA);

        System.out.print("Introduce el nombre del archivo para escritura: ");
        String archivoB = scanner.nextLine();
        File f2 = new File("Documentos/" + archivoB);

        if (!f2.exists()) {
            try {
                FileWriter writer = new FileWriter(f2);
                Scanner ficheroA = new Scanner(f);
                ArrayList<String> lineas = new ArrayList<>();
                while (ficheroA.hasNextLine()) {
                    String linea = ficheroA.nextLine();
                    lineas.add(linea);
                }
                Collections.sort(lineas);
                for (int i = 0; i < lineas.size(); i++) {
                    writer.write(lineas.get(i) + "\n");
                }
                writer.close();
                ficheroA.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
