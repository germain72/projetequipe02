<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

		<table border="1">
			<thead>
				<tr>
					<th><spring:message code="colonne.idclient"/></th>
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
					<td><c:out value="${client.idclient}"/></td>
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
