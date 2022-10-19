package Ejercicio7;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class PolimorfismoRectangulo extends PolimorfismoFigura {
    private double[] lados;


    public PolimorfismoRectangulo(double[] lados) {
        this.lados = lados;
    }

    public PolimorfismoRectangulo(String colorFigura, double[] lados) {
        super(colorFigura);
        this.lados = lados;
    }

    public PolimorfismoRectangulo(double[] lados, String colorFigura, int[] posicion) {
        super(colorFigura, posicion);
        this.lados = lados;
    }

    @Override
    public double getPerimetro() {
        return 2 * lados[0] + 2 * lados[1];
    }

    // GETTERS Y SETTERS

    public double[] getLados() {
        return lados;
    }

    public void setLados(double base, double altura) {
        this.lados[0] = base;
        this.lados[1] = altura;
    }
}
