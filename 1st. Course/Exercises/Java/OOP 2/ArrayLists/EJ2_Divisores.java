package Ejercicios_ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev 1º DAM
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date:  Febrero / 2022
 */
public class EJ2_Divisores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número para ver sus divisores: ");
        int numero = scanner.nextInt();
        System.out.println(divisores(numero));
    }

    public static ArrayList<Integer> divisores (int numero){
        ArrayList<Integer> listaDivisores = new ArrayList<Integer>();
        for (int i = 1; i <=numero ; i++) {
            if (numero % i == 0){
                listaDivisores.add(i);
            }
        }
        return listaDivisores;
    }
}
