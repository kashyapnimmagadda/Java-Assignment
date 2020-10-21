<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Home</title>
<style type="text/css">
th {
	background: black;
	color: white;
}

th, td {
	padding: 10px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

h1 {
	color: green;
}

a {
	text-decoration: none;
	color: black;
}

div {
	float: right;
	padding: 20px;
	padding-right: 100px;
	text-align: center;
}

div:HOVER {
	background-color: aqua;
	color: green;
}
</style>
</head>
<body>


	<div>
		<a href="user/logout">Logout</a>
	</div>
	<div>
		<a href="addpet">Add Pet</a>
	</div>
	<br>
	<br>
	<center>
		<h1>Available Pets</h1>
		<table border="2" width="80%">
			<tr>
				<th>PET_AGE</th>
				<th>PET_NAME</th>
				<th>PET_PLACE</th>
				<th>Buy</th>
			</tr>
			<c:forEach var="pet" items="${data }">
				<tr>
					<td>${pet.PET_AGE }</td>
					<td>${pet.PET_NAME }</td>
					<td>${pet.place }</td>
					<td><a href="pets/buyPet/{pet.ID}">Buy</a></td>
				</tr>
			</c:forEach>

		</table>
		<br>
		<h2>${msg }</h2>
	</center>
</body>
</html>