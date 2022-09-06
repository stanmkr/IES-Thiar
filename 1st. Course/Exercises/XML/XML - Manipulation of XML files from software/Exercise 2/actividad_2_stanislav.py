import xml.etree.ElementTree as ET

arbol = ET.parse("obras.xml")
raiz = arbol.getroot()

print("*** Muestre por pantalla el contenido del primer elemento <titulo> ***")
print(raiz.findtext(".//titulo"))

print("\n*** Muestre por pantalla el contenido de <museo> de la <foto> cuyo autor es Steve McCurry ***")
print(raiz.findtext('.//foto[autor="Steve McCurry"]/museo'))

print("\n*** Muestre por pantalla el contenido del <titulo> y el <autor> de todos los elementos <pintura> ***")
for pintura in arbol.findall('pintura'):
    print(f"Titulo: {pintura.findtext('.//titulo')} || Autor: {pintura.findtext('.//autor')}")

print(
    "\n*** Muestre por pantalla el contenido de <titulo> y <autor> de todas las obras (ya sean <pintura> o <foto>) del museo Reina Sofía ***")
pinturas = arbol.findall('.//pintura[museo="Reina Sofía"]')
fotos = arbol.findall('.//foto[museo="Reina Sofía"]')
for obra in pinturas:
    print(f"Titulo: {obra.findtext('.//titulo')} || Autor: {obra.findtext('.//autor')}")
for obra in fotos:
    print(f"Titulo: {obra.findtext('.//titulo')} || Autor: {obra.findtext('.//autor')}")

print("\n*** Muestre por pantalla el contenido de <autor> y <anyo> de la foto cuyo <titulo> es Chica con una Leica ***")
for foto in raiz.findall('foto[titulo="Chica con una Leica"]'):
    print(f"Autor: {foto.findtext('.//autor')} || Año: {foto.items()[1][1]}")

print("\n*** Muestre por pantalla los atributos y correspondientes valores de la <pintura> cuyo <titulo> es Foll ***")
pinturaFol = arbol.findall('.//pintura[titulo="Foll"]')
for elemento in pinturaFol:
    print(f"{elemento.items()[0][0]}: {elemento.items()[0][1]}")
    print(f"{elemento.items()[1][0]}: {elemento.items()[1][1]}")

print(
    "\n*** Muestre por pantalla los atributos de las obras (ya sean <pintura> o <foto>) que tengan el atributo visible = true ***")
obras_visibles = raiz.findall("./*/museo[@visible='true']/..")
for obra in obras_visibles:
    print(f"- {obra.findtext('titulo')} : {obra.attrib}")
