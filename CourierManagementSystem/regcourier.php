<?php
include 'connection.php';

$sql2="INSERT INTO courier(courier_name,courier_status,courier_city) VALUES('$_POST[couriername]','$_POST[courierstatus]','$_POST[couriercity]')";
    $result2=$connection->query($sql2);

if($result2)
{
    echo "courier registerd succfully...";
}

$connection->close();
?>