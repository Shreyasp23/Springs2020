<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="showForm" modelAttribute="student">

	First Name : <form:input path="firstName"/>
	<br><br>
	Last Name : <form:input path="lastName"/>
	<br><br>
	
	<form:select path="country">
	<form:option value="Brazil" label="Brazil"/>
	<form:option value="Japan" label="Japan"/>
	<form:option value="India" label="India"/>
	<form:option value="Germany" label="Germany"/>
	<br><br>
    </form:select>

	<br><br>
	<p>Select your Fav Language</p>
	<br>
	JAVA<form:radiobutton path="lang" value="Java"/>
	C#<form:radiobutton path="lang" value="C#"/>
	PHP<form:radiobutton path="lang" value="PHP"/>
	Python<form:radiobutton path="lang" value="Python"/>
	<br><br>
	 
	 Your Language is 
	 <form:radiobuttons path="languages" items="${student.languages}"/>
	 
	 Choice of OS
	 Windows<form:checkbox path="os" value="Windows"/>
	 Linux<form:checkbox path="os" value="Linux"/>
	<br><br>
	<input type="submit" value="Submit">

</form:form>


<div id="getName"><p>Confirmed:</p> ${student.fullName}  ${student.country}  ${student.lang}  ${student.languages}
<ul>
<c:forEach items="${student.os}" var="temp">
	
	<li>${temp}</li>
	
</c:forEach>
</ul>
</div>
</body>
</html>