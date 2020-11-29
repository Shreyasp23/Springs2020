<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration Form</title>
<style>
.error{
color:red
}
</style>
</head>
<body>
<form:form modelAttribute="customer" action="processForm">
 	FirstName: <form:input path="firstName"/>
 	<br><br>
 	LastName(*): <form:input path="lastName" />
 	<form:errors path="lastName" cssClass="error"/>
 	<br><br>
 	<br><br>
 	Free passes(*): <form:input path="freePasses" />
 	<form:errors path="freePasses" cssClass="error"/>
 	<br><br>
 	Enter Pincode(*): <form:input path="pinCode" />
 	<form:errors path="pinCode" cssClass="error"/>
 	
 		<br><br>
 	Enter Course Code(*): <form:input path="courseCode" />
 	<form:errors path="courseCode" cssClass="error"/>
 
 	<input type="submit" value="submit"/>
 </form:form>	
</body>
</html>