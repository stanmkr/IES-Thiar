package EjerciciosB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema12_Ficheros - EjerciciosB
 * Date: abril / 2022
 */
public class B5_Diccionario {
    public static void main(String[] args) {
        String palabra;
        File f = new File("Documentos/Diccionario");


        if (f.mkdir()) {
            System.out.println("El directorio " + f.getName() + " se ha creado correctamente");
        } else {
            System.err.println("Error al crear el directorio " + f.getName());
        }

        File f2 = new File("Documentos/diccionario.txt");
        ArrayList<String> palabras = new ArrayList<>();
        try {
            Scanner reader = new Scanner(f2);
            while (reader.hasNextLine()) {
                palabra = reader.nextLine();
                palabras.add(palabra);
            }

            for (int i = 65; i <= 90; i++) {
                char ascii = (char) i;
                String minuscula = String.valueOf(ascii).toLowerCase();
                File archivo = new File(f.getAbsolutePath() + "\\" + ascii + ".txt");
                try {
                    FileWriter writer = new FileWriter(archivo,true);
                    for (int j = 0; j < palabras.size(); j++) {

                        if (("" + palabras.get(j).charAt(0)).equals(minuscula)) { // con "" convierto en String
                            writer.write(palabras.get(j) + "\n");
                        }
                    }
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
