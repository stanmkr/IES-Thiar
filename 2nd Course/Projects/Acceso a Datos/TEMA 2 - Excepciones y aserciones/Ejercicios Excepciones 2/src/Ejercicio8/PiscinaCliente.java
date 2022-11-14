package Ejercicio8;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Excepciones 2
 * FECHA: Noviembre / 2022
 */
public class PiscinaCliente {
    public static void main(String[] args) {
        operacionesPiscina(new Piscina(100));
    }


    public static void operacionesPiscina(Piscina piscina) {
        try {
            for (int i = 1; i < 3; i++) { // llenando la piscina
                int cantidadALlenar = (int  )(Math.random() * 100);
                System.out.println("Intentando llenar " + cantidadALlenar + " litros.");
                piscina.llenar(cantidadALlenar);
            }
            System.out.println("El nivel de la piscina es: " + piscina.getNivel() + " litros.\n"); // mostrando su nivel

            for (int i = 1; i < 3; i++) { // vaciando la piscina
                int cantidadAVaciar = (int  )(Math.random() * 100);
                System.out.println("Intentado vaciar " + cantidadAVaciar + " litros.");
                piscina.vaciar(cantidadAVaciar);
            }
            System.out.println(piscina.getNivel()); // mostrando su nivel
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("El nivel de la piscina es: " + piscina.getNivel() + " litros."); // mostrando su nivel
        }
    }
}
