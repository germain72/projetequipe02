<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	    <form:form method="post" modelAttribute="modification" action="modifierModificationListeCourses">
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
					<c:forEach items="${modification.listeCourses}" var="client" varStatus="status">
		                <tr>
		                    <td>
		                	<c:out value="${client.idclient}"/>
								<input type="hidden" name="listeClients[${status.index}].idclient" value="${client.idclient}"/>
		                	</td>
		                	<td>
		                	<c:out value="${client.nomclient}"/>
								<input type="hidden" name="listeClients[${status.index}].nomclient" value="${client.nomclient}"/>
		                	</td>
		                	<td>
								<input type="text" name="listeClients[${status.index}].prenomclient" value="${client.prenomclient}"/><br/>
								<b><i><form:errors path="listeClients[${status.index}].prenomclient" /></i></b>
		                	</td>
		                </tr>
		            </c:forEach>
	            </tbody>
	        </table>
	        <input type="submit"/>
	    </form:form>
