import math  # clase MATH para poder usar en número PI y math.pow

radio = float(
    input("Introduce el radio: "))  # input del usuario que se guardara en tipo float dentro de la variable radio
area = math.pi * math.pow(radio, 2)  # variable area que calcula el área de un círculo dado su radio,

print(
    f"La superficie del circulo es: {area:.2f}")  # muestro por pantalla el valor de la variable {area} con 2 decimales
