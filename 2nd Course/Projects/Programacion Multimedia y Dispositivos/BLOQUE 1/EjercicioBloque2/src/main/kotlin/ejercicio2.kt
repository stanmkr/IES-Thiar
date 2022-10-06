import java.lang.NumberFormatException

/**
 * AUTOR:Stanislav Krastev
 * PROYECTO: EjercicioBloque2
 * FECHA: OCTUBRE / 2022
 *
 * Realizar un programa que nos indique cuantos días faltan para acabar el mes ingresando por
pantalla el día, mes y año. Tener en cuenta que debe calcular cualquier año y saber distinguir si es
bisiesto o no y de esa manera diferenciar si Febrero tiene 28 o 29 días.
 */

fun main(args: Array<String>) {
    var datosCorrectos = true
    try {
        println("Te voy a decir cuantos días faltan para acabar el mes.\n")
        print("Ingresa el día: ")
        val dia = readln().toInt()
        print("Ingresa el mes: ")
        val mes = readln().toInt()
        print("Ingresa el año: ")
        val anyo = readln().toInt()
        if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12 || anyo <= 0) {
            datosCorrectos = false
        }
        if (datosCorrectos) {
            when (mes) {
                1, 3, 5, 7, 8, 10, 12 -> println("Faltan ${31 - dia} días para que acabe el mes")
                2 -> when {
                    anyo % 4 == 0 && anyo % 100 != 0 -> println("Faltan ${29 - dia} días para que acabe el mes")
                    anyo % 400 == 0 -> println("Faltan ${29 - dia} días para que acabe el mes")
                    else -> println("Faltan ${28 - dia} días para que acabe el mes")
                }

                4, 6, 9, 11 -> println("Faltan ${31 - dia} días para que acabe el mes")
            }
        } else {
            println("Has inroducido algun dato incorrecto, revisalo y vuelve a intentarlo.")
        }

    } catch (e: NumberFormatException) {
        println("Introduce números máquina")
    }


}