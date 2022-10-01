/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Personajes_main {
    public static void main(String[] args) throws Exception {

        Mago miMago = new Mago("pepe",3);
        Mago miMag2 = new Mago("pepe",3);
        Mago miMag3 = new Mago("Juan",3);
        Grupo mi_grupo = new Grupo();

        System.out.println(mi_grupo.incluirPersonaje(miMag2));
        System.out.println(mi_grupo.incluirPersonaje(miMag2));
        System.out.println(miMag2.getClass());

        System.out.println(mi_grupo.getMiembro("Pepe"));
        System.out.println(mi_grupo.getMiembro("pepe"));


    }
}
