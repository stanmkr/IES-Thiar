package ejercicios.ejerciciosTema8;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class Ingrediente {

    private String nombre;
    private int cantidad;
    private String unidad;

    public Ingrediente(String nombre, int cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Ingrediente setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Ingrediente setCantidad(int cantidad) {
        this.cantidad = cantidad;
        return this;
    }

    public String getUnidad() {
        return unidad;
    }

    public Ingrediente setUnidad(String unidad) {
        this.unidad = unidad;
        return this;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", unidad='" + unidad + '\'' +
                '}';
    }
}
