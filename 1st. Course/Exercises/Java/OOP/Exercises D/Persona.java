package ejercicios.ejerciciosD;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 * <p>
 * Crea un programa con una clase llamada Persona que representará los datos principales de una persona: dni, nombre, apellidos y edad.
 * <p>
 * En el main de la clase principal instancia dos objetos de la clase Persona.
 * Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos).
 * Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de edad”.
 */
public class Persona {
    private String dni, nombre, apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    // MÉTODOS

    // Imprime la información del objeto: “DNI:… Nombre:… etc.
    public void Imprime() {
        System.out.printf("""
                DNI: %s
                Nombre: %s
                Apellidos: %s
                Edad: %d%n""", dni, nombre, apellidos, edad);
    }

    // Devuelve true si es mayor de edad (false si no).
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    // Devuelve true si tiene 65 años o más (false si no).
    public boolean esJubilado() {
        return edad >= 65;
    }

    // Devuelve la diferencia de edad entre ‘this’ y p
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }

}
