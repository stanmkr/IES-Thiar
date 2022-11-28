import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios3
 * FECHA: Noviembre / 2022
 * *******************************
 * Se dispone de dos ficheros de texto que contienen una lista de números enteros cada uno,
 * ordenados de menor a mayor, a razón de un número por línea. Se pide un programa en Java
 * que, a partir de estos dos ficheros, genere un tercer fichero que contenga todos y cada uno de
 * los datos de los dos ficheros iniciales y esté también ordenado de menor a mayor.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        File fichero1 = new File("Documentos/ejercicio3.txt");
        File fichero2 = new File("Documentos/ejercicio3_v2.txt");
        List<Integer> lista = new ArrayList<>();
        Integer[] numerosOrdenados;

        try {
            Scanner scanner = new Scanner(fichero1);
            while (scanner.hasNext()) {
                int numero = scanner.nextInt();
                lista.add(numero);
            }
            scanner = new Scanner(fichero2);
            while (scanner.hasNext()) {
                int numero = scanner.nextInt();
                lista.add(numero);
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el fichero no existe");
        }
        numerosOrdenados = lista.toArray(new Integer[0]);
        Arrays.sort(numerosOrdenados);
        try {
            PrintWriter ficheroDestino = new PrintWriter("Documentos/ejercicio3_resultado.txt");
            for (Integer numero : numerosOrdenados) {
                System.out.println(numero);
                ficheroDestino.print(numero +" ");
            }
            ficheroDestino.flush();
            ficheroDestino.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        JOptionPane.showMessageDialog(null, "Los números ordenados: " + Arrays.toString(numerosOrdenados));
    }
}
