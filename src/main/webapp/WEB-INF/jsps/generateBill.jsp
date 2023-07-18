<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bill</title>
</head>
<body>
	<h1>Create Bill</h1>
	<form action= "saveBill" method= "post">
		<pre>
			First Name <input type= "text" name= "firstName" value="${contact.firstName }"/>
			Last Name <input type= "text" name= "lastName" value="${contact.lastName }"/>
			Email <input type= "text" name= "email" value="${contact.email }"/>
			mobile <input type= "text" name= "mobile" value="${contact.mobile }"/>
			Product <input type= "text" name= "porduct"/>
			price <input type= "text" name= "price"/>
			<input type= "submit" value="generateBill"/>
		</pre>
	</form>
</body>
</html>