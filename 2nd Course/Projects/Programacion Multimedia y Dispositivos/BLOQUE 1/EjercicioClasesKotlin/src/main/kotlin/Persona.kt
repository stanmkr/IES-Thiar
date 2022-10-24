import java.util.concurrent.ThreadLocalRandom
import kotlin.math.pow

/**
 * Created by Stanislav Krastev
 * EjercicioClasesKotlin -
 * Date: Octubre / 2022
 *
 */
class Persona { //Un constructor por defecto.

    //private val sexo = "Hombre"
    internal var nombre: String = ""
    internal var edad: Int = 0
    internal var DNI: String = ""
    internal var sexo: String = "H"
    internal var peso: Double = 0.0
    internal var altura: Double = 0.0

    constructor()

    // Un constructor con el nombre, edad y sexo, el resto por defecto.
    constructor(nombre: String, edad: Int, sexo: String) {
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
     * calculara si la persona esta en su peso ideal
     */
    fun calcularIMC(): Int {
        val IMC = this.peso / (this.altura.pow(2))
        val pesoIdeal = -1
        val porDebajo = 0
        val porEncima = 1

        return if (IMC in 20.0..25.0) {
            pesoIdeal
        } else if (IMC > 25) {
            porEncima
        } else {
            porDebajo
        }

    }

    /**
     * devuelver true o false is es mayor o menor
     */
    fun esMayorDeedad(): Boolean {
        return this.edad >= 18
    }

    // comprueba que el sexo introducido es correcto. Si no
    //es correcto, sera H. No sera visible al exterior.
    private fun comprobarSexo() {
        if (this.sexo != "H" && this.sexo != "M") {
            this.sexo = "H"
        }
    }

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
        return "Persona(nombre='$nombre', edad=$edad, DNI='$DNI', sexo='$sexo', peso=$peso, altura=$altura)"
    }



}