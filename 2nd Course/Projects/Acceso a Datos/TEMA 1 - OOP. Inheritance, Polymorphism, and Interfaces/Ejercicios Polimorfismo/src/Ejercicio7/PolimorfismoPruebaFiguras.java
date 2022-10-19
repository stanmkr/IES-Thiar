package Ejercicio7;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Polimorfismo
 * FECHA: dsa / 2022
 */
public class PolimorfismoPruebaFiguras {
    public static void main(String[] args) {
        int[] posicion = {10, 20};
        double[] lados = {50, 100};
        PolimorfismoCirculo miCirculo = new PolimorfismoCirculo(3, "Red", posicion);
        PolimorfismoRectangulo miRectangulo = new PolimorfismoRectangulo(lados,"Blue",posicion);

        System.out.println(miCirculo.getPerimetro());
        System.out.println(miRectangulo.getPerimetro());

        //¡Atención acceso a los métodos de la subclase!!!!!
        PolimorfismoCirculo instanciaCirculo = miCirculo;
        System.out.println(instanciaCirculo.getRadio());

        System.out.println(((PolimorfismoCirculo)miCirculo).getRadio());
        lados = ((PolimorfismoRectangulo)miRectangulo).getLados();
        System.out.println(lados[0]);
        System.out.println(lados[1]);


        System.out.println(miCirculo.getRadio());
        int [] centro = miCirculo.getPosicion();
        System.out.println(centro[0]);
        System.out.println(centro[1]);


    }
}
