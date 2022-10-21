package Ejercicio1;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Interfaces
 * FECHA: Octubere / 2022
 */
public class Impresion {
    public static void main(String[] args) {
        ItfNeutro neutro = new ItfNeutro();
        ItfNegativoImpresion negativo = new ItfNegativoImpresion();
        neutro.imprimir();
        negativo.imprimir();

        neutro.imprimirBonito();

    }


    static class ItfNeutro implements ItfImpresion, ItfImpresion2 {

        @Override
        public void imprimir() {
            System.out.println("Las olas del mar");
        }

        @Override
        public void imprimirBonito() {
            System.out.println("---- Las olas del mar ----");
        }
    }

   static  class ItfPositivoImpresion implements ItfImpresion {


        @Override
        public void imprimir() {
            System.out.println("¡Qué buen tiempo hace!");
        }

    }

    static class ItfNegativoImpresion implements ItfImpresion {

        @Override
        public void imprimir() {
            System.out.println("¡Odio los lunes!");
        }

    }


}
