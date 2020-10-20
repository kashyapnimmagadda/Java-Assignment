<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Login Page</h1>
		<form:form action="user/authenticate" method="post" modelAttribute="bean">
  		user name : <form:input path="USER_NAME" />
  		password : <form:input path="USER_PASSWD" />
			<input type="submit">


		</form:form>
	</center>
</body>
</html>