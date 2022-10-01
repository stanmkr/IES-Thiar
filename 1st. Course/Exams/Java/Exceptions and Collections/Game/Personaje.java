/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Personaje implements Comparable{

    private final String nombre;
    protected int fuerza;
    private boolean herido=false,muerto=false;

    public static final int FUERZA_PORDEFECTO=5;

    public Personaje(String nombre) {
        this.nombre=nombre;

    }



    abstract public boolean retirarse() throws Exception;

    /**
     * Comrprueba si un valor es correcto para el atributo fuerza >=1 y <=10
     * @param f fuerza a establecer
     * @return
     */
    public static boolean comprobarFuerza(int f) {
        return f<=10 && f>=1;
    }
    /**
     * Establece un valor aleatorio para el atributo fuerza
     */
    protected void setFuerzaAleatoria() {
        this.fuerza=ThreadLocalRandom.current().nextInt(1, 11);
    }

    // Getters y Setters
    public int getFuerza() {
        return fuerza;
    }
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    public boolean isHerido() {
        return herido;
    }
    public void setHerido(boolean herido) {
        this.herido = herido;
    }
    public boolean isMuerto() {
        return muerto;
    }
    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
    public String getNombre() {
        return nombre;
    }


    @Override
    public String toString() {
        return nombre+" "+fuerza;
    }


}