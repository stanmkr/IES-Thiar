package ejercicios.ejerciciosE;

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
    private String nombre, apellidos;
    private final String dni;
    private int edad;
    static final int MAYORIA_EDAD = 18;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        if (Persona.validarDNI(dni)){
            this.dni=dni;
        }else {
            System.err.println("ERROR al introducir el DNI");
            this.dni = "000000000"; // o a null pero no es recomendable poner null
        }
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
                Edad: %d%n""", getDni(), getNombre(), getApellidos(), getEdad());
    }

    // Devuelve true si es mayor de edad (false si no).
    public boolean esMayorEdad() {
        return getEdad() >= Persona.MAYORIA_EDAD;
    }

    // Devuelve true si tiene 65 años o más (false si no).
    public boolean esJubilado() {
        return getEdad() >= 65;
    }

    // Devuelve la diferencia de edad entre ‘this’ y p
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }


    // Devuelve true si dni es válido (tiene 8 números y una letra). Si no, devolverá false.
    static boolean validarDNI(String dni) {
        String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
        int cantidadNumeros = 1;
        boolean esValido = false;
        if (dni.length() != 9 || !Character.isLetter(dni.charAt(8))) {
            return false;
        } else
            for (int i = 0; i <dni.length()-1 ; i++) {
                for (int j = 0; j < numeros.length ; j++) {
                    if (dni.substring(i,i+1).equals(numeros[j])){
                        cantidadNumeros++;
                        break;
                    }
                }
                if (cantidadNumeros == 9){
                    esValido = true;
                }
            }
            return esValido;
    }
    // OTRO METODO PARA VALIDAR DNI (más fácil)
    public static boolean validarDNICharacter(String dni){
        if (dni.length()!=9){
            return false;
        }
        for (int i = 0; i <8 ; i++) {
            if (!Character.isDigit(dni.charAt(i))){
                return false;
            }
        }
        if (Character.isLetter(dni.charAt(8))){
            return true;
        }
        return false;
    }


}


