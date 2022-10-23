package Ejercicio5;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio5
 * Date: Octubre / 2022
 */
public class PruebaCantar {
    public static void hacerCantar(PuedeCantar cantor) {
        cantor.cantar();
    }

    public static void main(String[] args) {
        Persona pavaroti = new Persona();
        Canario piolin = new Canario();
        Gallo claudio = new Gallo();

        hacerCantar(pavaroti);
        hacerCantar(piolin);
        hacerCantar(claudio);

    }
}
