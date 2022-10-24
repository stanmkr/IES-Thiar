import java.util.ArrayList;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Alumno extends Persona {
    private String curso;
    private ArrayList<Double> listaNotas;

    // CONSTRUCTOR
    public Alumno(String nombre, String dni, int telefono, int edad, String curso, ArrayList<Double> listaNotas) {
        super(nombre, dni, telefono, edad);
        this.curso = curso;
        this.listaNotas = listaNotas;
    }




    // MÉTODOS

    /**
     * añade una nota a la lista de notas del objeto alumno
     * @param nota que se va a añadir a la lista
     */
    public void anyadirNota(double nota) {
        this.listaNotas.add(nota);
    }

    /**
     * elimina las notas guardadas en la lista de notas del objeto alumno
     */
    public void eliminarNotas (){
        this.listaNotas.clear();
    }

    @Override
    public String toString() {
        return "El alumno " + getNombre() + " del curso " + curso + " tiene las siguientes notas " + listaNotas;
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
