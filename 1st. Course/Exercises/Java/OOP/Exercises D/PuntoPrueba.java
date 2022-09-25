package ejercicios.ejerciciosD;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class PuntoPrueba {
    public static void main(String[] args) {
        Punto miPunto1 = new Punto(0, 0);
        Punto miPunto2 = new Punto(15, 20);
        Punto miPunto3 = new Punto(3, 4);

        System.out.println("La distancia entre los puntos es: " + miPunto1.distancia(miPunto3));

        miPunto1.imprime();
        miPunto1.setXY(5, 7);
        miPunto1.imprime();
        miPunto1.setXY(10, 5);
        miPunto1.desplaza(2, 10);
        miPunto1.imprime();


        System.out.printf("La suma de las coordinadas (x,y) del primer punto: %d + %d = %d%n", miPunto1.getX(), miPunto1.getY(), miPunto1.getX() + miPunto1.getY());
        System.out.printf("La resta de las coordinadas (x,y) del segundo punto: %d - %d = %d%n", miPunto2.getX(), miPunto2.getY(), miPunto2.getX() - miPunto2.getY());
        System.out.printf("La multiplicación de las coordinadas (x,y) del tercer punto: %d * %d = %d%n", miPunto3.getX(), miPunto3.getY(), miPunto3.getX() * miPunto3.getY());
    }
}
