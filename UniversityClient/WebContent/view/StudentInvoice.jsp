<%@page import="edu.cmpe273.univserver.beans.StudentCourse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Invoice</title>
</head>
<body>
 <% if(session.getAttribute("user")==null)
	  {
	  	response.sendRedirect("Login.jsp");
	  	return;
	  }
	  %>
  <div class = "container">
	<div  class = "row" id = "main-content">
		<div class = "well">
		<form>
			<fieldset>
				<%
				StudentCourse[] invoiceReply = (StudentCourse[])session.getAttribute("invoiceReply");
				for(int iCount=0; iCount<invoiceReply.length;iCount++){
				%>
					
				<%=invoiceReply[iCount].getSjsuid() %>	
					
			<%}%>
			</fieldset>
		</form>
	</div>
	</div>
</div>

</body>
</html>