import java.io.*;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Ejercicios2 - PACKAGE_NAME
 * Date: Noviembre / 2022
 * *************************************
 * Haz un programa que copie un archivo en otro carácter a carácter. Los nombres de
 * los archivos origen y destino se pasarán como argumentos.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el nombre del archivo origen incluyendo su extensión: ");
            File fileOrigen = new File("Documentos/" + scanner.nextLine());
            System.out.println(fileOrigen.getAbsolutePath());
            if (fileOrigen.exists()) {
                System.out.print("Introduce el nombre del archivo destino: ");
                PrintWriter fileDestino = new PrintWriter("Documentos/" + scanner.nextLine());
                System.out.println("Procediendo a copiar el contenido del archivo origen al archivo destino...");
                Scanner lecturaOrigen = new Scanner(fileOrigen);
                while (lecturaOrigen.hasNext()) {
                    String linea = lecturaOrigen.nextLine();
                    fileDestino.println(linea);
//                    for (int i = 0; i <linea.length() ; i++) {
//                        fileDestino.print(linea.charAt(i));
//                    }
//                    fileDestino.println();
                }
                fileDestino.flush();
                fileDestino.close();
                System.out.println("Hecho.");
            } else {
                System.err.println("ERROR: el archivo destino no se encuentra.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
