<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<link href="<c:url value="/resources/bootstraptheme/theme.min.4.css" />"
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
	<!--<div class="m2i-body panel-body"><!-- -->
	<main class="m2i-body panel-body">


		<!-- Default panel contents -->

		<!-- Form ID LIBEBELLE -->
		<!-- <form action="creeActionRessources" method="post" class=""  modelAttribute="creationJoueur">
			<h2>Creation d'une Ressources</h2>
			<label for="formLibelle"><spring:message
					code="form.lbl.ressources" /> : </label><input type="text"
				id="formLibelle" name="formLibelle" /><br /> <input type="submit"
				value="Envoyer">
		</form> -->
		<div class="well">
			<form:form action="creeActionRessources" modelAttribute="creation" cssClass="form-horizontal">
			<!--<form action="creeActionRessources" method="post" 
				class="form-horizontal"><!--  -->
				<fieldset>
					<legend>
						<spring:message code="form.legend.ressources" />
					</legend>
					<form:errors path="libelle">
					<div class="has-error">
					</form:errors>
					<div class="form-group "> <!-- has-error has-warning has-success-->
						<label for="formLibelle" class="col-lg-2 control-label"><spring:message
								code="form.lbl.ressources" /><form:errors path="libelle"><span> : </span></form:errors><form:errors path="libelle"/></label>
						<div class="col-lg-10">
							<form:input path="libelle" id="formLibelle" cssClass="form-control"/>
							<!-- <input type="text" id="formLibelle" name="formLibelle" class="form-control"/><!--  -->
						</div>
					</div>
					<form:errors path="libelle">
					</div>
					</form:errors>
					<div class="form-group">
						<div class="col-lg-10 col-lg-offset-2">
							<!-- <button class="btn btn-default">Cancel</button><!---->
							<button type="submit" class="btn btn-primary">
								<spring:message code="form.submit" />
							</button>
						</div>
					</div>
				</fieldset>
			<!--</form><!--  -->
			</form:form>
		</div>


	</main>
	<!-- </div><!-- -->

	<!-- Fin des balise de la page %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% -->
	<footer class="panel-footer navbar-fixed-bottom">
	<div class="row">
		<div class="col-md-12">
			<p>copyright &#9400; 2017-2018 M2I</p>
		</div>
	</div>
	</footer>
</body>
</html>