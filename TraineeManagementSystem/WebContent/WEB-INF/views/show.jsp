<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.trainee.model.dao.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${param.message}
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Branch</th>
			<th>Percentage</th>
		</tr>

		<c:forEach items="${trainees}" var="trainee">
			<tr>
				<td>${trainee.id}</td>
				<td>${trainee.name}</td>
				<td>${trainee.branch}</td>
				<td>${trainee.percentage}</td>
			</tr>

		</c:forEach>
	</table>
	<a href="home.jsp">Go to HomePage</a>

</body>
</html>