<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>

<h1>Employee Form</h1>
<hr>
<spring:form action="employee" method="post" modelAttribute="emodel">
	<table>
	<tr>
		<td>FirstName</td>
		<td><spring:input path="fname"/></td>
	</tr>
	
	<tr>
		<td>LastName</td>
		<td><spring:input path="lname"/></td>
	</tr>
	
	<tr>
		<td>Gender</td>
		<td>
			<spring:radiobutton path="gender" value="male"/>Male
			<spring:radiobutton path="gender" value="female"/>Female
		</td>
	</tr>
	
	<tr>
		<td>Date</td>
		<td><spring:input path="date" type="date"/></td>
	</tr>
	
	<tr>
		<td>Phone</td>
		<td><spring:input path="phone"/></td>
	</tr>
	
	<tr>
		<td>Company</td>
		<td><spring:input path="company"/></td>
	</tr>
	
	<tr>
		<td>Position</td>
		<td><spring:input path="position"/></td>
	</tr>
	
	<tr>
		<td>Salary</td>
		<td><spring:input path="salary"/></td>
	</tr>
	
	<tr>
		<td>Country</td>
		<td><spring:input path="address.country"/></td>
	</tr>
	
	<tr>
		<td>City</td>
		<td><spring:input path="address.city"/></td>
	</tr>
	
	<tr>
		<td>State</td>
		<td>
			<spring:select path="address.state">
				<spring:option value="">----select--</spring:option>
				<spring:option value="1">state-1</spring:option>
				<spring:option value="2">state-2</spring:option>
				<spring:option value="3">state-3</spring:option>
				<spring:option value="4">state-4</spring:option>
				<spring:option value="5">state-5</spring:option>
			</spring:select>
		</td>
	</tr>
	
	<tr>
		<td>Zip</td>
		<td><spring:input path="address.zip"/></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="save" /></td>
	</tr>
	
	</table>
</spring:form>
</body>
</html>