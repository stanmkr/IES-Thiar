package Ejercicio6;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio6
 * Date: Octubre / 2022
 */
public class Gato implements PuedeCaminar,PuedeNadar{
    @Override
    public void caminar() {
        System.out.println("El gato camina");
    }

    @Override
    public void nadar() {
        System.out.println("El gato sabe nadar");
    }
}
