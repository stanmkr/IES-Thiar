#   Crea un conjuntos llamado usuarios con los nombres Ana, David, Rosa, Juan y Matías.
usuarios = {"Ana", "David", "Rosa", "Juan", "Matias"}

#   Crea un conjunto llamado administradores con los nombres Juan y Ana.
administradores = {"Juan", "Ana"}

#   Borra al administrador Juan del conjunto de administradores.
usuarios.discard("Juan")

#   Añade a Matías como un nuevo administrador, pero no lo borres del conjunto de usuarios.
administradores.add("Matias")

#   Muestra por pantalla cuántos usuarios hay usando la función correspondiente que devuelve la cantidad de elementos de un conjunto.
print("Hay", len(usuarios), " usuarios\n")

#   Muestra por pantalla qué nombres son, a su vez, usuarios y administradores mediante el uso del operador de intersección de conjuntos.
print(usuarios & administradores, " están tanto en usuarios como en administradores\n")

#   Muestra todos los usuarios por pantalla de forma dinámica (recorriendo el conjunto mediante un bucle for). Además se debe indicar si cada usuario es administrador o no haciendo uso del operador de pertenencia.
for i in usuarios:
    if i in administradores:
        print(i, "es administrador")
    else:
        print(i)
