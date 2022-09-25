import java.util.concurrent.ThreadLocalRandom;

/**
 * Developed by Stanislav Krastev 1º DAM
 * examenT8 - PACKAGE_NAME
 * febrero - 2022
 */
public class Elipse {
    public static final double PI = 3.141592;
    private double radioMenor, radioMayor, coordenadaX1, coordenadaY1;
    public static final double valoresMaximos = 10;
    Elipse[] array;

    // constructor 1
    public Elipse(int coordenadaX1, int coordenadaY1, double radioMenor, double radioMayor) {
        this.coordenadaX1 = coordenadaX1;
        this.coordenadaY1 = coordenadaY1;
        this.radioMenor = radioMenor;
        this.radioMayor = radioMayor;
        if (this.coordenadaX1 < 0)
            this.coordenadaX1 = 0;
        if (this.coordenadaY1 < 0) {
            this.coordenadaY1 = 0;
        }
    }

    // constructor 2
    public Elipse(double coordenadaX1, double coordenadaY1, double coordenadaX2, double coordenadaY2) {
        if (coordenadaX2 > coordenadaX1 && coordenadaY2 > coordenadaY1) {
            this.coordenadaX1 = (coordenadaX2 + coordenadaX1) / 2;
            this.coordenadaY1 = (coordenadaY2 + coordenadaY1) / 2;
            this.radioMenor = (coordenadaY2 - coordenadaY1) / 2;
            this.radioMayor = (coordenadaX2 - coordenadaX1) / 2;
        } else {
            this.coordenadaX1 = 0;
            this.coordenadaY1 = 0;
            this.radioMayor = 0;
            this.radioMenor = 0;
        }
    }


    // metodo de clase (estatico) para crear una elipse
    static Elipse crearElipse() {
        Elipse elipse = new Elipse(0, 0, 0, 0);
        elipse.setCoordenadaX1(ThreadLocalRandom.current().nextDouble(0, valoresMaximos + 1));
        elipse.setCoordenadaY1(ThreadLocalRandom.current().nextDouble(0, valoresMaximos + 1));
        elipse.setRadioMenor(ThreadLocalRandom.current().nextDouble(0, valoresMaximos + 1));
        elipse.setRadioMayor(ThreadLocalRandom.current().nextDouble(0, valoresMaximos + 1));
        return elipse;
    }

    //metodo para imprimir el elipse
    public void imprimir() {
        System.out.println("El área del elipse es: " + getArea());
        System.out.printf("EL centro esta en la posición: (%.1f - %.1f)%n", getCoordenadaX1(), getCoordenadaY1());
        System.out.println("El radio menor del elipse es: " + getRadioMenor());
        System.out.println("El radio mayor del elipse es: " + getRadioMayor());
    }

    // metodo que devolverá el área de la elipse, definida como PI*r*R
    public double getArea() {
        return PI * radioMenor * radioMayor;
    }

    // metodo para desplazar x cantidad las dos coordenadas del centro
    public void despalazarXY(int desplazaX, int desplazaY) {
        if (getCoordenadaX1() + desplazaX > 0 && getCoordenadaY1() + desplazaY > 0) {
            setCoordenadaX1(getCoordenadaX1() + desplazaX);
            setCoordenadaY1(getCoordenadaY1() + desplazaY);
        } else {
            System.err.println("No pueden existir coordenadas negativas");
        }

    }


    // GETTERS Y SETTERS
    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getCoordenadaX1() {
        return coordenadaX1;
    }

    public void setCoordenadaX1(double coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public double getCoordenadaY1() {
        return coordenadaY1;
    }

    public void setCoordenadaY1(double coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }


}
