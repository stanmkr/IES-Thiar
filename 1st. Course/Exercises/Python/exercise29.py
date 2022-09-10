from copy import deepcopy
# Desarrolla una aplicación en Python que corrija la siguiente matriz siguiendo
# el criterio de que el cuarto elemento de cada fila debe ser el resultado de
# los tres primeros elementos de su misma fila.
# El programa debe realizar las operaciones pertinentes y mostrar la matriz corregida por pantalla.

matriz = [
    [1, 1, 1, 3],
    [2, 2, 2, 7],
    [3, 3, 3, 9],
    [4, 4, 4, 13]
]
matrizBuena = deepcopy(matriz)
suma = 0

# bucle para recorrer la matriz y hacer las operaciones necesarias
for x in range(len(matrizBuena)):
    for y in range(len(matrizBuena)):
        if y == (len(matrizBuena) - 1):
            matrizBuena[x][y] = suma
            break
        suma += matrizBuena[x][y]
    suma = 0

# bucle para mostrar la matriz original
print("\nMATRIZ ORIGINAL")
for x in range(len(matriz)):
    for y in range(len(matriz)):
        print(matriz[x][y], " ", end="")
    print()

# bucle para mostrar la matrizBuena
print("\nMATRIZ CORREGIDA")
for x in range(len(matrizBuena)):
    for y in range(len(matrizBuena)):
        print(matrizBuena[x][y], " ", end="")
    print()
