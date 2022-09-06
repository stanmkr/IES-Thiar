for $pais in doc("datosue.xml")//estado
where ($pais/idh)>0.9
group by $fecha := $pais/entrada
order by $fecha
return 
  <incorporacion fecha="{$fecha}">
      {for $p in $pais
      let $pibcap :=(($p/pib)*1000000) div ($p/poblacion)
      order by $pibcap descending
       return <pais pibcapita="{$pibcap}">{string($p/@nombre)}</pais>  
     } 
  </incorporacion>

