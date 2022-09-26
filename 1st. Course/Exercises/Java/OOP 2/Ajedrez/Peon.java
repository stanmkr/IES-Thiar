package Ajedrez;


/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ajedrez
 * Date: Febrero / 2022
 */
public class Peon extends Pieza {

    //  CONSTRUCTOR
    public Peon(ColorPieza ColorPieza, int x, int y) {
        super(ColorPieza, x, y);
    }


    //  MÉTODOS
    @Override
    public void mover(int x, int y) {
        if (comprobarPosicion(x) && comprobarPosicion(y)) { // compruebo con el método estático de la clase Pieza, si las coordenadas introducidas están en rango (0-7), es decir, no se salen del tablero
            if (ColorPieza == Ajedrez.ColorPieza.BLANCO) {  // partiendo de la base, de que las coordenadas están dentro del tablero, comprueba de que color de pieza se trata
                if (x == posicion.x) { // ya que el peon solo se mueve en el eje Y (en nuestro caso no contemplamos movimientos diagonales), compruebo si la coordenada X es la misma que tenía en un principio, es decir debe el Peon debe de estar quiero en esa coordenada, no hacer movimiento
                    if (y > posicion.y) { // en caso de cumplirse la condición anterior, compruebo si la coordenada y que se introduce es mayor que la anterior, es decir, no se puede ir hacia atrás, solo hacia delante
                        if (posicion.y == 1) { // en caso de cumplirse la anterior cond., compruebo si la posición actual del Peon está en y1 es decir, está en el inicio de la partida, ya que al comenzar la partida, el peon tiene el derecho, de hacer 1 paso hacia delante o 2 si lo quisiera
                            if (y == posicion.y + 1 || y == posicion.y + 2) { // en caso de cumplirse que está en comienzo de la partida, compruebo si la coordenada Y que el usuario ha introducido, está en rango, es decir, solo puede mover 1 paso o 2
                                posicion.move(posicion.x, y); // en caso de cumplirse que el usuario ha introducido coordenada Y correcta, se efectúa el movimiento de la pieza Peon,
                            } else {
                                System.out.println("Sólo es posible mover 1 o 2 posiciones el Peón");
                            }
                        } else { // en caso de que el peon no se encuentra en el inicio de la partida, solamente podrá efectuar un desplazamiento hacia delante
                            if (y == posicion.y + 1) { // compruebo si la coordenada Y introducida, esta en rango es decir, es una posición más que la anterior
                                posicion.move(posicion.x, y); // en caso de cumplirse se ejecuta el movimiento de la pieza
                            } else {
                                System.out.println("Sólo es posible mover 1 posición el peón");
                            }
                        }
                    } else {
                        System.out.println("No puedes mover el Peón hacia atrás");
                    }
                } else {
                    System.out.println("No puedes mover el peón en el eje X");
                }
            } else { // en caso de que el peón sea de color Negro
                if (x == posicion.x) {
                    if (y < posicion.y) { // compruebo si la coordenada Y que se introduce es menor que la anterior, es decir, estoy yendo hacia delante, en este caso estoy yendo hacia atrás en el eje Y
                        if (posicion.y == 6) { // en este caso el inicio de la partida para el Peón de color NEGRO está en la posición 6 no en la 1... compruebo...
                            if (y == posicion.y - 1 || y == posicion.y - 2) { // en caso de cumplirse que se encuentra en esa posición, comprueba si el movimiento introducido está en rango
                                posicion.move(posicion.x, y); // se ejecuta el movimiento
                            } else {
                                System.out.println("Sólo es posible mover 1 o 2 posiciones el Peón");
                            }
                        } else { // en caso de que el peón no está en el inicio
                            if (y == posicion.y - 1) {  // compruebo si la coordenada pasada por el usuario es correcta, es decir, es una menos que la anterior
                                posicion.move(posicion.x, y); // ejecuto el movimiento
                            } else {
                                System.out.println("Sólo es posible mover 1 posición el peón");
                            }
                        }
                    } else {
                        System.out.println("No puedes mover el Peón hacia atrás");
                    }
                } else {
                    System.out.println("No puedes mover el peón en el eje X");
                }
            }
        } else {
            System.out.println("Las coordenadas introducidas están fuera del tablero.");
        }
    }


    //  MÉTODOS DE LA INTERFAZ JuegoTablero
    @Override
    public char indiceAPosicion(int indice) {
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
        return "ABCDEFGH".indexOf(posicion);
    }

    @Override
    public int posicionAIndice(int posicion) {
        return posicion - 1;
    }
}

