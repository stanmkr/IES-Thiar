for $marca at $i in doc("rental.xml")//coche/marca
    return <vehiculo>
      {concat($marca/text()," ", $marca/@modelo)}
      {if ($marca/../precio<48) then (
       <barato/>
     )else(
       <caro/>
     )}
    </vehiculo>