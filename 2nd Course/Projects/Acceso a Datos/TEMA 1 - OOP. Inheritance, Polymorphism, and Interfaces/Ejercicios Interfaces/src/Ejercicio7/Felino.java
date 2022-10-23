package Ejercicio7;

import Ejercicio6.Mamifero;
import Ejercicio6.PuedeCaminar;
import Ejercicio6.PuedeNadar;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio7
 * Date: Octubre / 2022
 */
public class Felino extends Mamifero implements PuedeCaminar, PuedeNadar {

    @Override
    public void nadar() {
        System.out.println("El felino puede nadar");
    }

    @Override
    public void caminar() {
        System.out.println("El felino camina");
    }
}
