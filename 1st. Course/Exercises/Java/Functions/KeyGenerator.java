import java.awt.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema7_Funciones - PACKAGE_NAME
 * Date: ENERO / 2022
 * <p>
 * Vamos a crear un programa Java para generar contraseñas seguras. Al programa se le pasarán como parámetros las opciones de generación de la contraseña.
 * La clase se llamará GeneradorClaves y admitirá los siguientes parámetros:
 * · Número de caracteres a generar. Este parámetro es obligatorio y siempre el primero.
 * · -M Parámetro opcional, nos indica que incorporemos mayúsculas en la contraseña (al menos 1)
 * · -n Parámetro opcional. Indica que la contraseña debe contener números (al menos 1)
 * · -s Parámetro opcional. Indica que la contraseña debe contener caracteres símbolos (al menos 1)
 * <p>
 * LETRAS PARA USAR
 * Letras en mayúsculas: A a Z (abcdefghijklmnopqrtsuvwxyz)
 * Letras en minúsculas: a a z (26 caracteres)
 * Números: 0 a 9 (10 caracteres)
 * Símbolos: ! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _` { | } ~ (32 caracteres)
 */
public class GeneradorClaves {
    public static void main(String[] entrada) {
        // Comprobamos que tenemos parámetros
        if (entrada.length == 0) {
            System.out.println("Numero de parametros incorrecto");
            System.out.println("El formato correcto es GeneradorClaves <longitud> [-M] [-n] [-s]");
        } else {
            int longitud = Integer.parseInt(entrada[0]);
            boolean conMayusculas = false, conNumeros = false, conSimbolos = false;
            for (int i = 1; i < entrada.length; i++) {
                switch (entrada[i]) {
                    case "-M" -> conMayusculas = true;
                    case "-n" -> conNumeros = true;
                    case "-s" -> conSimbolos = true;
                }
            }
            System.out.printf("Generando clave de %d caracteres.%n", longitud);
            if (conMayusculas) System.out.print("Con mayúsculas");
            if (conNumeros) System.out.print("\nCon números");
            if (conSimbolos) System.out.print("\nCon símbolos");
            System.out.println("\nClave generada: " + generarClave(longitud, conMayusculas, conNumeros, conSimbolos));
        }
    }

    public static String generarClave(int longitud, boolean mayusculas, boolean numeros, boolean simbolos) {
        String cadena = "";
        String clave = "";
        String minusc = "abcdefghijklmnopqrtsuvwxyz";
        String mayusc = minusc.toUpperCase();
        String simb = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String nums = "0123456789";
        int aleatorio; // para almacenar los aleatorios que se generaran
        cadena = cadena.concat(minusc); // siempre va a contener minusculas aunque no haya ningun parametro opcional


        if (mayusculas) { // comprobacion si mayusculas = true, añade 1 sola letra mayuscula
            cadena = cadena.concat(mayusc);
                aleatorio = ThreadLocalRandom.current().nextInt(0, mayusc.length());
                clave += mayusc.charAt(aleatorio);
                //clave = clave.concat(mayusc.substring(aleatorio, aleatorio + 1));
        }
        if (numeros) { // comprobacion si numeros = true, añade 1 solo digito
            cadena = cadena.concat(nums);
            aleatorio = ThreadLocalRandom.current().nextInt(0, nums.length());
            clave += nums.charAt(aleatorio);
            //clave = clave.concat(nums.substring(aleatorio, aleatorio + 1));
        }
        if (simbolos) { // comprobacion si simbolos = true, añade 1 solo simbolo
            cadena = cadena.concat(simb);
            aleatorio = ThreadLocalRandom.current().nextInt(0, simb.length());
            clave += simb.charAt(aleatorio);
            //clave = clave.concat(simb.substring(aleatorio, aleatorio + 1));

        }

        //añadiendo una letra minúscula
        aleatorio = ThreadLocalRandom.current().nextInt(0, minusc.length());
        clave += minusc.charAt(aleatorio);
        //clave = clave.concat(minusc.substring(aleatorio, aleatorio + 1));

        // rellenando con caracteres aleatorios de lo que contiene cadena, desde la longitud de clave hasta la longitud total que ha introducido el usuario
        for (int i = clave.length() + 1; i <= longitud; i++) {
            aleatorio = ThreadLocalRandom.current().nextInt(0, cadena.length());
            clave += cadena.charAt(aleatorio);
            //clave = clave.concat(cadena.substring(aleatorio, aleatorio + 1));
        }
        //devuelve la clave generada reordenada aleatoriamente gracias a la función
        return reordenarClave(clave);
    }

    /**
     * reordena aleatoriamente una cadena de texto que se le pasa como parametro
     * @param cadena lo que va a reordenar
     * @return devuelve un String copia del que se pasa como parámetro pero reordenado
     */
    public static String reordenarClave(String cadena) {
        String claveFinal = "";
        for (int i = 0; i < cadena.length(); i++) {
            if ((int) (Math.random() * 2) == 0) {
                claveFinal = claveFinal + cadena.charAt(i);
            } else {
                claveFinal = cadena.charAt(i) + claveFinal;
            }
        }
        return claveFinal;
    }
}
