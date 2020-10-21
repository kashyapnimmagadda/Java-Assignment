<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Pet</title>
<style type="text/css">
th, td {
	padding: 26px;
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
	width: 5px;
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
	<br>
	<br>
	<center>
		<h1>Pet Information</h1>
		<form:form action="pet/addpet" method="post" modelAttribute="bean">
			<table>
				<tr>
					<td>Name :</td>
					<td><form:input path="PET_NAME" /></td>
				</tr>
				<form:errors path="PET_NAME"></form:errors>
				<tr>
					<td>Age :</td>
					<td><form:input path="PET_AGE" /></td>
				</tr>
				<form:errors path="PET_AGE"></form:errors>
				<tr>
					<td>Place :</td>
					<td><form:input path="place" /></td>
				</tr>
				<form:errors path="place"></form:errors>
				<tr>
					<td></td>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form:form>
	</center>
</body>
</html>