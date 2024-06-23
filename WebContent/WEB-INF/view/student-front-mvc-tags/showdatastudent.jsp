<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>FirstName : ${student.firstName}</p>
<p>LastName :  ${student.lastName}</p>
<p>Age :  ${student.age}</p>
<p>phone :  ${student.phonenumber}</p>
<p>Country :  ${student.country}</p>
<p>Major :  ${student.major}</p>
<p>Language :  ${student.language}</p>

<j:set var="lengthArray" value="${student.courses}"/> 
<j:set var="lengthArray2" value="${fn:length(lengthArray)}"/>


<j:if test="${lengthArray2 > 0}"> 
    <p>
	<j:forEach var="c" items="${student.courses}">
		${c}
	</j:forEach> 
</p>
</j:if> 

<j:if test="${lengthArray2 == 0}"> 
    <p>${ lengthArray2}
	No Courses Registered
</p>
</j:if> 
</body>
</html>