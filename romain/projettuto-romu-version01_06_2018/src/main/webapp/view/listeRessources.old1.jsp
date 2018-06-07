<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!-- Code construit pour bootstrap 3.3.7-dist -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<!--  -->
<title>Templete Fils Rouge</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- encodage de la page -->
<!-- Chargement css de base -->
<!-- Chargement des css Bootstrap -->
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<!-- Chargement des feuilles theme css bootstrap aprais les css Bootstrap principal-->
<link href="<c:url value="/resources/bootstraptheme/theme.min.2.css" />"
	rel="stylesheet">
<!-- Chargement de mes feuilles css -->
<!-- On charge toujour notre css pour surcharger les précédent -->
<link rel="stylesheet" media="all" type="text/css"
	href="<c:url value="/resources/css/template.2.css" />" />
<!-- -->
<!-- Le chargement du javascript peut bloquer la page ,à besin de jquery pour fonctionner-->
<!--  -->
<script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
</head>

<body>
	<nav class="navbar navbar-default m2i-navbar navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">

			<button type="button"
				class="navbar-toggle collapsed navbar-fixed-top"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse navbar-left"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="#">Link</a></li>
					<li class="active"><a href="#">Link <span class="sr-only">(current)</span>
					</a></li>
					<li><a href="#">Link</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
			<a class="navbar-brand" href="#"> Brand </a>
		</div>
		<ul class="nav navbar-nav navbar-right">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown" role="button" aria-haspopup="true"
				aria-expanded="false">login <span class="caret"></span>
			</a>
				<ul class="dropdown-menu">
					<li>
						<!-- Module de connection --> Menu de connection
					</li>
					<li><a href="#">Action</a></li>
				</ul></li>
		</ul>
	</div>
	<!-- /.container-fluid --> </nav>

	<!-- Fin des balise de la barre de navigations %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% -->
	<div class="m2i-body panel-body">

		<div class="panel panel-default">
			<!-- Default panel contents -->
			<div class="panel-heading">Panel heading</div>

			<!-- Table -->
			<table class="table">
				<thead>
					<tr>
						<th><spring:message code="colonne.identifiant" /></th>
						<th><spring:message code="colonne.lbl.ressources"  /></th>
						<th><spring:message code="colonne.lbltype.ressources" /></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listeRessources}" var="ressources">
						<tr>
							<td><c:out value="${ressources.id}" /></td>
							<td><c:out value="${ressources.libebelle}" /></td>
							<td><c:out value="${ressources.typeRessource}" /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Panel title</h3>
			</div>
			<div class="panel-body">
				<p>Accueil | Règle | Jeux</p>
			</div>


			<div class="panel-footer">
				<span class="text-right"> Panel footer </span>
			</div>
		</div>

	</div>

	<!-- Fin des balise de la page %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% -->

	<footer class="navbar navbar-inverse navbar-fixed-bottom m2i-footerbar">
	<div>
		<ul class="nav navbar-nav ">
			<li>
				<div class="row">
					<div class="col-md-12">
						<p>copyright &#9400; 2017-2018 M2I</p>
					</div>
				</div>
			</li>
		</ul>
	</div>
	</footer>
</body>

</html>