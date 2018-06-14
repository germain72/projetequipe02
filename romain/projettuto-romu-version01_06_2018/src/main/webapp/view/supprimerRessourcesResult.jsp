<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!-- Code construit pour bootstrap 3.3.7-dist -->

<div class="panel panel-default">
	<div class="panel-heading">
		<h3 class="panel-title">Ressource suprimer</h3>
	</div>
	<div class="panel-body">
		<p>La ressource ${supRessources.libebelle } à biens étée suprimer
		</p>
		<p>${supRessources.id } | ${supRessources.libebelle } |
			${supRessources.typeRessource }</p>
	</div>
</div>

<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">Panel heading</div>

	<!-- Table -->
	<table class="table table-hover">
		<thead>
			<tr>
				<th><spring:message code="colonne.identifiant" /></th>
				<th><spring:message code="colonne.lbl.ressources" /></th>
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

