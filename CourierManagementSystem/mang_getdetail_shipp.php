<?php
include 'connection.php';


$sql = "CREATE TABLE if not exists mang_getdetail_shipp(
            manager_ID INT(6)  ,
            FOREIGN KEY(manager_ID) REFERENCES manager(manager_ID),
            shipper_ID INT(6)  ,
            FOREIGN KEY(shipper_ID) REFERENCES shipper(shipper_ID)
            
            )";

$result = $connection->query($sql);

if($result){
echo "mang_getdetail_shipp Table created succesfully...";
}

else{
echo "Error in Creating mang_getdetail_shipp Table";
}

$connection->close();
?>