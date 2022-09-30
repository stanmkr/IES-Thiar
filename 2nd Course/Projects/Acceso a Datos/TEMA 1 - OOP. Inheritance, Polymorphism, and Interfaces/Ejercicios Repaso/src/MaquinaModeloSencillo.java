/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class MaquinaModeloSencillo {
    public MaquinaAlmacen deposito1Euro = new MaquinaAlmacen((short) 8);
    public MaquinaAlmacen deposito01Euro = new MaquinaAlmacen((short) 15);

    public MaquinaAlmacen depositoCocaCola = new MaquinaAlmacen((short) 10);
    public MaquinaAlmacen depositoNaranja = new MaquinaAlmacen((short) 5);
    public MaquinaAlmacen depositoAgua = new MaquinaAlmacen((short) 8);

    private float precioCocaCola = 1.0f;
    private float precioNaranja = 1.3f;
    private float precioAgua = 0.6f; //precio recomendado

    public void ponPrecios(float cocaCola, float naranja, float agua) {
        precioCocaCola = cocaCola;
        precioNaranja = naranja;
        precioAgua = agua;
    }

    public float dimePrecioCocaCola() {
        return precioCocaCola;
    }

    public float dimePrecioNaranja() {
        return precioNaranja;
    }

    public float dimePrecioAgua() {
        return precioAgua;
    }

    public void mostrarEstadoMaquina() {
        System.out.print("CocaColas: " +
                depositoCocaCola.dimeNumeroDeElementos() + " ");

        System.out.print("Naranjas: " +
                depositoNaranja.dimeNumeroDeElementos() + " ");
        System.out.println("Agua: " +
                depositoAgua.dimeNumeroDeElementos() + " ");

        System.out.print("1 Euro: " +
                deposito1Euro.dimeNumeroDeElementos() + " ");
        System.out.println("0.1 Euro: " +
                deposito01Euro.dimeNumeroDeElementos() + " ");
        System.out.println();
    }
}
