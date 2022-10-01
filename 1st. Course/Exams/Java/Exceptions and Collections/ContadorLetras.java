import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by Stanislav Krastev
 * examenTema10_11 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class ContadorLetras {
    public static void main(String[] args) {
        String frase = "Decir que Java es estupendo porque funciona con todos los sistemas operativos es como decir que el sexo anal es estupendo porque funciona con todos los géneros (Alanna)";
        HashMap<String, Integer> contador = new HashMap<>();
        char [] a = frase.toCharArray();

        for (int i = 0; i <frase.length() ; i++) {
            contador.put(String.valueOf(frase.charAt(i)),0);
        }



        for (Character k: a) {
            contador.put(String.valueOf(k),contador.get(String.valueOf(k))+1);

        }

        for (String e:contador.keySet()) {
            System.out.println(e +" :"+contador.get(e));
        }


    }

}
