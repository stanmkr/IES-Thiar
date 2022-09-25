package ejercicios.ejerciciosTema8;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Programación - ejercicios.ejerciciosTema8
 * Date: FEBRERO / 2022
 */
public class RecetaPRUEBAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("¿Cuántos ingredientes tendrá la receta?: ");
        int cantidadIngredientes = scanner.nextInt(); // la longitud del array, es decir el número ingredientes que tendrá

        //creo un array llamado misIngredientes de la clase Ingrediente, cada posición del array contiene un objeto que tiene 3 parámetros, nombre, cantidad y unidad
        Ingrediente[] misIngredientes = new Ingrediente[cantidadIngredientes];

        // recorro el array y rellenando sus índices con los datos que necesita (3 valores por índice del array)
        for (int i = 0; i < misIngredientes.length; i++) {
            System.out.printf("El nombre del ingrediente %d: ", i + 1);
            String nombre = scanner.next();
            System.out.print("La cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // para limpiar el buffer de entrada de datos, ya que leemos un integer y a continuación un string
            System.out.print("La unidad: ");
            String unidad = scanner.nextLine();
            misIngredientes[i] = new Ingrediente(nombre, cantidad, unidad); // una vez teniendo los datos guardo esos datos en la posición [i] del array
        }

        // una vez rellenado el array de ingredientes, creo un objeto de la clase Receta (creo una receta) que recibe en uno de sus parámetros un array (el array de ingredientes que creamos antes)
        Receta receta1 = new Receta("Pollo marinado", "Esto es la elaboracion........", 60, misIngredientes);
        receta1.mostrarReceta(); // muestro los datos de la receta


        // RECETA 2 ----------------------------
        System.out.print("\n¿Cuántos ingredientes tendrá la receta 2?: ");
        cantidadIngredientes = scanner.nextInt();
        misIngredientes = new Ingrediente[cantidadIngredientes];
        for (int i = 0; i < misIngredientes.length; i++) {
            System.out.printf("El nombre del ingrediente %d: ", i + 1);
            String nombre = scanner.next();
            System.out.print("La cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // para limpiar el buffer de entrada de datos, ya que leemos un integer y a continuación un string
            System.out.print("La unidad: ");
            String unidad = scanner.nextLine();
            misIngredientes[i] = new Ingrediente(nombre, cantidad, unidad);
        }

        Receta receta2 = new Receta("Arroz a banda","Escribe la elaboración aqui....",120,misIngredientes);
        receta2.mostrarReceta();

    }
}
