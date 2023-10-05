<?php
include "connection.php";



$sql = "SELECT shipment_Location , count(shipment_Location) as 'shipmentcount' from shipmentdetail group by shipment_Location; ";
$result = $connection->query($sql);


if($result->num_rows>0){
    echo "
    <style>
                    
    table{
        background-color:black;
       
        width: 80%;
        height:30%;
        
    }
    tr{
        background-color:lightgrey;
        text-align:center;
        width:10%;
        
        
    }

    td{
        background-color:wheat;
        height:20%;
        height:30%;
    }
    
    </style>

    <table>
    <tr>
    <th>shipment location</th>
    <th>shipment count</th>
    
 
    </tr>
    ";
    while($row = $result->fetch_assoc()){
    echo"
    <tr>
    <td>$row[shipment_Location]</td>
    <td>$row[shipmentcount]</td>
    
    
    
    </tr>
    ";
    } 
    echo "</table>";

   
}
else{
    echo "no record present";
}

?>