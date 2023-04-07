<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Locations</title>
</head>
<body>
<h2>All Locations</h2>
<table border ='1'>

<tr>
   <th>Id</th>
    <th>Code</th>
    <th>Name</th>
     <th>Type</th>
</tr>
<c:forEach items="${locations}" var="location">
<tr>
   <th>${location.id}</th>
    <th>${location.code}</th>
    <th>${location.name}</th>
     <th>${location.type}</th>
</tr>



</c:forEach>



</table>
</body>
</html>