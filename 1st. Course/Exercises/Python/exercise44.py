def hotel(nombre, ciudad, *args, **kwargs):
    """muestra por pantalla una ficha del hotel y sus características"""

    valoraciones = []  # lista vacía en la que se almacenarán las valoraciones introducidas
    valoracion_media = 0

    # recorro todos los args introducidos en la función, cada arg lo añado a
    # una lista y lo agrego en una variable que contendrá la suma de los argumentos
    # y después hago el cálculo de la media
    for arg in args:
        valoraciones.append(arg)
        valoracion_media += arg
    valoracion_media = valoracion_media / len(valoraciones)

    print(f"\nNombre: {nombre}")
    print(f"Ciudad: {ciudad}")
    print(f"Categoría: {kwargs['estrellas'] * '*'}")
    print(f"Valoración media: {valoracion_media:.1f} ({len(valoraciones)})")

    # compruebo si el nombre (clave) del kwarg está entre los argumentos
    if 'precioEstandar' in kwargs and 'superficieEstandar' in kwargs:
        precio_metro2 = kwargs['precioEstandar'] / kwargs['superficieEstandar']
        print(f"Precio medio estándar: {precio_metro2:.1f} €/m2")

    # recorro todos los kwargs y en caso de que el valor del kwarg (value) coincide con True lo muestro
    print("Otros servicios:")
    for valor in kwargs:
        if kwargs[valor] == True:
            print("-", valor)

    # termino la función
    return


hotel("La zenia", "Orihuela Costa", 7.4, 8.3, 6.4, superficieEstandar=36, precioEstandar=95, estrellas=4,
      Wifi=True, Párking=False,
      Piscina=True)

hotel("Palacio de Tudemir", "Orihuela", 7.8, 8.2, 5.4, 4.6,
      superficieEstandar=45, precioEstandar=120, estrellas=4, Wifi=True,
      Párking=True, Piscina=False, Restaurante=True)

hotel("Lo Monte", "Pilar de la Horadada", 8.8, 6.2, 7.7, estrellas=2,
      Wifi=True, Párking=False)
