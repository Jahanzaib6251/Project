<?php
include 'connection.php';

$shipmenttodelete=$_POST['shipmentid'];

$sql = "DELETE FROM shipmentdetail WHERE shipment_id='$shipmenttodelete'";
if ($connection->query($sql) === TRUE) {
    $sql = "DELETE FROM shipper WHERE shipment_id='$shipmenttodelete'";
    if ($connection->query($sql) === TRUE){
        $sql = "DELETE FROM assignto WHERE shipment_id='$shipmenttodelete'";
        if ($connection->query($sql) === TRUE){
            echo "record deleted";
        }
    }
}
else {
    echo "no record present";
}
$connection->close();
?>





 