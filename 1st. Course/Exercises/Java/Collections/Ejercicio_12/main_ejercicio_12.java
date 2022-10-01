package Ejercicio_12;

import Ejercicio_11.Persona_v3;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_3
 * Date: marzo / 2022
 */
public class main_ejercicio_12 {


    public static void main(String[] args) {
        LocalDate año = LocalDate.now();

        ArrayList<Persona_v3> personas = new ArrayList<>();
        Persona_v3 p1 = new Persona_v3("Abascal", "678 234 543", "daxxx@gmail.com", LocalDate.of(2000, 2, 10));
        Persona_v3 p2 = new Persona_v3("Maradona", "678 234 666", "maradona@gmail.com", LocalDate.of(1966, 1, 1));
        Persona_v3 p3 = new Persona_v3("PePE", "678 234 777", "aapepito@gmail.com", LocalDate.of(1960, 10, 10));
        Persona_v3 p4 = new Persona_v3("Antonio", "678 111 543", "blanco@gmail.com", LocalDate.of(2000, 5, 5));
        Persona_v3 p5 = new Persona_v3("Antonio", "678 111 543", "blanco@gmail.com", LocalDate.of(2000, 5, 5));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        Collections.sort(personas);
        Set<Persona_v3> listaPersonas = new LinkedHashSet<>(personas);





        double sumaEdades = 0;
        int mayor = 0;
        String nombrePersonaMayor = "";
        for (Persona_v3 p : listaPersonas) {
            sumaEdades += año.getYear() - p.getFechaNacimiento().getYear();
            if (mayor < año.getYear() - p.getFechaNacimiento().getYear()) {
                nombrePersonaMayor = p.getNombre();
                mayor = año.getYear() - p.getFechaNacimiento().getYear();
            }
        }

        System.out.printf("La edad media de las personas es: %.2f%n", sumaEdades / listaPersonas.size());

        System.out.println("El nombre de la persona mayor es: " + nombrePersonaMayor + " con una edad de " + mayor + " años");

        System.out.println("\n---- Mostrando valores del ArrayList con COMPARABLE ---- ");
        for (Persona_v3 p : personas) {
            System.out.println(p);
        }


        // clase que implementa comparator
        class ComparaPorNombre implements Comparator {

            @Override
            public int compare(Object o1, Object o2) {
                Persona_v3 persona1 = (Persona_v3) o1;
                Persona_v3 persona2 = (Persona_v3) o2;
                return persona1.getNombre().compareTo(persona2.getNombre());
            }
        }
        System.out.println();
        personas.sort(new ComparaPorNombre());
        for (Persona_v3 persona : personas) {
            System.out.println(persona);
        }



        // clase anonima comparator
        personas.sort(new Comparator<Persona_v3>() {
            @Override
            public int compare(Persona_v3 o1, Persona_v3 o2) {
                return o1.getEmail().compareToIgnoreCase(o2.getEmail());
            }
        });
        System.out.println("\n---- Mostrando valores del HashSet con COMPARATOR ---- ");
        for (Persona_v3 p : listaPersonas) {
            System.out.println(p);
        }


    }
}
