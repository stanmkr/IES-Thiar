def menu():
    print("""
    -----    M E N U     -----
    [1] Añadir animal terrestre
    [2] Añadir animal acuático
    [3] Eliminar animal terrestre
    [4] Eliminar animal acuático
    [5] Animales terrestres y acuáticos
    [6] Comprobar animal
    [X] Salir""")


animales_Terrestres = set()
animales_Acuaticos = set()
while True:
    menu()
    inputUser = input("\nIntroduce una opción del menú: ")
    inputUser.lower()
    if inputUser == "1":
        nombre = input("Introduce el nombre del animal terrestre que quieres añadir: ")
        animales_Terrestres.add(nombre.capitalize())
        print(nombre, "añadido correctamente")
    elif inputUser == "2":
        nombre = input("Introduce el nombre del animal acuático que quieres añadir: ")
        animales_Acuaticos.add(nombre.capitalize())
        print(nombre, "añadido correctamente")
    elif inputUser == "3":
        nombre = input("Introduce el nombre del animal terrestre que quieres eliminar: ")
        if nombre.capitalize() in animales_Terrestres:
            animales_Terrestres.discard(nombre.capitalize())
            print(nombre, "eliminado correctamente")
        else:
            print(nombre, "no existe en la lista de animales terrestres")
        # animales_Terrestres.discard(nombre.capitalize())
    elif inputUser == "4":
        nombre = input("Introduce el nombre del animal acuático que quieres eliminar: ")
        if nombre.capitalize() in animales_Acuaticos:
            animales_Acuaticos.discard(nombre.capitalize())
            print(nombre, "eliminado correctamente")
        else:
            print(nombre, "no existe en la lista de animales acuáticos")
    elif inputUser == "5":
        print("\nANIMALES ACUÁTICOS: ", animales_Acuaticos)
        print("\nANIMALES TERRESTRES: ", animales_Terrestres)
    elif inputUser == "6":
        inputUser = input("Introduce el nombre del animal para ver a qué lista pertenece: ")
        nombre = inputUser.capitalize()
        if nombre in animales_Acuaticos and nombre in animales_Terrestres:
            print(nombre, "es un animal terrestre y acuático")
        elif nombre in animales_Acuaticos:
            print(nombre, "es un animal acuático")
        elif nombre in animales_Terrestres:
            print(nombre, "es un animal terrestre")
        else:
            print(nombre, " no pertenece a ningún conjunto")
    elif inputUser.lower() == "x":
        print("ADIÓS")
        break
    else:
        print("Opción incorrecta")
