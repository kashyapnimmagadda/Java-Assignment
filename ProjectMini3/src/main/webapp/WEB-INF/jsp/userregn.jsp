<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<script type="text/javascript">
	function matchpass() {
		var firstpassword = document.regForm.firstpass.value;
		var secondpassword = document.regForm.secondpass.value;
		if (secondpassword == null || secondpassword == "") {
			alert("Confirm the password")
			return false;
		} else if (firstpassword == secondpassword) {
			return true;
		} else {
			alert("Password must be same!!");
			return false;
		}
	}
</script>
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

.error {
	color: red
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
		<a href="loginpage">Login</a>
	</div>
	<div>
		<a href="index.jsp">Home</a>
	</div>

	<br>
	<br>
	<br>
	<center>
		<h1>Registration page</h1>
		<form:form action="user/add" method="post" modelAttribute="bean"
			name="regForm" onsubmit="return matchpass()">
			<table>
				<tr>
					<td>User Name :</td>
					<td><form:input path="USER_NAME" /></td>
				</tr>
				<form:errors path="USER_NAME" cssClass="error"></form:errors>
				<tr>
					<td>Password :</td>
					<td><form:input path="USER_PASSWD" id="firstpass" /></td>
					<td><form:errors path="USER_PASSWD" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Confirm Password :</td>
					<td><form:input path="confirmPassword" id="secondpass" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form:form>
		<h4>${msg}</h4>
	</center>
</body>
</html>