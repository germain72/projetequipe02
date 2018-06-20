<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script type="text/javascript"
	src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
<script type="text/javascript"
	src="<c:url value="/resources/bootstrap/js/jquery.min.js"/>"></script>
<link
	href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">

<link
	href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />"
	rel="stylesheet">
<!--  <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet"> -->

<link href="<c:url value="/resources/css/projettuto.css" />"
	rel="stylesheet">

<script
	src="<c:url value="/resources/bootstrap/js/bootstrap-datepicker.min.js"/>"></script>
<link
	href="<c:url value="/resources/bootstrap/css/datepicker.min.css"/>"
	rel="stylesheet" />
<link
	href="<c:url value="/resources/bootstrap/css/datepicker3.min.css"/>"
	rel="stylesheet" />

<title><spring:message code="titre.listejoueurs" /></title>
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
</html>