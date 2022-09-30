package Ejercicio_6;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_6
 * Date: marzo / 2022
 */
public class ejercicio6 {
    public static void main(String[] args) {
        HashMap<String, Double> plantilla = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int inpputUser;

        do {

            menu();
            System.out.print("\nIntroduce una opción del menú: ");
            inpputUser = scanner.nextInt();
            scanner.nextLine();
            switch (inpputUser) {
                case 1:
                    System.out.print("Introduce el nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el salario del jugador: ");
                    double salario = scanner.nextDouble();
                    plantilla.put(nombre.toUpperCase(), salario);
                    System.out.printf("El jugador %s con salario %.2f€ ha sido añadido correctamente%n", nombre.toUpperCase(), salario);
                    break;
                case 2:
                    System.out.println("Introduce el nombre del jugador que quieres eliminar: ");
                    nombre = scanner.nextLine();
                    if (plantilla.containsKey(nombre.toUpperCase())) {
                        plantilla.remove(nombre.toUpperCase());
                        System.out.printf("El jugador %s ha sido eliminado correctamente%n", nombre);
                    } else {
                        System.out.println("El jugador no esta en la plantilla.");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el nombre del jugador para consultar su salario: ");
                    nombre = scanner.nextLine();
                    if (plantilla.containsKey(nombre.toUpperCase())) {
                        System.out.printf("El salario de %s es %.2f%n", nombre, plantilla.get(nombre.toUpperCase()));
                    } else {
                        System.out.println("El jugador no esta en la plantilla.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el nombre del jugador para aumentar su salario un 10%: ");
                    nombre = scanner.nextLine();
                    if (plantilla.containsKey(nombre.toUpperCase())) {
                        plantilla.put(nombre.toUpperCase(), plantilla.get(nombre) * 1.10);
                        //salario = plantilla.get(nombre.toUpperCase()) * 1.10;
                        System.out.printf("El salario del jugador %s ahora es de %.2f€%n", nombre.toUpperCase(), plantilla.get(nombre));
                    } else {
                        System.out.println("El jugador no esta en la plantilla.");
                    }
                    break;
                case 0:
                    System.out.println("Has decidido salir, adiós.");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (inpputUser != 0);

        for (String e : plantilla.keySet()) {
            System.out.println(e + "salario: " + plantilla.get(e));
        }
    }


    public static void menu() {
        System.out.println("\n**** MENU ****\n1.Añadir jugador\n2.Eliminar jugador\n3.Consultar salario jugador\n4.Incrementar salario\n0.Salir");
    }

}
