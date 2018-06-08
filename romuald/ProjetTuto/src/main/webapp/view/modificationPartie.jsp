<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/ loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript"
	src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
<link href="<c:url value="/resources/css/projettuto.css" />"
	rel="stylesheet">

<title><spring:message code="titre.modification.elementparties" /></title>
</head>
<body>

	<form:form method="post" modelAttribute="modificationParties"
		action="modifierModificationListeParties">
		<table border="1">
			<thead>
				<tr>
					<th><spring:message code="colonne.identifiant" /></th>
					<th><spring:message code="colonne.nom" /></th>
					<th><spring:message code="colonne.date" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${modificationPartie.listeParties}" var="partie"
					varStatus="status">
					<tr>
						<td><c:out value="${partie.idPartie}" /> <input
							type="hidden" name="listeParties[${status.index}].idpartie"
							value="${partie.idPartie}" /></td>
						<td><c:out value="${partie.nom}" /> <input
							type="hidden" name="listeParties[${status.index}].nom"
							value="${partie.nom}" /></td>	
						<td><c:out value="${partie.date}" /> <input type="text"
							name="listeParties[${status.index}].date" value="${partie.date}" /><br>

						<b><i><form:errors
							path="listeParties[${status.index}].date" value="${partie.date}" /></i></b></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="submit" />
	</form:form>


</body>
</html>