import java.util.Objects;

/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Casilla {
    enum ColorTerreno {ROJO, AMARILLO, VERDE}
    private final String nombre;
    private int codigo;

    //  CONSTRUCTOR
    public Casilla(String nombre) {
        this.nombre = nombre;
        codigo++;
    }

    //  MÉTODOS
    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre de la casilla: " +this.nombre);
        System.out.println("Código de casilla: " + this.codigo);
    }


    // comprobar si dos casillas son iguales, si tienes todos sus atributos iguales
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casilla casilla = (Casilla) o;
        return codigo == casilla.codigo && Objects.equals(nombre, casilla.nombre);
    }

    //  GETTERS Y SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}