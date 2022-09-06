for $a in doc("datosue.xml")//estado
let $pib_per_capita:=doc("datosue.xml")/$a/pib * 1000000 div $a/poblacion
where $pib_per_capita > 48000
group by $fecha :=$a/entrada
return $a