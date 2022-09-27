package Ejercicio6_Astros;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio6_Astros
 * Date: Febrero / 2022
 */
public class Satelite extends Astros {
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private Planeta planeta;


    //  CONSTRUCTOR
    public Satelite(String nombre, double radio, double rotacionEje, double masa, double tempMedia, double gravedad, double distanciaPlaneta, double orbitaPlanetaria, Planeta planeta) {
        super(nombre, radio, rotacionEje, masa, tempMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planeta = planeta;
    }

    //  MéTODOS
    @Override
    public void muestra() {
        System.out.println("*** SATÉLITE " + getNombre() + " ***");
        System.out.println("Radio            : " + getRadio());
        System.out.println("Rotación eje     : " + getRotacionEje());
        System.out.println("Masa:            : " + getMasa());
        System.out.println("Temperatura media: " + getTempMedia());
        System.out.println("Gravedad         : " + getGravedad());
        System.out.println("Distancia planeta: " + distanciaPlaneta);
        System.out.println("Órbita al planeta: " + orbitaPlanetaria);
        System.out.println("Pertenece planeta: " + planeta.getNombre());
    }


    //  GETTERS Y SETTERS

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
}
