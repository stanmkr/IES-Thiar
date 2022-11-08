package Ejercicio8;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class PruebaEjercicio8 {
    public static void main(String[] args) {
        NumberDivision.divisionStrings("sda","0");
        System.out.println();
        NumberDivision.divisionStrings("21","sa");
        System.out.println();
        NumberDivision.divisionStrings("50","0");
        System.out.println();
        NumberDivision.divisionStrings("0","20");
    }
}

class NumberDivision {
    static void divisionStrings(String string1, String string2) {
        try {
            int s1 = Integer.parseInt(string1);
            try {
                int s2 = Integer.parseInt(string2);
                System.out.println(s1/s2);
            } catch (ArithmeticException e) {
                System.out.println("No es posible dividir entre 0");
            }
        } catch (NumberFormatException e) {
            System.out.println("No puedes parsear letras, son necesarios números");
        }


    }
}
