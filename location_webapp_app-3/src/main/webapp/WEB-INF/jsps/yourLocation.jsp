<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
</head>
<body>
<h2>Location</h2>
<a href=getLocation>Click here to view all Records </a>
<form action ="saveLocation" method="post" >
<table>
<tr>
<th>Id<input type="text" name="id">
</th>
</tr>
<tr>
<th>Code<input type="text" name="code">
</th>
</tr>
<tr>
<th>Name<input type="text" name="name">
</th>
</tr>
<tr>
<th>Urban<input type="radio" name="type" value ="Urban">
</th>
</tr>
<tr>
<th>Rural<input type="radio" name="type" value ="Rural">
</th>
</tr>
<tr>
<th><input type="Submit" name ="save">
</tr>
</table>
${msg}
</form>                                                                                                                                     
</body>
</html>