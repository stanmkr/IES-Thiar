import java.text.DecimalFormat
import kotlin.math.*

/**
 * Autor: Stanislav Krastev
 * 2º DAM
 * Septiembre / 2022
 */
fun programaTerminado(){
    println("Introduce bien las cantidades máquina, que eres un máquina...\n")
    println("Terminando programa...")
    println("Programa terminado.")
}

fun esPositivo (valor: Double):Boolean{
    return valor > 0
}

fun main(args: Array<String>) {
    println("*************** APLICACIÓN ALCOHOLEMIA ***************\n")
    // println("Program arguments: ${args.joinToString()}")
    print("Cuantos litros debes tomar para estar “perjudicado“: ")
    val perjudicado = readLine()!!.toDouble()
    if (esPositivo(perjudicado)){
        val perjudicadoMililitros = perjudicado * (1000)
        print("Cual es el diámetro del vaso (en cm): ")
        val diametro = readLine()!!.toDouble()
        if (esPositivo(diametro)){
            print("Cual es la altura del vaso (en cm): ")
            val altura = readLine()!!.toDouble()
            if (esPositivo(altura)){
                print("¿Cuantos vasos has tomado hasta el momento?: ")
                val vasosCantidad = readLine()!!.toInt()
                if (vasosCantidad >= 0){
                    val radio = diametro / 2
                    val vasoVolumen = Math.PI * radio.pow(2) * altura
                    val limite = perjudicadoMililitros / vasoVolumen
                    if (vasosCantidad >= limite) {
                        println("-------------------------------------------------")
                        println("¡Ya estas borracho, vete ya a casa perro! 😂😂")
                    } else {
                        val resultado = limite-vasosCantidad
                        val decimalFormat = DecimalFormat("#.##")
                        val resultadoFormateado = decimalFormat.format(resultado) // para formatear a 2 decimales
                        println("-------------------------------------------------")
                        println("Te faltan $resultadoFormateado vasos para ponerte muñeco")
                    }
                }else{
                    programaTerminado()
                }
            }else{
                programaTerminado()
            }
        }else{
            programaTerminado()
        }
    }else{
        programaTerminado()
    }
}
