<%@page import="edu.cmpe273.univserver.beans.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>List of All Students</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
	String context = request.getContextPath();
	Person[] person = (Person[])session.getAttribute("listOfAllStudents");
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
			<div class="span9">
				<div class="well">
					
						
				<%if(person!=null){%> 
				<form action="ListStudentsForACourse.jsp">
				<input type="submit" Value="Return"><br><br>
					<table border="1" align="left">
				<tr>
					<td>Sr. No.</td><td>SJSU ID</td><td>First Name</td><td>Last Name</td>
					<td>Email ID</td></tr>	
				
				<%	for(int iCount=0;iCount<person.length;iCount++){
					%>
				
				<tr>
					<td><%=(iCount)+1 %></td>
					<td><%=person[iCount].getSjsuid() %></td>
					<td><%=person[iCount].getFirstName()%></td>
					<td><%=person[iCount].getLastName()%></td>
					<td><%=person[iCount].getEmailid()%></td>
					
				</tr>
				
				<%}%>
				</table>
				<% }%>
		
		</form>
		</div>
			</div>
			</header>
			</div>
			
</body>
</html>
