import java.util.ArrayList;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Profesor extends Persona {
    private String curso;
    private ArrayList<Double> listaNotas;


    // CONSTRUCTOR
    public Profesor(String nombre, String dni, int telefono, int edad, String curso, ArrayList<Double> listaNotas) {
        super(nombre, dni, telefono, edad);
        this.curso = curso;
        this.listaNotas = listaNotas;
    }


    // MÉTODOS
    public void anyadirAsignatura(String asignatura) {


    }

    public void eliminarAsignatura (String asignatura){

    }

    @Override
    public String toString() {
        return "El profesor " + getNombre() + " que imparte los cursos " + curso;

    }

    // GETTERS Y SETTERS
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
