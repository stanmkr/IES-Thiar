opciones = "-OPCIONES-"
print("Tendrás que introducir 2 números, y te mostraré un menu con distintas opciones para operar con los números. ")
num1 = int(input("Introduce el 1er número: "))
num2 = int(input("Introduce el 2º número: "))
print("\n-------------- M E N U -------------- ")
print(f"{opciones:^37}")
print("1 --> SUMAR")
print("2 --> RESTAR")
print("3 --> MULTIPLICAR")
print("------------------º------------------\n")
opc = int(input("Elige una opción: "))
while opc != 1 and opc != 2 and opc != 3:
    print("No es una opción válida.")
    opc = int(input("Elige una opción: "))
else:
    print("Opción correcta")
if opc == 1:
    print(f"La suma de {num1}+{num2} es: {num1 + num2}")
elif opc == 2:
    print(f"La resta de {num1}-{num2} es: {num1 - num2}")
elif opc == 3:
    print(f"La multiplicación de {num1}*{num2} es: {num1 * num2}")
