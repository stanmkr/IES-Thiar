package Ejercicio6;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class Rectangulo extends Figura {
    private double[] lados;


    public Rectangulo(double[] lados) {
        this.lados = lados;
    }

    public Rectangulo(String colorFigura, double[] lados) {
        super(colorFigura);
        this.lados = lados;
    }

    public Rectangulo(double[] lados, String colorFigura, int[] posicion) {
        super(colorFigura, posicion);
        this.lados = lados;
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
