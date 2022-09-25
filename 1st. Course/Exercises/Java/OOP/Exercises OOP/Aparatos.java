package ejercicios.ejerciciosTema8;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class Aparatos {
    public static double consumoTotal = 0;
    private String nombre;
    private int consumoIndividual;
    private boolean encendido;

    // CONSTRUCTOR
    public Aparatos(String nombre, int consumoIndividual) {
        this.nombre = nombre;
        this.consumoIndividual = consumoIndividual;
        apagar(); // por defecto, al crear un objeto de la clase, este tiene un estado apagado (encendido = false)

    }

    // METODOS

    /**
     * metodo de clase (static) que nos va a devolver el consumo total de todos los objetos creados
     * @return devuelve el consumo total
     */
    public static double consumoTotalWatios() {
        return consumoTotal;
    }

    /**
     * metodo que hace cambiar el estado de la variable booleana "encendido", comprueba antes, si encedido = true, entonces apaga y resta el consumo individual del objeto del consumo total... en caso de encedido = false, no hace nada ya que no puede apagar algo que ya esta apagado
     */
    void apagar() {
        if (encendido) {
            encendido = false;
            consumoTotal -= consumoIndividual;
        }
    }

    /**
     * lo mismo que el método apagar() pero enciende, comprueba si esta apagado, enciende, y suma el consumo individual del objeto que hemos encendido al consumo total de todos los objetos
     */
    void encender() {
        if (!encendido) {
            encendido = true;
            consumoTotal += consumoIndividual;
        }

    }
 // GETTER Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConsumoIndividual() {
        return consumoIndividual;
    }

    public void setConsumoIndividual(int consumoIndividual) {
        this.consumoIndividual = consumoIndividual;
    }


}