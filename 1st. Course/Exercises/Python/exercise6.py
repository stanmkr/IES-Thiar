cadena = input("Escribe una frase cualquiera: ")

print("La cantidad de 'a' que contiene la palabra %s son %i" % (cadena, cadena.count('a')))
print(f"Las palabras de la cadena <{cadena}> --> {cadena.split()}")
print(f"La cadena con la primera letra de cada palabra en mayúscula -->  {cadena.title()}")
print("Toda la cadena en mayúscula ", cadena.upper())
print("LA longitud de la cadena es: ", len(cadena))
print("La cadena con todas las ocurrencias de la letra 'a' sustituidas por la letra 'i' --> ", cadena.replace('a', 'i'))
