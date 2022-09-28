def menu():
    print("""
    -----    M E N U     -----
    [A] Añadir persona socia
    [B] Buscar persona socia
    [C] Cantidad de personas socias
    [D] Mostrar personas socias
    [E] Eliminar persona socia
    [X] Salir""")


personasSocias = {}
listaPersonas = []

while True:
    menu()
    inputUser = input("\nIntroduce una opción del menú: ")

    if inputUser.upper() == "A":
        personasSocias = {"Nombre": "", "Apellidos": "", "Edad": "", "Localidad": ""}
        nombre = input("Introduce el nombre de la persona")
        apellidos = input("Introduce los apellidos")
        edad = input("Introduce la edad")
        localidad = input("Introduce la localidad")
        personasSocias["Nombre"] = nombre
        personasSocias["Apellidos"] = apellidos
        personasSocias["Edad"] = edad
        personasSocias["Localidad"] = localidad
        listaPersonas.append(personasSocias)

    elif inputUser.upper() == "B":
        nombre = input("Introduce el nombre de la persona socia que quieres buscar: ")
        apellidos = input("Introduce los apellidos de la persona socia que quieres buscar: ")
        for persona in listaPersonas:
            if persona.get("Nombre") == nombre and persona.get("Apellidos") == apellidos:
                print("Los datos introducidos por el usuario se corresponden con una persona socia registrada")
                
        for persona in listaPersonas:
            if persona.get("Nombre") != nombre and persona.get("Apellidos") != apellidos:
                print("La persona socia no está en la lista")

    elif inputUser.upper() == "C":
        print("La cantidad de personas socias es: ", len(listaPersonas))
    elif inputUser.upper() == "D":
        for persona in listaPersonas:
            print("NOMBRE:", persona.get("Nombre"), "| APELLIDOS", persona.get("Apellidos"))
    elif inputUser.upper() == "E":
        nombre = input("Introduce el nombre de la persona socia que quieres eliminar: ")
        apellidos = input("Introduce los apellidos de la persona socia que quieres eliminar: ")
        for persona in listaPersonas:
            if persona.get("Nombre") == nombre and persona.get("Apellidos") == apellidos:
                print(nombre, apellidos, "eliminado correctamente")
            if persona.get("Nombre") != nombre and persona.get("Apellidos") != apellidos:
                print("La persona socia no está en la lista")
    elif inputUser.upper() == "X":
        print("HAS DECIDIDO SALIR, HASTA LUEGO")
        break
    else:
        print("Opción incorrecta.")
