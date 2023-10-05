<?php
include 'connection.php';


$sql = "CREATE TABLE if not exists assignto(
    manager_id int(6) default '1',
    FOREIGN KEY(manager_id) REFERENCES manager(manager_id) ON DELETE CASCADE ,
    courier_id int(6),
    FOREIGN KEY(courier_id) REFERENCES courier(courier_id) ON DELETE CASCADE  ,
    shipment_ID INT(6)  ,
    FOREIGN KEY(shipment_ID) REFERENCES shipmentdetail(shipment_ID) ON DELETE CASCADE  ,
    shipment_status varchar(10) not null
    
    )";


$result = $connection->query($sql);

if($result){
echo "Assignto Table created succesfully...";
}

else{
echo "Error in Creating Assignto Table";
}

$connection->close();
?>