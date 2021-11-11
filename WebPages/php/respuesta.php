<?php include 'includes/header.php' ?>
<?php
$nombre = $_POST['nombre'];
$app = $_POST['app'];
$apm = $_POST['apm'];
$mensaje = $_POST['mensaje'];
?>

<?php
  if ($nombre || trim()!='') { ?>
    <p>Nombre:
      <?php  echo $nombre. "<br>" ?>
    </p>
  }
<?php else{
  echo "Campo obligatorio<br>";
  }?>

<?php
  if ($app || trim()!='') { ?>
    <p>Apellido materno:
      <?php  echo $app. "<br>" ?>
    </p>
  }
<?php else{
  echo "Campo obligatorio<br>";
  }?>

<?php
  if ($apm || trim()!='') { ?>
    <p>Apellido paterno:
      <?php  echo $apm. "<br>" ?>
    </p>
  }
<?php else{
  echo "Campo obligatorio<br>";
  }?>


<?php
  if (isset($_REQUEST['opciones'])){
    $carreras = $_POST['carreras'];
    echo "La carrera que seleccionaste es: ";
    foreach ($opciones as $opcion) {
      echo $carrera;
    }
  } else {
    echo "No seleccionaste una carrera";
  }
?>

<?php
if(isset($_POST['area'])){
$area = $_REQUEST['area'];
  echo "<H2>Area de especialización</H2>";
  switch ($area) {
    case '1':
      echo "FRONT END Y BACK END";
      break;
    case '2':
      echo "Matlab";
      break;
    case '3':
      echo "Procesos alimenticios";
      break;
    default:
      echo "Sistemas de lógica combinatoria";
    break;
  }
}
?>
x
