import random
from collections import OrderedDict

lista_resultados = {2: 0, 3: 0, 4: 0, 5: 0, 6: 0, 7: 0, 8: 0, 9: 0, 10: 0, 11: 0, 12: 0}
tiradas_total = 0
for i in range(1, 301):
    tiradas_total += 1
    aleatorio_dado1 = random.randint(1, 6)
    aleatorio_dado2 = random.randint(1, 6)
    resultado = aleatorio_dado1 + aleatorio_dado2
    for clave, valor in lista_resultados.items():
        # si el resultado es igual a la clave del diccionario, añado una coincidencia +1 al valor de dicha clave
        if resultado == clave:
            lista_resultados[clave] += 1
    # ya tengo las coincidencias en cada clave
for clave, valor in lista_resultados.items():  # obtengo el % que corresponden las coincidencias
    porcentaje = (lista_resultados.get(clave) * 100) / tiradas_total
    lista_resultados[clave] = porcentaje

print("Probabilidad de suma de dados:")
# ordeno el diccionario por valor en orden inverso (descendiente)
lista_ordenada = OrderedDict(sorted(lista_resultados.items(), key=lambda x: x[1], reverse=True))
for clave, valor in lista_ordenada.items():
    print(f"{clave}: {valor:.2f}%")
print(f"Total de tiradas {tiradas_total}")
