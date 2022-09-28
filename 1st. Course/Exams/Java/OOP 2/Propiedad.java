/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public abstract class Propiedad extends Casilla implements Comprable{
    protected final int precio;
    protected final int hipoteca;
    private int propietario;

    //   CONSTRUCTOR
    public Propiedad(String nombre, int precio, int hipoteca) {
        super(nombre);
        this.precio = precio;
        this.hipoteca = hipoteca;
        this.propietario = -1;
    }

    //  CONSTRUCTOR 2 sólo recibe el nombre como parametro
    public Propiedad(String nombre) {
        super(nombre);
        this.hipoteca = getHipoteca();
        this.precio = getPrecio();
    }


    //  MÉTODO ABSTRACTO
    public abstract int getALquiler(int modificacion);
    public abstract void mostrarInfo();



    //  GETTERS Y SETTERS
    public int getPrecio() {
        return precio;
    }

    public int getHipoteca() {
        return hipoteca;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }
}
