
package Ejercicio2;
/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: Ejercicios Exepciones 1
 * FECHA: Noviembre2 / 2022
 */
public class PruebaExcepcion2{
    public static void main (String args[]){
        Excepcion2 objeto =new Excepcion2();
        objeto.miMetodo();
    }

}
class Excepcion2{
    void miMetodo(){
        int numero[]=new int[5];
        try{
            System.out.println("Accediendo a una posicion fuera del vector");
            numero[7]=0;
        }
        catch (ArrayIndexOutOfBoundsException excep)
        {
            System.out.println ("Ocurrió una excepcion");
        }
    }
}

/*
¿En qué método se genera la excepción?
    En el método main();

¿Qué método la captura?
    miMetodo();

¿Vuelve el control del programa al main, después de la captura?
    Sí, después de capturar la expeción el programa sigue en curso, pero no tiene más líneas de código
 */