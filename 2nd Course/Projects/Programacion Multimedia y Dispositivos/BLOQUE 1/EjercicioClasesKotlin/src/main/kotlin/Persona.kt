import java.util.concurrent.ThreadLocalRandom
import kotlin.math.pow

/**
 * Created by Stanislav Krastev
 * EjercicioClasesKotlin -
 * Date: Octubre / 2022
 *
 */
class Persona {

    internal var nombre: String = ""
    internal var edad: Int = 0
    internal var DNI: String = ""
    internal var sexo: String = "H"
    internal var peso: Double = 0.0
    internal var altura: Double = 0.0

    constructor() // CONSTRUCTOR vacío (por defecto)

    // Un constructor con el nombre, edad y sexo, el resto por defecto.
    constructor(nombre: String, edad: Int, sexo: String) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        generarDNI()
    }

    // Un constructor con todos los atributos como parámetro.
    constructor(nombre: String, edad: Int, sexo: String, peso: Double, altura: Double) {
        this.nombre = nombre
        this.edad = edad
        this.sexo = sexo
        this.peso = peso
        this.altura = altura
        generarDNI()
    }

    /**
     * Calculará si la persona está en su peso ideal (es necesario que la altura se introduzca en metros)
     * Devuelve un entero:
     *
     * 1 si tiene sobrepeso
     * -1 si tiene el peso ideal
     * 0 si está flaco para su estatura
     */
    fun calcularIMC(): Int {
        val imc = this.peso / (this.altura.pow(2))
        val pesoIdeal = -1
        val porDebajo = 0
        val porEncima = 1

        return if (imc in 20.0..25.0) {
            pesoIdeal
        } else if (imc > 25) {
            porEncima
        } else {
            porDebajo
        }
    }

    /**
     * Función que calculará el peso ideal que recibe como parámetro un número entero, e imprime según el valor recibido (esta función recibirá como parámetro la función de calcular el IMC calcularIMC()
     */
    fun pesoIdeal(calculo: Int) {
        if (calculo == 1) {
            println("tiene sobrepeso")
        } else if (calculo == -1) {
            println("tiene el peso ideal para su estatura")
        } else {
            println("esta muy flaco para su estatura")
        }
    }

    /**
     * Imprime por pantalla un mensaje según el valor del atributo del objeto que llama a la función true o false is es mayor o menor
     */
    fun esMayorDeEdad() {
        println()
        if (this.edad >= 18) {
            println("${this.nombre} es mayor de edad")
        } else {
            println("${this.nombre} es menor de edad")
        }
    }

    /**
     *  comprueba que el sexo introducido es correcto. Si no es correcto, pondrá como valor al atributo sexo = "H".
     */

    fun comprobarSexo() {
        if (this.sexo != "H" && this.sexo != "M") {
            this.sexo = "H"
        }
    }

    /**
     * Genera un DNI aleatorio, una vez generado asigna el valor del dni aleatorio al atributo DNI del objeto que llama esa función
     */
    private fun generarDNI() {
        val numero: Int = ThreadLocalRandom.current().nextInt(10000000, 100000000)
        val resto: Int = numero - (numero / 23 * 23)
        val letras = "TRWAGMYFPDXBJZSQVHLCKE"
        val arrayLetras = letras.toCharArray()
        val letra = arrayLetras[resto]
        val dni = numero.toString() + letra
        this.DNI = dni
    }


    override fun toString(): String {
        return "Persona --> NOMBRE: $nombre, EDAD: $edad, DNI: $DNI, SEXO: $sexo, PESO: $peso, ALTURA: $altura"
    }


}