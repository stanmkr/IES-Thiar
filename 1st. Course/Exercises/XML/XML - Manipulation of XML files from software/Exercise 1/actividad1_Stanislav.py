import xml.etree.ElementTree as ET

arbol = ET.parse("rental.xml")
raiz = arbol.getroot()

# Muestre por pantalla la etiqueta del elemento raíz
print(f"Etiqueta del elemento raíz: {raiz.tag}")

# Muestra por pantalla los atributos del segundo hijo del elemento raíz
print(f"Atributos del 2º hijo del elemento raíz: {raiz[1].attrib}")

# Muestra por pantalla la cantidad de elementos hijos del elemento raíz
print("Cantidad de elementos hijos del elemento raíz:",len(raiz))

# Muestra por pantalla el texto de primer hijo del segundo hijo del elemento raíz
print(f"Texto del primero hijo del segundo hijo de la raiz: {raiz[1][0].text}")

# Muestra por pantalla el tail del primer hijo del sexto hijo del primer hijo del elemento raíz
print(f"\n---- El tail es: {raiz[0][5][0].tail}")

# Muestra por pantalla la etiqueta y el contenido textual de los primeros hijos de todos los hijos del elemento raíz
# (es decir, la etiqueta de cada elemento <matricula> y su contenido). Haz uso de un bucle for.
print("---- Etiqueta de cada elemento <matricula> y su contenido ----")
for hijos_raiz in raiz:
    for primer_hijo in hijos_raiz:
        if primer_hijo.tag == "matricula":
            print(f"Etiqueta elemento: {primer_hijo.tag}\nContenido: {primer_hijo.text}\n")

for coche in raiz:
    print(f"{coche[0].tag}:{coche[0].text}")


