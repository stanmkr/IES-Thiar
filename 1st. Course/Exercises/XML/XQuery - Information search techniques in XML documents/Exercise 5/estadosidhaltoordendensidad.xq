for $a in doc("datosue.xml")//estado
let $densidad:=doc("datosue.xml")/$a/poblacion div $a/superficie
where $a/idh > 0.92
order by $densidad descending
return concat($a/@nombre,", ",$a/idh)