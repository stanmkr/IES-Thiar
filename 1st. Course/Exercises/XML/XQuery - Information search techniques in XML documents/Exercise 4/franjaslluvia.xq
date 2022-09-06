<franjaslluvia>{
  for $dias in doc("prevision_vielha.xml")//dia
    for $lluvias in $dias//prob_precipitacion
    where $lluvias="5" or $lluvias="10"
   return
   <fecha franja ="{$lluvias/@periodo}">{$dias/@fecha/string()}</fecha>
}</franjaslluvia>