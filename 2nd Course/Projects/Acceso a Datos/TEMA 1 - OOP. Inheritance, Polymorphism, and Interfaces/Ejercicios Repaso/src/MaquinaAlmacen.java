/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class MaquinaAlmacen {
    private short capacidad;
    private short numeroDeElementos = 0;

    MaquinaAlmacen(short capacidad) {
        this.capacidad = capacidad;
    }

    // GETTERS
    public short dimeNumeroDeElementos() {
        return (numeroDeElementos);
    }

    public short dimeCapacidad() {
        return (capacidad);
    }

    public boolean hayElemento() {

        return (numeroDeElementos != 0);
    }

    public boolean hayHueco() {
        return (numeroDeElementos != capacidad);
    }

    public void meteElemento() {
        numeroDeElementos++;
    }

    public void sacaElemento() {
        numeroDeElementos--;
    }

    public void rellenaAlmacen() {
        numeroDeElementos = capacidad;
    }
}
