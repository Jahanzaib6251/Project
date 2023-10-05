<?php
include 'connection.php';


$sql = "CREATE TABLE if not exists shipp_contain_shipm(
            shipment_ID INT(6)  ,
            FOREIGN KEY(shipment_ID) REFERENCES shipmentdetail(shipment_ID),
            shipper_ID INT(6)  ,
            FOREIGN KEY(shipper_ID) REFERENCES shipper(shipper_ID)
            
            )";

$result = $connection->query($sql);

if($result){
echo "shipp_contain_shipm Table created succesfully...";
}

else{
echo "Error in Creating shipp_contain_shipm Table";
}

$connection->close();
?>