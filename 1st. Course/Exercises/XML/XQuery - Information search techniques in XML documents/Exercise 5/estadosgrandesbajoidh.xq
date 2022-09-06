for $a in doc("datosue.xml")//estado
where $a/idh < 0.93 and $a/superficie > 100000
order by $a/idh descending
return concat($a/@nombre,", ",$a/idh/text())