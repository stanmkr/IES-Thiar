import numpy as np

mayores = 0
menores = 0
ceros = 0
print("Te voy a solicitar las dimensiones de un array bidimensio")
filas = int(input("Introduce el número de filas: "))
columnas = int(input("Introduce el número de columnas: "))
print("Muy bien, ahora te pediré valores para rellenar el array índice por índice")
array = []
for z in range(filas):
    array.append([0] * columnas)  # para la fila z=0, z=1,etc.. me creo columnas con el valor 0

# recorro la matriz bidimensional con, el for exterior para las filas, el interior para las columnas
for i in range(filas):
    for j in range(columnas):
        num = int(input(f"Introduce el valor para el elemento [{i}][{j}]: "))
        array[i][j] = num
        if num < 0:
            menores += 1
        elif num > 0:
            mayores += 1
        else:
            ceros += 1
print("*** LA MATRIZ ***")

for x in range(len(array)):
    for y in range(len(array[0])):
        print(array[x][y], " ", end="")
    print()

print(f"\nHay {mayores} valor/es mayores de 0")
print(f"\nHay {menores} valor/es menores de 0")
print(f"\nHay {ceros} valor/es iguales a 0")

#   Escribe un comentario al final del archivo de código fuente en el que indiques si se ha creado un archivo bytecode en la ejecución y por qué.
#   No se ha creado archivo bytecode ya que este se crea a partir de la compilación del código, pero python es un lenguaje interpretado no compilado, no compila, es interpretado en tiempo de ejecución
