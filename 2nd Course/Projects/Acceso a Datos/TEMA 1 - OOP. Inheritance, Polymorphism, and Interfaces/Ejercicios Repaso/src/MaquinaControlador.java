import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class MaquinaControlador {
    public static void main(String[] args) {
        String accion;
        char car;
        Scanner teclado = new Scanner(System.in);

        MaquinaModeloSencillo miMaquina = new MaquinaModeloSencillo();
        miMaquina.ponPrecios(1.1f, 1.3f, 0.8f);
        miMaquina.deposito1Euro.meteElemento();
        miMaquina.deposito01Euro.meteElemento();
        miMaquina.deposito01Euro.meteElemento();
        miMaquina.depositoCocaCola.rellenaAlmacen();
        miMaquina.depositoNaranja.rellenaAlmacen();
        //miMaquina.Deposito1Euro.rellenaAlmacen(); No nos ha llegado el suministro de agua

        do {
            System.out.println("-- c,n,a,s --");
            accion = teclado.nextLine();
            car = accion.charAt(0);
            switch (car) {
                case 'c':
                    System.out.println("Ha seleccionado Coca cola");
                    if (miMaquina.depositoCocaCola.hayElemento()) {
                        if (MaquinaAutomataEuros.introduccionMonedas
                                (miMaquina, miMaquina.dimePrecioCocaCola())) {
                            miMaquina.depositoCocaCola.sacaElemento();
                            System.out.println("No olvide coger su cocacola");
                            // Sacar fisicamente la CocaCola
                        }
                    } else
                        System.out.println("Producto agotado");
                    break;
                case 'n':
                    System.out.println("Ha seleccionado Naranja");
                    if (miMaquina.depositoNaranja.hayElemento()) {
                        if (MaquinaAutomataEuros.introduccionMonedas
                                (miMaquina, miMaquina.dimePrecioNaranja())) {
                            miMaquina.depositoNaranja.sacaElemento();
                            System.out.println("No olvide coger su naranja");
                            // Sacar fisicamente la Naranja
                        }
                    } else
                        System.out.println("Producto agotado");
                    break;
                case 'a':
                    System.out.println("Ha seleccionado Agua");
                    if (miMaquina.depositoAgua.hayElemento()) {
                        if (MaquinaAutomataEuros.introduccionMonedas
                                (miMaquina, miMaquina.dimePrecioAgua())){
                            miMaquina.depositoAgua.sacaElemento();
                            System.out.println("No olvide coger su agua");
                            // Sacar fisicamente el agua
                        }
                    } else
                        System.out.println("Producto agotado");
                    break;
                default:
                    System.out.println("Error de seleccion, intentelo de nuevo");
                    break;
            }
            miMaquina.mostrarEstadoMaquina();

        } while (!accion.equals("s"));
    }
}
