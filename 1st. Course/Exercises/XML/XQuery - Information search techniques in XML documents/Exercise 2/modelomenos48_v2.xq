for $marca at $i in doc("rental.xml")//coche/marca
return
    if ($marca/../precio<48) then (
       <barato> {concat($marca/text()," ", $marca/@modelo)}</barato>
     )else(
       <caro>{concat($marca/text()," ", $marca/@modelo)}</caro>
     )