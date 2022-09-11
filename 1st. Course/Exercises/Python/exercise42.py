def elevar_al_cubo(lista):
    lista_numeros = []
    for x in lista:
        lista_numeros.append(pow(x, 3))
    return lista_numeros


lista_numeros = []
while True:
    numeros = input("Introduce número para introducirlo a la lista: ")
    if numeros == "00":
        break
    else:
        lista_numeros.append(int(numeros))

print("\nLista original: ", lista_numeros)
print("Los cubos de los números de la lista pasada son: ", elevar_al_cubo(lista_numeros))