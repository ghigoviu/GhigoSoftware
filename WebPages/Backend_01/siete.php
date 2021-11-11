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
if (1<0) {
	// code...
	echo "1 es  mayor ";
} else {
	// code...
	echo "1 es  mayor ";
}

echo "<hr>";
$edad1=13;
$edad2=12;

if ($edad1 < $edad2) {
	echo "la edad 1 es menor";

} else {
	echo "la edad 1 es meyor";
}
echo "<hr>";

$numero =10;
if ($numero % 2==0) {
	// code...
	echo "es numero es par";
} else {
	// code...
	echo "el numero es impar";
}


?>
<?php //include 'includes/footer.php'  ?>


