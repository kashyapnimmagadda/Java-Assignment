<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
	padding: 15px;
	text-align: left;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

h2 {
	color: green;
}

.error {
	color: red
}
</style>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<center>
		<h1>Registration Page</h1>
		<form:form action="store" method="post" modelAttribute="bean"
			name="regForm" onsubmit="return matchpass()">
			<table>
				<tr>
					<td>Username</td>
					<td><form:input path="userName" id="username" /></td>
					<td><form:errors path="userName" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" id="firstpass" /></td>
					<td><form:errors path="password" cssClass="error" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><form:input path="" id="secondpass" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form:form>

		<br>
		<h2>${msg}</h2>
	</center>

</body>
</html>