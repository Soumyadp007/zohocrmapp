<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact list</title>
</head>
<body>
	<h1>Contact List</h1>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>last Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Source</th>
			<th>Bill</th>
		</tr>
		<c:forEach items= "${contacts }" var= "contacts">
			<tr>
				<td>${contacts.id }</td>
				<td><a href="contactInfo?id= ${contacts.id }">${contacts.firstName }</a></td>
				<td>${contacts.lastName }</td>
				<td>${contacts.email }</td>
				<td>${contacts.mobile }</td>
				<td>${contacts.source }</td>
				<td><a href= "viewBill?id= ${contacts.id }">Bill</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>