package ejercicios.ejerciciosTema8;

import ejercicios.ejerciciosE.Punto;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosTema8
 * febrero - 2022
 */
public class Triangulo {
    private Punto punto1, punto2, punto3;

    // constructor

    /**
     * recibe 3 objetos de la clase Punto, cada objeto tiene sus coordinadas x,y
     * @param punto1 objeto1
     * @param punto2 objeto2
     * @param punto3 objeto3
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    // MÉTODO

    /**
     * calcula la longitud del perímetro del triángulo dado coordenadas, se utiliza un método Distancia que es de la clase punto que calcula la distancia entre dos puntos
     * @return devuelve la longitud del perímetro
     */
    public int longitudPerimetro (){
        return punto1.distancia(punto2 ) + punto2.distancia(punto3) + punto3.distancia(punto1);
    }
}
