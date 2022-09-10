frase = input("Introduce una frase en minúsculas: ")
frase.lower()
cantidad_vocales = 0
cantidad_consonantes = 0
for x in frase:
    if x in "aeiou":
        cantidad_vocales += 1
    elif x.isalpha():
        cantidad_consonantes += 1

print(f"Los vocales que contiene la frase: {cantidad_vocales}")
print(f"Los consonantes que contiene la frase: {cantidad_consonantes}")
