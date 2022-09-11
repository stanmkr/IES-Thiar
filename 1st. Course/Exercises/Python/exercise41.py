import statistics


def mediana(lista):
    """ Pasada una lista como parámetro calcula y devuelve la mediana de la lista
    La mediana es el valor que ocupa el lugar central de todos los datos cuando estos están ordenados de menor a mayor.
    """
    # ordena la lista de menor a mayor y devuelve la mediana de la lista
    print(f"\nLa mediana calculada mediante la función statistics.median() es: {statistics.median(lista):.2f}")
    mitad = int(len(lista) / 2)
    lista.sort()
    if len(lista) % 2 == 0:
        return print(f"La mediana calculada mediante función casera es: {(lista[mitad] + lista[mitad - 1]) / 2:.2f}")

    else:
        return print(f"La mediana calculada mediante función casera es:  {lista[mitad]:.2f}")


numeros = []
while True:
    userInput = input(
        "Introduce número para agregarlo a la lista de números. Si introduces 00 dejarás de introducir números: ")
    if userInput == "00":
        break
    else:
        numeros.append(float(userInput))

mediana(numeros)
