#   se separa la cadena de caracteres con el método split, usando el separador \n
alumnos = "nif;nombre;email;teléfono;nota\n01234567L;Pedro " \
          "González;pedrogonzalez@mail.com;656343576;8.5\n" \
          "71476342J;Candela Costa;candela@mail.com;692839321;8\n" \
          "63823376M;Juan Martínez;juanjo@mail.com;664888233;5.2\n" \
          "98376547F;Carolina Sánchez;carolina@mail.com;667677855;5.7\n".split("\n")

#   las cadenas se insertan en una lista
lista_alumnos = [alumnos[0].split(";"), alumnos[1].split(";"), alumnos[2].split(";"), alumnos[3].split(";"),
                 alumnos[4].split(";")]

#   diccionario vacío que será rellenada más adelante
diccionario_alumnos = {}

# se recorre el diccionario y con el método default de los diccionarios, se agrega el NIF como clave y un diccionario
# con la información de cada alumno
for i in range(1, len(lista_alumnos)):
    diccionario_alumnos.setdefault(lista_alumnos[i][0],
                                   {lista_alumnos[0][1]: lista_alumnos[i][1],
                                    lista_alumnos[0][2]: lista_alumnos[i][2],
                                    lista_alumnos[0][3]: lista_alumnos[i][3],
                                    lista_alumnos[0][4]: lista_alumnos[i][4]})

#   muestro el diccionario
for i in diccionario_alumnos:
    print(i, ":", diccionario_alumnos.get(i))

suma_notas = 0
var = 0
#   recorro la longitud del diccionario de alumnos
for i in range(len(diccionario_alumnos)):
    var += 1
    suma_notas += float(lista_alumnos[var][4])
print("\nLa nota media de los alumnos es:", suma_notas / len(diccionario_alumnos))
