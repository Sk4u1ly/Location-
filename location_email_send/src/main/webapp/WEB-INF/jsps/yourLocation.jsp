<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records</title>
<style>
 th {
  float: left;
 }
 #pname{
  width:50px;
 }
</style>
</head>
<body>
<h2>Location</h2>
<form action ="saveLocation" method="post" >
<table>
<tr>
<th id="pname">Id</th>
<th><input type="text" name="id">
</th>
</tr>
<tr>
<th id="pname">Code</th>
<th><input type="text" name="code">
</th>
</tr>
<tr>
<th id="pname">Name</th>
<th><input type="text" name="name">
</th>
</tr>
<tr>
<th id="pname">Urban</th>
<th><input type="radio" name="type" value ="Urban">
</th>
</tr>
<tr>
<th id="pname">Rura</th>
<th><input type="radio" name="type" value ="rural">
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