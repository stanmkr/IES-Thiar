import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Casilla> casillasDelJuego = new ArrayList<>();
        Tablero tablero = new Tablero(casillasDelJuego);


        Casilla casilla1 = new Casilla("mi casilla");
        Casilla casilla2 = new Casilla("mi casilla2");
        Estaciones prueba = new Estaciones("Oeste");
        Terreno t = new Terreno("Mi terreno", 200, 20000, 500, Casilla.ColorTerreno.AMARILLO);
        Terreno t2 = new Terreno("Mi segundo terreno", 200, 20000, 500, Casilla.ColorTerreno.AMARILLO);
        Casilla c1 = new Casilla("Casilla");
        Casilla c2 = new Casilla("Casilla2");
        casillasDelJuego.add(c1);
        casillasDelJuego.add(c2);
        casillasDelJuego.add(prueba);
        casillasDelJuego.add(t);
        casillasDelJuego.add(t2);
        tablero.mostrarTablero();
        t2.comprar(3);
        t2.comprar(3);



    }
}
