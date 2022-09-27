package Ejercicio7_Mascotas;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class Loro extends Ave{
    private String origen;
    private boolean habla;

    //  CONSTRUCTOR
    public Loro(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.origen = origen;
        this.habla = habla;
    }

    //  MÉTODOS
    public void muestra(){
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Fecha de nacimiento : " + this.getFechaNac());
        System.out.println("Pico : " + this.getPico());
        System.out.println("Vuela : " + this.isVuela());
        System.out.println("Origen : " + origen);
        System.out.println("Habla : " + habla);
    }

    public void habla() {
        System.out.println("HOLA HOLA");
    }


    public void volar(){
        this.setEstado("Volando");
    }

    public void saluda(){
        System.out.println("Hola soy un Loro");
    }


}
