package TallerHerramientas;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev
 * Tema2 - TallerHerramientas
 * Date: Octubre / 2022
 */
public class GestionHerramientas {
    static int herramientaAleatoria() {
        return ThreadLocalRandom.current().nextInt(10);
    }


    static int tiempoUsandoHerramienta() {
        return ThreadLocalRandom.current().nextInt(2000, 4000);
    }

    static int tiempoDescanso() {
        return ThreadLocalRandom.current().nextInt(1000, 3000);
    }

    public static void gestionarAlumno(int numeroAleatorio1, int numeroAleatorio2, String nombreAlumno) {
        Herramienta[] herramientas = new Herramienta[2]; // array de objeto Herramienta de 2 posiciones para guardar una herramienta aleatoria sacada del banco de herramientas
        herramientas[0] = Herramienta.bancoHerramientas[numeroAleatorio1];
        herramientas[1] = Herramienta.bancoHerramientas[numeroAleatorio2];

        if (numeroAleatorio1 == numeroAleatorio2) { // en caso de que la segunda herramienta sacada del banco es la misma que la primera se vuelve a sacar una herramienta del banco hasta que las dos herramientas sean distintas
            do {
                numeroAleatorio2 = herramientaAleatoria(); // número aleatorio en el rango de la longitud del banco de herramientas
                herramientas[1] = Herramienta.bancoHerramientas[numeroAleatorio2];
            } while (numeroAleatorio1 == numeroAleatorio2);
        }
        Herramienta mayor, menor;
        if (herramientas[0].getId() < herramientas[1].getId()) {
            mayor = herramientas[1];
            menor = herramientas[0];
        }else {
            menor = herramientas[1];
            mayor = herramientas[0];
        }

        synchronized (mayor) { // sincronizo el 1er objeto Herramienta
            synchronized (menor) { // sincronizo el 2º objeto Herramienta
                System.out.println("El alumno " + nombreAlumno + " esta usando las herramientas " + menor.getNombre() + " y " + mayor.getNombre());
                try {
                    Thread.sleep(GestionHerramientas.tiempoUsandoHerramienta()); // una vez que el hilo ha terminado, se ejecuta un tiempo de espera aleatorio (entre 2 y 3 segundos)
                    System.out.println("El alumno " + nombreAlumno + " ha terminado con las herramientas.");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
