package ejercicios.ejerciciosTema8;

/**
 * Created by Stanislav Krastev 1º DAM
 * Programación - ejercicios.ejerciciosTema8
 * Date: FEBRERO / 2022
 */
public class EjemplarLibroPRUEBAS {
    public static void main(String[] args) {
        EjemplarLibro l1 = new EjemplarLibro("Quijote");
        EjemplarLibro l2 = new EjemplarLibro("50 sombras de Grey");
        EjemplarLibro l3 = new EjemplarLibro(l1);
        EjemplarLibro l4 = new EjemplarLibro(l3);
        l1.Prestar();

        if (l1.Prestar()){
            System.out.println("El libro esta prestado");
        }else {
            System.out.println("ERROR al prestar el libro");
        }
        System.out.println(l4);
    }
}
