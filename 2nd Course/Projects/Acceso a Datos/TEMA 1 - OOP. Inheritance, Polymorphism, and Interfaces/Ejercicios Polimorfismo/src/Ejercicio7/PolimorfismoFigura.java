package Ejercicio7;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: Octubre / 2022
 */
public class PolimorfismoFigura {
    private String colorFigura;
    private int[] posicion;



    public double getPerimetro (){
        return 0;
    }

    // C O N S T R U C T O R E S
    public PolimorfismoFigura() {
        posicion = new int[2];
        colorFigura = "Black";
    }


    public PolimorfismoFigura(String colorFigura) {
        this.colorFigura = colorFigura;
    }

    public PolimorfismoFigura(String colorFigura, int[] posicion) {
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
