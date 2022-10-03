package EjerciciosB;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosB
 * Date: abril / 2022
 * Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’).
 * Se le pedirá al usuario cuántos nombres de persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’
 */
public class B4_NombreYApellidos {
    public static void main(String[] args) {
        String nombre, apellido, archivo, numPersonas;
        File fNombres = new File("Documentos/usa_nombres.txt");
        File fApellidos = new File("Documentos/usa_apellidos.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            Scanner nombres = new Scanner(fNombres);
            Scanner apellidos = new Scanner(fApellidos);
            ArrayList<String> listaNombres = new ArrayList<>();
            while (nombres.hasNextLine()) {
                nombre = nombres.nextLine();
                listaNombres.add(nombre);
            }
            ArrayList<String> listaApellidos = new ArrayList<>();
            while (apellidos.hasNextLine()) {
                apellido = apellidos.nextLine();
                listaApellidos.add(apellido);
            }


            System.out.print("¿Cuántos nombres de persona quieres generar?: ");
            numPersonas = scanner.nextLine();
            System.out.print("¿A que archivo quieres añadirlos?: ");
            archivo = scanner.nextLine();
            File destino = new File("Documentos/" + archivo);
            int cantidadP = Integer.parseInt(numPersonas);
            try {
                FileWriter writer = new FileWriter(destino, true);
                for (int i = 0; i < cantidadP; i++) {
                    int nombreAleatorio = ThreadLocalRandom.current().nextInt(0, listaNombres.size() + 1);
                    int apellidoAleatorio = ThreadLocalRandom.current().nextInt(0, listaApellidos.size() + 1);
                    writer.write(listaNombres.get(nombreAleatorio) + " " + listaApellidos.get(apellidoAleatorio) + "\n");
                }
                writer.close();
                nombres.close();
                apellidos.close();
                scanner.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.err.println("Error");
        }


    }
}
