<?php
	require 'dbcon.php';
	if (!$con) {
		echo "Error Connecting DB!";
	}else {
		if (!mysqli_select_db($con, $db)) {
			echo "DB does not exist!";
		} else {
			$phoneNumber = $_REQUEST['phoneNumber'];
			$res = mysqli_query($con, "SELECT * FROM su WHERE phoneNumber='$phoneNumber'") or die(mysqli_error($con));
			if (mysqli_num_rows($res) == 1) {
				echo "admin";
				return;
			} 
			$res = mysqli_query($con, "SELECT * FROM donors WHERE phoneNumber='$phoneNumber'") or die(mysqli_error($con));
			if (mysqli_num_rows($res) == 1) {
				echo "donor";
				return;
			} else {
				echo "false";
				return;
			}
		}
		
	}
?>