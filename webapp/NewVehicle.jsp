<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="models.Vehicle"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8" name="viewport" content="width=device-width initial-scale=1">
		<title>Login</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	</head>
	
	<body>
		<div class="container">
			<h1>New Vehicle</h1>
			<form action="" method="post" >
				<input id="inputText" class="inputText" type="text" placeholder="Make" required="" name="make"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Model" required="" name="model"> <br>
				<input id="inputNumber" class="inputNumber" type="number" placeholder="Year" required="" name="year"> <br>
				<input id="inputNumber" class="inputNumber" type="number" placeholder="Price" required="" name="price"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Licence Number" required="" name="licenceNumber"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Colour" required="" name="colour"> <br>
				<input id="inputNumber" class="inputNumber" type="number" placeholder="Number of Doors" required="" name="numberDoors"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Transmition" required="" name="transmition"> <br>
				<input id="inputNumber" class="inputNumber" type="number" placeholder="Milage" required="" name="milage"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Fuel type" required="" name="fuelType"> <br>
				<input id="inputNumber" class="inputNumber" type="number" placeholder="Engine Size" required="" name="engineSize"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Body Style" required="" name="bodyStyle"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Condition" required="" name="condition"> <br>
				<input id="inputText" class="inputText" type="text" placeholder="Notes" required="" name="notes"> <br>
				<input type="submit" value="Create New Record">
			</form>
		</div>
	</body>
	
</html>