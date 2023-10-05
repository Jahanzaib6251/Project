<?php
include 'connection.php';

$sql="INSERT INTO manager(manager_id, manager_contact , manager_password ) VALUES('1','123456','123456')"; 

$result = $connection->query($sql);

if($result){
    echo "record added";
        
        }

$connection->close();

?>