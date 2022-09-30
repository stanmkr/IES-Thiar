import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: septiembre / 2022
 */
public class MaquinaAutomataEuros {

    // ***************************************************
    // * Recoge monedas en 'maquina' para cobrar 'precio'.
// * Devuelve 'true'
    // * si el pago se ha realizado con exito y 'false' en
// * caso contrario
    // ****************************************************
    public static boolean introduccionMonedas(MaquinaModeloSencillo maquina, float precio) {
        String accion;
        char car;
        boolean pagado = false, anulado = false, cambioOK;
        float acumulado = 0;
        Scanner teclado = new Scanner(System.in);


        do {
            System.out.println("-- u,d,a --");
            accion = teclado.nextLine();
            car = accion.charAt(0);
            switch (car) {
                case 'u':
                    if (maquina.deposito1Euro.hayHueco()) {
                        maquina.deposito1Euro.meteElemento();
                        acumulado = acumulado + 1f;
                    } else System.out.println("Temporalmente esta maquina no acepta monedas de un euro");
                    break;
                case 'd':
                    if (maquina.deposito01Euro.hayHueco()) {
                        maquina.deposito01Euro.meteElemento();
                        acumulado = acumulado + 0.1f;
                    } else System.out.println("Temporalmente esta maquina no acepta monedas de 0.1 euros");
                    break;
                case 'a':
                    System.out.println("Operación anulada");
                    anulado = true;
                    break;
            }
            maquina.mostrarEstadoMaquina();
        } while (acumulado < precio || anulado);

        if (anulado) { // == true
            devolver(maquina, acumulado);
        }
        else if (cambioDisponible(maquina, acumulado - precio)) {
            devolver(maquina, acumulado - precio);
        } else {
            System.out.println("La maquina no dispone del cambio necesario");
            devolver(maquina, acumulado);
            anulado = true;
        }
        return (!anulado);
    }

    // **************************************************
// * Devuelve la cantidad de dinero indicada,
// * actualizando los almacenes de monedas
// **************************************************
    private static void devolver (MaquinaModeloSencillo maquina,float cantidad){
        int monedas1, monedas01;
        cantidad = cantidad + 0.01f; //Evita problemas de
//falta de precision
        monedas1 = (int) Math.floor((double) cantidad);
        cantidad = cantidad - (float) monedas1;
        monedas01 = (int) Math.floor((double) cantidad * 10f);
        for (int i = 1; i <= monedas1; i++) {
            maquina.deposito1Euro.sacaElemento();
            // Sacar 1 moneda de un euro
        }

        for (int i = 1; i <= monedas01; i++) {
            maquina.deposito01Euro.sacaElemento();
            // Sacar 1 moneda de 0.1 euro
        }
        System.out.println("Recoja el importe: " + monedas1 + " monedas de un euro y " + monedas01 + " monedas de 0.1 euros");
    }
    // ******************************************************
    // * Indica si es posible devolver 'cantidad' euros en 'maquina'
    // ******************************************************
    private static boolean cambioDisponible(MaquinaModeloSencillo maquina, float cantidad) {
        int monedas1, monedas01;

        cantidad = cantidad + 0.01f; //Evita problemas de falta de precision
        monedas1 = (int) Math.floor((double) cantidad);
        cantidad = cantidad - (float) monedas1;
        monedas01 = (int) Math.floor((double) cantidad * 10f);
        return (maquina.deposito1Euro.dimeNumeroDeElementos() >= monedas1) && (maquina.deposito01Euro.dimeNumeroDeElementos() >= monedas01);
   }
}
