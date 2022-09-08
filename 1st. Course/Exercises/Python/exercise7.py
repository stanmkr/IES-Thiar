import math  # clase MATH para poder usar en número PI y math.pow

# input del usuario que se guardara en tipo float dentro de la variable radio
radio = float(input("Introduce el radio: "))
# variable area que calcula el área de un círculo dado su radio
area = math.pi * math.pow(radio, 2)
# muestro por pantalla el valor de la variable {area} con 2 decimales
print(f"La superficie del circulo es: {area:.2f}")

print("----------- EJERCICIO 7 -----------\n")

print(" Alineación a la derecha")
print(f"|{area:>50}|")

print("\nQue el signo sea usado tanto para números positivos como para números negativos")
print(f"{area:+}")

print("\nLa longitud del campo sea de 10.")
print(f"{area:010.2f}")

print("\nLa precisión sea de 3.")
print(f"{area:.3f}")

print("\nQue la representación sea en punto fijo")
print(f"{area:f}")
