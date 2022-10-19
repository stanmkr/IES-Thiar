package Ejercicio6;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class Figura {
    private String colorFigura;
    private int[] posicion;


    // C O N S T R U C T O R E S
    public Figura() {
        posicion = new int[2];
        colorFigura = "Black";
    }

    public Figura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public Figura(String colorFigura, int[] posicion) {
        this.colorFigura = colorFigura;
        this.posicion = posicion;
    }



    // GETTER Y SETTERS
    public String getColorFigura() {
        return colorFigura;
    }

    public void setColorFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int coordenadaX, int coordenadaY) {
        this.posicion[0] = coordenadaX;
        this.posicion[1] = coordenadaY;
    }
}
