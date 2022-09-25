package ejercicios.ejerciciosTema8;

import java.time.LocalDate;

/**
 * Created by Stanislav Krastev 1º DAM
 * Programación - ejercicios.ejerciciosTema8
 * Date: FEBRERO / 2022
 */
public class EjemplarLibro {
    private final String titulo;
    private LocalDate fecha;
    private int numEjemplar;
    private boolean prestado;


    //CONSTRUCTOR 1
    public EjemplarLibro(String titulo) {
        this.titulo = titulo;
        this.fecha = LocalDate.now();
        numEjemplar = 1; // por defecto al crear un objeto libro este será el primer parámetro
        prestado = false; // por defecto al crear un objeto libro no esta prestado
    }

    // CONSTRUCTOR 2 --> se le pasa un objeto como parámetro
    public EjemplarLibro(EjemplarLibro libro) {
        this.titulo = libro.titulo;
        this.fecha = libro.fecha;
        prestado = false;
        this.numEjemplar = libro.numEjemplar + 1; // al pasarle un objeto al constructor, se entiende que el objeto será el siguiente ejemplar
    }

    /**
     * si no está prestado lo marca como prestado y devuelve true ̧ si ya está prestado devuelve FALSE .
     *
     * @return devuelve true si esta prestado / false si no esta prestado
     */
    public boolean Prestar() {
        if (!prestado) {
            prestado = true;
            return true;
        } else {
            return false;
        }
    }

    /**
     * si está prestado lo marca como no prestado y devuelve true ̧ si no está prestado no hace nada y devuelve false.
     *
     * @return true cuando ya no esta prestado y se devuelve / false cuando no hay nada que devolver(no esta prestado)
     */
    public boolean Devolver() {
        if (prestado) {
            prestado = false;
            return true;
        } else {
            return false;
        }
    }

    /**
     * genera un String con el nombre, la fecha, el nº de ejemplar y si está prestado o no
     * @return
     */
    @Override
    public String toString() {
        return "EjemplarLibro{" +
                "TÍTULO= '" + titulo + '\'' +
                ", FECHA= " + fecha +
                ", NUMERO EJEMPLAR= " + numEjemplar +
                ", PRESTADO= " + prestado +
                '}';
    }

}
