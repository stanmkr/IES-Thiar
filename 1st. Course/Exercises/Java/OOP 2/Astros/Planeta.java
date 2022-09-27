package Ejercicio6_Astros;

import java.util.ArrayList;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicio6_Astros
 * Date: Febrero / 2022
 */
public class Planeta extends Astros {

    private double distanciaSol;
    private double orbitaSol;
    private boolean tieneSatelites;
    private ArrayList<Satelite> satelites;

    //  CONSTRUCTOR
    public Planeta(String nombre, double radio, double rotacionEje, double masa, double tempMedia, double gravedad, double distanciaSol, double orbitaSol, boolean tieneSatelites, ArrayList<Satelite> satelites) {
        super(nombre, radio, rotacionEje, masa, tempMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
        this.satelites = satelites;
    }

    // constructor SIN satélites ... posteriormente se podrían añadir satélites con el método correspondiente
    public Planeta(String nombre, double radio, double rotacionEje, double masa, double tempMedia, double gravedad, double distanciaSol, double orbitaSol) {
        super(nombre, radio, rotacionEje, masa, tempMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = false;
        this.satelites = new ArrayList<Satelite>();
    }



    //  MÉTODOS
    @Override
    public void muestra() {
        System.out.println("*** PLANETA " + this.getNombre() + " ***");
        System.out.println("Radio            : " + this.getRadio());
        System.out.println("Rotación eje     : " + this.getRotacionEje());
        System.out.println("Masa:            : " + this.getMasa());
        System.out.println("Temperatura media: " + this.getTempMedia());
        System.out.println("Gravedad         : " + this.getGravedad());
        System.out.println("Distancia al sol : " + distanciaSol);
        System.out.println("Órbita al sol    : " + orbitaSol);
        System.out.println("Tiene satélites  : " + tieneSatelites);
        if (tieneSatelites){
            for (int i = 0; i <getSatelites().size() ; i++) {
                System.out.println("Satélite " + i + ": " + getSatelites().get(i).getNombre());
            }
        }
    }


    // añade un satélite al arraylist de satélites
    public void anyadirSatelite(Satelite satelite){
        satelites.add(satelite);
        this.tieneSatelites=true;
    }

    //  GETTERS Y SETTERS

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    public void setSatelites(ArrayList<Satelite> satelites) {
        this.satelites = satelites;
    }
}
