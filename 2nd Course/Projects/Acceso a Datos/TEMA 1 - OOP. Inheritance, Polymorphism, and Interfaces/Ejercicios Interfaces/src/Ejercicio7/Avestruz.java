package Ejercicio7;

import Ejercicio6.PuedeCaminar;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio7
 * Date: Octubre / 2022
 */
public class Avestruz implements PuedeCaminar {
    @Override
    public void caminar() {
        System.out.println("La avestruz puede caminar");
    }
}
