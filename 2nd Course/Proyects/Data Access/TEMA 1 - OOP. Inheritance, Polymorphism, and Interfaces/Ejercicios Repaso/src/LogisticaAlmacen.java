/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */


public class LogisticaAlmacen {
    private byte capacidad;
    private byte numeroDeHuecos;

    LogisticaAlmacen(byte capacidad) {
        this.capacidad = capacidad;
        numeroDeHuecos = capacidad;
    }

    // GETTERS
    public byte dimeNumeroDeHuecos() {
        return (numeroDeHuecos);
    }

    public byte dimeCapacidad() {
        return (capacidad);
    }

    public boolean hayHueco() {
        return (numeroDeHuecos != 0);
    }

    public boolean hayContenedor() {
        return (numeroDeHuecos != capacidad);
    }

    public void meteContenedor() {
        numeroDeHuecos--;
    }

    public void sacaContenedor() {
        numeroDeHuecos++;
    }

}


