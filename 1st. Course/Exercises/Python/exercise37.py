def menu():
    print("""
    -----    M E N U     -----
    [1] Consultar rio
    [2] Borrar rio
    [3] Cantidad de ríos según el país
    [4] Mostrar información
    [X] Salir""")


rios = {"Ebro": "España", "Misuri": "America del norte", "Danubio": "Alemania"}
while True:
    menu()
    userInput = input("\nIntroduce una opción del menú: ")
    userInput.lower()
    if userInput == "1":
        userInput = input("Introduce un río para ver si está en el diccionario: ")
        if rios.get(userInput.capitalize()):
            print("El río", userInput.capitalize(), "está en el diccionario.")
        else:
            userRespuesta = input("El río no esta en el diccionario. ¿Deseas añadirlo?: ")
            if userRespuesta.lower() == "si":
                pais = input("Vale, voy a añadirlo, pero dime el país del río: ")
                rios[userInput.capitalize()] = pais.capitalize()
                print("\n *** RIOS ***")
                for i in rios:
                    print(i)
            elif userRespuesta.lower() == "no":
                print("De acuerdo.")
            else:
                print("No entiendo tu respuesta, lo siento.")
    elif userInput == "2":
        userInput = input("Introduce un río para borrarlo del diccionario: ")
        if userInput.capitalize() in rios:
            del rios[userInput.capitalize()]
            print("El río", userInput.capitalize(), "ha sido eliminado correctamente.")
        else:
            print(userInput.capitalize(), "no está en el diccionario.")

    elif userInput == "3":
        userInput = input("Introduce un país para ver el número de ríos que tiene registrados: ")
        cantidad = 0
        for i in rios.values():
            if userInput.capitalize() == i:
                cantidad += 1
        print("El país", userInput, "tiene", cantidad, "río/s")
    elif userInput == "4":
        for i in rios:
            print("El río", i, "transcurre por", rios.get(i))

    elif userInput == "x":
        print("ADIÓS")
        break
    else:
        print("Opción incorrecta")