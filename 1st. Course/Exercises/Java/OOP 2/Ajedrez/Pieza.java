package Ajedrez;

import java.awt.Point;
import java.util.Objects;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ajedrez
 * Date: marzo / 2022
 */
public abstract class Pieza implements JuegoTablero {

    protected ColorPieza ColorPieza;
    protected Point posicion;
    protected boolean comida;

    //  CONSTRUCTORES
    //  constructor 1
    public Pieza(ColorPieza ColorPieza, int x, int y) {
        posicion =new Point(x,y);

        if (comprobarPosicion(posicion.x) && comprobarPosicion(posicion.y) ) {
            this.comida = false;
        } else {
            this.comida = true;
        }
        this.ColorPieza = ColorPieza;
    }

    //  constructor 2
    //   usa el constructor 1, no recibirá ningún parámetro y creará una nueva Pieza en la posición 10, 10 y de color BLANCO.
    public Pieza (){
        this(Ajedrez.ColorPieza.BLANCO,10,10);
    }

    //  constructor 3
    //  usa el constructor 1, recibe como parámetro una Pieza, y copiará sus atributos a la nueva Pieza,
    public Pieza(Pieza unaPieza){
       this(unaPieza.ColorPieza,unaPieza.posicion.x, unaPieza.posicion.y);
    }


    //  MÉTODOS
    public abstract void mover(int x, int y);

    /**
     * Comprueba si el parámetro pasado esta dentro del rango 0-7
     * @param p el punto a comprobar
     * @return devuelve true si esta en rango / false si esta fuera de rango
     */
    static boolean comprobarPosicion(int p) {
        return p >= 0 && p <= 7;
    }


    //  EQUALS
    //  Se considerará que una pieza es igual a la otra si es el mismo tipo de pieza, del mismo color y se encuentra en la misma posición.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pieza pieza = (Pieza) o;
        return ColorPieza == pieza.ColorPieza && this.posicion.equals(pieza.posicion);
    }



//  GETTERS & SETTERS
    public ColorPieza getColor() {
        return ColorPieza;
    }

    public void setColor(ColorPieza ColorPieza) {
        this.ColorPieza = ColorPieza;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }


}
