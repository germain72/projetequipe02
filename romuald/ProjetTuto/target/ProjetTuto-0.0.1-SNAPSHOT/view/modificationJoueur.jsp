<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/ loose.dtd">

	<form:form method="post" modelAttribute="modificationJoueur"
		action="modifierModificationListeJoueurs">
		<table border="1">
			<thead>
				<tr>
					<th><spring:message code="colonne.identifiant" /></th>
					<th><spring:message code="colonne.nom" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${modificationJoueur.listeJoueurs}" var="joueur"
					varStatus="status">
					<tr>
						<td><c:out value="${joueur.idpartie}" /> <input type="hidden"
							name="listeJoueurs[${status.index}].idJoueur" value="${joueur.idjoueur}" />
						</td>
						<td><c:out value="${joueur.nom}" /> <input type="text"
							name="listeJoueurs[${status.index}].nom" value="${joueur.nom}" /><br>

							<b><i><form:errors
										path="listeJoueurs[${status.index}].nom"
										value="${joueur.nom}" /></i></b></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="submit" />
	</form:form>
