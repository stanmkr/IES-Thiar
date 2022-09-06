<humedadmas70>{
for $dias in doc("prevision_vielha.xml")//dia/@fecha
  where $dias/../humedad_relativa/maxima>70
return
<fecha>{$dias/string()}</fecha>
}</humedadmas70>