<%@ page import="edu.cmpe273.univserver.beans.InstructorCourse"%>
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
								  
								  <%
								   InstructorCourse c = (InstructorCourse) session.getAttribute("newic");
									%>
	<div class="container control-group">
		<header class="row">
			<div class="span12">
			
				
					<div class="well">
						<form id="Admin-page" method="POST" name="addcourse"  onsubmit="return validate(this)">
							 								
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									 id="inputinfo" name="department" value="<%=c.getDepartment() %>" 
									required="required" rel="popover" readonly="readonly">
									<span id="cnumbererror" class="error"></span>
							</div>	
						      
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Course Number" id="inputinfo" name="course_number" value="<%=c.getCourseNumber() %>" 
									required="required" rel="popover" readonly="readonly"
									data-content="please type the course number" onclick="return removeError()">
									<span id="cnumbererror" class="error"></span>
							</div>			

							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Course Number" id="inputinfo" name="section" value="<%=c.getSection() %>" 
									required="required" rel="popover" readonly="readonly">
									<span id="cnumbererror" class="error"></span>
							</div>			

							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Professor ID" id="inputinfo" name="sjsuid"
									required="required" rel="popover" value=<%=c.getSjsuid() %>
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
									
								</select>
									<span id="dayerror" class="error"></span>
							</div>
							
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="NO of Seats" id="inputinfo" name="availableSeats"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="seaterror" class="error"></span>
							</div>
							
							<div>
							<table><tr><td>From:</td></tr>
							<tr><td><select  name="fhrs">
								<option value='' disabled='disabled' selected='selected'>Hr</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<span id="fhrserror" class="error"></span>
							</select>
							
							<select name="fmins" >
								<option value='' disabled='disabled' selected='selected'>Min</option>
								<option value="00">00</option>
								<option value="15">15</option>
								<option value="30">30</option>
								<option value="45">45</option>
								<span id="fminserror" class="error"></span>
							</select>
								
							<select name="fampm" >
								<option value='' disabled='disabled' selected='selected'>AM/PM</option>
								<option value="AM">AM</option>
								<option value="PM">PM</option>
							<span id="fampmerror" class="error"></span>													
							</select>
							</td>
							</tr>
							<tr><td>To:</td></tr>
							<tr><td><select  name="thrs">
								<option value='' disabled='disabled' selected='selected'>Hr</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
								<span id="thrserror" class="error"></span>
							</select>
							
							<select name="tmins" >
								<option value='' disabled='disabled' selected='selected'>Min</option>
								<option value="00">00</option>
								<option value="15">15</option>
								<option value="30">30</option>
								<option value="45">45</option>
								<span id="tminserror" class="error"></span>
							</select>
								
							<select name="tampm" >
								<option value='' disabled='disabled' selected='selected'>AM/PM</option>
								<option value="AM">AM</option>
								<option value="PM">PM</option>
							<span id="tampmerror" class="error"></span>
							</select>
							</td>
							</tr></table>
							</div>
						<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Location" id="inputinfo" name="location"
									required="required" rel="popover"
									onclick="return removeError()">
									<span id="locerror" class="error"></span>
							</div>
							<div>
								<input type="button" class="btn btn-success" value="Assign Class" onclick=" return doContinue()">
						<br>
							<%if(session.getAttribute("status")!=null) 
								{
									%>
									<%= session.getAttribute("status") %>
									<%
									session.removeAttribute("status");
									} %>
							</div>
						</form>
					</div>
			</div>
		</header>
</div>
		<script src="http://code.jquery.com/jquery.js"></script>
		<script src="<%request.getContextPath(); %>/js/bootstrap.min.js"></script>
   <script src="<%request.getContextPath(); %>/js/bootstrap-select.js"></script>


     <script type="text/javascript">
 	function doContinue(){
		var department = document.forms[0].department.value;//$("#department").val();
		var course_number=document.forms[0].course_number.value;//$("#course_number").val();
		var section = document.forms[0].section.value;	//$("#section").val();
		var sjsuid = document.forms[0].sjsuid.value;//$("#course_name").val();
		var day = document.forms[0].day.value;//$("#course_name").val();
		var availableSeats = document.forms[0].availableSeats.value;	//$("#credits").val();
		
		var fhrs = document.forms[0].fhrs.value;//$("#credits").val();
		var fmins = document.forms[0].fmins.value;
		var fampm = document.forms[0].fampm.value;
		var thrs = document.forms[0].thrs.value;//$("#credits").val();
		var tmins = document.forms[0].tmins.value;
		var tampm = document.forms[0].tampm.value;
		var location=document.forms[0].location.value;
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
	    	document.getElementById("sjsuiderror").innerHTML = "Please Enter SJSUID";
	    	return false;
		}
		if(day==null||day==""){
	    	document.getElementById("dayerror").innerHTML = "Please Select DAY";
	    	return false;
		}
		
		if(availableSeats==null||availableSeats==""){
	    	document.getElementById("seaterror").innerHTML = "Please Enter No of Seats ";
	    	return false;
		}
	
		
		if(fhrs==null||fhrs==""){
	    	document.getElementById("fhrserror").innerHTML = "Please Select From  Hours";
	    	return false;
		}
		if(fmins==null||fmins==""){
	    	document.getElementById("fminserror").innerHTML = "Please Select From  Mins";
	    	return false;
		}
		if(fampm==null||fampm==""){
	    	document.getElementById("fampmerror").innerHTML = "Please Select From  AM/PM";
	    	return false;
		}
		if(thrs==null||thrs==""){
	    	document.getElementById("thrserror").innerHTML = "Please Select TO  Hours";
	    	return false;
		}
		if(tmins==null||tmins==""){
	    	document.getElementById("tminserror").innerHTML = "Please Select TO  Mins";
	    	return false;
		}
		if(tampm==null||tampm==""){
	    	document.getElementById("tampmerror").innerHTML = "Please Select TO  AM/PM";
	    	return false;
		}
		if(location==null||location==""){
	    	document.getElementById("locerror").innerHTML = "Please Select TO  Location";
	    	return false;
		}
		
		
		
		
		   document.forms[0].action = '../UpdateAssignClass';
		    document.forms[0].submit();
		
	}
 	
	function removeError() {
			
		var department = document.forms[0].department.value; 
		var course_number=document.forms[0].course_number.value; //$("#course_number").val();
		var course_name = document.forms[0].course_name.value; //$("#course_name").val();
		var section = document.forms[0].section.value; //$("#section").val();
		var credits = document.forms[0].credits.value ;  //$("#credits").val();
		var desc = document.forms[0].description.value; //$("#credits").val();
		
		if(department!=null||department!=""){
	    	document.getElementById("depterror").innerHTML = "";
		}
		if(course_number!=null||course_number!=""){
	    	document.getElementById("cnumbererror").innerHTML = "";
		}
		if(course_name!=null||course_name!=""){
	    	document.getElementById("dayerror").innerHTML = "";
		}
		if(section!=null||section!=""){
	    	document.getElementById("sectionerror").innerHTML = "";
		}
		if(credits!=null||credits!=""){
	    	document.getElementById("creditserror").innerHTML = "";
		}
		if(desc!=null||desc!=""||desc!="Course Description"){
	    	document.getElementById("descerror").innerHTML = "";
		
		}  
	}

   </script>
   	


</body>
</html>