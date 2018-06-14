<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Code construit pour bootstrap 3.3.7-dist -->

<div class="panel panel-default">
	<!-- Default panel contents -->
	<!-- <form:form method="POST" cssClass="form-horizontal"><!--  -->
		<div class="panel-heading">Panel heading</div>


		<!-- Table -->
		<table class="table">
			<thead>
				<tr>
					<th><spring:message code="colonne.identifiant" /></th>
					<th><spring:message code="colonne.lbl.ressources" /></th>
					<th><spring:message code="colonne.lbltype.ressources" /></th>
					<th> - </th><!--  -->
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listeRessources}" var="ressources">
					<tr>
						<td><c:out value="${ressources.id}" /></td>
						<td><c:out value="${ressources.libebelle}" /></td>
						<td><c:out value="${ressources.typeRessource}" /></td>
						<td><a href="supprimerActionRessource?idRessource=${ressources.id}">suprimer</a></td>
						<% //<!-- <td><form:radiobuttons path="idRessources" items="${ressources.id}"/></td> <!--  --> %>
					</tr>
				</c:forEach>
			</tbody>
		</table>




	<!-- </form:form><!--  -->
</div>
<div class="well">
	<form:form action="supprimerRessourcesResult" method="POST"  cssClass="form-horizontal">



		<div class="col-lg-10 col-lg-offset-2">
			<!-- <button class="btn btn-default">Cancel</button><!---->
			<button type="submit" class="btn btn-primary">
				<spring:message code="form.submit" />
			</button>
		</div>
	</form:form>
</div>

