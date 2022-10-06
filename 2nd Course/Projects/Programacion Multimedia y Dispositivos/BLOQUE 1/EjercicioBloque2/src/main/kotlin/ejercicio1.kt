/**
 * AUTOR: Stanislav Krastev
 * CURSO: 2º DAM
 * FECHA: Octubre/2022
 * Utilizando la sentencia when, pedir por pantalla la nota de un examen y devolver la situacion en
la que se encuentra el examen. Entre 0 y 4 suspenso, entre 5 y 7 aprobado, entre 7 y 10 excelente,
en otro caso....dato no valido
 */

fun main(args: Array<String>) {
    while (true){
        try {
            print("Introduce la nota del examen para ver la situación en la que se encuentra el examen: ")
            val nota = readln().toDouble();
            when(nota){
                in 0.0 .. 4.0 ->{
                    println("Suspenso")
                }
                in 4.1 .. 7.0 ->{
                    println("Aprobado")
                }
                in 7.1 .. 10.0 -> {
                    println("Excelente")
                }
                else ->{
                    println("Dato no válido.")
                }
            }
            break
        } catch (e:NumberFormatException){
            println("Debes de introducir números.")
        }
    }
}