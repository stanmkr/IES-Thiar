package ejercicios.ejerciciosB;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 * <p>
 * Crea un programa con una clase llamada Rectangulo que representará un rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano,
 * por lo que la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 * <p>
 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).
 * Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y áreas.
 */

public class Rectangulo {
    int x1, x2, y1, y2;

    // constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectángulo");
        }

    }
}
