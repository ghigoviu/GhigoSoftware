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
	$lenguaje= "HTML5";

	switch ($lenguaje) {
		case 'PHP':
			// code...
		echo "BACK-END";
			break;
		case 'javascript':
			// code...
		echo "front-end y del back end";
			break;
		case 'HTML5':
			// code...
		echo "front end";
			break;

		default:
			// code...
		echo "no valido";
			break;
	}
?>
<?php //include 'includes/footer.php'  ?>


