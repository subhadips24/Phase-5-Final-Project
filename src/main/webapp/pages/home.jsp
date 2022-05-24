<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Fell Up The Details of Employee</h1>
		<form action="insert" method="post">
				<table><tr>
										<td>Enter Employee Name:</td>
										<td><input type="text" name="ename"></td>
							</tr>
							<tr>
										<td>Enter Employee Age:</td>
										<td><input type="text" name="eage"></td>
							</tr>
							<tr>
										<td>Enter Employee Email:</td>
										<td><input type="text" name="eemail"></td>
							</tr>
							<tr>
									<td><input type="submit" name="submit" value="Click for Reg"></td>
							</tr>
				</table>
				
		</form>
</body>
</html>