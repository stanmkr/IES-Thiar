package EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosB
 * Date: abril / 2022
 */
public class B2_NotasAlumnos {
    public static void main(String[] args) {

        ArrayList<String> alumnos = new ArrayList<>();
        File fichero = new File("Documentos/alumnos_notas.txt");
        try {
            Scanner entrada = new Scanner(fichero);
            while (entrada.hasNext()) {
                String nombre = entrada.next() + " " + entrada.next();
                double notaMedia = 0;
                int contador = 0;
                while (entrada.hasNextInt()) {
                    notaMedia += entrada.nextInt();
                    contador++;
                }
                alumnos.add(String.format("%.2f %s", notaMedia / contador, nombre));
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el fichero. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error al leer los datos");
        }
        Collections.sort(alumnos, Collections.reverseOrder());
        for (String a : alumnos) {
            System.out.println(a);
        }


    }
}
