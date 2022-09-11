def total(cantidad_sin_iva, iva=21):
    return "{:.2f}".format(((cantidad_sin_iva * iva) / 100) + cantidad_sin_iva)


#   invocación de la función pasándole solo 1 argumento
print("Total con iva:", total(121.2))

#   invocación de la función pasándole 2 argumentos
print("Total con iva:", total(121.2, 5))
print("Total con iva:", total(57, 70))
