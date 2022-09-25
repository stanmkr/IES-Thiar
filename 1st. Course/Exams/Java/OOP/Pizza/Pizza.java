/**
 * Developed by Stanislav Krastev 1º DAM
 * examenT8 - PACKAGE_NAME
 * febrero - 2022
 */
public class Pizza {
    private String tamanyo;
    private String tipo;
    private boolean estado; // true para pedida / false para servida
    public static int totalPedidas = 0;
    public static int totalServidas = 0;

    // constructor
    public Pizza(String tipo, String tamanyo) {
        this.tamanyo = tamanyo;
        this.tipo = tipo;
        if (tipo.equalsIgnoreCase("margarita") || tipo.equalsIgnoreCase("cuatro quesos") || tipo.equalsIgnoreCase("funghi")){
        }else {
            System.err.println("El tipo de pizza no es el correcto");
        }
        if (tamanyo.equalsIgnoreCase("mediana") || tamanyo.equalsIgnoreCase("familiar")){
        }else{
            System.err.println("El tamaño de pizza no es el correcto");
        }
        estado = true; // por defecto al crear un objeto Pizza, esta tiene estado Pedida
        totalPedidas++;
    }

    public void sirve() {
        if (estado) { // si esta pedida
            estado = false; // la cambiamos a servida
        }else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    private String estadoPizza() {
        String miEstado = "";
        if (estado) {
            miEstado = "pedida";
        } else {
            miEstado = "servida";
            totalServidas++;
        }
        return miEstado;
    }


    // metodo de clase que devuelve el total de pizza pedidas
    static int getTotalServidas(){
        return totalServidas;
    }


     // metodo de clase que devuelve el total de pizza pedidas
    static int getTotalPedidas(){
        return totalPedidas;
    }

    @Override
    public String toString() {

        return "Pizza" + " " + tipo + " " + tamanyo + ", " + estadoPizza();


    }


}
