def menu():
    return print("""
    -----    M E N U     -----
    [A] Añadir persona socia
    [B] Buscar persona socia
    [C] Cantidad de personas socias
    [D] Mostrar personas socias
    [E] Eliminar persona socia
    [X] Salir""")


def alta_socio():
    personasSocias = {"Nombre": "", "Apellidos": "", "Edad": "", "Localidad": ""}
    nombre = input("Introduce el nombre de la persona: ")
    apellidos = input("Introduce los apellidos: ")
    edad = input("Introduce la edad: ")
    localidad = input("Introduce la localidad: ")
    personasSocias["Nombre"] = nombre
    personasSocias["Apellidos"] = apellidos
    personasSocias["Edad"] = edad
    personasSocias["Localidad"] = localidad
    listaPersonas.append(personasSocias)
    return print(nombre, apellidos, "ha sido añadido/a correctamente.")


def buscar_socio():
    existe = False
    nombre = input("Introduce el nombre de la persona socia que quieres buscar: ")
    apellidos = input("Introduce los apellidos de la persona socia que quieres buscar: ")
    for persona in listaPersonas:
        if persona.get("Nombre") == nombre and persona.get("Apellidos") == apellidos:
            existe = True
    if existe:
        return print("Los datos introducidos por el usuario se corresponden con una persona socia registrada")
    else:
        return print("La persona socia no está en la lista.")


def cantidad_socios():
    return print("La cantidad de personas socias es: ", len(listaPersonas))


def nombres_apellidos_socios():
    for persona in listaPersonas:
        print("NOMBRE:", persona.get("Nombre"), "| APELLIDOS:", persona.get("Apellidos"))
    return


def eliminar_socio():
    eliminado = False
    nombre = input("Introduce el nombre de la persona socia que quieres eliminar: ")
    apellidos = input("Introduce los apellidos de la persona socia que quieres eliminar: ")

    for persona in listaPersonas:
        if persona.get("Nombre") == nombre and persona.get("Apellidos") == apellidos:
            listaPersonas.remove(persona)
            eliminado = True
    if eliminado:
        return print(nombre, apellidos, "eliminado correctamente")
    else:
        return print("La persona socia no está en la lista")


personasSocias = {}
listaPersonas = []
while True:
    menu()
    inputUser = input("\nIntroduce una opción del menú: ")
    print()
    if inputUser.upper() == "A":
        alta_socio()

    elif inputUser.upper() == "B":
        buscar_socio()

    elif inputUser.upper() == "C":
        cantidad_socios()

    elif inputUser.upper() == "D":
        nombres_apellidos_socios()

    elif inputUser.upper() == "E":
        eliminar_socio()

    elif inputUser.upper() == "X":
        print("HAS DECIDIDO SALIR, HASTA LUEGO")
        break
    else:
        print("Opción incorrecta.")
