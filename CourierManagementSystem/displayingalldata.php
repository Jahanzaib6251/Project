<?php
include "connection.php";

$trackid = $_POST['trackingid'];

$sql = "SELECT * from shipmentdetail sd NATURAL JOIN  shipper s NATURAL JOIN courier c NATURAL JOIN assignto d where  shipment_ID ='$trackid'; ";
$result = $connection->query($sql);


if($result->num_rows>0){
    
    echo "
    <style>
                    
    table{
        background-color:black;
       
        width: 100%;
        height:80%
        
    }
    tr{
        background-color:lightgrey;
        text-align:center;
        width:10%
        
    }

    td{
        background-color:wheat;
        height:60%;
    }
    
    </style>

    <table>
    <tr>
    <th>shipment location</th>
    <th>shipment weight</th>
    <th>shipment description</th>
    <th>shipment status</th>
    <th>shipment payment</th>
    <th>shipment price</th>
    <th>shipper name</th>
    <th>shipper address</th>
    <th>shipper contact</th>
    <th>receiver name</th>
    <th>receiver address</th>
    <th>receiver contact</th>
    <th>courier name</th>
    <th>courier status</th>
 
    </tr>
    ";
    while($row = $result->fetch_assoc()){
    echo"
    <tr>
    <td>$row[shipment_Location]</td>
    <td>$row[shipment_Weight]</td>
    <td>$row[shipment_Description]</td>
    <td>$row[shipment_status]</td>
    <td>$row[shipment_payment]</td>
    <td>$row[shipment_price]</td>
    <td>$row[shipper_name]</td>
    <td>$row[shipper_address]</td>
    <td>$row[shipper_contact]</td>
    <td>$row[receiver_name]</td>
    <td>$row[receiver_address]</td>
    <td>$row[receiver_contact]</td>
    <td>$row[courier_name]</td>
    <td>$row[courier_status]</td>
    
    
    </tr>
    ";
    } 
    echo "</table>";

   
}
else{
    echo "<br>";
    echo "no record found";
}
?>