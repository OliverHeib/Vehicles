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
	    			<th scope="col">ID</th>
	    			<th scope="col">Make</th>
	    			<th scope="col">Model</th>
	    			<th scope="col">Year</th>
	    			<th scope="col">Price</th>
	    			<th scope="col">License Number</th>
	    			<th scope="col">Colour</th>
	    			<th scope="col">Number Doors</th>
	    			<th scope="col">Transmission</th>
	    			<th scope="col">Mileage</th>
	    			<th scope="col">Fuel Type</th>
	    			<th scope="col">Engine Size</th>
	    			<th scope="col">Body Style</th>
	    			<th scope="col">Condition</th>
	    			<th scope="col">Notes</th>
	  			</tr>
				<%
					ArrayList<Vehicle> allVehicles = (ArrayList<Vehicle>) request.getAttribute("allVehicles");
					for (Vehicle v : allVehicles)
					{
						out.write("<tr> <th scope='row'>" + v.getVehicle_id() + "</th> <td>" + v.getMake() + "</td> <td>" + v.getModel() + "</td> <td>" + v.getYear() + "</td> <td>" + v.getPrice() + "</td> <td>" + v.getLicense_number() + "</td> <td>" + v.getColour() + "</td> <td>" + v.getNumber_doors() + "</td> <td>" + v.getTransmission() + "</td> <td>" + v.getMileage() + "</td> <td>" + v.getFuel_type() + "</td> <td>" + v.getEngine_size() + "</td> <td>" + v.getBody_style() + "</td> <td>" + v.getCondition() + "</td> <td>" + v.getNotes() + "</td> </tr>");
					}
				%>
			</table>
			<br>
			<a href="./addnew">+ New Vehicle</a>
		</div>
	</body>
	
</html>