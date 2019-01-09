<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="models.Vehicle"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Vehicles</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	</head>
	
	<body>
		<div class="container">
			<h1>All Vehicles</h1>
			<table class="tablel table-bordered table-striped">
				<tr>
	    			<th>ID</th>
	    			<th>Make</th>
	    			<th>Model</th>
	    			<th>Year</th>
	    			<th>Price</th>
	    			<th>License Number</th>
	    			<th>Colour</th>
	    			<th>Number Doors</th>
	    			<th>Transmission</th>
	    			<th>Mileage</th>
	    			<th>Fuel Type</th>
	    			<th>Engine Size</th>
	    			<th>Body Style</th>
	    			<th>Condition</th>
	    			<th>Notes</th>
	  			</tr>
				<%
					ArrayList<Vehicle> allVehicles = (ArrayList<Vehicle>) request.getAttribute("allVehicles");
					for (Vehicle v : allVehicles)
					{
						out.write("<tr> <td>" + v.getVehicle_id() + "</td> <td>" + v.getMake() + "</td> <td>" + v.getModel() + "</td> <td>" + v.getYear() + "</td> <td>" + v.getPrice() + "</td> <td>" + v.getLicense_number() + "</td> <td>" + v.getColour() + "</td> <td>" + v.getNumber_doors() + "</td> <td>" + v.getTransmission() + "</td> <td>" + v.getMileage() + "</td> <td>" + v.getFuel_type() + "</td> <td>" + v.getEngine_size() + "</td> <td>" + v.getBody_style() + "</td> <td>" + v.getCondition() + "</td> <td>" + v.getNotes() + "</td> </tr>");
					}
				%>
			</table>
			<br>
			<a href="./addnew">+ New Vehicle</a>
		</div>
	</body>
	
</html>