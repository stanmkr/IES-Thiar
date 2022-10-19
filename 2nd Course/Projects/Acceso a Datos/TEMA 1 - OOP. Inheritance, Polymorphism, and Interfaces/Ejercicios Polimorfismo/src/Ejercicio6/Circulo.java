package Ejercicio6;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class Circulo extends Figura {
    private double radio;

    // CONSTRUCTOR


    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, String colorFigura) {
        super(colorFigura);
        this.radio = radio;
    }

    public Circulo(double radio, String colorFigura, int[] posicion) {
        super(colorFigura, posicion);
        this.radio = radio;
    }



    //  GETTERS Y SETTERS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
