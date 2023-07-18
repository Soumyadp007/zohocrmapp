<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Mail</title>
</head>
<body>
	<h1>Compose Email</h1>
	<form action= "treggerEmail" method= "post">
		<pre>
			To <input type= "text" name= "email" value= "${email}"/>
			Subject <input type= "text" name= "sub"/>
			 <textarea name= "message" rows= "10" col= "50"></textarea>
			 <input type= "submit" value= "send"/>
		</pre>
	</form>
	${msg }
</body>
</html>