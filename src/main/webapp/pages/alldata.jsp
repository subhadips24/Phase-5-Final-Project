<%@page import="com.mySpring.api.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="com.mySpring.api.*"%>

<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="">
	<%
	List<Employee> e1 = (List<Employee>) request.getAttribute("allemp");
	%>
	<p class="h1" style="text-align: center; color: blue;">Employee All
		Data</p>
	<br>

	<table class="table table-success table-striped">
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Age</th>
			</tr>
		</thead>
		<%
		for(Employee ee:e1)
		{
		%>
		<tbody>
			<tr>
				<th scope="row"><%=ee.getEId() %></th>
				<td><%=ee.getEName() %></td>
				<td><%= ee.getEEmail()%></td>
				<td><%= ee.getEAge()%></td>
			</tr>
		</tbody>
		<%
		}
		%>
		
	</table>
		<br>
		<button type="button" class="btn btn-outline-success"><a href="/" style="text-align: center;">Go For Registration</a></button>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>