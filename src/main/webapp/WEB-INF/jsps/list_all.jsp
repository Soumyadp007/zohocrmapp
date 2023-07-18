<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
<a href= "createLead">Create New Lead</a>
	<h1>List Of All Leads</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Update</th>
		</tr>
		<c:forEach items= "${lead }" var= "lead">
			<tr>
				<td>${lead.id }</td>	
				<td><a href="leadInfo?id=${lead.id }">${lead.firstName }</a></td>
				<td>${lead.lastName }</td>
				<td>${lead.email }</td>
				<td>${lead.mobile }</td>
				<td>${lead.source }</td>
				<td><a href= "update">update</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>