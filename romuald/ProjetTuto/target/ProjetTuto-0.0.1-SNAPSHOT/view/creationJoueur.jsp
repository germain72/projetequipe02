<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/ loose.dtd">

	<form:form method="post" modelAttribute="creationJoueur"
		action="creerCreationListeJoueurs">
		<spring:message code="creation.elementjoueurs.nom.nom" />
		<form:input path="nom" />
		<b><i><form:errors path="nom" cssclass="error" /></i></b>
		<br>
		<br>
		<input type="submit" />
	</form:form>
	<table border="1">
		<thead>
			<tr>
				<th><spring:message code="colonne.identifiant" /></th>
				<th><spring:message code="colonne.nom" /></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listeJoueurs}" var="joueur">
				<tr>
					<td><c:out value="${joueur.idJoueur}" /></td>
					<td><c:out value="${joueur.nom}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

