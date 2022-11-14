package Ejercicio10;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class PiscinaCliente {
    public static void main(String[] args) {
        Piscina miPiscina = new Piscina(300);
        try {
            operacionesPiscina(miPiscina);
        } catch (PiscinaNivelExcepcion e) {
            System.err.println(e.getMessage());;
            System.out.println("El nivel de la piscina es : " + miPiscina.getNivel() );
        }
    }

    public static void operacionesPiscina(Piscina piscina) throws PiscinaNivelExcepcion {

        for (int i = 1; i <= 3; i++) {
            int cantidadALlenar = (int) (Math.random() * 100);
            System.out.println("Intentando llenar " + cantidadALlenar + " litros.");
            piscina.llenar(cantidadALlenar);
        }
        System.out.println("El nivel de la piscina es: " + piscina.getNivel() + " litros.\n"); // mostrando su nivel
        for (int i = 1; i <= 3; i++) { // vaciando la piscina
            int cantidadAVaciar = (int  )(Math.random() * 100);
            System.out.println("Intentado vaciar " + cantidadAVaciar + " litros.");
            piscina.vaciar(cantidadAVaciar);
        }
        System.out.println("El nivel de la piscina es: " + piscina.getNivel() + " litros."); // mostrando su nivel
    }

}
