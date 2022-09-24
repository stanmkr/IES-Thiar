package ejercicios.ejerciciosA;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class RectanguloPruebas {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo();
        Rectangulo rect2 = new Rectangulo();

        rect1.x1 = 0;
        rect1.y1 = 0;
        rect1.x2 = 5;
        rect1.y2 = 5;

        rect2.x1 = 7;
        rect2.y1 = 9;
        rect2.x2 = 2;
        rect2.y2 = 3;

        System.out.printf("Las coordenadas del rectángulo 1 son: (%d,%d) - (%d,%d)%n",rect1.x1,rect1.y1,rect1.x2,rect1.y2);
        System.out.printf("Las coordenadas del rectángulo 2 son: (%d,%d) - (%d,%d)%n",rect2.x1,rect2.y1,rect2.x2,rect2.y2);
        System.out.printf("El perímetro del rectángulo 1 es: %d%n",Math.abs((rect1.x1-rect1.x2)*2) + Math.abs((rect1.y1-rect1.y2)*2)) ;
        System.out.printf("El perímetro del rectángulo 2 es: %d%n",Math.abs((rect2.x1-rect2.x2)*2) + Math.abs((rect2.y1-rect2.y2)*2)) ;
        System.out.printf("El área del rectángulo 1 es: %d%n", (rect1.x1-rect1.x2)*(rect1.y1-rect1.y2));
        System.out.printf("El área del rectángulo 2 es: %d%n", (rect2.x1-rect2.x2)*(rect2.y1-rect2.y2));



    }
}
