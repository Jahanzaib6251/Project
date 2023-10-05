<?php
include 'connection.php';

// SQL Create Table Query
$sql = "CREATE TABLE if not exists courier(

		courier_ID INT(6) AUTO_INCREMENT PRIMARY KEY  ,
		courier_name varchar(20) not null,
		courier_password int(10) not null default '1234',
		courier_Contact varchar(11) NOT NULL default '03201235678',
		courier_status varchar(10) not null,
		courier_city varchar(10) not null
		)";

if ($connection->query($sql) === TRUE) {

echo "Courier Table created succesfully...";
}else{
echo "Error in Creating Courier Table";
}

?>