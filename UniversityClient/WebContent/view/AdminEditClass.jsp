<%@page import="edu.cmpe273.univserver.beans.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Admin-</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
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
						<form id="Admin-page" method="POST" name="addcourse"  onsubmit="return validate(this)">
							 	<div>

								<select class="span3" name="department" onchange="return removererror()">
									<option value='' disabled='disabled' selected='selected'>Select Department</option>
									<option value="CMPE">Computer Engineering</option>
									<option value="SE">Software Engineering</option>
									<option value="CS">Computer Science</option>
									<option value="EE">Electrical Engineering</option>
									<option value="ME">Mechanical Engineering</option>
								</select>
								<span id="depterror" class="error"></span>
							</div>
							
				
						      
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Course Number" id="inputinfo" name="course_number"
									required="required" rel="popover"
									data-content="please type the course number" onclick="return removeError()">
									<span id="cnumbererror" class="error"></span>
							</div>
					

							<div class="controls controls-row info">
									<select class="span2" name="section" 	onchange="return removeError()">
									<option value='' disabled='disabled' selected='selected'>Select Section</option>
									<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
								</select>
									<span id="sectionerror" class="error"></span>
							</div>
							<div>
								<input type="button" class="btn btn-success" value="Edit Class" onclick=" return doContinue()">
						<br>
							<%if(session.getAttribute("Status")!=null) 
								{
									%>
									<%= session.getAttribute("Status") %>
									<%
									session.removeAttribute("Status");
									} %>
							</div>
						</form>
					</div>
			</div>
		</header>


		<script src="http://code.jquery.com/jquery.js"></script>
		<script src="<%request.getContextPath(); %>/js/bootstrap.min.js"></script>
   <script src="<%request.getContextPath(); %>/js/bootstrap-select.js"></script>


     <script>
 	function doContinue(){
 		
		var department = document.forms[0].department.value;//$("#department").val();
		var course_number=document.forms[0].course_number.value;//$("#course_number").val();
		var section = document.forms[0].section.value;	//$("#section").val();
		
		
		
		if(department==null||department==""){
	    	document.getElementById("depterror").innerHTML = "Please Select Department";
	    	return false;
		}
		
		if(course_number==null||course_number==""){
	    	document.getElementById("cnumbererror").innerHTML = "Please Enter Course Number";
	    	return false;
		}
	
		if(section==null||section==""){
	    	document.getElementById("sectionerror").innerHTML = "Please Select section";
	    	return false;
		}


		   document.forms[0].action = '../GetCourseClass';
		    document.forms[0].submit();
		
	}
 	
	function removeError() {
			
		var department = document.forms[0].department.value; 
		var course_number=document.forms[0].course_number.value; //$("#course_number").val();
		
		var section = document.forms[0].section.value; //$("#section").val();
		
		
		
		if(department!=null||department!=""){
	    	document.getElementById("depterror").innerHTML = "";
		}
		if(course_number!=null||course_number!=""){
	    	document.getElementById("cnumbererror").innerHTML = "";
		}
		
		if(section!=null||section!=""){
	    	document.getElementById("sectionerror").innerHTML = "";
		}
		  
	}

   </script>
   	</div>


</body>