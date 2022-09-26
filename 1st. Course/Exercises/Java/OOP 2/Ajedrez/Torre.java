package Ajedrez;


/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ajedrez
 * Date: Febrero / 2022
 */
public class Torre extends Pieza {

    //  CONSTRUCTOR
    //  hereda de Pieza. No tiene ningún atributo nuevo y tiene un constructor al que se le pasa el color y su posición en X y en Y que usa algún constructor de Pieza,
    public Torre(ColorPieza ColorPieza, int x, int y) {
        super(ColorPieza, x, y);
    }

    //  MÉTODOS
    @Override
    public void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) {
            if (posicion.x == x) {
                posicion.move(posicion.x, y);
            } else if (posicion.y == y) {
                posicion.move(x, posicion.y);
            }
        } else {
            System.out.println("Has decidido no continuar con el movimiento.");
        }
    }


    // MÉTODOS DE LA INTERFAZ JuegoTablero
    @Override
    public char indiceAPosicion(int indice) {
        //  char [] letras = new char[] {'A','B','C','D','E','F','G','H'};
        String letrasTablero = "ABCDEFGH";
        return letrasTablero.charAt(indice);
    }

    @Override
    public int indiceAPosicionN(int indice) {
        return indice + 1;

    }

    @Override
    public int posicionAIndice(char posicion) {
        posicion = Character.toUpperCase(posicion);
        char[] letras = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int indice = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == posicion) {
                indice = i;
            }
        }
        return indice;
    }

    @Override
    public int posicionAIndice(int posicion) {
        return posicion - 1;
    }
}
