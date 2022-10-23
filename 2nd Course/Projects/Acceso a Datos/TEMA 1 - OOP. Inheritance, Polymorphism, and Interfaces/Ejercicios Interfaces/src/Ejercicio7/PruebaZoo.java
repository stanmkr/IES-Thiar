package Ejercicio7;

import Ejercicio6.Gato;
import Ejercicio6.Loro;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio7
 * Date: Octubre / 2022
 */
public class PruebaZoo {
    public static void main(String[] args) {
        Gato pisi = new Gato();
        Loro pesado = new Loro();
        Avestruz avestruz = new Avestruz();
        Murcielago batman = new Murcielago();
        Tigre rocky = new Tigre();


        pisi.nadar();
        pisi.caminar();
        System.out.println();
        pesado.volar();
        pesado.caminar();
        System.out.println();
        avestruz.caminar();
        System.out.println();
        batman.caminar();
        batman.volar();
        System.out.println();
        rocky.caminar();
        rocky.nadar();
    }
}
