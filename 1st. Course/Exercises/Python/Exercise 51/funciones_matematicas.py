import math
import sys


def suma(num1, num2):
    return print("\nLa suma de los números es:", num1 + num2)


def resta(num1, num2):
    return print("\nLa resta de los números es:", num1 - num2)


def producto(num1, num2):
    return print("\nEl producto de los números es:", num1 * num2)


def division(num1, num2):
    return print("\nLa división de los números es:", num1 / num2)


def potencia(num1, num2):
    return print(f"\n{num1} elevado a {num2} es:", math.pow(num1, num2))


def seguir_operando():
    flag = True
    while flag:
        respuesta = input("\n¿Deseas realizar más operaciones con los mismos operandos?: ")
        if respuesta.lower() == "si":
            print("Te muestro de nuevo las opciones")
            flag = False
        elif respuesta.lower() == "no":
            respuesta = input("\n¿Deseas salir del programa?: ")
            if respuesta.lower() == "si":
                print("\nGracias por usar el programa. ¡Espero verte pronto por aquí!")
                sys.exit(0)
            elif respuesta.lower() == "no":
                print("\nDe acuerdo. Te muestro de nuevo las opciones disponibles.")
                flag = False
            else:
                print("\nNo entiendo lo que quieres decir.")
        else:
            print("\nNo entiendo tu respuesta")


def menu():
    print("""
        1. SUMA
        2. RESTA
        3. PRODUCTO
        4. DIVISIÓN
        5. POTENCIA
        """)
