package ejercicios.ejerciciosD;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, apellidos, dni;
        int edad;

        System.out.print("Introduce el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("Introduce el DNI: ");
        dni = scanner.next();
        System.out.print("Introduce la edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        Persona persona1 = new Persona(dni, nombre, apellidos, edad);

        if (persona1.esMayorEdad()) {
            System.out.printf("%s %s con DNI %s es mayor de edad%n", persona1.getNombre(), persona1.getApellidos(), persona1.getDni());
            if (persona1.esJubilado()){
                System.out.println("TAMBIÉN ES JUBILADO");
            }
        } else {
            System.out.printf("%s %s con DNI %s es menor de edad%n", persona1.getNombre(), persona1.getApellidos(), persona1.getDni());
        }

        persona1.Imprime();

        System.out.print("\nIntroduce el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("Introduce el DNI: ");
        dni = scanner.next();
        System.out.print("Introduce la edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();

        Persona persona2 = new Persona(dni, nombre, apellidos, edad);
        persona2.Imprime();

        if (persona2.esMayorEdad()) {
            System.out.printf("%s %s con DNI %s es mayor de edad%n", persona2.getNombre(), persona2.getApellidos(), persona2.getDni());
            if (persona2.esJubilado()){
                System.out.println("TAMBIÉN ES JUBILADO");
            }
        } else {
            System.out.printf("%s %s con DNI %s es menor de edad%n", persona2.getNombre(), persona2.getApellidos(), persona2.getDni());
        }

        System.out.printf("La diferencia de edad de %s y %s es %d", persona1.getNombre(),persona2.getNombre(),persona1.diferenciaEdad(persona2));

    }

}
