package Ejercicio7_Mascotas;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class Canario extends Ave{
    private String color;
    private boolean canta;

    //  CONSTRUCTOR

    public Canario(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, estado, fechaNac, pico, vuela);
        this.color = color;
        this.canta = canta;
    }


    //  MÉTODOS

    public void muestra(){
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Fecha de nacimiento : " + this.getFechaNac());
        System.out.println("Pico : " + this.getPico());
        System.out.println("Vuela : " + this.isVuela());
        System.out.println("Color : " + color);
        System.out.println("Canta : " + canta);

    }


    public void habla(){
        System.out.println("PIO PIO");
    }

    public void volar (){
        this.setEstado("Volando");
    }



    //  GETTERS Y SETTERS

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
}
