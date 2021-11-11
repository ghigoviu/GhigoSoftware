<?php include 'includes/header.php' ?>

<div class="contenedor">
<?php
  echo "aprendiendo php";
?>
</div>

<?php
  $a=10;
  $b=5;
  if ($a < $b) {
    echo "$a es el número Mayor";
  }elseif ($a == $b) {
    echo "Los numeros son iguales";
  }else {
    echo "$b es el numero Mayor";
  }


 ?>
 <?php include 'includes/footer.php' ?>
