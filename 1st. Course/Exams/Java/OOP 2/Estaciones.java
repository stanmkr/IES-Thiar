/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Estaciones extends Propiedad {
    private static final int VALOR_ESTACION = 10000;

    //  CONSTRUCTOR
    public Estaciones(String nombre) {
        super(nombre);
    }


    @Override
    public int getALquiler(int modificacion) {
        return VALOR_ESTACION / modificacion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("*** ESTACIÓN ***");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Valor de la estación: " + VALOR_ESTACION);
    }

    // método del interface
    @Override
    public void comprar(int i) {
        if (this.getPropietario() == -1){
            this.setPropietario(i);
            System.out.println("Has comprado la propiedad");
        }else {
            System.out.println("La propiedad esta ocupada.");
        }
    }
}
