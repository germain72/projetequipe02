<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Code construit pour bootstrap 3.3.7-dist -->

		<!-- Default panel contents -->

		<!-- Form ID LIBEBELLE -->
		<!-- <form action="creeActionRessources" method="post" class=""  modelAttribute="creationJoueur">
			<h2>Creation d'une Ressources</h2>
			<label for="formLibelle"><spring:message
					code="form.lbl.ressources" /> : </label><input type="text"
				id="formLibelle" name="formLibelle" /><br /> <input type="submit"
				value="Envoyer">
		</form> -->
		<div class="well">
			<form:form action="creeActionRessources" modelAttribute="creation" cssClass="form-horizontal">
			<!--<form action="creeActionRessources" method="post" 
				class="form-horizontal"><!--  -->
				<fieldset>
					<legend>
						<spring:message code="form.legend.ressources" />
					</legend>
<%-- 					<form:errors path="libelle"> --%>
<!-- 						<div class="has-error"> -->
<%-- 					</form:errors> --%>
					<spring:bind path="libelle" >
<!-- 					<div class="form-group"> -->
					<div class="form-group ${status.error ? 'has-error' : ''}">
<!-- 					<div class="form-group "> has-error has-warning has-success -->
						<label for="formLibelle" class="col-lg-2 control-label"><spring:message
								code="form.lbl.ressources" /><form:errors path="libelle" element="span"> : </form:errors><form:errors path="libelle"/></label>
						<div class="col-lg-10">
							<form:input path="libelle" id="formLibelle" cssClass="form-control"/>
							<!-- <input type="text" id="formLibelle" name="formLibelle" class="form-control"/><!--  -->
						</div>
					</div>
					</spring:bind>
<%-- 					<form:errors path="libelle"> --%>
<!-- 					</div> -->
<%-- 					</form:errors> --%>
					<div class="form-group">
						<div class="col-lg-10 col-lg-offset-2">
							<!-- <button class="btn btn-default">Cancel</button><!---->
							<button type="submit" class="btn btn-primary">
								<spring:message code="form.submit" />
							</button>
						</div>
					</div>
				</fieldset>
			<!--</form><!--  -->
			</form:form>
		</div>

