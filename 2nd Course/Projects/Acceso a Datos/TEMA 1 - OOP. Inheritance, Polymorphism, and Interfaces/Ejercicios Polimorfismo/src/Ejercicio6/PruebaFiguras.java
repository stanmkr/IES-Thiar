package Ejercicio6;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: dsa / 2022
 */
public class PruebaFiguras {
    public static void main(String[] args) {
        int[] posicion = {10, 20};
        double[] lados = {50, 100};
        Circulo miCirculo = new Circulo(3, "Red", posicion);
        Rectangulo miRectangulo = new Rectangulo(lados,"Blue",posicion);

        System.out.println(miCirculo.getRadio());
        int [] centro = miCirculo.getPosicion();
        System.out.println(centro[0]);
        System.out.println(centro[1]);
        System.out.println(miRectangulo.getColorFigura());

    }
}
