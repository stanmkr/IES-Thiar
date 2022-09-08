precio_sin_descuento = float(input("Introduce el precio del producto: ")) # influt casteado a float para poder introducir números con decimales
descuento_porcentaje = 12 # variable para guardar el descuento
ahorro = precio_sin_descuento * (descuento_porcentaje/100) # formula para obtener cuanto es el descuento dado un precio y un descuento en porcentaje
precio_final = precio_sin_descuento-ahorro # formula para obtener el precio final una vez aplicado el descuento anteriormente calculado
print(f"Teniendo un {descuento_porcentaje}% de descuento, el descuento de tu artículo es de {ahorro:.2f}")
print(f"El precio final de tu artículo con el descuento aplicado es: {precio_final:.2f}")