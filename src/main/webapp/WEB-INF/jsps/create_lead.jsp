<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h1>Create New Lead</h1>
	<form action= "saveLead" method= "post">
		<pre>
			First Name <input type= "text" name= "firstName"/>
			Last Name <input type= "text" name= "lastName"/>
			Email <input type= "text" name= "email"/>
			Mobile <input type= "text" name= "mobile"/>
			Source: <select name= "source">
						<option value= "newsPaper">News Paper</option>
						<option value= "webSite">Web Site</option>
						<option value= "Add">Advertise</option>
						<option value= "seminer">Seminar</option>
					</select>
			<input type= "submit" value= "save"/>
		</pre>
	</form>
</body>
</html>