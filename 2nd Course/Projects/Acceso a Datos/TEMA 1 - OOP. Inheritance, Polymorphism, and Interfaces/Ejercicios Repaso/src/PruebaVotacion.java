/**
 * Created by Stanislav Krastev
 * TEMA 1 - POO, Herencia, Polimorfismo e Interfaces - PACKAGE_NAME
 * Date: Septiembre / 2022
 */
public class PruebaVotacion {
    public static void main(String[] args) {

        System.out.println(Votacion.nombreDelMasVotado() +
                ": " + Votacion.votosDelMasVotado());

        // Tenemos tres candidatos en esta votacion
        Votacion juan = new Votacion("juan Peire");
        Votacion ana = new Votacion("ana Garcia");
        Votacion adela = new Votacion("adela Sancho");

        // empieza la votacion
        juan.voto();
        ana.voto();
        ana.voto();
        ana.voto();

        adela.voto();
        System.out.println(Votacion.nombreDelMasVotado() +
                ": " + Votacion.votosDelMasVotado());

        juan.voto();
        juan.voto();
        juan.voto();
        adela.voto();
        System.out.println(Votacion.nombreDelMasVotado() +
                ": " + Votacion.votosDelMasVotado());

        adela.voto();
        adela.voto();
        ana.voto();
        ana.voto();
        System.out.println(Votacion.nombreDelMasVotado() +
                ": " + Votacion.votosDelMasVotado());

        System.out.println(juan.nombrePersona() + ": " +
                juan.votos());
        System.out.println(ana.nombrePersona() + ": " +
                ana.votos());
        System.out.println(adela.nombrePersona() + ": " +
                adela.votos());

    }
}
