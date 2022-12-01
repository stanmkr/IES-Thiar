package Ejercicio2;

import java.io.Serializable;

/**
 * Created by Stanislav Krastev
 * Ejercicios4 - Ejercicio2
 * Date: Noviembre / 2022
 */
public class Alumno implements Serializable {
    private String numExpediente, nombre;
    private double notaParcial1;
    private double notaParcial2;
    private double media;


    public Alumno(String nombre, String numExpediente, double notaParcial1, double notaParcial2, double notaParcial3) {
        this.numExpediente = numExpediente;
        this.nombre = nombre;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
        this.media = (this.notaParcial1 + this.notaParcial2 + notaParcial3) / 3.0;
    }

    public double getMedia() {
        return media;
    }


    @Override
    public String toString() {
        return nombre + " | EXPEDIENTE: [" + numExpediente + "] Nota 1º parcial [" + notaParcial1 + "] Nota 2º parcial [" + notaParcial2 + "] Nota 3º parcial [" + notaParcial2 + "] | MEDIA: ["+media+"]";
    }
}
