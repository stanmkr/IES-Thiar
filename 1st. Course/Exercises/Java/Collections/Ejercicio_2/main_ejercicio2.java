package Ejercicio_2;

import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicios
 * Date: marzo / 2022
 */
public class main_ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking_v2 parkingCentro = new Parking_v2();
        int inputUser;
        do {
            menu();
            System.out.print("\nIntroduce opción del menú: ");
            inputUser = scanner.nextInt();
            switch (inputUser) {
                case 1 -> {
                    scanner.nextLine();
                    System.out.print("Introduce la matricula del coche que quieres aparcar: ");
                    String matricula = scanner.nextLine();
                    parkingCentro.aparcar(matricula);
                }
                case 2 -> {
                    scanner.nextLine();
                    parkingCentro.desaparcar();
                }
                case 3 -> parkingCentro.mostrarCoches();
                case 0 -> System.out.println("Hasta luego");
                default -> System.out.println("Opción incorrecta");
            }
        } while (inputUser != 0);


    }


    public static void menu() {
        System.out.println("\n**** MENU ****\n1. Aparcar\n2. Desaparcar\n3. Mostrar la lista de matrículas\n");
    }
}
