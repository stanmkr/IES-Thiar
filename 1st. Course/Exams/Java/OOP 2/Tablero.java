import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Tablero {
    private ArrayList<Casilla> casillas;

    //  CONSTRUCTOR
    public Tablero(ArrayList<Casilla> casillas) {
        this.casillas = casillas;
        casillas = new ArrayList<>();

        Terreno t = new Terreno("Terreno verde",50000,80000,400, Casilla.ColorTerreno.VERDE);
        Terreno t2 = new Terreno("Terreno paraiso",55000,85000,500, Casilla.ColorTerreno.VERDE);
        Estaciones es1 = new Estaciones("Norte");
        Terreno t3 = new Terreno("Terreno infierno",90000,120000,900, Casilla.ColorTerreno.ROJO);
        Estaciones es2 = new Estaciones("Sur");
        this.casillas.add(t);
        this.casillas.add(t2);
        this.casillas.add(es1);
        this.casillas.add(t3);
        this.casillas.add(es2);

    }

    //  MÉTODOS
    public void mostrarTablero(){
        for (Casilla p:casillas) {
                p.mostrarInfo();
            System.out.println();
        }
    }

    //  recorrerá el tablero y devolverá un ArrayList de los terrenos del jugador que se la pasa como parámetro.
    public ArrayList<Terreno> listaTerrenos(int jugador){
       ArrayList<Terreno> lista = new ArrayList<>();
       for (Casilla c : casillas){
           if (c instanceof Terreno){
               Terreno t = (Terreno) c;
               if (((Terreno) c).getPropietario()==jugador){
                   lista.add(t);
               }
           }
       }
        return null;
    }



}
