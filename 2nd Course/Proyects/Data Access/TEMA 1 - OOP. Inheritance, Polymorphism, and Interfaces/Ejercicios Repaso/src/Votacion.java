/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class Votacion {
    // persona a la que se vota en esta instancia y el numero de votos que lleva
    private String persona = null;
    private int votos = 0;
    //cometario

    // persona más votada de todas las instancias y el numero
    // de votos que lleva
    static private int votosMasVotado = 0;
    static private String personaMasVotada = null;

    // Constructor
    Votacion(String persona) {
        this.persona = persona;
    }

    // Se invoca cada vez que alguien vota a persona
    public void voto() {
        votos++;
        if (votos > votosMasVotado) {
            personaMasVotada = persona;
            votosMasVotado = votos;
        }
    }

    // Devuelve el nombre de persona
    public String nombrePersona() {
        return persona;
    }

    // Devuelve el numero de votos de persona
    public int votos() {
        return votos;
    }


    // Devuelve el nombre de la persona mas votada
    static public String nombreDelMasVotado() {
        return personaMasVotada;
    }

    // Devuelve el numero de votos de la persona mas votada
    static public int votosDelMasVotado() {
        return votosMasVotado;
    }
}
