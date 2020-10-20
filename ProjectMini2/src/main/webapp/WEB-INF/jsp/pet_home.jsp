<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th {
	background: black;
	color: white;
}
</style>
</head>
<body>
	welcome to pet home
	<center>
		<h1>Available Pets</h1>
		<table border="2" width="100%">
			<tr>
				<th>PET_AGE</th>
				<th>PET_NAME</th>
				<th>PET_PLACE</th>
				<th>PET_OWNERID</th>
			</tr>
			<c:forEach var="pet" items="${data }">
				<tr>
					<td>${pet.PET_AGE }</td>
					<td>${pet.PET_NAME }</td>
					<td>${pet.place }</td>
					<td>${pet.owner }</td>
				</tr>
			</c:forEach>

		</table>
		<br>
		<h2>${msg }</h2>
	</center>
</body>
</html>