package Ajedrez;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ajedrez
 * Date: marzo / 2022
 */
public class mainAjedrez {
    public static void main(String[] args) {
        Pieza torreBlanca = new Torre(ColorPieza.BLANCO,2,5);
        Pieza torreBNegra = new Torre(ColorPieza.NEGRO,2,5);
        Pieza peonBlanco = new Peon(ColorPieza.BLANCO,1,1);
        Pieza peonNegro = new Peon(ColorPieza.NEGRO,6,2);

        System.out.println( peonBlanco.posicionAIndice('f'));
        peonBlanco.mover(2,4);
        peonBlanco.mover(1,4);
        peonBlanco.mover(1,3);

        peonNegro.mover(6,8);




    }

}

