/**
 * Created by Stanislav Krastev
 * Practica 2 - Excepciones - PACKAGE_NAME
 * Date: Noviembre / 2022
 */
public class Piscina {
    private int nivel;
    public final int MAX_NIVEL;

    // CONSTRUCTOR
    public Piscina(int max) {
        if (max < 0) max = 0;
        MAX_NIVEL = max;
    }

    // MÉTODOS
    public void vaciar(int cantidad) throws Exception {
        if (cantidad > nivel) {
            throw new Exception("Intentando vaciar " + cantidad + " litros. No queda agua suficiente. Se queda con " + this.nivel + " litros.");
        } else {
            nivel = nivel - cantidad;
        }
    }

    public void llenar(int cantidad) throws Exception {
        if (cantidad + nivel > MAX_NIVEL) {
            throw new Exception("Intentando llenar " + cantidad + " litros. Se desborda con tanta agua. Se queda con " + this.nivel + " litros.");
        }
        nivel = nivel + cantidad;
    }


    // GETTER
    public int getNivel() {
        return nivel;
    }

}
