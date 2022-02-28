<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
	integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn"
	crossorigin="anonymous">

<title>Driver Management System</title>

<style type="text/css">
body{ overflow-y: scroll;}
nav {
	background-color: #262261;
}

.navbar-brand {
	color: white;
	font-size: x-large;
	margin-left: 25px;
}

.navbar-Logout {
	color: white;
	font-size: x-large;
	margin-left: 1050px;
}

aside {
	width: 220px;
	background-color: #262261;
	text-align: center;
	height: 90vh;
}

.info {
	font-size: x-large;
}

.sidebar-action-buttons {
	color: white;
}

.middle {
	margin-top: 30px;
}
#myTable{
width: 100%;
margin-bottom: 20px;
}
.header th{
text-align: center;
padding: 5px 10px;
}
td{
text-align: center;
}
</style>
</head>
<body>
	<header class="header">
		<nav class="navbar navbar-expand-lg">
			<a class="navbar-brand" href="welcome">Driver Management</a> 
		</nav>
	</header>

	<div class="main">
		<div class="row">
			<div class="col-sm-3">
				<aside>
					<div class="sidebar left ">
						<div class="user-panel">
							<div class="pull-left info">
								<p class="sidebar-action-buttons">Welcome</p>
							</div>
							<div class="pull-left info">
								<a type="Submit" class="sidebar-action-buttons" href="Insert">Insert detail</a>
							</div>
						</div>
					</div>
				</aside>
			</div>
			<div class="col-sm-9">
				<div class="middle">
					<form:form action="Drivers" method="Get" >
						

						<table id="myTable" border="2">
							<tr class="header">
							
							
								<th>Id</th>
								<th>FirstName</th>
								<th>LastName</th>
								<th>Birthdate</th>
								<th>Address</th>
								<th>CompanyName</th>
								
							</tr>
							<c:forEach items="${driver}" var="dr" >
								<tr>
									<td>${dr.id}</td>
									<td>${dr.firstName}</td>
									<td>${dr.lastName}</td>
									<td>${dr.birthDate}</td>
									<td>${dr.address}</td>
									<td>${dr.companyName }</td>
									
									<td><a href="update/${dr.id}">Update</a> <a
										href="delete/${dr.id}">delete</a></td>
								</tr>
							</c:forEach>
						</table>
						<button class="btn btn-primary btn-lg" type="submit">data</button>
					</form:form>
				</div>
			</div>
		</div>
	</div>




	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>
    -->
</body>
</html>