/**
 * Developed by Stanislav Krastev 1º DAM
 * examenT8 - PACKAGE_NAME
 * febrero - 2022
 */
public class PizzaProbando {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("margsarita","mediana");
        Pizza pizza2 = new Pizza("funghi","familiar");
        pizza2.sirve();
        Pizza pizza3 = new Pizza("cuatro quesos","medisana");
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println("Servidas: " + Pizza.getTotalServidas());
        pizza2.sirve();
        pizza2.sirve();
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());

        Pizza pizza4 = new Pizza("margarita","mediana");
        pizza4.sirve();
        System.out.println(pizza4);
        System.out.println("Servidas: " + Pizza.getTotalServidas());
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());





    }
}
