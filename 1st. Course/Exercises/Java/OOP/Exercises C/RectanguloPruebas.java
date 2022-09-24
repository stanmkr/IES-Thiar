package ejercicios.ejerciciosC;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 */
public class RectanguloPruebas {
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(3, 3, 2, 2);
        Rectangulo rect2 = new Rectangulo(7, 8, 6, 7);
        rect1.setX1(1);
        rect1.setX2(-5);

        System.out.printf("Las coordenadas del rectángulo 1 son: (%d,%d) - (%d,%d)%n", rect1.getX1(), rect1.getY1(), rect1.getX2(), rect1.getY2());
        System.out.printf("Las coordenadas del rectángulo 2 son: (%d,%d) - (%d,%d)%n", rect1.getX1(), rect1.getY1(), rect1.getX2(), rect1.getY2());
        System.out.printf("El perímetro del rectángulo 1 es: %d%n", Math.abs(rect1.getX1() - rect1.getX2()) * 2 + (Math.abs(rect1.getY1() - rect1.getY2())) * 2);
        System.out.printf("El perímetro del rectángulo 2 es: %d%n", Math.abs(rect2.getX1() - rect2.getX2()) * 2 + Math.abs(rect2.getY1() - rect2.getY2()) * 2);
        System.out.printf("El área del rectángulo 1 es: %d%n", Math.abs(rect1.getX1() - rect1.getX2()) * Math.abs(rect1.getY1() - rect1.getY2()));
        System.out.printf("El área del rectángulo 2 es: %d%n", Math.abs(rect2.getX1() - rect2.getX2()) * Math.abs(rect2.getY1() - rect2.getY2()));


    }
}
