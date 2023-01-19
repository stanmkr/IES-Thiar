package ejemplo.base;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private String profesor;
    private List<Alumno> alumnos;

    public Asignatura(String nombre, Profesor profesor){
        this.nombre = nombre;
        this.profesor = String.valueOf(profesor);
        alumnos = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", profesor='" + profesor + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
