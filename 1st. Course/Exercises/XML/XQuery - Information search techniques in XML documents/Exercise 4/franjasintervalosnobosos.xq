<intervalosnubosos>{
  for $dias in doc("prevision_vielha.xml")//dia
    for $cielo in $dias//estado_cielo
    where $cielo/@descripcion="Intervalos nubosos"
  return
  <fecha franja="{$cielo/@periodo}">{$dias/@fecha/string()}</fecha>
}</intervalosnubosos>