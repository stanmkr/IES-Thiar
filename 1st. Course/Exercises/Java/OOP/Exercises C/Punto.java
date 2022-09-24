package ejercicios.ejerciciosC;

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


//    // metodo para asignar la coordenada x
//    void setX(int x){
//        this.x = x;
//    }
//    // metodo para asignar la coordenada y
//    public void setY(int y){
//        this.y = y;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
}
