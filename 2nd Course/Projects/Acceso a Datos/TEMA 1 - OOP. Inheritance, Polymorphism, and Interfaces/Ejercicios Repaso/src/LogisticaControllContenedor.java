import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class LogisticaControllContenedor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LogisticaAlmacen almacen1 = new LogisticaAlmacen((byte) 2);
        LogisticaAlmacen almacen2 = new LogisticaAlmacen((byte) 4);
        LogisticaAlmacen almacen3 = new LogisticaAlmacen((byte) 8);

        String accion;
        do {
            accion = teclado.nextLine();
            if (accion.equals("m")) // meter contenedor
                if (almacen1.hayHueco())
                    almacen1.meteContenedor();
                else if (almacen2.hayHueco())
                    almacen2.meteContenedor();
                else if (almacen3.hayHueco())
                    almacen3.meteContenedor();
                else
                    System.out.println("Hay que esperar a que vengan a quitar un contenedor");
            else // sacar contenedor

                if (almacen1.hayContenedor())
                    almacen1.sacaContenedor();
                else if (almacen2.hayContenedor())
                    almacen2.sacaContenedor();
                else if (almacen3.hayContenedor())
                    almacen3.sacaContenedor();
                else
                    System.out.println("Hay que esperar a que vengan a poner un contenedor");
        } while (!accion.equals("Salir"));
    }
}
