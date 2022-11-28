import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios3
 * FECHA: Noviembre / 2022
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe número seguido de espacio seguido de número. Si al comienzo de una linea escribes la palabra <INTRO> terminará el programa.");
        try {
            PrintWriter fichero = new PrintWriter("Documentos/texto.txt");
            while (true) {
                System.out.print("Escribe un número o escribe INTRO para terminar el programa: ");
                String input1 = scanner.nextLine();
                if (input1.equals("INTRO")) break;
                fichero.print(input1);
                fichero.print(" ");
                System.out.print("Escribe el segundo número: ");
                fichero.print(scanner.nextLine()+"\n");

            }

            fichero.flush();
            fichero.close();
        } catch (FileNotFoundException e) {
            System.err.println("ERROR: el archivo no se encuentra");
        }

        System.out.println("\nPrograma finalizado.");
    }
}
