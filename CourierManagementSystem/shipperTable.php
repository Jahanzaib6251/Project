<?php
include 'connection.php';
// SQL Create Table Query
$sql = "CREATE TABLE if not exists Shipper(
shipper_ID INT(6) AUTO_INCREMENT PRIMARY KEY ,
shipper_name VARCHAR(30) NOT NULL,
shipper_address VARCHAR(50) NOT NULL,
shipper_contact int(10) not null,
receiver_name VARCHAR(30) NOT NULL,
receiver_address VARCHAR(50) NOT NULL,
receiver_contact int(10) not null
)";

if ($connection->query($sql) === TRUE) {

echo "Shipper Table created succesfully...";
}else{
echo "Error in Creating Shipper Table";
}
?>