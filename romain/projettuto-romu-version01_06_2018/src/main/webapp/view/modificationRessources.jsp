<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	isELIgnored="false" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Code construit pour bootstrap 3.3.7-dist -->


<div class="well">
	<form:form action="modifierActionRessource" modelAttribute="modifier"
		cssClass="form-horizontal">
		<!--<form action="creeActionRessources" method="post" 
				class="form-horizontal"><!--  -->
		<fieldset>
			<legend> modification de la ressource ${idRessource} </legend>
			<form:hidden path="id" />
			<form:hidden path="typeRessource" />
			<div class="form-group ">
				<!-- has-error has-warning has-success-->
				<form:errors path="libelle">
					<div class="has-error">
				</form:errors>
				<label for="formLibelle" class="col-lg-2 control-label"><spring:message
						code="form.lbl.ressources" />
					<form:errors path="libelle">
						<span> : </span>
					</form:errors>
					<form:errors path="libelle" /></label>
				<div class="col-lg-10">
					<form:input path="libelle" id="formLibelle" cssClass="form-control" />
					<!-- <input type="text" id="formLibelle" name="formLibelle" class="form-control"/><!--  -->
				</div>
				<form:errors path="libelle">
			</div>
			</form:errors>
</div>
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

