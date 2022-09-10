from statistics import median
listaAlturas = []

for x in range(10):
    altura = float(input(f"Introduce la altura de la jugadora {x + 1}: "))
    listaAlturas.append(altura)
listaAlturas.sort()  # ordenamos la lista de menor a mayor valor
print(listaAlturas)
print(f"\nLa jugadora más alta mide: {max(listaAlturas)}")
print(f"Las tres jugadores más bajas miden {listaAlturas[:3]}")
print(f"La mediana de las alturas introducidas es {median(listaAlturas)}")
