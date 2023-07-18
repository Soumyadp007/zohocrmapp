<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bill</h1>
	First Name: ${bill.firstName }<br/>
	Last Name: ${bill.lastName }<br/>
	Email: ${bill.email }<br/>
	mobile: ${bill.mobile }<br/>
	product: ${bill.product }<br/>
	price: ${bill.price }<br/>
	<a href= "">Download Bill</a>
</body>
</html>