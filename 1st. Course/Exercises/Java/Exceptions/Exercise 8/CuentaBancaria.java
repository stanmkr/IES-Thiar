package ejercicio_8;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;


import java.util.ArrayList;

/**
 * Created by Stanislav Krastev
 * Tema10_Excepciones - PACKAGE_NAME
 * Date: marzo / 2022
 */
public class CuentaBancaria {
    String fecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

    //  atr. constantes
    private final String iban;
    private final String titular;

    //  atr. variables
    private double saldo;
    private ArrayList movimientos;

    //  atr. constantes de clase
    private final static double SALDO_MINIMO = -50;
    private final static double AVISO_HACIENDA = 3000;

    //  cuenta válida
    private boolean valida;

    //  CONSTRUCTOR
    public CuentaBancaria(String iban, String titular) throws CuentaException {
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        movimientos = new ArrayList<>();

        //  COMPROBACIÓN DE IBAN y registro de si es cuenta válida
        if (!iban.matches("^[A-Z]{2}[0-9]{22}")) {
            this.valida = false;
            throw new CuentaException("El formato del IBAN no es correcto");
        } else {
            this.valida = true;
        }
    }


    //  MÉTODOS

    // Intenta ingresar una cantidad. Devuelve true si pudo hacerlo y lanza una excepción si no
    public boolean ingresar(double cantidad) throws AvisarHaciendaException, Exception {
        if (cantidad > 0 && cantidad <= AVISO_HACIENDA) {
            this.saldo += cantidad;
            movimientos.add("Ingreso: " + cantidad + "€ Fecha: "+ fecha);

            return true;
        } else if (cantidad <= 0) {
            throw new Exception("AVISO: El valor del ingreso debe de ser mayor a 0");
        } else {
            throw new AvisarHaciendaException("AVISO: Notificar Hacienda");
        }
    }


    // retirar una cantidad, devuelve true si pudo hacerla, y lanza una excepción si no
    public boolean retirar(double cantidad) throws CuentaException, Exception {
        if (cantidad <= 0) {
            throw new CuentaException("AVISO: El valor de la retirada debe de ser mayor a 0");
        } else if ((this.saldo - cantidad) < SALDO_MINIMO) {
            throw new CuentaException("AVISO: No se puede realizar la operación, saldo en cuenta inferior al mínimo " + SALDO_MINIMO);
        } else {
            this.saldo -= cantidad;
            movimientos.add("Retirada: " + cantidad + "€ Fecha: "+ fecha);

            if (this.saldo < 0) throw new Exception("AVISO: Saldo en cuenta negativo");
            return true;
        }
    }


    //  GETTERS Y SETTERS

    public String getIban() {
        return iban;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList movimientos) {
        this.movimientos = movimientos;
    }

    public boolean isValida() {
        return valida;
    }

    public void setValida(boolean valida) {
        this.valida = valida;
    }

    public void mostrarMovimientos() {
        System.out.println();
        System.out.println("Saldo actual de la cuenta: " + this.getSaldo() + " €");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < movimientos.size(); i++) {
            System.out.println(movimientos.get(i));
        }
    }

    public String toString() {
        return "\nIBAN: " + getIban() + "\nTitular: " + getTitular();
    }
}
