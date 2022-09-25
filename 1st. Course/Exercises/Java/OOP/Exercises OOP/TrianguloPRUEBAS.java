package ejercicios.ejerciciosTema8;

import ejercicios.ejerciciosE.Punto;

import java.util.ArrayList;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class TrianguloPRUEBAS {
    public static void main(String[] args) {

        // utilizo el método de la clase Punto que crea puntos aleatorios
        Triangulo trianguloPruebas = new Triangulo(Punto.creaPuntoAleatorio(), Punto.creaPuntoAleatorio(), Punto.creaPuntoAleatorio());
        System.out.println("La longitud del perímetro es: " + trianguloPruebas.longitudPerimetro());


    }
}
