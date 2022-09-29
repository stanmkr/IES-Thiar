/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ejercicio_6 {
    public static void main(String[] args) throws Exception {

        Gato miGato = new Gato("El gato juan", 3);
        try {
            Gato miGato2 = new Gato("Ño", 2);
        }catch (Exception e){
            e.printStackTrace();
        }
        miGato.imprimir();
        miGato.setNombre("je");

    }

}
