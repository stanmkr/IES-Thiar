package pspT2.ejemplos._1_lanzaHilos;

import java.util.Random;

class Hilo2 implements Runnable {

    private final String nombre;

    Hilo2(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int pausa = new Random().nextInt(500);
        System.out.println("Hola, soy " + nombre + " con pausa de " + pausa);
        try {
            Thread.sleep(pausa);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.printf("Hilo %s terminado.\n", nombre);
    }

}

public class LanzaHilos2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ArrayList<Thread> arrayHilos = new ArrayList<>();
        Thread[] arrayHilos = new Thread[10];
        for (int i = 0; i < arrayHilos.length; i++) {
            arrayHilos[i] = new Thread(new Hilo2("Hilo " + i));
            arrayHilos[i].start();
        }

        for (Thread hilo : arrayHilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println("Proceso interrumpido");
            }
        }
        System.out.println("Proceso principal terminado");
    }

}
