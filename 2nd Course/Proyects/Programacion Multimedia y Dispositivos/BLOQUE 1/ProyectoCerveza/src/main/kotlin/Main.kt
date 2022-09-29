import kotlin.math.*

fun main(args: Array<String>) {
    println("Hello World!")
    // println("Program arguments: ${args.joinToString()}")
    print("Cuantos litros debes tomar para estar “perjudicado: ")
    val perjudicado = readLine()!!.toDouble()
    val perjudicadoMililitros = perjudicado * (1000)
    print("Cual es el diámetro del vaso (en cm): ")
    val diametro = readLine()!!.toDouble()
    print("Cual es la altura del vaso (en cm): ")
    val altura = readLine()!!.toDouble()
    print("¿Cuantos vasos has tomado hasta el momento?: ")
    val vasosCantidad = readLine()!!.toInt()

    val radio = diametro / 2
    val vasoVolumen = Math.PI * radio.pow(2) * altura
  val tomadoHastaElMomento = vasosCantidad * vasoVolumen

    val limite = perjudicadoMililitros / vasoVolumen

    if (vasosCantidad >= limite) {
        println("Ya estas borracho, vete ya a casa perro!")
    } else {
        println("Te faltan ${limite - vasosCantidad} vasos para ponerte muñeco")
    }

}
