<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>"></script>
        <script type="text/javascript" src="<c:url value="/resources/bootstrap/js/jquery.min.js"/>"></script>
        <link href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />" rel="stylesheet">

        <link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">

        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">

		<script src="<c:url value="/resources/bootstrap/js/bootstrap-datepicker.min.js"/>"></script>
        <link href="<c:url value="/resources/bootstrap/css/datepicker.min.css"/>" rel="stylesheet" />
		<link href="<c:url value="/resources/bootstrap/css/datepicker3.min.css"/>" rel="stylesheet" />
		<script>
 $(function() {$( "#datepicker" ).datepicker({
  firstDay: 1,
  altField: "#datepicker",
  closeText: 'Fermer',
  prevText: 'Précédent',
  nextText: 'Suivant',
  currentText: 'Aujourd\'hui',
  monthNames: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
  monthNamesShort: ['Janv.', 'Févr.', 'Mars', 'Avril', 'Mai', 'Juin', 'Juil.', 'Août', 'Sept.', 'Oct.', 'Nov.', 'Déc.'],
  dayNames: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi'],
  dayNamesShort: ['Dim.', 'Lun.', 'Mar.', 'Mer.', 'Jeu.', 'Ven.', 'Sam.'],
  dayNamesMin: ['D', 'L', 'M', 'M', 'J', 'V', 'S'],
  weekHeader: 'Sem.',
  dateFormat: 'yy-mm-dd'});}); 
 </script>

		
        <title><spring:message code="titre.projettuto"/></title>
    </head>
    <body>
        <table>
            <tbody>
                <tr>
                    <td valign="top">
                        <table>
                            <tbody>
                                <tr><td>
                                    <c:url value="/afficherListeClients" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.listeclients"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherCreationListeClients" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.creerClients"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherModificationListeClients" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.modifierClients"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherSuppressionListeClients" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.supprimerClients"/>
                                    </a>
                                </td></tr>
                            <!--
                                <tr><td>
                                    <c:url value="/afficherListeCourses" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.listecourses"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherCreationListeCourses" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.creation.elementcourses"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherSuppressionListeCourses" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.suppression.elementcourses"/>
                                    </a>
                                </td></tr>
                                <tr><td>
                                    <c:url value="/afficherModificationListeCourses" var="url" />
                                    <a href="${url}">
                                        <spring:message code="titre.modification.elementcourses"/>
                                    </a>
                                </td></tr>
                                -->
                            </tbody>
                        </table>
                    </td>
                    <td valign="top">
                        <tiles:insertAttribute name="principal" />
                    </td>
                </tr>
            </tbody>
        </table>
    </body>
</html>