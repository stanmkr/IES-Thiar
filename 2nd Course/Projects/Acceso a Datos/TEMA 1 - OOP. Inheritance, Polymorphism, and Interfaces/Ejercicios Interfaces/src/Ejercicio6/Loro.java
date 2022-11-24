package Ejercicio6;

import Ejercicio7.Aves;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio6
 * Date: Octubre / 2022
 */
public class Loro extends Aves implements PuedeCaminar{

    @Override
    public void caminar() {
        System.out.println("El loro puede caminar");
    }

    @Override
    public void volar() {
        System.out.println("El loro vuela");
    }
}
