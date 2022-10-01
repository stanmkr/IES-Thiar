/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Troll extends Personaje{


    public static  int numeroTrolls=1;
    private static final String nombre ="Troll_"  ;

    //  CONSTRUCTORES
    public Troll() {
        super(nombre + numeroTrolls++); // aumento el trol +1

    }


    //  MÉTODOS heredados
    @Override
    public boolean retirarse() throws Exception {
        throw new Exception("Un trol no puede retirarse");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
