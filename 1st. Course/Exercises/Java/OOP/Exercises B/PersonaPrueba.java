package ejercicios.ejerciciosB;

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

        Persona persona1 = new Persona(nombre, apellidos, edad);

        if (mayorMenor(persona1.edad)) {
            System.out.printf("%s %s con DNI %s es mayor de edad%n", persona1.nombre, persona1.apellidos, dni);
        } else {
            System.out.printf("%s %s es menor de edad%n", persona1.nombre, persona1.apellidos);
        }

        System.out.print("Introduce el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        apellidos = scanner.nextLine();
        System.out.print("Introduce el DNI: ");
        dni = scanner.next();
        System.out.print("Introduce la edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();
        Persona persona2 = new Persona(nombre, apellidos, edad);

        if (mayorMenor(persona2.edad)) {
            System.out.printf("%s %s con DNI %s es mayor de edad%n", persona2.nombre, persona2.apellidos, persona2.dni);
        } else {
            System.out.printf("%s %s es menor de edad%n", persona2.nombre, persona2.apellidos);
        }


    }

    public static boolean mayorMenor(int edad) {
        return edad >= 18;
    }
}
