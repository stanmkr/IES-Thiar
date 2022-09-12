import random
import funciones_matematicas

num1 = random.uniform(0, 10)
num2 = random.uniform(0, 10)
print("TUS NÚMEROS")
print(num1, " | ", num2)
while True:
    funciones_matematicas.menu()
    user_answer = input("¿Que operación deseas realizar?: ")
    if user_answer == "1":
        funciones_matematicas.suma(num1, num2)
        funciones_matematicas.seguir_operando()
    elif user_answer == "2":
        funciones_matematicas.resta(num1, num2)
        funciones_matematicas.seguir_operando()
    elif user_answer == "3":
        funciones_matematicas.producto(num1, num2)
        funciones_matematicas.seguir_operando()
    elif user_answer == "4":
        funciones_matematicas.division(num1, num2)
        funciones_matematicas.seguir_operando()
    elif user_answer == "5":
        funciones_matematicas.potencia(num1, num2)
        funciones_matematicas.seguir_operando()
    else:
        print("La opción no esta entre las disponibles.")
