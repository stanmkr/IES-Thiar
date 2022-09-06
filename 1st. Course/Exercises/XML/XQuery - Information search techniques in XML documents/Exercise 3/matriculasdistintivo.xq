let $azul:=doc("rental.xml")//coche[distintivoambiental="azul"]/matricula,
$verde:=doc("rental.xml")//coche[distintivoambiental="verde"]/matricula
return
<matricula>
<azul>{$azul}</azul>
<verde>{$verde}</verde>
</matricula>