/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Mago extends Personaje {

    //  CONSTRUCTOR
    public Mago(String nombre, int fuerza) {
        super(nombre);
        if (comprobarFuerza(fuerza)) {
            this.fuerza = fuerza;
        } else {
            this.fuerza = Mago.FUERZA_PORDEFECTO;
        }
    }

    //  MÉTODOS
    @Override
    /**
     * Método abstracto de Personaje. Un mago puede retirarse si está herido y no está muerto, entonces el método devolverá verdadero.
     * Si está muerto lanzará una Exception con el mensaje
     * "El mago está muerto". Si no está herido, lanzará una Exception con el mensaje "El mago no está herido"
     */
    public boolean retirarse() throws Exception {
        if (!isMuerto() && isHerido()){
            return true;
        } else if (isMuerto()) {
            throw new Exception("El mago está muerto");
        } else if (!isHerido()) {
            throw new Exception("El mago no está herido");
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "El mago " + getNombre() + " tiene una fuerza de " + this.fuerza + " puntos";
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
