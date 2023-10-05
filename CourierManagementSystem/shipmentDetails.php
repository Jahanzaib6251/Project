<?php

include 'connection.php';


// SQL Create Table Query
$sql = "CREATE TABLE if not exists ShipmentDetail(
shipment_ID INT(6)  AUTO_INCREMENT PRIMARY KEY,
shipment_Location VARCHAR(30) NOT NULL,
shipment_Weight int(50) NOT NULL,
shipment_Description varchar(30) not null,
shipment_status varchar(30) not null,

shipment_payment varchar(10) not null ,
shipment_price int(20) not null,

manager_ID int(6),
FOREIGN KEY(manager_ID) REFERENCES manager(manager_ID) ON DELETE CASCADE , 
courier_id int(6),
FOREIGN KEY(courier_id) REFERENCES courier(courier_id) ON DELETE CASCADE 

)";
if ($connection->query($sql) === TRUE) {

echo "ShipmentDetail Table created succesfully...";
}else{
echo "Error in Creating ShipmentDetail Table";
}



?>