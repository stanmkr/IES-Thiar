import java.util.ArrayList;
import java.util.Scanner;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Alumno extends Persona {
    Scanner scanner = new Scanner(System.in);
    private final String curso;
    private ArrayList<Double> listaNotas;

    // CONSTRUCTOR
    public Alumno(String nombre, String dni, int telefono, int edad, String curso) {
        super(nombre, dni, telefono, edad);
        this.curso = curso;
        this.listaNotas = new ArrayList<>();
    }


    // MÉTODOS

    /**
     * añade una nota a la lista de notas del objeto alumno
     */
    public void anyadirNota() {
        System.out.print("Introduce la nota del alumno: ");
        double nota = Double.parseDouble(scanner.nextLine());
        if (nota > 0 && nota <= 10) {
            this.listaNotas.add(nota);
            System.out.printf("Nota %.2f añadida correctamente...\n", nota);

        }else {
            System.out.println("La nota debe de ser entre 0 y 10");
        }
    }

    /**
     * elimina las notas guardadas en la lista de notas del objeto alumno
     */
    public void eliminarNotas() {
        this.listaNotas.clear();
        System.out.println("Notas eliminadas correctamente...");
    }

    @Override
    public String toString() {
        return "El alumno " + getNombre() + " con DNI: " + getDni() + ", Tlf: " + getTelefono() + " y edad: " + getEdad() + " años, del curso " + curso + ", tiene las siguientes notas: " + listaNotas;
    }

    // GETTERS Y SETTERS
    public String getCurso() {
        return curso;
    }


    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }


}
