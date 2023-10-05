<?php
include 'connection.php';
$username = $_POST['username'];
$password = $_POST['password'];


if($username=='1' && $password=='123456'){
    header("location:Manage.html");
}
else {
   $a = "select * from courier where courier_id = '$username' AND courier_password = '$password'";
   $r = $connection->query($a);
   if($r->num_rows>0){
    header("location:courierBOY.html");
   }
   else{
    header("location:Login.html");
   }
    
}

$connection->close();
?>




