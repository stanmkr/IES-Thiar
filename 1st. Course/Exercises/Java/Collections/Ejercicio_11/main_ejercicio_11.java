package Ejercicio_11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Stanislav Krastev
 * TEMA11_Colecciones - Ejercicio_3
 * Date: marzo / 2022
 */
public class main_ejercicio_11 {
    public static void main(String[] args) {
        LocalDate año = LocalDate.now();
        ArrayList<Persona_v3> personas = new ArrayList<>();
        Persona_v3 p1 = new Persona_v3("Abpe", "678 234 543", "pepe@gmail.com", LocalDate.of(2000, 2, 10));
        Persona_v3 p2 = new Persona_v3("Maradona", "678 234 666", "maradona@gmail.com", LocalDate.of(1966, 1, 1));
        Persona_v3 p3 = new Persona_v3("PePE", "678 234 777", "pepito@gmail.com", LocalDate.of(1960, 10, 10));
        Persona_v3 p4 = new Persona_v3("Antonio", "678 111 543", "blanco@gmail.com", LocalDate.of(2000, 5, 5));

        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);

        Collections.sort(personas);

        double sumaEdades = 0;
        int mayor = 0;
        String nombrePersonaMayor = "";
        for (Persona_v3 p : personas) {
            sumaEdades += año.getYear() - p.getFechaNacimiento().getYear();
            if (mayor < año.getYear() - p.getFechaNacimiento().getYear()) {
                nombrePersonaMayor = p.getNombre();
                mayor = año.getYear() - p.getFechaNacimiento().getYear();
            }
        }

        System.out.printf("La edad media de las personas es: %.2f%n",sumaEdades / personas.size());

        System.out.println("El nombre de la persona mayor es: " + nombrePersonaMayor + " con una edad de "+ mayor+" años");

        System.out.println("\n---- Mostrando valores del HashSet con COMPARABLE---- ");
        for (Persona_v3 p : personas) {
            System.out.println(p);
        }


        personas.sort(new Comparator<Persona_v3>() {
            @Override
            public int compare(Persona_v3 o1, Persona_v3 o2) {
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }
        });
        System.out.println("\n---- Mostrando valores del HashSet con COMPARATOR---- ");
        for (Persona_v3 p : personas) {
            System.out.println(p);
        }





    }
}
