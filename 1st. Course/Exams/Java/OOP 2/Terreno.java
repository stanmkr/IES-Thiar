/**
 * Created by Stanislav Krastev
 * Examen_OOP2 - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class Terreno extends Propiedad {
    protected int precioAlquiler;
    ColorTerreno color;

    //  CONSTRUCTOR
    public Terreno(String nombre, int precio, int hipoteca, int precioAlquiler, ColorTerreno color) {
        super(nombre, precio, hipoteca);
        this.precioAlquiler = precioAlquiler;
        this.color = color;
    }

    //  MÉTODOS
    @Override
    public int getALquiler(int modificacion) {
        if (modificacion <= 4) {
            return this.precioAlquiler * modificacion;
        } else {
            return precioAlquiler * 10;
        }
    }
    public void mostrarInfo(){
        System.out.println("*** TERRENO ***");
        System.out.println("Terreno: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Hipoteca: " + getHipoteca());
        System.out.println("Precio de alquiler: " + getPrecioAlquiler());
        System.out.println("Color del terreno: " + getColor());
    }


    //  GETTERS Y SETTERS
    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public ColorTerreno getColor() {
        return color;
    }

    public void setColor(ColorTerreno color) {
        this.color = color;
    }


    // método del interface
    @Override
    public void comprar(int i) {
        if (this.getPropietario() == -1){
            System.out.println("Has comprado la propiedad");
            this.setPropietario(i);
        }else {
            System.out.println("La propiedad esta ocupada.");
        }
    }
}
