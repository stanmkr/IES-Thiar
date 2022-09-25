/**
 * Developed by Stanislav Krastev 1º DAM
 * examenT8 - PACKAGE_NAME
 * febrero - 2022
 */
public class ProbandoElipse {
    public static void main(String[] args) {
        Elipse prueba;
        prueba = Elipse.crearElipse();
        prueba.imprimir();
        prueba.despalazarXY(7,4);
        System.out.println();
        prueba.imprimir();
        System.out.println("El área es: " + prueba.getArea());
        Elipse [] arrayElipses = new Elipse[10];
        for (int i = 0; i < arrayElipses.length ; i++) {
            arrayElipses[i] = Elipse.crearElipse();
        }
    }
}
