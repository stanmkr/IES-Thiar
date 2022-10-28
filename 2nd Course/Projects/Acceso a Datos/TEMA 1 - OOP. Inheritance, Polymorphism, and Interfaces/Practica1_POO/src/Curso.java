/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Practica1_POO
 * FECHA: Octubre / 2022
 */
public class Curso {
    private final String codigo, nombre;

    // CONSTRUCTOR
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public String getCodigo() {
        return codigo;
    }


    public String getNombre() {
        return nombre;
    }



    @Override
    public String toString() {
        return "CURSO --- " +
                "Código: " + codigo +
                " | Nombre: " + nombre;
    }
}
