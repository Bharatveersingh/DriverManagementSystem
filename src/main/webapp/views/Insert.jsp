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
	position: fixed;
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

main {
	position: fixed;
}

aside {
	width: 220px;
	background-color: #262261;
	text-align: center;
	height: 90vh;
	position: fixed;
}

.info {
	font-size: x-large;
}

.sidebar-action-buttons {
	color: white;
}

.middle {
	margin-top: 15px;
}

.form-label {
	font-size: large;
}
</style>
</head>
<body>
	<header class="header">
		<nav class="navbar navbar-expand-lg">
			<a class="navbar-brand" href="welcome">DriverManagement</a> 
		</nav>
	</header>

	<div class="main">
		<div class="row">
			<div class="col-sm-2">
				<aside>
					<div class="sidebar left ">
						<div class="user-panel">
							<div class="pull-left info">
								<p class="sidebar-action-buttons">Welcome</p>
							</div>
							<div class="pull-left info">
								<a type="Submit" class="sidebar-action-buttons" href="Insert">Insert Details</a>
							</div>
						</div>
					</div>
				</aside>
			</div>
			<div class="col-sm-10">
				<div class="middle">
					<form:form action="addDriver" method="Post">
						<div class="row">
							<div class="col-sm-6 p-5">
								<div class="form-outline">
									<label class="form-label">ID</label> <input type="text"
										name="id" class="form-control form-control-lg"
										placeholder="name" />
								</div>

								<div class="form-outline mt-2">
									<label class="form-label">firstname</label> 
									<input
										type="text" name="firstName"
										class="form-control form-control-lg"
										placeholder="firstname" />
								</div>

								<div class="form-outline mt-2">
									<label class="form-label">LastName</label> <input type="text"
										name="lastName" class="form-control form-control-lg"
										placeholder="LastName" />
								</div>

								
							</div>
							<div class="col-sm-6 p-5 ">
							
							<div class="form-outline mt-2">
									<label class="form-label">BirthDate</label> <input type="date"
										name="birthDate" class="form-control form-control-lg"
										placeholder="dd/mm/yyyy" />
								</div>
								
								<div class="form-outline">
									<label class="form-label">Address</label> <input type="text"
										name="address" class="form-control form-control-lg"
										placeholder="Address" />
								</div>


								<div class="button-sbmit mt-5 text-right">
									<button class="btn btn-primary btn-lg" type="submit">Save</button>
								</div>
							</div>
						</div>

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