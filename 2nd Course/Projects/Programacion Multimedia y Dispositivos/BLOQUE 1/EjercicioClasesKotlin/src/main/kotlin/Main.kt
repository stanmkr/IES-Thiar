/**
 * Created by Stanislav Krastev
 * EjercicioClasesKotlin -
 * Date: Octubre / 2022
 *
 */

fun main() {
    // ----------------------- OBJETO 1
    print("Introduce nombre: ")
    var nombre = readln()
    print("Introduce edad: ")
    var edad = readln().toInt()
    while (edad < 0) {
        print("Introduce edad mayor a 0: ")
        edad = readln().toInt()
    }
    print("Introduce sexo ('H' | 'M'): ")
    var sexo = readln()
    print("Introduce peso (en kg): ")
    var peso = readln().toDouble()
    while (peso < 0.0) {
        print("Introduce peso mayor a 0 (en kg): ")
        peso = readln().toDouble()
    }
    print("Introduce altura (en metros): ")
    var altura = readln().toDouble()
    while (altura < 0.0) {
        print("Introduce altura mayor a 0 (en metros): ")
        altura = readln().toDouble()
    }

    val p1 = Persona(nombre, edad, sexo, peso, altura)
    p1.comprobarSexo()

    println("\n" + p1)
    p1.esMayorDeEdad()
    print(p1.nombre + " ")
    p1.pesoIdeal(p1.calcularIMC())
    println()

    // ----------------------- OBJETO 2
    print("Introduce nombre: ")
    nombre = readln()
    print("Introduce edad: ")
    edad = readln().toInt()
    while (edad < 0) {
        print("Introduce edad mayor a 0: ")
        edad = readln().toInt()
    }
    print("Introduce sexo ('H' | 'M'): ")
    sexo = readln()
    val p2 = Persona(nombre, edad, sexo)
    p2.comprobarSexo()

    println("\n" + p2)
    p2.esMayorDeEdad()
    print(p2.nombre + " ")
    p2.pesoIdeal(p2.calcularIMC())
    println()

    // ----------------------- OBJETO 3
    val p3 = Persona()
    p3.nombre = "Juan"
    p3.edad = 20
    p3.sexo = "H"
    p3.peso = 80.0
    p3.altura = 1.75
    println("\n" + p3)
    p3.esMayorDeEdad()
    print(p3.nombre + " ")
    p3.pesoIdeal(p3.calcularIMC())


}




