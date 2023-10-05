<?php

include 'connection.php';
// SQL Create Table Query
$sql = "CREATE TABLE if not exists manager(
manager_ID INT(6)  PRIMARY KEY default '1',
manager_name varchar(30) NOT NULL default 'Hadi' ,
manager_Contact varchar(11) NOT NULL default '03200123456',
manager_password int(10) not null default '123456'

)";

if ($connection->query($sql) === TRUE) 
{
echo "Manager Table created succesfully...";
}

else
{
echo "Error in Creating Manager Table";
}

?>