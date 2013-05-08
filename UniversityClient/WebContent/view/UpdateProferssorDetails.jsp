<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Update User Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
	String context = request.getContextPath();
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
					<form method="post" name="updateProfessor">
						<div class="controls controls-row info">
							<input type="text" class="input-medium required span3"
								placeholder="SJSU ID" id="inputinfo" required="required"
								name="sjsuid" rel="popover"
								data-content="please type your course name"
								onkeypress="return removeError()"> <span
								id="sjsuiderror" class="error"></span>
						</div>

						<div>
							<input type="button" class="btn btn-success" value="Search"
								onclick="return doContinue()"> <br>
							<%
					if(session.getAttribute("updateReply")!=null){%> 
						<%=session.getAttribute("updateReply") %>	
					
					<%}	%>
						</div>
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

</script>
</body>
</html>