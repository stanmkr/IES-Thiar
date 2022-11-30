package Ejercicio2;

/**
 * Created by Stanislav Krastev
 * Ejercicios4 - Ejercicio2
 * Date: Noviembre / 2022
 */
public class Alumno {
    private String numExpediente, nombre;
    private double notaParcial1, notaParcial2, notaParcial3, media = 0;


    public Alumno(String numExpediente, String nombre, double notaParcial1, double notaParcial2, double notaParcial3) {
        this.numExpediente = numExpediente;
        this.nombre = nombre;
        this.notaParcial1 = notaParcial1;
        this.notaParcial2 = notaParcial2;
        this.notaParcial3 = notaParcial3;
        this.media = (this.notaParcial1 + this.notaParcial2 + this.notaParcial3) / 3.0;
    }

    public double getMedia() {
        return media;
    }


    @Override
    public String toString() {
        return nombre + " | EXPEDIENTE: [" + numExpediente + "] Nota 1º parial [" + notaParcial1 + "] Nota 2º parcial [" + notaParcial2 + "] Nota 3º parcial [" + notaParcial2 + "] | MEDIA: ["+media+"]";
    }
}
