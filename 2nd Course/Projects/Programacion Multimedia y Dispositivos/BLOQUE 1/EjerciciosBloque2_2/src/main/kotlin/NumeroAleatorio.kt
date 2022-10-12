/**
 * Created by Stanislav Krastev
 * EjerciciosBloque2_2 -
 * Date: Octubre / 2022
 *En este ejercicio vamos a generar un número aleatorio entre 1 y 10 con la opción random(). Le
solicitaremos al usuario que intente adivinar el número y nos informe por pantalla si hemos
acertado o no. En caso de fallar se genera un nuevo número y le volvemos a pedir que intente
acertar. Si os animáis, intentar colocar un break en la programación para que salgamos si el usuario
ingresa el número 0
 */

fun main() {
    var acertado = false
    var numAleatorio = (1..10).random()
    println("numero ordenador: $numAleatorio")
    println("El ordenador acaba de sacar un número aleatorio entre 1 y 10, tienes que intentar adivinarlo.")
    print("Cual crees que ha sido el número aleatorio: ")
    var inputUser = readln().toInt()
    if (inputUser == numAleatorio) {
        acertado = true
    } else if (inputUser == 0) {
        println("Has decidido terminar este sufrimiento. Tira a tomarte una cerveza anda.")
    } else {
        while (inputUser < 0 || inputUser > 10) {
            println("Debes de introducir números en el rango que te dije.")
            print("Introduce de nuevo el número: ")
            inputUser = readln().toInt()
            if (inputUser == 0) {
                println("Has decidido terminar este sufrimiento. Tira a tomarte una cerveza anda.")
                break
            }
        }
        while (inputUser != numAleatorio && inputUser != 0) {
            println("NO has acertado, intentalo de nuevo.")
            numAleatorio = (1..10).random()
            println("numero ordenador: $numAleatorio")
            print("Introduce tu número: ")
            inputUser = readln().toInt()
            if (inputUser == numAleatorio) {
                acertado = true
            } else if (inputUser == 0) {
                println("Has decidido terminar este sufrimiento. Tira a tomarte una cerveza anda.")
                break
            }
            while (inputUser < 0 || inputUser > 10) {
                println("Debes de introducir números en el rango que te dije.")
                print("Introduce de nuevo el número: ")
                inputUser = readln().toInt()
                if (inputUser == numAleatorio) {
                    acertado = true
                }
            }
        }
    }


    if (acertado) {
        println("Has acertado, el número era $numAleatorio")
    }

}
