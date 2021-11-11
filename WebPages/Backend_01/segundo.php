<?php include 'includes/header.php'  ?>
<div class="contenedor">
<?php  
 echo "<h1>aprendiendo php<h1/>";
?>
</div>
<?php
	$hola="cadena";
	$numero=20;
	$textocadena="cadena 2";

	echo $hola;
	$saludo="<h2> este es un encabezado</h2>";
	echo $saludo;


?>
<?php 
echo "<hr>"; 
	echo "10+20 =".(10+20);

?>

<?php
$numero1=10;
$numero2=20;
$numero3=30;
$numero4=40;

//suma
echo "<hr>";
echo $numero1 + $numero2;
echo "<hr>";
//resta
echo $numero4 - $numero3;
//multiplicacion
echo "<hr>";
echo $numero1 * $numero2;
//divicion
echo "<hr>";
echo $numero4 / $numero1;
//Parentesis
echo "<hr>";
echo ($numero1 + $numero2)*($numero1 * .16);

//Incremento
echo "<hr>";
 $numero1++;
 echo $numero1;

 //Decremento
echo "<hr>";
 $numero1--;
 echo $numero1;
//incrementos en la misma variable
 echo "<hr>";
 $total=0;
 $total+=10;
 $total+=20;
 $total+=10;
 echo "<hr>";
 echo $total;
 $total=100;
 $total-=10;
  $total-=20;
   $total-=10;
    echo $total;

    echo "<hr>";
    echo 10 %3;
    echo "<hr>";
    echo 10%2;
?>
<?php //include 'includes/footer.php'  ?>


