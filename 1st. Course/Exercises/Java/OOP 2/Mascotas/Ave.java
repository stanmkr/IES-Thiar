package Ejercicio7_Mascotas;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio7_Mascotas
 * Date: Febrero / 2022
 */
public abstract class Ave extends Mascota {
    private String pico;
    private boolean vuela;

    public Ave(String nombre, int edad, String estado, String fechaNac, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNac);
        this.pico = pico;
        this.vuela = vuela;
    }

    //  MÉTODO ABSTRACTO
    public abstract void volar();

    public abstract void muestra ();
    public abstract void habla();

    //  GETTERS Y SETTERS
    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
