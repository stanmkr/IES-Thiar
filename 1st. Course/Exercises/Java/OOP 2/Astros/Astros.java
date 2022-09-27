package Ejercicio6_Astros;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio6_Astros
 * Date: Febrero / 2022
 */
public abstract class Astros {
    private String nombre;
    private double radio;
    private double rotacionEje;
    private double masa;
    private double tempMedia;
    private double gravedad;


    //  CONSTRUCTOR

    public Astros(String nombre, double radio, double rotacionEje, double masa, double tempMedia, double gravedad) {
        this.nombre = nombre;
        this.radio = radio;
        this.rotacionEje = rotacionEje;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.gravedad = gravedad;
    }


    //  MÉTODOS
    abstract public void muestra();

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRotacionEje() {
        return rotacionEje;
    }

    public void setRotacionEje(double rotacionEje) {
        this.rotacionEje = rotacionEje;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
}
