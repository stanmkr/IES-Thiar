package Ejercicio_3;

import java.time.LocalDate;
import java.util.HashSet;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_3
 * Date: marzo / 2022
 */
public class main_ejercicio_3 {
    public static void main(String[] args) {
        LocalDate año = LocalDate.now();
        HashSet<Persona> personas = new HashSet<>();
        Persona p1 = new Persona("Pepe", "678 234 543", "pepe@gmail.com", LocalDate.of(2000, 2, 10));
        Persona p2 = new Persona("Maradona", "678 234 666", "maradona@gmail.com", LocalDate.of(1966, 1, 1));
        Persona p3 = new Persona("PePE", "678 234 777", "pepito@gmail.com", LocalDate.of(1960, 10, 10));
        Persona p4 = new Persona("Patricio", "678 111 543", "patricio@gmail.com", LocalDate.of(2000, 5, 5));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        double sumaEdades = 0;
        int mayor = 0;
        String nombrePersonaMayor = "";
        for (Persona p : personas) {
            sumaEdades += año.getYear() - p.getFechaNacimiento().getYear();
            if (mayor < año.getYear() - p.getFechaNacimiento().getYear()) {
                nombrePersonaMayor = p.getNombre();
                mayor = año.getYear() - p.getFechaNacimiento().getYear();
            }
        }

        System.out.printf("La edad media de las personas es: %.2f%n",sumaEdades / personas.size());

        System.out.println("El nombre de la persona mayor es: " + nombrePersonaMayor + " con una edad de "+ mayor+" años");

        System.out.println("\n---- Mostrando valores del HashSet ---- ");
        for (Persona p : personas) {
            System.out.println(p);
        }

    }
}
