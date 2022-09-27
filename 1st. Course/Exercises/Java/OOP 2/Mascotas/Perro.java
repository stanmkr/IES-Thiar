package Ejercicio7_Mascotas;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class Perro extends Mascota {
    private String raza;
    private boolean pulgas;

    //  CONSTRUCTOR
    public Perro(String nombre, int edad, String estado, String fechaNac, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNac);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //  MÉTODOS ABSTRACTOS
    public void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Fecha de nacimiento : " + this.getFechaNac());
        System.out.println("Raza : " + this.raza);
        System.out.println("Pulgas : " + this.pulgas);
    }

    public void habla(){
        System.out.println("GUAU GUAU soy un perro muy perro");
    }
    //  GETTERS Y SETTERS



    //  GETTERS Y SETTERS
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
