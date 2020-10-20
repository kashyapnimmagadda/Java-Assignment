<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>
<body>
	<a href="loginpage">go to login</a>
	<center>
		<h1>Registration page</h1>
		<br>
		<form:form action="user/add" method="post" modelAttribute="bean">
		username : <form:input path="USER_NAME" />
			<br>
			<br>
			<form:errors path="USER_NAME" cssClass="error"></form:errors>
		password : <form:input path="USER_PASSWD" />
			<br>
			<br>
		confirm password : <form:input path="confirmPassword" />
			<br>
			<br>
			<input type="submit" value="Register">
		</form:form>
		${msg}
	</center>
</body>
</html>