package ejercicios.ejerciciosC;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 *
 * Crea un programa con una clase llamada Persona que representará los datos principales de una persona: dni, nombre, apellidos y edad.
 *
 * En el main de la clase principal instancia dos objetos de la clase Persona.
 * Luego, pide por teclado los datos de ambas personas (guárdalos en los objetos).
 * Por último, imprime dos mensajes por pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es mayor de edad”.
 *
 */
public class Persona {
   private String dni,nombre,apellidos;
    private int edad;

    public Persona ( String nombre, String apellidos, int edad){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getEdad (){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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


}
