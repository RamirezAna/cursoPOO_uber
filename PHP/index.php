<?php
require_once('car.php');
require_once('uberX.php');
require_once('uberPool.php');
require_once('account.php');

$uberX = new UberX("CVB123",new Account("Andres","AND456","TOYOTA","VITS"));
$uberX->printDataCar();

$uberPool = new UberPool("CVB123",new Account("Andrea","ANDA123","Chevrolet","Spark"))
$uberPool->printDataCar();

?>