<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/ loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
<link href="<c:url value="/resources/projettuto.css" />" rel="stylesheet">

<title><spring:message code="titre.suppression.elementjoueurs" /></title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th><spring:message code="colonne.identifiant" /></th>
				<th><spring:message code="colonne.nom" /></th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listeJoueurs}" var="joueur">
				<tr>
					<td><c:out value="${joueur.idJoueur}" /></td>
					<td><c:out value="${joueur.nom}" /></td>
					<td><c:url value="/supprimerSuppressionListeJoueurs" var="url">
							<c:param name="idJoueur" value="${joueur.idJoueur}" />
						</c:url> <a href="${url}"> <spring:message
								code="suppression.supprimer.nomjoueur" />
					</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>