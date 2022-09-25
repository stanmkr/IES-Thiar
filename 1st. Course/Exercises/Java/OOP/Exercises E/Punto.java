package ejercicios.ejerciciosE;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 * <p>
 * Crea un programa con una clase llamada Punto que representará un punto de dos dimensiones en un plano.
 * Solo contendrá dos atributos enteros llamadas x e y (coordenadas).
 * <p>
 * En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3, 7).
 * Muestra por pantalla sus coordenadas (utiliza un println para cada punto).
 * Modifica todas las coordenadas (prueba distintos operadores como = + - += *=...) y vuelve a imprimirlas por pantalla.
 */
public class Punto {
    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // SETTER Y GETTERS
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Imprime por pantalla las coordenadas.
    public void imprime() {
        System.out.printf("(%d,%d)%n", x, y);
    }

    //Modifica ambas coordenadas. Es como un setter doble.
    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    // Desplaza el punto la cantidad (dx,dy) indicada. Ejemplo:
    public void desplaza(int dx, int dy) {
        setXY(dx + x, dy + y);
    }

    // Calcula y devuelve la distancia entre el propio objeto (this) y otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.
    public int distancia(Punto p) {
        double distancia = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return (int) distancia;
    }

    // método que nos permita crear un objeto Punto con coordenadas aleatorias, entre -100 y 100 y luego devolverlo
    public static Punto creaPuntoAleatorio (){
        int x = ThreadLocalRandom.current().nextInt(-100,100+1);
        int y = ThreadLocalRandom.current().nextInt(-100,100+1);
       return new Punto(x,y);


    }

}
