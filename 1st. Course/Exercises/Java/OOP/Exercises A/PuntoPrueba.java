package ejercicios.ejerciciosA;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class PuntoPrueba {
    public static void main(String[] args) {
        Punto miPunto1 = new Punto();
        Punto miPunto2 = new Punto();
        Punto miPunto3 = new Punto();

        miPunto1.x = 5;
        miPunto1.y = 0;
        miPunto2.x = 10;
        miPunto2.y = 10;
        miPunto3.x = -3;
        miPunto3.y = 7;
        System.out.printf("La suma de las coordinadas (x,y) del primer punto: %d + %d = %d%n", miPunto1.x, miPunto1.y, miPunto1.x + miPunto1.y);
        System.out.printf("La resta de las coordinadas (x,y) del segundo punto: %d - %d = %d%n", miPunto2.x, miPunto2.y, miPunto2.x - miPunto2.y);
        System.out.printf("La multiplicación de las coordinadas (x,y) del tercer punto: %d * %d = %d%n", miPunto3.x, miPunto3.y, miPunto3.x * miPunto3.y);
    }
}
