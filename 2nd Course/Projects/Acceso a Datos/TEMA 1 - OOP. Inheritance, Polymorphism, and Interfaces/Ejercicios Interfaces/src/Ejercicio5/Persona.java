package Ejercicio5;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio5
 * Date: Octubre / 2022
 */
public class Persona implements PuedeCantar{

    @Override
    public void cantar() {
        System.out.println("do re mi fa sol la si");
    }
}
