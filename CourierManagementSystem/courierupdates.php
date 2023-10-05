<?php
include 'connection.php';

$shipmentstatus= $_POST['shipmentstatus'];
$courierid = $_POST['courierid'];
$shipmentid=$_POST['shipmentid'];

$a = "select * from shipmentdetail where shipment_id = '$shipmentid' ";

$r=$connection->query($a);
if($r->num_rows>0){
    
        $row = $r->fetch_assoc();
        $c = $row["courier_id"];
        
        if(($c)==$courierid) {
            
            $sql="INSERT INTO assignto( courier_id ,shipment_id , shipment_status ) VALUES( '$courierid' , '$shipmentid' , '$shipmentstatus')"; 
            $x=$connection->query($sql);
            if($x){
                echo "inserted";
            }
        }
        else{
            
            echo "you are not assigned this shipment";
            
        }
}
else{
    
    echo "no record present";
}



$connection->close();



?>