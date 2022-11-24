fun main() {
    var saldo = 0.00
    var cantidad: Double
    menu()
    print("Elige una opción (1-4): ")
    var opcion = readln()

    while (opcion != "4") {
        when (opcion) {
            // ver saldo
            "1" -> {
                println("Tu saldo es de $saldo€\n")
            }
            //ingresar money
            "2" -> {
                print("Introduce la cantidad a ingresar: ")
                cantidad = readln().toDouble()
                while (cantidad <= 0) {
                    println("Por favor, ingresa cantidades positivas.")
                    cantidad = readln().toDouble()
                }
                saldo += cantidad
                println("Ingresados correctamente $cantidad€")
            }
            // sacar money
            "3" -> {
                print("Introduce la cantidad a retirar: ")
                cantidad = readln().toDouble()
                while (cantidad <= 0) {
                    print("Por favor, ingresa cantidades positivas: ")
                    cantidad = readln().toDouble()
                }
                while (cantidad > saldo) {
                    println("¡Quieto! No tienes saldo suficiente fiera.")
                    println("Tu balance es: $saldo€")
                    print("Ingresa algo coherente: ")
                    cantidad = readln().toDouble()
                }
                saldo -= cantidad
                println("Retirados correctamente $cantidad€")
            }
            else -> {
                println("La opción no se encuentra en la lista.")
            }
        }
        menu()
        print("Elige una opción (1-4): ")
        opcion = readln()
    }
    println("Has elegido la opción 4 (Salir).\nHasta pronto.")
}

private fun menu() {
    println("\n********** M E N Ú **********")
    println(
        "1.- Ver saldo\n" +
                "2.- Ingresar dinero\n" +
                "3.- Sacar dinero\n" +
                "4.- Salir"
    )
    println("********** M E N Ú **********\n")

}

