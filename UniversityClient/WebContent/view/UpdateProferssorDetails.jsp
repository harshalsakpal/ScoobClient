<%@page import="edu.cmpe273.univserver.beans.Person"%>
<%@page import="edu.cmpe273.univserver.beans.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Delete Professor Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%String context = request.getContextPath(); %>
<!-- Bootstrap -->
<link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet" media="screen">
<%@ include file="AdminHome.jsp" %>
<%@ include file="Proxy.jsp" %>
</head>
<script type="text/javascript">
	
</script>
<body>
			
 <% 
 	if(session.getAttribute("admin")==null)
	  {
	  	response.sendRedirect("AdminLogin.jsp");
	  	return;
	  }
	  %>

	<div class="container control-group">
		<header class="row">
			<div class="span12">
				<div class="well">
					<form method="post" name="updateProfessor" >
						<div class="controls controls-row info">
							<input type="text" class="input-medium required span3"
								placeholder="SJSU ID" id="inputinfo" required="required"
								name="sjsuid" rel="popover"
								data-content="please type your course name"
								onkeypress="return removeError()"> 
								<span id="sjsuiderror" class="error"></span>
						</div>

						<div>
							<input type="button" class="btn btn-success" value="Search"
								onclick=" return doContinue()"> <br>
						</div>
					<br>
					<%if(session.getAttribute("instructorDetails")!=null){ 
					Person person = (Person)session.getAttribute("instructorDetails");
					
					%>
					<table>
						<tr>
							<td>SJSU ID</td>
						<td>
							<input type="text" value=<%=person.getSjsuid() %> name="sjsuid" disabled="disabled"></td>
						</tr>
							
						<tr>
						<td>First Name</td>
							<td><input type="text" value=<%=person.getFirstName() %> name="firstName" disabled="disabled"></td>
						</tr>
							
						<tr>
							<td>Last Name</td>
							<td><input type="text" value=<%=person.getLastName() %> name="lastName" disabled="disabled"></td>
						</tr>
						
						<tr>
							<td>Address Line 1</td>
							<td><input type="text" value=<%=person.getAddrLine1() %> name="addrLine1" disabled="disabled"></td>
						</tr>
						
						<tr>
						<td>Address Line 2</td>
						<td><input type="text" value=<%=person.getAddrLine2() %> name="addrLine2" disabled="disabled"></td>
						</tr>
						
						<tr>
						<td>City</td>
						<td><input type="text" value=<%=person.getCityName() %> name="cityName" disabled="disabled"></td>
						</tr>
						
						<tr>
						<td>State</td>
						<td><input type="text" value=<%=person.getStateName() %> name="stateName" disabled="disabled"></td>
						</tr>
						
						<tr>
						<td>Zip</td>
						<td><input type="text" value=<%=person.getZipCode() %> name="zipCode" disabled="disabled"></td>
						</tr>
							
						<tr>
						<td>Email Id</td>
						<td><input type="text" value=<%=person.getEmailid() %> name="emailid" disabled="disabled"></td>
						</tr>
						
						<tr><td>Password</td>
						<td><input type="password" value=<%=person.getPassword() %> name="password" disabled="disabled"></td>
						</tr>
						<tr><td>Date Of Birth</td>
						<td><input type="text" value=<%=person.getDateOfBirth() %> name="dateOfBirth" disabled="disabled"></td>
						</tr>
						<tr><td>Gender</td>
						<td><input type="text" value=<%=person.getGender() %> name="gender" disabled="disabled"></td>
						</tr>
						<tr><td>Department</td>
						<td><input type="text" value=<%=person.getDepartment() %> name="department" disabled="disabled"></td>
						</tr>	
				</table>		

						<input type="button" class="btn btn-success" value="Submit" name="submit" onclick="return doContinue()" disabled="disabled">
								
						<input type="button" class="btn btn-info" value="Edit" name="edit" onclick="enableFields()">
													
					<%}	else if(session.getAttribute("instructorDetailsMessage")!=null){%>
						<%=session.getAttribute("instructorDetailsMessage") %>
					<%} %>
					</form>
				</div>
			</div>
		</header>
	</div>
<script type="text/javascript">
	function doContinue(){
		var sjsuid = document.updateProfessor.sjsuid.value;
		
		if(sjsuid==null||sjsuid==""){
	    	document.getElementById("sjsuiderror").innerHTML = "Please Enter SJSU ID";
	    	return false;
		}
		   document.updateProfessor.action = '../UpdateProfessor';
		   document.updateProfessor.submit();
	}
 	
	function removeError() {
		var sjsuid = document.updateProfessor.sjsuid.value; 
		if(sjsuid!=null||sjsuid!=""){
	    	document.getElementById("sjsuiderror").innerHTML = "";
		}
	}

	function enableFields(){
		document.updateProfessor.submit.disabled = false;
		document.updateProfessor.edit.disabled = true;
		document.updateProfessor.department.disabled = false;
		document.updateProfessor.firstName.disabled = false;
		document.updateProfessor.lastName.disabled = false;
		document.updateProfessor.addrLine1.disabled = false;
		document.updateProfessor.addrLine2.disabled = false;
		document.updateProfessor.cityName.disabled = false;
		document.updateProfessor.stateName.disabled = false;
		document.updateProfessor.zipCode.disabled = false;
		document.updateProfessor.emailid.disabled = false;
		document.updateProfessor.password.disabled = false;
		document.updateProfessor.dateOfBirth.disabled = false;
		document.updateProfessor.gender.disabled = false;
		document.updateProfessor.role.disabled = false;
		
	}

</script>

</body>
</html>