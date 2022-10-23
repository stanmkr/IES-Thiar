package Ejercicio7;

import Ejercicio6.Mamifero;
import Ejercicio6.PuedeCaminar;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio7
 * Date: Octubre / 2022
 */
public class Murcielago  extends Mamifero implements PuedeVolar, PuedeCaminar {

    @Override
    public void volar() {
        System.out.println("El murcielago vuela");
    }

    @Override
    public void caminar() {
        System.out.println("El murcielago camina");
    }
}
