package TallerHerramientas;

/**
 * Created by Stanislav Krastev
 * Tema2 - TallerHerramientas
 * Date: Octubre / 2022
 */
public class Alumno implements Runnable {
    private final String nombre;


    // CONSTRUCTOR
    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    /**
     * método RUN del hilo
     */
    @Override
    public void run() {
        while (true) {
            GestionHerramientas.gestionarAlumno(GestionHerramientas.herramientaAleatoria(), GestionHerramientas.herramientaAleatoria(), getNombre());
            try {
                // una vez que el hilo ha terminado, se ejecuta un tiempo de descanso aleatorio (entre 1 y 2 segundos)
                Thread.sleep(GestionHerramientas.tiempoDescanso());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}
