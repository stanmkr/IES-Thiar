package ejercicios.ejerciciosB;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class PuntoPrueba {
    public static void main(String[] args) {
        Punto miPunto1 = new Punto(3,4);
        Punto miPunto2 = new Punto(15,20);
        Punto miPunto3 = new Punto(2,2);

        System.out.printf("La suma de las coordinadas (x,y) del primer punto: %d + %d = %d%n", miPunto1.x, miPunto1.y, miPunto1.x + miPunto1.y);
        System.out.printf("La resta de las coordinadas (x,y) del segundo punto: %d - %d = %d%n", miPunto2.x, miPunto2.y, miPunto2.x - miPunto2.y);
        System.out.printf("La multiplicación de las coordinadas (x,y) del tercer punto: %d * %d = %d%n", miPunto3.x, miPunto3.y, miPunto3.x * miPunto3.y);
    }
}
