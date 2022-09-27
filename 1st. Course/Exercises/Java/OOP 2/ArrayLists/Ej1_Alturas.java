package Ejercicios_ArrayLists;

import java.util.*;

/**
 * Created by Stanislav Krastev
 * Tema9_OOP_2 - Ejercicios_ArrayLists
 * Date: febrero / 2022
 */
public class Ej1_Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        // lista en la que se va a guardar altura de distintos alumnos
        ArrayList<Double> alturaAlumno = new ArrayList<Double>();
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: // añadir valor
                    double altura = 0;
                    do {
                        System.out.print("Escribe la altura para añadirla (rango: 0,50 - 2,50): ");
                        altura = scanner.nextDouble();
                        if (alturaCorrecta(altura)) {
                            alturaAlumno.add(altura);
                        } else {
                            System.out.println("El rango no es válido, vuelve a introducir la altura. ");
                        }
                    } while (!alturaCorrecta(altura));
                    break;

                case 2: // imprimir lista con su posicion
                    System.out.println("\nLISTA ACTUAL~~~~~~");
                    for (int i = 0; i < alturaAlumno.size(); i++) {
                        System.out.println("Posición: " + i + " --> Altura: " + alturaAlumno.get(i));
                    }
                    break;
                case 3: // eliminar posicion
                    int posicion;
                    int longitud = alturaAlumno.size() - 1;
                    do {
                        System.out.print("Elige la posición que quieres eliminar: ");
                        posicion = scanner.nextInt();
                        if (posicion > alturaAlumno.size() - 1 || posicion < 0) {
                            System.out.println("Número de posición incorrecto, vuelve a introducir la posición.");
                        } else {
                            System.out.println("La posición " + posicion + " con valor " + alturaAlumno.get(posicion) + " ha sido eliminada ");
                            alturaAlumno.remove(posicion);
                        }
                    } while (posicion > longitud || posicion < 0);
                    break;
                case 4: // eliminar por valor
                    double valor;
                    int eliminaciones = 0;
                    System.out.print("Elige el valor que quieres eliminar: ");
                    valor = scanner.nextDouble();
                    if (!alturaAlumno.contains(valor)) {
                        System.out.println("El valor no se encuentra en la lista");
                        break;
                    }
                    while (alturaAlumno.contains(valor)) {
                        alturaAlumno.remove(valor);
                        eliminaciones++;
                    }
                    System.out.println("Cantidad de eliminaciones: " + eliminaciones);
                    break;
                case 5: // ordenar lista
                    Collections.sort(alturaAlumno);
                    System.out.println("LISTA ORDENADA CORRECTAMENTE.");
                    System.out.println("Mostrando lista: ");
                    System.out.println();
                    for (int i = 0; i <alturaAlumno.size() ; i++) {
                        System.out.println("Posición: " + i + " --> Altura: " + alturaAlumno.get(i));
                    }
                    break;
                case 0:
                    System.out.println("Has elegido salir, goodbye");
                    break;
                default:
                    System.out.println("La opción no se encuentra en el menú");
            }
        } while (opcion != 0);


    }


    // funcion para mostrar un menu
    public static void mostrarMenu() {
        System.out.println("\n---------- º ----------");
        System.out.println("      M   E   N   U ");
        System.out.println("---------- º ----------");
        System.out.println("Opción 1: AÑADIR ALTURA");
        System.out.println("Opción 2: MOSTRAR LISTA ACTUAL CON EL NÚMERO DE POSICIÓN");
        System.out.println("Opción 3: ELIMINAR POR POSICIÓN");
        System.out.println("Opción 4: ELIMINAR POR VALOR");
        System.out.println("Opción 5: ORDENAR LISTA");
        System.out.println("Opción 0: SALIR");
        System.out.println("---------- º ----------\n");
        System.out.print("Elige opción: ");
    }

    // funcion para comprobar si la altura esta dentro de rango correcto
    public static boolean alturaCorrecta(double altura) {
        return (altura >= 0.50 && altura <= 2.50);

    }
}
