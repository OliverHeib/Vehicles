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
			<h1>Log in</h1>
			<form action="dashboard" method="post" >
				<input id="inputUsername" class="inputUsername" type="text" placeholder="Username" required="" name="username"> <br>
				<input id="inputPassword" class="inputPassword" type="password" placeholder="Password" required="" name="password"> <br>
				<input type="submit" value="Login">
			</form>
		</div>
	</body>
	
</html>