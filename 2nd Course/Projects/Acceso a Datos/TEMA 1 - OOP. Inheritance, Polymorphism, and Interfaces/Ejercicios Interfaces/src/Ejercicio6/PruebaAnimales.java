package Ejercicio6;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio6
 * Date:  / 2022
 */
public class PruebaAnimales {
    public static void main(String[] args) {
        Gato felix = new Gato();
        Loro pepe = new Loro();

        felix.caminar();
        felix.nadar();
        System.out.println();
        pepe.caminar();
    }
}
