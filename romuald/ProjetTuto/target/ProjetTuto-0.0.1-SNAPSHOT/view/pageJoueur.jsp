<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/ loose.dtd">
<html>
<head>

<title><spring:message code="titre.application.joueur" /></title>
</head>
<body>
	<table>
		<tbody>
			<tr>
				<td valign="top">
					<table>
						<tbody>
							<tr>
								<td><c:url value="/afficherListeJoueurs" var="url" /> <a
									href="${url}"> <spring:message code="titre.listejoueurs" />
								</a></td>
							</tr>
							<tr>
								<td><c:url value="/afficherCreationListeJoueurs" var="url" />
									<a href="${url}"> <spring:message
											code="titre.creation.elementjoueurs" />
								</a></td>
							</tr>
							<tr>
								<td><c:url value="/afficherSuppressionListeJoueurs"
										var="url" /> <a href="${url}"> <spring:message
											code="titre.suppression.elementjoueurs" />
								</a></td>
							</tr>
							<tr>
								<td><c:url value="/afficherModificationListeJoueurs"
										var="url" /> <a href="${url}"> <spring:message
											code="titre.modification.elementjoueurs" />
								</a></td>
							</tr>
						</tbody>
					</table>
				</td>
				<td valign="top"><tiles:insertAttribute name="principal" /></td>
			</tr>
		</tbody>
	</table>
	</body>