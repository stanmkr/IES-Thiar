package TallerHerramientas;

/**
 * Created by Stanislav Krastev
 * Tema2 - TallerHerramientas
 * Date: Octubre / 2022
 */
public class Herramienta {
    private final String nombre;
    static final Herramienta[] bancoHerramientas = {new Herramienta("Llave inglesa"),
            new Herramienta("Destornillador plano"), new Herramienta("Alicates"),
            new Herramienta("Sierra"), new Herramienta("Martillo"),
            new Herramienta("Nivel"), new Herramienta("Taladro"),
            new Herramienta("Destornillador estrella"), new Herramienta("Soldador"),
            new Herramienta("Serrucho")};

    // CONSTRUCTOR
    public Herramienta(String nombre) {
        this.nombre = nombre;
    }

    // GETTER
     public String getNombre() {
        return nombre;
    }
}
