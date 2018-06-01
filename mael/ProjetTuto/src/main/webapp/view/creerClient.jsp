<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	    <form:form method="post" modelAttribute="creation" action="creerCreationListeCourses">
	        <spring:message code="creerClients.pseudoclient" />
	        <form:input path="pseudo"/>
	        <b><i><form:errors path="pseudo" cssclass="error"/></i></b><br>
	        <spring:message code="creerClients.mdpclient"/>
	        <form:input path="mdp"/>
	        <b><i><form:errors path="mdp" cssclass="error"/></i></b><br>
	        <input type="submit"/>
	    </form:form>
	    <table border="1">
	        <thead>
	            <tr>
					<th><spring:message code="colonne.nomclient"/></th>
					<th><spring:message code="colonne.prenomclient"/></th>
					<th><spring:message code="colonne.naissanceclient"/></th>
					<th><spring:message code="colonne.pseudoclient"/></th>
					<th><spring:message code="colonne.mdpclient"/></th>
					<th><spring:message code="colonne.admin"/></th>
				</tr>
			</thead>
			<tbody>
			    <c:forEach items="${listeClients}" var="client">
			        <tr>
						<td><c:out value="${client.nomclient}"/></td>
						<td><c:out value="${client.prenomclient}"/></td>
						<td><c:out value="${client.naissanceclient}"/></td>
						<td><c:out value="${client.pseudoclient}"/></td>
						<td><c:out value="${client.mdpclient}"/></td>
						<td><c:out value="${client.admin}"/></td>
			        </tr>
			    </c:forEach>
			</tbody>
		</table>
