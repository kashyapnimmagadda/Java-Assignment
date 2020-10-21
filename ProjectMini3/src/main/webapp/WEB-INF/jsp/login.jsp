<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
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

h4 {
	color: red;
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
		<a href="index.jsp">Home</a>
	</div>
	<br>
	<br>
	<center>
		<h1>Login Page</h1>

		<form:form action="user/authenticate" method="post"
			modelAttribute="bean">
			<table>
				<tr>
					<td>user name :</td>
					<td><form:input path="USER_NAME" /></td>
				</tr>
				<tr>
					<td>password :</td>
					<td><form:input path="USER_PASSWD" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form:form>
		<h4>${msg }</h4>
		<br> <br> if not a member yet, please <a href="home">Register</a>
	</center>
</body>
</html>