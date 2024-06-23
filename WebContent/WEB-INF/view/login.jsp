<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Log in </h1>
<f:form></f:form>
<form action="loginprocess" method="post">
	<input type="text" placeholder="username" name="user"> 
	<input type="password" placeholder="password" name="pass"> 
	<input type="submit" value="Done">
</form>
</body>
</html>