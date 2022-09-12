def notas(diccionario):
    diccionario_temporal = {}
    for clave, valor in diccionario.items():
        if 0 <= valor < 5:
            diccionario_temporal[clave] = "Insuficiente"
        elif 5 <= valor < 6:
            diccionario_temporal[clave] = "Suficiente"
        elif 6 <= valor < 7:
            diccionario_temporal[clave] = "Bien"
        elif 7 <= valor < 9:
            diccionario_temporal[clave] = "Notable"
        elif 9 <= valor < 10:
            diccionario_temporal[clave] = "Sobresaliente"
        elif valor == 10:
            diccionario_temporal[clave] = "Matricula de honor"
        else:
            diccionario_temporal[clave] = "Calificación errónea"

    print("--- TUS CALIFICACIONES ---")
    for clave, valor in diccionario_temporal.items():
        print(clave, "...", valor)
    return
