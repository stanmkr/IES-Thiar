package Ejercicio2;

/**
 * Created by Stanislav Krastev
 * Ejercicios Interfaces - Ejercicio2
 * Date: Octubre / 2022
 */
public class PruebaArrayReales {
    public static void main(String[] args) {

        ArrayReales x = new ArrayReales();
        x.valor = new double[5];
        x.asignar();
        x.imprimir();
        System.out.println("Mínimo : " + x.minimo());
        System.out.println("Máximo : " + x.maximo());
        System.out.println("Sumatorio: " + x.sumatorio());

    }
}
