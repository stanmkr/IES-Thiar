#   Muestra por pantalla el nombre y apellido y el DNI del primer pasajero.
pasajero1 = "Sancho Panza", 19876340, "Budapest"
print("Pasajero 1\n Nombre: ", pasajero1[0], "\n DNI: ", pasajero1[2])

print()

#   Utiliza el desempaquetado de tupla para asignar a tres variables los datos del segundo pasajero. Muestra por pantalla el valor de cada una de estas variables.
nombre, dni, destino = pasajero2 = ("Johny Melavo", 19820510, "Honduras")
print(f"Pasajero 2\n Nombre: {nombre}\n DNI: {dni}\n Destino: {destino}")

print()

# El tercer pasajero informa que se ha equivocado al facilitar su DNI. Utiliza los recursos pertinentes para rehacer la tupla con el DNI correcto.
pasajero3 = ("John Rambo", [13320110], "Massachusetts")
print(pasajero3)
pasajero3_dni = int(input("Introduce el nuevo DNI: "))
pasajero3[1].remove(13320110)
pasajero3[1].append(pasajero3_dni)
print()
#   Crea una lista con los tres pasajeros y muestra por pantalla los datos del tercer pasajero.
lista_pasajeros = [pasajero1, pasajero2, pasajero3]
print("Pasajero 3: ", lista_pasajeros[2])
