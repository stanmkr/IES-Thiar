a = int(input("Introduce el coeficiente a: "))
# se pide un input al usuario, por defecto python guarda los input en tipo String, por eso casteamos a int()
b = int(input("Introduce el coeficiente b: ")) # se pide segundo valor
x = (0 - b) / a # cálculo que se guarda en variable x
print("Formula: ax+b=0")
print(f"Valor del coeficiente x: {x:.2f}") # se imprime resultado formateado hasta 2 decimales

