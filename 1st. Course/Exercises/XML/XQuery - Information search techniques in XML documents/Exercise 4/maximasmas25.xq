for $dias in doc("prevision_vielha.xml")//dia/@fecha
  where $dias/../temperatura/maxima>25
return $dias