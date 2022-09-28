import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Stanislav Krastev
 * examenTrimestre - PACKAGE_NAME
 * Date: mayo / 2022
 */
public class Articulo {
    ArrayList<Articulo> articulos = new ArrayList<>();
    private int stock;
    protected  static int id = 0;
    protected int idArt;
    protected String nombre;
    private double pvp, precioCompraProveedor;
    private static final int IVA = 21;


    //  CONSTRUCTOR
    public Articulo(int stock, String nombre, double pvp, double precioCompraProveedor) throws Exception {
        id ++;
        this.idArt= id;


        this.nombre = nombre;
        this.precioCompraProveedor = precioCompraProveedor;
        if (stock < 0) {
            throw new Exception("El stock debe de ser mayor o igual a 0");
        } else {
            this.stock = stock;
        }

        if (pvp < precioCompraProveedor) {
            throw new Exception("El precio de venta al público debe de ser superior al precio de compra al proveedor");
        } else {
            this.pvp = pvp + (pvp * (IVA / 100.0));
        }
    }

    //  GETTERS Y SETTERS

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return idArt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double getPrecioCompraProveedor() {
        return precioCompraProveedor;
    }

    public void setPrecioCompraProveedor(double precioCompraProveedor) {
        this.precioCompraProveedor = precioCompraProveedor;
    }


    //  MÉTODOS

    /**
     * devuelve cadena de texto con la información del artículo
     */
    public String infoArticulo() {
        return "ID: " + getId() + " Nombre: " + getNombre() + " PVP: " + getPvp() + " Precio compra proveedor: " + getPrecioCompraProveedor() + " IVA: " + IVA + " Stock: " + getStock();
    }


    /**
     * vende cierta cantidad de artículos y los resta del stock, lanza excepción si vende más de lo que tiene en stock
     *
     * @param unidades el número de unidades
     * @return si ha sido posible la venta
     * @throws Exception excepción si las unidades a comprar son mayores del stock disponible
     */
    public boolean venderCliente(int unidades) throws Exception {
        if (unidades > this.stock) {
            throw new Exception("Intentas vender una cantidad superior del stock disponible");
        } else {
            this.stock -= unidades;
            return true;
        }
    }


    /**
     * compra cierta cantidad de artículos y las sumas al stock, si no es posible lanza excepcion
     *
     * @param unidades las unidades que se comprarán
     * @return devuelve si ha sido posible o no
     * @throws Exception excepción si las unidades a comprar son menores a 0
     */
    public boolean comprarProveedor(int unidades) throws Exception {
        if (unidades > 0) {
            stock += unidades;
            return true;
        } else {
            throw new Exception("Las unidades a comprar deben de tener un valor superior a 0");
        }
    }
}

