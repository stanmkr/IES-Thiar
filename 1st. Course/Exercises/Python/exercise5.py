cadena = input("Introduce una cadena de caracteres: ")

print("4 primeros caracteres de la cadena \"" + cadena + "\" (" + cadena[:3 + 1] + ")")
print("3 últimos caracteres de la cadena \"" + cadena + "\" (" + cadena[-3:] + ")")
print("Los caracteres con índice par de la cadena \"" + cadena + "\" (" + cadena[:len(cadena):2] + ")")
print("Los caracteres con índice impar de la cadena \"" + cadena + "\" (" + cadena[1:len(cadena):2] + ")")
