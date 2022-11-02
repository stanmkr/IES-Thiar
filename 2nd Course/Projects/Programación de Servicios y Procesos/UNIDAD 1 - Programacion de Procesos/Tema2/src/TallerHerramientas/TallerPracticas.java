package TallerHerramientas;

/**
 * Created by Stanislav Krastev
 * Tema2 - TallerHerramientas
 * Date: Octubre / 2022
 */
public class TallerPracticas {
    public static void main(String[] args) {
        // array de Hilos que serán objetos de la clase Alumno
        Thread[] alumnosEnPracticas = {new Thread(new Alumno("Juan")), new Thread(new Alumno("Pedro")),
                new Thread(new Alumno("Antonio")), new Thread(new Alumno("Francisco")),
                new Thread(new Alumno("Arturo"))};

        for (Thread alumno : alumnosEnPracticas) {
            alumno.start(); // ejecuto el Hilo
        }
    }
}
