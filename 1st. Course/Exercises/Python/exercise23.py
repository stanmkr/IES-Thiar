frase = input("Introduce una frase en minúsculas: ")
frase.lower()
cantidad_vocales = 0
vocales = ["a", "e", "i", "o", "u"]
for x in range(0, len(vocales)):
    for z in range(0, len(frase)):
        if vocales[x] == (frase[z]):
            cantidad_vocales += 1

print(f"Los vocales que contiene la frase: {cantidad_vocales}")
