<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="Drivers" method="Get" >
						

						<table id="myTable" border="2">
							<tr class="header">
							
							
								<th>Id</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Birthdate</th>
								<th>Address</th>
								
							</tr>
							<c:forEach items="${driver}" var="dr" >
								<tr>
									<td>${dr.id}</td>
									<td>${dr.firstName}</td>
									<td>${dr.lastName}</td>
									<td>${dr.birthDate}</td>
									<td>${dr.address}</td>
									
									<td><a href="update/${dr.id}">Update</a> <a
										href="delete/${dr.id}">delete</a></td>
								</tr>
							</c:forEach>
						</table>
						<button class="btn btn-primary btn-lg" type="submit">data</button>
					</form:form>
					<a href="Insert">Insert</a>
</body>
</html>