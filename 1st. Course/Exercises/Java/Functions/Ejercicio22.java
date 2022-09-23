
/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: Diciembre / 2021
 * <p>
 * Crea las siguientes funciones matemáticas:
 * 1. masPrimo: Devuelve el siguiente menor primo que es mayor a un número que se le pasa como parámetro
 * 2. dígitos: Devuelve el número de dígitos que tiene un número que se le pasa como parámetro
 * 3. digitoN: Devuelve el dígito en la posición n de un número entero que se le pasa como parámetro. Si no lo encuentra devuelve -1
 * 4. posicionDigito: Devuelve la primera posición de un dígito en un número entero. Devuelve -1 si no lo encuentra
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        //System.out.println(masPrimo(12421));
       // //System.out.println(digitos(12421));
       //System.out.println(digitoN(3462,2));
        //System.out.println(digitoN(12345, 2) + digitoN(12345, 5));
        System.out.println(posicionDigito(23745,6));
    }

    /**
     * la función devuelve el siguiente número primo que procede al número introducido como parámetro
     *
     * @param num es el número a partir del cual se comprobará cuál es el siguiente primo
     * @return devuelve el siguiente primo inmediato que procede después del parámetro introducido
     */
    public static int masPrimo(int num) {
        int primo = 0;
        boolean noPrimo = true;
        while (noPrimo) {
            int divisores = 0;
            num++;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                primo = num;
                noPrimo = false;
            }
        }
        return primo;
    }

    /**
     * comprueba la cantidad de dígitos que contiene un número introducido como parámetro
     *
     * @param num el número a comprobar sus dígitos
     * @return devuelve la cantidad de dígitos
     */
    public static int digitos(double num) {
        int numDigitos = 0;
        char punto = '.';
        String cadena = String.valueOf(num);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != punto) {
                numDigitos++;
            } else {
                if (cadena.charAt(i + 1) == '0') {
                    numDigitos--;
                }
            }
        }
        return numDigitos;
    }

    /**
     * comprueba si la posicion recibida se encuentra dentro de la longitud del número introducido y devuelve el dígito de dicha posición o -1 si está fuera de rango
     *
     * @param num      numero a introducir
     * @param posicion la posición de la que queremos ver el dígito del número a introducir
     * @return devuelve el dígito que se encuentra en la posición introducida como parámetro, o en caso de no encontrarlo(estar fuera de rango) devuelve -1
     */
    public static int digitoN(int num, int posicion) {

        posicion -= 1;
        String parametro = String.valueOf(num);
        if (posicion > parametro.length() || posicion < 0) {
            return -1;
        } else {
            return Integer.parseInt(String.valueOf(parametro.charAt(posicion))) ;
        }
    }

    /**
     * busca un dígito dentro de un número introducido
     *
     * @param numero el número
     * @param digito el dígito a buscar
     * @return si encuentra el dígito, lo devuelve, si no lo encuentra, devuelve -1
     */
    public static int posicionDigito(int numero, int digito) {
        String num = String.valueOf(numero);
        String dig = String.valueOf(digito);
        if (num.contains(dig)) {
            return (num.indexOf(dig) + 1); // devuelve el índice del dígito encontrado y le suma +1 al índice para convertirlo en la posición
        } else {
            return (num.indexOf(dig)); // si no lo encuentra devolverá -1 por defecto, ya que asi funciona el método indexoF()
        }

    }
}
