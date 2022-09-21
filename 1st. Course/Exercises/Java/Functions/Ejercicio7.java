import java.util.Scanner;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * diciembre - 2021
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura;
        System.out.print("Introduce la base del rectángulo: ");
        base = scanner.nextDouble();
        System.out.print("Introduce la altura del rectángulo: ");
        altura = scanner.nextDouble();
        System.out.println("El PERÍMETRO DEL RECTÁNGULO ES: " + perimetroRectangulo(base,altura));
        System.out.println("El ÁREA DEL RECTÁNGULO ES: " + areaRectangulo(base,altura));


    }

    /**
     * calcula el perimetro de un rectangulo dados sus lados
     * @param ancho base del rectangulo en double
     * @param alto lado del rectangulo en double
     * @return devuelve el resultado del perimetro
     */
    public static double perimetroRectangulo(double ancho, double alto) {
        double perimetro;
        perimetro = 2 * ancho + 2 * alto;
        return perimetro;
    }

    /**
     * calcula el area de un rectangulo
     * @param ancho base del rectangulo
     * @param alto altura del rectangulo
     * @return devuelve el area
     */
    public static double areaRectangulo(double ancho, double alto) {
        double area;
        area = ancho * alto;
        return area;
    }

}
