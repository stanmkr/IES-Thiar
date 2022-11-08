package Ejercicio6;

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre / 2022
 */
public class Excepcion6 {
    public static void main(String[] args) {
        int num[]= {4,8,16,32,64,128,256,512};
        int den[]= {2,0,4,4,0,8};
        try
        {
            for (int i=0;i<num.length;i++)
            {
                try //try interno
                {
                    System.out.println(num[i]+"/"+den[i]+"="+ num[i]/den[i]);
                }
                catch (ArithmeticException e)
                {
                    System.out.println("División por cero "+ i);
                }
            }
        } //try externo
        catch (Throwable ex)
        {
            System.out.println("Ha ocurrido una excepción fatal ");
        }
        System.out.println("El programa continue aquí");
    }
}
