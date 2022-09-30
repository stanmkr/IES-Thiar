package Ejercicio_7;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_6
 * Date: marzo / 2022
 */
public class ejercicio7 {
    public static void main(String[] args) {
        HashMap<String, Double> plantilla = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int inputUser;

        do {

            menu();
            System.out.print("\nIntroduce una opción del menú: ");
            inputUser = scanner.nextInt();
            scanner.nextLine();
            switch (inputUser) {
                case 1:
                    System.out.print("Introduce el nombre del jugador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el salario del jugador: ");
                    double salario = scanner.nextDouble();
                    if (plantilla.size() < 25) {
                        plantilla.put(nombre.toUpperCase(), salario);
                        System.out.printf("El jugador %s con salario %.2f€ ha sido añadido correctamente%n", nombre.toUpperCase(), salario);
                    } else {
                        System.out.println("La plantilla esta llena, lo siento");
                    }
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
                    System.out.println("**** LISTA DE JUGADORES ****\n");
                    for (String key : plantilla.keySet()) {
                        System.out.println(key + " salario: " + plantilla.get(key));
                    }
                    break;
                case 4:
                    System.out.println("Introduce el salario de un jugador para ver que otros jugadores tienen un salario parecido: ");
                    salario = scanner.nextInt();
                    for (String key : plantilla.keySet()) {
                        if (plantilla.get(key) <= salario + 6000 && plantilla.get(key) >= salario - 6000) {
                            System.out.println(key + " tiene un salario de " + plantilla.get(key));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Has decidido salir, adiós.");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (inputUser != 0);


    }

    public static void menu() {
        System.out.println("\n**** MENU ****\n1.Añadir jugador\n2.Eliminar jugador\n3.Listar jugadores y su salario\n4.Ver salario parecido\n0.Salir");
    }

}
