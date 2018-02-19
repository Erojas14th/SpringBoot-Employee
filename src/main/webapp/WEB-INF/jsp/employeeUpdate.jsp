<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<!-- Jquery Base -->
<script type="text/javascript" src="/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="/resources/js/registrar.js"></script>
<!-- JQuery UI -->
<script type="text/javascript" src="/resources/js/jquery-ui.min.js"></script>
<link rel="stylesheet" href="/resources/css/jquery-ui.min.css">
<!-- BootStrap 3.2 (funciona con bootstrp-table) -->
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css">
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<!-- Inicio del Nav-->

	<nav class="nav">
	<ul class="nav nav-tabs" role="tablist">
		<li class="active"><a href="#">Home</a></li>
		<li><a href="#">Profile</a></li>
		<li><a href="#">Messages</a></li>
		<li class="dropdown"><a class="dropdown-toggle"
			data-toggle="dropdown" href="#"> Dropdown <span class="caret"></span>
		</a>
			<ul class="dropdown-menu" role="menu">
				<li role="presentation"><a role="menuitem" tabindex="-1"
					href="/navegacion/goLogin">Ingresar</a></li>
				<li role="presentation"><a role="menuitem" tabindex="-1"
					href="/navegacion/goInicio">Salir</a></li>
			</ul></li>
	</ul>
	</nav>

	<!-- Fin del Nav-->

	<div class="container">
		<div class="row">
			<form action="/employee/update" method="post"
				enctype="multipart/form-data" id="uploadForm">
				<div class="col-md-8">


					<legend>Registrese</legend>

					<div class="form-group">
						<label for="firstName">First Name</label> <input type="text"
							class="form-control" name="id" id="id" placeholder="ID"
							value="${employee.id}">
					</div>


					<div class="form-group">
						<label for="firstName">First Name</label> <input type="text"
							class="form-control" name="firstName" id="firstName"
							value="${employee.firstName}" placeholder="First Name">
					</div>


					<div class="form-group">
						<label for="lastName">Last Name</label> <input type="text"
							class="form-control" name="lastName" id="lastName"
							value="${employee.lastName}" placeholder="Last Name">
					</div>


					<div class="form-group">
						<label for="salary">Salary</label> <input type="text"
							class="form-control" name="salary" id="salary"
							value="${employee.salary}" placeholder="Salary">
					</div>


					<div class="form-group">
						<label for="startDate">Start Date</label> <input type="text"
							class="form-control" id="startDate" name="startDate"
							value="${employee.startDate}" placeholder="Start Date">
					</div>

					<div class="form-group">
						<label for="endDate">End Date</label> <input type="text"
							class="form-control" id="endDate" name="endDate"
							value="${employee.endDate}" placeholder="End Date">
					</div>

				</div>
				<div class="col-md-4">

					<div class="form-group">


						<div id="wrapper" style="margin-top: 20px;">
							<label for="foto">Ingrese su foto</label> <input name="foto"
								id="foto" multiple="multiple" type="file" />
							<div id="image-holder"></div>
						</div>

					
							<img src="data:image/jpeg;base64,${foto}" width="200"
								height="200">
				


					</div>



					<button type="submit" class="btn btn-primary">Registrarse</button>

				</div>

			</form>



			<div class="row">
				<div class="alert alert-primary" role="alert">
					<a href="/employee/list" class="alert-link">Retornar</a>
				</div>
			</div>




		</div>
	</div>
</body>
</html>