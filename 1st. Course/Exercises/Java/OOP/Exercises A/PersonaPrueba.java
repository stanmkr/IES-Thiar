package ejercicios.ejerciciosA;

import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        System.out.print("Introduce el nombre: ");
        persona1.nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        persona1.apellidos = scanner.nextLine();
        System.out.print("Introduce el DNI: ");
        persona1.dni = scanner.next();
        System.out.print("Introduce la edad: ");
        persona1.edad = scanner.nextInt();
        if (mayorMenor(persona1.edad)){
            System.out.printf("%s %s con DNI %s es mayor de edad ", persona1.nombre,persona1.apellidos,persona1.dni);
        } else {
            System.out.printf("%s %s con DNI %s es menor de edad ", persona1.nombre,persona1.apellidos,persona1.dni);
        }

        System.out.print("Introduce el nombre: ");
        persona2.nombre = scanner.nextLine();
        System.out.print("Introduce los apellidos: ");
        persona2.apellidos = scanner.nextLine();
        System.out.print("Introduce el DNI: ");
        persona2.dni = scanner.next();
        System.out.print("Introduce la edad: ");
        persona2.edad = scanner.nextInt();
        if (mayorMenor(persona2.edad)){
            System.out.printf("%s %s con DNI %s es mayor de edad%n", persona2.nombre,persona2.apellidos,persona2.dni);
        } else {
            System.out.printf("%s %s con DNI %s es menor de edad%n", persona2.nombre,persona2.apellidos,persona2.dni);
        }


    }
    public static boolean mayorMenor(int edad){
        return edad >= 18;
    }
}
