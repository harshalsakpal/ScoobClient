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
			
	<div class="container control-group">
		<header class="row">
			<div class="span12">
			
				
					<div class="well">
						<form id="Admin-page" method="POST" name="assigncourse"  onsubmit="return validate(this)">
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
							
								<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Professor ID" id="inputinfo" name="sjsuid"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="sjsuiderror" class="error"></span>
							</div>
									<div class="controls controls-row info">
									<select class="span2" name="day" 	onchange="return removeError()">
									<option value='' disabled='disabled' selected='selected'>Select DAY</option>
									<option value="MONDAY">MONDAY</option>
									<option value="TUESDAY">TUESDAY</option>
									<option value="WEDNESDAY">WEDNESDAY</option>
									<option value="THURSDAY">THURSDAY</option>
									<option value="FRIDAY">FRIDAY</option>
									<option value="SATURDAY">SATURDAY</option>
									<option value="SUNDAY">SUNDAY</option>
								</select>
									<span id="dayerror" class="error"></span>
							</div>
							
							<div class="controls controls-row info">
								<input type="time" class="input-medium required span3"
									placeholder="NO of Seats" id="inputinfo" name="seats"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="seaterror" class="error"></span>
							</div>
							<div>
								<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Enter Location" id="inputinfo" name="location"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="locerror" class="error"></span>
							</div>
							
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="NO of Seats" id="inputinfo" name="seats"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="seaterror" class="error"></span>
							</div>
							<div>
								<input type="button" class="btn btn-success" value="Assign Class" onclick=" return doContinue()">
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
		var sjsuid=document.forms[0].sjsuid.value;
		
		
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
		if(sjsuid==null||sjsuid==""){
	    	document.getElementById("sjsuiderror").innerHTML = "Please Enter SJSU ID";
	    	return false;
		}


		   document.forms[0].action = '../AssignClass';
		    document.forms[0].submit();
		
	}
 	
	function removeError() {
			
		var department = document.forms[0].department.value; 
		var course_number=document.forms[0].course_number.value; //$("#course_number").val();
		
		var section = document.forms[0].section.value; //$("#section").val();
		var sjsuid=document.forms[0].sjsuid.value;
		
		
		if(department!=null||department!=""){
	    	document.getElementById("depterror").innerHTML = "";
		}
		if(course_number!=null||course_number!=""){
	    	document.getElementById("cnumbererror").innerHTML = "";
		}
		
		if(section!=null||section!=""){
	    	document.getElementById("sectionerror").innerHTML = "";
		}
		if(sjsuid!=null||sjsuid!=""){
	    	document.getElementById("sjsuiderror").innerHTML = "";
		}
		  
	}

   </script>
   	</div>


</body>