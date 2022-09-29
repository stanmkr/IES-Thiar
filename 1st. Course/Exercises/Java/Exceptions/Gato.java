/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Gato {
    private String nombre;
    private int edad;

    //  CONSTRUCTOR
    public Gato(String nombre, int edad) throws Exception {
        if (nombre.length() < 3) throw new Exception("El nombre del gato debe de tener al menos 3 caracteres");
        if (edad < 0) throw new Exception("La edad del gato no puede ser negativa");
        this.nombre = nombre;
        this.edad = edad;
    }


    //  GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) throw new Exception("El nombre del gato debe de tener al menos 3 caracteres");
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0) throw new Exception("La edad del gato no puede ser negativa");
        this.edad = edad;
    }

    //  MÉTODOS

    public void imprimir(){
        System.out.println("Nombre del gato: " + getNombre());
        System.out.println("Edad del gato: " + getEdad());
    }
}
