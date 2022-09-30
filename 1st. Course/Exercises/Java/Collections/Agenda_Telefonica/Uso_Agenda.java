package Agenda_Telefonica;

import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Agenda_Telefonica
 * Date: marzo / 2022
 */
public class Uso_Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;


        Agenda miAgenda = new Agenda();

        while (true) {
            menu();
            try {
                System.out.print("Introduce una opción del menú: ");
                userInput = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Debes de introducir números y tienen que ser enteros");
                continue;
            }
            switch (userInput) {
                case 1:
                    miAgenda.mostrarRegistros();
                    break;
                case 2:
                    System.out.print("introduce un nombre para tu contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("introduce un teléfono para tu contacto: ");
                    String telefono = scanner.nextLine();
                    miAgenda.añadirEntrada(nombre, telefono);
                    break;
                case 3:
                    System.out.print("introduce el nombre para buscarlo en la agenda: ");
                    nombre = scanner.nextLine();
                    miAgenda.buscarNombre(nombre);
                    break;
                case 4:
                    System.out.print("introduce el teléfono para buscarlo en la agenda: ");
                    String tel = scanner.nextLine();
                    miAgenda.buscarNumero(tel);
                    break;
                case 5:
                    System.out.print("introduce el nombre para borrarlo en la agenda: ");
                    nombre = scanner.nextLine();
                    miAgenda.borrarPorNombre(nombre);
                    break;
                case 6:
                    System.out.print("introduce el número para borrarlo en la agenda: ");
                    tel = scanner.nextLine();
                    miAgenda.borrarPorNumero(tel);
                    break;
                case 7:
                    System.out.println("La lista ordenada por nombres: ");
                    miAgenda.mostrarAgendaOrdenada();

                    break;
                case 0:
                    System.out.println("HAS DECIDIDO SALIR");
                    System.exit(0);
                default:
                    System.out.println("OPCIÓN INCORRECTA.");
                    break;
            }
        }


    }

    public static void menu() {
        System.out.println("""
                \n*** MENU ****
                                
                1. Mostrar Agenda
                2. Añadir entrada
                3. Buscar por nombre
                4. Buscar por número
                5. Borrar por nombre
                6. Borrar por número
                7. Ordenar por nombre
                0. Salir
                """);
    }
}
