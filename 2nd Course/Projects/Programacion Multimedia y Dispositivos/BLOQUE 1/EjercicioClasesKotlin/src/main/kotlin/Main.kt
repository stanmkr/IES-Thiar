/**
 * Created by Stanislav Krastev
 * EjercicioClasesKotlin -
 * Date: Octubre / 2022
 *
 */

fun main() {
    print("Introduce nombre: ")
    val nombre = readln()
    print("Introduce edad:")
    val edad = readln().toInt()
    print("Introduce sexo: ")
    val sexo = readln()
    print("Introduce peso: ")
    val peso = readln().toDouble()
    print("Introduce altura: ")
    val altura = readln().toDouble()

    val p1 = Persona(nombre, edad, sexo, peso, altura)
    println(p1.calcularIMC())
    println(pesoIdeal(p1.calcularIMC()))
    if (p1.esMayorDeedad()){
        println("Es mayor")
    }else{
        println("Es menor")
    }
    println(p1)
    println()

    val p2 = Persona(nombre, edad, sexo)
    println(pesoIdeal(p2.calcularIMC()))
    if (p2.esMayorDeedad()){
        println("Es mayor")
    }else{
        println("Es menor")
    }
    println(p2)
    println()

    val p3 = Persona()
    p3.nombre = "Juan"
    p3.edad=20
    p3.sexo="H"
    p3.peso=80.0
    p3.altura=175.0
    println(pesoIdeal(p3.calcularIMC()))
    if (p3.esMayorDeedad()){
        println("Es mayor")
    }else{
        println("Es menor")
    }
    println(p3)



}

fun pesoIdeal (calculo:Int){
    if (calculo==1){
        println("Tiene sobrepeso")
    }else if (calculo == -1){
        println("Tiene el peso ideal para su estatura")
    }else{
        println("Esta muy flaco para su estatura")
    }
}


