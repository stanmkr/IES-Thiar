package Ejercicio_3;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Herencia
 * FECHA: Octubre / 2022
 */
public class PruebaPeriodico3 {
    public static void main(String[] args) {
        // instaciación de 4 objetos Periódico3


        // usando CONSTRUCTOR por defecto sin parámetros
        Periodico3 p1  = new Periodico3();

       // usando CONSTRUCTOR que solo inicializa las propiedades de la subclase
        Periodico3 p2 = new Periodico3("El mundo","25/09/2012");

        // usando CONSTRUCTOR que solo inicializa las propiedades de la superclase
        Periodico3 p3 = new Periodico3(64,0.9f);

        // usando el constructor nos permita inicializar todas las propiedades
        //de la subclase y la superclase
        Periodico3 p4 = new Periodico3("El País","27/09/2012",45,0.9f);

        // usando el método imprimir de la clase para mostrar información del objeto
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();

    }
}
