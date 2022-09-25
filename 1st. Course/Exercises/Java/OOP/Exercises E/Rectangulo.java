package ejercicios.ejerciciosE;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * Tema8_OOP - ejercicios.ejerciciosA
 * enero - 2022
 * <p>
 * Crea un programa con una clase llamada Rectangulo que representará un rectángulo mediante dos coordenadas (x1,y1) y (x2,y2) en un plano,
 * por lo que la clase deberá tener cuatro atributos enteros: x1, y1, x2, y2.
 * <p>
 * En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3).
 * Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto).
 * Modifica todas las coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y áreas.
 */

public class Rectangulo {
    private int x1, x2, y1, y2;
    private static final int VALOR_MAXIMO = 100;
    private static final int VALOR_MINIMO = 0;

    // constructor
    public Rectangulo(int x1, int y1, int x2, int y2) {

        if (x1 > VALOR_MAXIMO || x1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x1 debe de star entre 0 y 100");
        } else {
            this.x1 = x1;
        }

        if (y1 > VALOR_MAXIMO || y1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y1 debe de star entre 0 y 100");
        } else {
            this.y1 = y1;
        }

        if (x2 > VALOR_MAXIMO || x2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x2 debe de star entre 0 y 100");
        } else {
            this.x2 = x2;
        }

        if (y2 > VALOR_MAXIMO || y2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y2 debe de star entre 0 y 100");
        } else {
            this.y2 = y2;
        }

        if (x1 < x2 || y1 < y2) {
            System.err.println("ERROR al instanciar Rectángulo");
        }
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x1 > VALOR_MAXIMO || x1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x1 debe de star entre 0 y 100");
        } else {
            this.x1 = x1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x2 > VALOR_MAXIMO || x2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x2 debe de star entre 0 y 100");
        } else {
            this.x2 = x2;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y1 > VALOR_MAXIMO || y1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y1 debe de star entre 0 y 100");
        } else {
            this.y1 = y1;
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y2 > VALOR_MAXIMO || y2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y2 debe de star entre 0 y 100");
        } else {
            this.y2 = y2;
        }
    }

    // METODOS

    //Método para imprimir la información del rectángulo por pantalla.
    public void imprimir() {
        System.out.printf("Las coordenadas del rectángulo son: (%d,%d) - (%d,%d)%n", this.x1, this.y1, this.x2, this.y2);
    }

    // setter doble x1,y1
    public void setX1Y1(int x1, int y1) {
        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y1 > VALOR_MAXIMO || y1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y1 debe de star entre 0 y 100");
        } else {
            this.y1 = y1;
        }

        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x1 > VALOR_MAXIMO || x1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x1 debe de star entre 0 y 100");
        } else {
            this.x1 = x1;
        }

    }

    // setter doble x2,y2
    public void setX2Y2(int x2, int y2) {
        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x2 > VALOR_MAXIMO || x2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x2 debe de star entre 0 y 100");
        } else {
            this.x2 = x2;
        }

        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y2 > VALOR_MAXIMO || y2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y2 debe de star entre 0 y 100");
        } else {
            this.y2 = y2;
        }
    }

    // setter de todo
    public void setAll(int x1, int y1, int x2, int y2) {

        // x1 - Y1
        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y1 > VALOR_MAXIMO || y1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y1 debe de star entre 0 y 100");
        } else {
            this.y1 = y1;
        }

        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x1 > VALOR_MAXIMO || x1 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x1 debe de star entre 0 y 100");
        } else {
            this.x1 = x1;
        }

        // X2 - Y2
        if (x1 > x2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (x2 > VALOR_MAXIMO || x2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada x2 debe de star entre 0 y 100");
        } else {
            this.x2 = x2;
        }

        if (y1 > y2) {
            System.err.println("ERROR, no es posible modificar el valor.");
        }
        if (y2 > VALOR_MAXIMO || y2 < VALOR_MINIMO) {
            System.err.println("El valor de la coordenada y2 debe de star entre 0 y 100");
        } else {
            this.y2 = y2;
        }
    }

    // metodo que devuelve el perimetro del objeto rectangulo
    public int getPerimetro() {
        return Math.abs(x1 - x2) * 2 + Math.abs(y1 - y2) * 2;
    }

    // metodo que devuelve el area del objeto
    public int getArea() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }

    // metodo que genera un rectángulo aleatorio
    public static Rectangulo creaRectanguloAleatorio (){
        int x1,x2,y1,y2;
        x1 = ThreadLocalRandom.current().nextInt(VALOR_MINIMO,VALOR_MAXIMO+1);
        do {
            x2 = ThreadLocalRandom.current().nextInt(VALOR_MINIMO,VALOR_MAXIMO+1);
        } while (x1 > x2);

        y1 = ThreadLocalRandom.current().nextInt(VALOR_MINIMO,VALOR_MAXIMO+1);
        do {
            y2 = ThreadLocalRandom.current().nextInt(VALOR_MINIMO,VALOR_MAXIMO+1);
        }while (y1 > y2);

        return new Rectangulo(x1,y1,x2,y2);

    }

}
