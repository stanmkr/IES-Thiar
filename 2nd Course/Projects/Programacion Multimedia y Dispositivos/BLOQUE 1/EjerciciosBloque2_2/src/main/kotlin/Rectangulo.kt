import java.text.DecimalFormat
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Created by Stanislav Krastev
 * EjerciciosBloque2_2 -
 * Date: Octubre / 2022
 *
 * Realizar un programa que solicite las dimensiones de los lados de un rectángulo y nos pida si
queremos calcular su perímetro, superficie, la diagonal trazada entre dos vértices opuestos o el área
del triángulo formado al trazar esta diagonal
 */
fun main() {
    print("Introduce la base del rectángulo: ")
    val base = readln().toDouble()
    print("Introduce la altura del rectángulo: ")
    val altura = readln().toDouble()

    menu()
    when (readln()) {
        // perimetro
        "1" -> {
            println("\nEl perímetro del rectángulo es ${2 * base + 2 * altura}")
        }
        // superficie
        "2" -> {
            println("\nLa superficie del rectángulo es ${base * altura}")

        }
        // diagonal trazada entre dos vertices opuestos
        "3" -> {
            val diagonal = sqrt(altura.pow(2.0) + base.pow(2.0))
            val formato2Decimales = DecimalFormat("#.00")
            val diagonalFormateado = formato2Decimales.format(diagonal)
            println("La diagonal es $diagonalFormateado")
        }
        // area
        "4" -> {
            print("El área del triangulo formado al trazar esta diagonal es ${(base * altura) / 2}")
        }
        else -> {
            println("Opción desconocida.")
        }
    }

}

private fun menu() {
    println(
        "\nELIGE QUE QUIERES CALCULAR\n" +
                "1. Perimetro\n" +
                "2. Superficie\n" +
                "3. Diagonal trazada entre dos vértices opuestos\n" +
                "4. Área del triángulo formado al trazar esta diagonal.\n"
    )
    print("Introduce opcion: ")
}