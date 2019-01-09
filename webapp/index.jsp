<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="models.Vehicle"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>Vehicles</title>
	</head>
	
	<body>
		<h1>All Vehicles</h1>
		<%
			ArrayList<Vehicle> allVehicles = (ArrayList<Vehicle>) request.getAttribute("allVehicles");
			for (Vehicle v : allVehicles)
			{
				out.write("" + v.getVehicle_id() + v.getMake() + v.getModel() + v.getYear() + v.getPrice() + v.getLicense_number() + v.getColour() + v.getNumber_doors() + v.getTransmission() + v.getMileage() + v.getFuel_type() + v.getEngine_size() + v.getBody_style() + v.getCondition() + v.getNotes() + "<br>");
			}
		%>
		<br>
		<a href="./addnew">+ New Vehicle</a>
	</body>
	
</html>