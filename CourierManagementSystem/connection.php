<?php
  $servername ="localhost";
  $username ="root";
  $password ="";
  $database ="courier_management_system";

  $connection = mysqli_connect($servername, $username,$password,$database);

  if (!$connection) {
    // code...
      echo "Not Connecte...";
  }
?>
