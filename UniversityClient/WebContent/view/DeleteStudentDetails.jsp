<%@page import="edu.cmpe273.univserver.beans.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Delete Student Details</title>
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
					<form method="post" name="deleteStudent" >
						<div class="controls controls-row info">
							<input type="text" class="input-medium required span3"
								placeholder="SJSU ID" id="inputinfo" required="required"
								name="sjsuid" rel="popover"
								data-content="please type your course name"
								onclick="return removeError()"> 
								<span id="sjsuiderror" class="error"></span>
						</div>

					<% if(session.getAttribute("deleteReply")!=null){ %>
						<%= session.getAttribute("deleteReply")%>		
					<%} %>
						<div>
							<input type="button" class="btn btn-success" value="Delete Student"
								onclick=" return doContinue()"> <br>
						</div>

					</form>
				</div>
			</div>
		</header>
	</div>

<script type="text/javascript">
	function doContinue(){
		var sjsuid = document.forms[0].sjsuid.value;
		
		if(sjsuid==null||sjsuid==""){
	    	document.getElementById("sjsuiderror").innerHTML = "Please Enter SJSU ID";
	    	return false;
		}
		
		   document.forms[0].action = '../DeleteStudent';
		   document.forms[0].submit();
		
	}
 	
	function removeError() {
			
		var sjsuid = document.forms[0].sjsuid.value; 
		
		if(sjsuid!=null||sjsuid!=""){
	    	document.getElementById("sjsuiderror").innerHTML = "";
		}
	}

</script>

</body>
</html>