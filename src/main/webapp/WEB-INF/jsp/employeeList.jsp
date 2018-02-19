<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Jquery Base -->
<script type="text/javascript" src="/resources/js/jquery-3.3.1.min.js"></script>

<!-- Bootstrap Tables-->
<script type="text/javascript" src="/resources/js/bootstrap-table.min.js"></script>
<script type="text/javascript" src="/resources/js/bootstrap-table-es-ES.js"></script>
<link rel="stylesheet" href="/resources//css/bootstrap-table.min.css">
<script type="text/javascript" src="/resources/js/bootstrap-otro.js"></script>
<!-- BootStrap 3.2 (funciona con bootstrp-table) -->
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css">
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>

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


	<!-- Inicio del Body-->

	<div class="container-fluid">
		<div class="row">

			<table data-toggle="table" data-sort-name="name"
				data-sort-order="desc" data-query-params="queryParams"
				data-pagination="true" data-height="500" data-search="true"
				data-show-refresh="true" data-show-toggle="true"
				data-show-columns="true">


				<thead>
					<tr>
						<th data-field="id" data-sortable="true">ID</th>
						<th data-field="firstName" data-sortable="true">First Name</th>
						<th data-field="lastNam" data-sortable="true">Last Name</th>
						<th data-field="salary" data-sortable="true">Salary</th>
						<th data-field="startDate" data-sortable="true">Start Date</th>
						<th data-field="endDate" data-sortable="true">End Date</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach items="${list}" var="e">
						<tr>
							<td scope="row">${e.id}</td>
							<td>${e.firstName}</td>
							<td>${e.lastName}</td>
							<td>${e.salary}</td>
							<td><fmt:formatDate value="${e.startDate}"
									pattern="dd-MM-yyyy" /></td>
							<td><fmt:formatDate value="${e.endDate}"
									pattern="dd-MM-yyyy" /></td>
							<td>

								<div class="alert alert-danger" role="alert">
									<a href="/employee/delete?id=${e.id}" class="alert-link">Delete</a>
								</div>

							</td>
							<td>

								<div class="alert alert-success" role="alert">
									<a href="/employee/surfing?id=${e.id}" class="alert-link">Update</a>
								</div>
							</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
		<div class="row">
			<form action="/employee/surfing" method="get">
				<div class="form-group">
					<input type="hidden" name="id" id="id" value="0">
					<button type="submit" class="btn btn-success">New Employee</button>

				</div>
			</form>
		</div>
	</div>

</body>
</html>