for $marca in doc("rental.xml")//coche/marca/text()
return <fabricante>{$marca}</fabricante>