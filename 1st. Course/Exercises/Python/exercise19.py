respuestaUser = "si"
while respuestaUser == "si":
    numero1 = int(input("Introduce el primer número rango(1-20): "))
    while numero1 < 1 or numero1 > 20:
        print("No estas en el rango correcto")
        numero1 = int(input("Introduce el primer número rango(1-20): "))
    else:
        print("Rango correcto del primer número")
    numero2 = int(input("Introduce el segundo número rango (1-20): "))
    while numero2 < 1 or numero2 > 20:
        print("No estas en el rango correcto")
        numero2 = int(input("Introduce el segundo número rango(1-20): "))
    else:
        print("Rango correcto del segundo número")

    print(f"La media aritmetica de {numero1} y {numero2} es: {(numero1 + numero2) / 2:.1f}\n")
    respuestaUser = input("¿Deseas continuar y repetir la operación? (SI-NO): ")
    respuestaUser = respuestaUser.lower()
    while respuestaUser != "si" and respuestaUser != "no":
        if respuestaUser != "si" and respuestaUser != "no":
            print("No es una respuesta válido, inténtalo de nuevo.")
        respuestaUser = input("¿Deseas continuar y repetir la operación? (SI-NO): ")
        respuestaUser = respuestaUser.lower()
    if respuestaUser == "si":
        print("Muy bien, volvemos a empezar.")
    else:
        print("Entiendo, hasta luego.")
