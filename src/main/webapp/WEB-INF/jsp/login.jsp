<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<!-- Jquery Base -->
<script type="text/javascript" src="/resources/js/jquery-3.3.1.min.js"></script>
<!-- BootStrap 3.2 (funciona con bootstrp-table) -->
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap-theme.min.css">
<script type="text/javascript" src="/resources/js/bootstrap.min.js"></script>
<!-- Login -->
<link rel="stylesheet" href="/resources/css/login.css">
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

	<div class="container-fluid">
		<div class="row">
			<div class="form">
				<div class="col-md-7">
					<div class="form-group">

						<div class="form-group">
							<label class="sr-only" for="exampleInputEmail2">Username</label>
							<input type="text" class="form-control" id="username"
								placeholder="Username">
						</div>
						<div class="form-group">
							<label class="sr-only" for="exampleInputPassword2">Password</label>
							<input type="password" class="form-control" id="passqord"
								placeholder="Password">
						</div>
						<div class="checkbox">
							<label> <input type="checkbox"> Remember me
							</label>
						</div>
						<button type="submit" class="btn btn-default">Sign in</button>

					</div>
				</div>
				<div class="col-md-5 hidden-xs hidden-sm">
					<div class="form-group">
						<img class="img" src="/resources/images/login.png">
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>