package Ejercicio7;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class PolimorfismoCirculo extends PolimorfismoFigura {
    private double radio;

    // CONSTRUCTOR
    public PolimorfismoCirculo(double radio) {
        this.radio = radio;
    }

    public PolimorfismoCirculo(double radio, String colorFigura) {
        super(colorFigura);
        this.radio = radio;
    }

    public PolimorfismoCirculo(double radio, String colorFigura, int[] posicion) {
        super(colorFigura, posicion);
        this.radio = radio;
    }


    /**
     *
     * @return el perímetro del circulo
     */
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * this.radio;
    }

    //  GETTERS Y SETTERS
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
