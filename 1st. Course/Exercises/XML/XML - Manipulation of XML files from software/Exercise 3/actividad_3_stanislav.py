import xml.etree.ElementTree as ET

arbol = ET.parse("prevision_vielha.xml")
raiz = arbol.getroot()


print("*** Muestre por pantalla el primer día en el que la probabilidad de precipitación (prob_precipitacion) sea '10'. ***")
diasPrecipitacion10 = raiz.iterfind('.//dia[prob_precipitacion="10"]')
for dia in diasPrecipitacion10:
    print(f"- DIA: {dia.get('fecha')}")



print("*** Muestre por pantalla el valor del atributo fecha de los días en los que la temperatura mínima sea '9'. ***")
diasMinima9 = raiz.iterfind('.//dia/temperatura[minima="9"]/..')

for dia in diasMinima9:
    print(f"- {dia.get('fecha')}")


print("*** Muestre por pantalla el valor del atributo fecha seguido del valor del atributo periodo de las franjas horarias en las que el estado del cielo será intervalos nubosos (el contenido es '13') ***")
estado_cielo_13 = raiz.iterfind('.//dia[estado_cielo="13"]')

for dia in estado_cielo_13:
    print(f"- {dia.get('fecha')}")
    estadoC = dia.findall('.//estado_cielo')
    for elemento in estadoC:
        if elemento.get('periodo') is not None:
            print(f"{elemento.get('periodo')}")