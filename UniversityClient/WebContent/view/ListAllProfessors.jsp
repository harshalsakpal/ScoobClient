<%@page import="edu.cmpe273.univserver.beans.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>List of All Professors</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
	String context = request.getContextPath();
	Person[] person = (Person[])session.getAttribute("listOfAllProfessors");
%>
<!-- Bootstrap -->
<link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<%@ include file="AdminHome.jsp"%>
<%@ include file="Proxy.jsp"%>
</head>
<body>
	<div class="container control-group">
		<header class="row">
			<div class="span12">
				<div class="well">
					<form method="post" name="ListAllProfessors">
						<div class="controls controls-row info">
							<input type="button" class="input-medium required span3"
								name="GetAllProfessors" value="Get All Professors"
								onclick="return getAllProfessors()">
						</div>

				<%if(person!=null){%> 
				
					<table border="1" align="left">
				<tr>
					<td>Sr. No.</td><td>SJSU ID</td><td>First Name</td><td>Last Name</td><td>City</td>
					<td>Address Line 1</td><td>Address Line 2</td><td>Email ID</td><td>Date of Birth</td><td>Department</td>
				</tr>	
				
				<%	for(int iCount=0;iCount<person.length;iCount++){
					%>
				
				<tr>
					<td><%=(iCount)+1 %></td>
					<td><%=person[iCount].getSjsuid() %></td>
					<td><%=person[iCount].getFirstName()%></td>
					<td><%=person[iCount].getLastName()%></td>
					<td><%=person[iCount].getCityName()%></td>
					<td><%=person[iCount].getAddrLine1()%></td>
					<td><%=person[iCount].getAddrLine2()%></td>
					<td><%=person[iCount].getEmailid()%></td>
					<td><%=person[iCount].getDateOfBirth()%></td>
					<td><%=person[iCount].getDepartment()%></td>
				</tr>
				
				<%}%>
				</table>
				<% }%>

					</form>
				</div>
			</div>
		</header>
	</div>

	<script type="text/javascript">
		function getAllProfessors() {
			document.forms[0].action = "../GetAllProfessors";
			document.forms[0].submit();
		}
	</script>

</body>
</html>
