<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>

</head>
<body>

					<form:form action="addDriver" method="POST" >
							<label >ID</label> <input type="number" name="id"  />
							<label>firstname</label> <input type="text" name="firstName" />
							<label>LastName</label> <input type="text" name="lastName"  />
							<label>BirthDate</label> <input type="date" name="birthDate" />
							<label>Address</label> <input type="text" name="address"  />
							<button class="btn btn-primary btn-lg" type="submit">Save</button>
					</form:form>
							
</body>
</html>