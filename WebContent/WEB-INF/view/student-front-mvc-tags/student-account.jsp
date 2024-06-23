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

	<f:form action="studentprocessTAGS" modelAttribute="student">
		First Name: <f:input path="firstName"   /><br>
		<f:errors path="firstName"></f:errors><br>
		Last Name: <f:input path="lastName"   /><br>
		<f:errors path="lastName"></f:errors><br>
		Age: <f:input path="Age" /> <br>
		<f:errors path="Age"></f:errors><br>
		Phone: <f:input path="Phonenumber" /> <br>
		<f:errors path="Phonenumber"></f:errors><br>
		Country:
		<f:select path="Country">
			<f:option value="Jordan" label="JOR"/>
			<f:option value="USA" label="USA"/>
			<f:option value="Iraq" label="IRQ"/>
		</f:select><br>
		Major:
		<f:select path="Major">
			<f:options items="${student.majors}"/>
		</f:select><br>
		
		Choose Language :
		<f:radiobutton checked="checked" path="Language" value="AR"/>AR
		<f:radiobutton path="Language" value="ENGLISH"/>EN
		<br>
		Choose Courses :
		<f:checkbox path="Courses" value="CIS100"/>CIS100
		<f:checkbox path="Courses" value="CIS101"/>CIS101
		<f:checkbox path="Courses" value="CIS102"/>CIS102
		
		<input type="submit" value="Done">
		
	</f:form>
</body>
</html>