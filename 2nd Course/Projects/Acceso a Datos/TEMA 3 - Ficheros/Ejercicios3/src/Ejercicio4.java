import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios3
 * FECHA: Noviembre / 2022
 * **********************************
 * Escriba un programa que haga una lista de todas las palabras encontradas en un archivo de
 * entrada y escriba esa lista en un archivo de salida, junto con el número de veces que ha
 * aparecido cada palabra.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el archivo a buscar: ");
        File fichero = new File("Documentos/"+scanner.nextLine());
        Map<String, Integer> listaPalabras = new LinkedHashMap<>();
        try {
            Scanner lectura = new Scanner(fichero);
            while (lectura.hasNext()) {
                String palabra = lectura.next();
                palabra = palabra.replaceAll("[.,()]",""); // quitamos los puntos y las comas de las palabras

                if (!listaPalabras.containsKey(palabra)) { // si no existe una clave con ese nombre (la palabra) entonces creamos un par clave valor Key Value (clave = palabra valor = 1 aparicion)
                    listaPalabras.put(palabra, 1);
                } else { // si ya existe una clave con ese nombre, añadimos +1 a su valor
                    listaPalabras.put(palabra, listaPalabras.get(palabra) + 1);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: archivo no encontrado");
        }


            try {
                PrintWriter ficheroDestino = new PrintWriter("Documentos/ejercicio4_resultado.txt");
                System.out.println("Procediendo a copiar las palabras en el nuevo archivo...");
                for (Map.Entry<String, Integer> entry : listaPalabras.entrySet()) {
                    ficheroDestino.print(entry.getKey() +" : "+ entry.getValue());
                    ficheroDestino.println();
                }
                ficheroDestino.flush();
                ficheroDestino.close();
                System.out.println("Operación finalizada con éxito.");
                } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
    }
