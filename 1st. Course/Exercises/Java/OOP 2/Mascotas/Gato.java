package Ejercicio7_Mascotas;

import Ajedrez.ColorPieza;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public class Gato extends Mascota {

    private String color;
    private boolean peloLargo;


    //  CONSTRUCTOR
    public Gato(String nombre, int edad, String estado, String fechaNac, String color, boolean peloLargo) {
        super(nombre, edad, estado, fechaNac);
        this.color = color;
        this.peloLargo = peloLargo;

    }


    //  MÉTODOS ABSTRACTOS
    public void muestra(){
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Fecha de nacimiento : " + this.getFechaNac());
        System.out.println("Color : " + color);
        System.out.println("Pelo largo : " + peloLargo);
    }

    public void habla(){
        System.out.println("MIAU MIAU soy un gato");
    }

    //  GETTERS Y SETTERS

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPeloLargo() {
        return peloLargo;
    }

    public void setPeloLargo(boolean peloLargo) {
        this.peloLargo = peloLargo;
    }
}
