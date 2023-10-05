<?php
include 'connection.php';

$city = $_POST['shipmentLocation'];

$a = "select * from courier where courier_city = '$city'";

$b = $connection->query($a);


if($b){
    
    if($city=='gujranwala'){
        
    $c = "select * from shipmentdetail where shipment_Location = '$city'";

    $d = $connection->query($c);
   
    if($d->num_rows<=10){
        $e="INSERT INTO shipmentdetail(shipment_weight,shipment_Location,shipment_payment,shipment_price,shipment_description,manager_ID,courier_id) VALUES('$_POST[shipmentweight]','$_POST[shipmentLocation]','$_POST[shipmentpayment]','$_POST[shipmentprice]','$_POST[shipmentdescription]','1','1')";
        $f=$connection->query($e);

        if($f){
           
            $g="INSERT INTO shipper(shipper_name , shipper_contact , shipper_address ,receiver_name , receiver_contact ,receiver_address) VALUES('$_POST[shippername]','$_POST[shippercontact]','$_POST[shipperaddress]','$_POST[receivername]','$_POST[receivercontact]','$_POST[shipmentLocation]')";
            $h=$connection->query($g);
                                if($h){
                        $i = "select shipper_id, shipment_id from shipper natural join shipmentdetail order by shipper_id desc limit 1";
                       $j = $connection->query($i);
                    if($j->num_rows > 0){
                            $row = $j->fetch_assoc();
                            $f_shipper_id = $row["shipper_id"];
                            $f_shipment_id = $row["shipment_id"];
                            
                            $k = "insert into shipp_contain_shipm (`shipment_ID`, `shipper_ID`) VALUES ($f_shipment_id, $f_shipper_id)";
                            $l = $connection->query($k);
                            if ($l) {
                              $m =  "insert into mang_getdetail_shipp(`manager_ID`, `shipper_ID`) VALUES (1, $f_shipper_id)";
                              $n = $connection->query($m);
                              if ($n) {
                                  $o = "INSERT INTO assignto(`manager_id`, `courier_id`, `shipment_ID`) VALUES (1, 1,$f_shipment_id)"; 
                                   $p = $connection->query($o);
                                   if ($p) {
                                        echo "data inserted";
                                   }
                              }
                            }
                            }
        }       }
    }
    else {
        echo "sorry ! max orders today";
    }
}
    
        elseif($city=='lahore'){
        
            $c = "select * from shipmentdetail where shipment_Location = '$city'";
            $d = $connection->query($c);
            if($d->num_rows<=10){
                $e="INSERT INTO shipmentdetail(shipment_weight,shipment_Location,shipment_payment,shipment_price,shipment_description,manager_ID,courier_id) VALUES('$_POST[shipmentweight]','$_POST[shipmentLocation]','$_POST[shipmentpayment]','$_POST[shipmentprice]','$_POST[shipmentdescription]','1','2')";
                $f = $connection->query($e);
                if($f){
                    $g="INSERT INTO shipper(shipper_name , shipper_contact , shipper_address ,receiver_name , receiver_contact ,receiver_address) VALUES('$_POST[shippername]','$_POST[shippercontact]','$_POST[shipperaddress]','$_POST[receivername]','$_POST[receivercontact]','$_POST[shipmentLocation]')";
                    $h=$connection->query($g);
                                        if($h){
                        $i = "select shipper_id, shipment_id from shipper natural join shipmentdetail order by shipper_id desc limit 1";
                       $j = $connection->query($i);
                    if($j->num_rows > 0){
                            $row = $j->fetch_assoc();
                            $f_shipper_id = $row["shipper_id"];
                            $f_shipment_id = $row["shipment_id"];
                            
                            $k = "insert into shipp_contain_shipm (`shipment_ID`, `shipper_ID`) VALUES ($f_shipment_id, $f_shipper_id)";
                            $l = $connection->query($k);
                            if ($l) {
                              $m =  "insert into mang_getdetail_shipp(`manager_ID`, `shipper_ID`) VALUES (1, $f_shipper_id)";
                              $n = $connection->query($m);
                              if ($n) {
                                   $o = "INSERT INTO assignto(`manager_id`, `courier_id`, `shipment_ID`) VALUES (1, 2,$f_shipment_id)"; 
                                   $p = $connection->query($o);
                                   if ($p) {
                                        echo "data inserted";
                                   }
                              }
                            }
                            }
                       }
                    }
                }
                
            else {
                echo "sorry ! max orders lahore today";
            }
        }

        elseif($city=='sialkot'){
        
            $c = "select * from shipmentdetail where shipment_Location = '$city'";
            $d = $connection->query($c);
            if($d->num_rows<=10){
                $e="INSERT INTO shipmentdetail(shipment_weight,shipment_Location,shipment_payment,shipment_price,shipment_description,manager_ID,courier_id) VALUES('$_POST[shipmentweight]','$_POST[shipmentLocation]','$_POST[shipmentpayment]','$_POST[shipmentprice]','$_POST[shipmentdescription]','1','3')";
                $f=$connection->query($e);
                if($f){
                    $g="INSERT INTO shipper(shipper_name , shipper_contact , shipper_address ,receiver_name , receiver_contact ,receiver_address) VALUES('$_POST[shippername]','$_POST[shippercontact]','$_POST[shipperaddress]','$_POST[receivername]','$_POST[receivercontact]','$_POST[shipmentLocation]')";
                    $h=$connection->query($g);
                    if($h){
                        $i = "select shipper_id, shipment_id from shipper natural join shipmentdetail order by shipper_id desc limit 1";
                       $j = $connection->query($i);
                    if($j->num_rows > 0){
                            $row = $j->fetch_assoc();
                            $f_shipper_id = $row["shipper_id"];
                            $f_shipment_id = $row["shipment_id"];

                            $k = "insert into shipp_contain_shipm (`shipment_ID`, `shipper_ID`) VALUES ($f_shipment_id, $f_shipper_id)";
                            $l = $connection->query($k);
                            if ($l) {
                              $m =  "insert into mang_getdetail_shipp(`manager_ID`, `shipper_ID`) VALUES (1, $f_shipper_id)";
                              $n = $connection->query($m);
                              if ($n) {
                                  $o = "INSERT INTO assignto(`manager_id`, `courier_id`, `shipment_ID`) VALUES (1, 3,$f_shipment_id)"; 
                                   $p = $connection->query($o);
                                   if ($p) {
                                        echo "data inserted";
                                   }
                              }
                            }
                            } else {
                                    echo "No rows found";
                                }
                }}
            }
            else {
                echo "sorry ! max orders sialkot today";
            }
        }

        elseif($city=='wazirabad'){
        
            $c = "select * from shipmentdetail where shipment_Location = '$city'";
            $d = $connection->query($c);
            if($d->num_rows<=10){
                $e="INSERT INTO shipmentdetail(shipment_weight,shipment_Location,shipment_payment,shipment_price,shipment_description,manager_ID,courier_id) VALUES('$_POST[shipmentweight]','$_POST[shipmentLocation]','$_POST[shipmentpayment]','$_POST[shipmentprice]','$_POST[shipmentdescription]','1','4')";
                $f=$connection->query($e);
                if($f){
                    $g="INSERT INTO shipper(shipper_name , shipper_contact , shipper_address ,receiver_name , receiver_contact ,receiver_address) VALUES('$_POST[shippername]','$_POST[shippercontact]','$_POST[shipperaddress]','$_POST[receivername]','$_POST[receivercontact]','$_POST[shipmentLocation]')";
                        $h=$connection->query($g);
                        if($h){
                        $i = "select shipper_id, shipment_id from shipper natural join shipmentdetail order by shipper_id desc limit 1";
                       $j = $connection->query($i);
                    if($j->num_rows > 0){
                            $row = $j->fetch_assoc();
                            $f_shipper_id = $row["shipper_id"];
                            $f_shipment_id = $row["shipment_id"];
                            
                            $k = "insert into shipp_contain_shipm (`shipment_ID`, `shipper_ID`) VALUES ($f_shipment_id, $f_shipper_id)";
                            $l = $connection->query($k);
                            if ($l) {
                              $m =  "insert into mang_getdetail_shipp(`manager_ID`, `shipper_ID`) VALUES (1, $f_shipper_id)";
                              $n = $connection->query($m);
                              if ($n) {
                                  $o = "INSERT INTO assignto(`manager_id`, `courier_id`, `shipment_ID`) VALUES (1, 4,$f_shipment_id)"; 
                                   $p = $connection->query($o);
                                   if ($p) {
                                        echo "data inserted";
                                   }
                              }
                            }
                            }
                        }
                }
            }
            else {
                echo "sorry ! max wazirabad orders today";
            }
        }
    
 }

$connection->close();
?>

<!-- ,'$_POST[shipperid]' -->