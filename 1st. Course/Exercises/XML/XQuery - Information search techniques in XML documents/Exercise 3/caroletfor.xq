let $precio_mayor:=(
for $precio in doc("rental.xml")//coche/precio
return $precio)
return <caro>{max($precio_mayor)}</caro>