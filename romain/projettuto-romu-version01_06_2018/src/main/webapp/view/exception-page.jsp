<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
	<h3>Exception Page</h3>
	<p>
		status:<br /><%=response.getContentType()%>
	</p>
	<p>
		Exception Message:<br />${exception.message}
	</p>
	<p>
		Exception type:<br />${exception['class'].name}
	</p>
	<p>
		${exception['class']}
	</p>
</body>
</html>