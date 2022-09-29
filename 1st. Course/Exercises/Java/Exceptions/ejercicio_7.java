import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;
        ArrayList<Gato_v2> listaGatos = new ArrayList<>();

        System.out.println("Introduce los datos de 5 datos.\n");

        while (listaGatos.size()<3) {
            try{
                System.out.println("Introduce el nombre del gato: ");
                nombre = scanner.next();
                System.out.println("Introduce la edad del gato: ");
                edad = scanner.nextInt();
                listaGatos.add(new Gato_v2(nombre,edad));
                scanner.nextLine();
            }catch (InputMismatchException e){
                e.printStackTrace();
                scanner.nextLine();
            }catch (Exception e){
                e.printStackTrace();
                scanner.nextLine();
            }
        }
        System.out.println("\n--- LISTA DE GATOS ---");
        for (Gato_v2 gato:listaGatos) {
            gato.imprimir();
            System.out.println();
        }

    }
}
