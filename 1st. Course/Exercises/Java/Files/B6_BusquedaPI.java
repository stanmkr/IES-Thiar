package EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema12_Ficheros - EjerciciosB
 * Date: Abril / 2022
 */
public class B6_BusquedaPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        System.out.print("Introduce un número de cualquier longitud: ");
        num = scanner.nextLine();
        scanner.close();


        File file = new File("Documentos/pi-million.txt");
        String numeroPI = "";
        try {
            Scanner archivoPI = new Scanner(file);
            while (archivoPI.hasNext()) {
                numeroPI = archivoPI.nextLine();
            }


            boolean coincide = false;
            String decimalesPI = numeroPI.substring(2);
            for (int i = 0; i < decimalesPI.length() - num.length(); i++) {
                if (num.equals(decimalesPI.substring(i, i + num.length()))) {
                    coincide = true;
                    break;
                }
            }

            if (coincide) {
                System.out.println("El número " + num + " se encuentra entre el millón de decimales del número PI");
            } else {
                System.out.println("El número " + num + " no se encuentra.");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
