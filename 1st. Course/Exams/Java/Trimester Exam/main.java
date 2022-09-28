/**
 * Created by Stanislav Krastev
 * examenTrimestre - PACKAGE_NAME
 * Date: mayo / 2022
 */
public class main {
    public static void main(String[] args) throws Exception {
        Articulo art1 = new Articulo(5,"manzana",50,4);
        Articulo art2 = new Articulo(4,"peras",50,4);

        System.out.println(art1.infoArticulo());
        System.out.println(art2.infoArticulo());
    }
}
