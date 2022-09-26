package Ajedrez;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ajedrez
 * Date: Febrero / 2022
 */
public interface JuegoTablero {

    char indiceAPosicion(int indice); // pasará un índice numérico a su letra correspondiente del tablero

    int indiceAPosicionN(int indice); // pasará un índice numérico a su posición numérica del tablero

    int posicionAIndice(char posicion); // pasará una letra que indica una posición en el tablero a su correspondiente índice

    int posicionAIndice(int posicion); // pasará una posición numérica en el tablero a su correspondiente índice
}
