from datetime import date, time, datetime, timedelta
import locale

hoy = date.today()
fecha_progenitor = input("Fecha nacimiento progenitor/a (dia/mes/año): ")
fecha_hijo = input("Fecha nacimiento hijo/a (dia/mes/año): ")
fecha_progenitor_convertida = datetime.strptime(fecha_progenitor, "%d/%m/%Y")
fecha_hijo_convertida = datetime.strptime(fecha_hijo, "%d/%m/%Y")

diferencia = fecha_hijo_convertida - fecha_progenitor_convertida
fecha_doble = fecha_hijo_convertida + diferencia
locale.setlocale(locale.LC_ALL, "es-ES")
fecha_cadena = fecha_doble.strftime("%A, %d de %B de%Y")
print(f"Fencha en que progenitor dobla al hijo:  {fecha_cadena}")

# fecha_progenitor_entero = fecha_progenitor.split("/")
# fecha_progenitor_convertida = date(int(fecha_progenitor_entero[2]), int(fecha_progenitor_entero[1]),
#                                    int(fecha_progenitor_entero[0]))
# fecha_progenitor_convertida = date.strftime("5/10/1952" "%d%m&Y")
