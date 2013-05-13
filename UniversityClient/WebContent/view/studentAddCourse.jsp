<%@page import="edu.cmpe273.univserver.beans.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Delete Student Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
	String context = request.getContextPath();
%>
<!-- Bootstrap -->
<link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<%@ include file="StudentHome.jsp"%>
<%@ include file="Proxy.jsp"%>
</head>
<script type="text/javascript">
	
</script>
<body>

	<%
		if (session.getAttribute("user") == null) {
			response.sendRedirect("Login.jsp");
			return;
		}
	%>

	<div class="container control-group">
		<header class="row">
			<div class="span12">
				<div class="well">
					<form method="post" name="addCourse">
					<input type="hidden" name="hiddenselectedcourses">
						<select class="selectpicker" name="department" title="department">
							<option value="CMPE">Computer Engineering</option>
							<option value="SE">Software Engineering</option>
							<option value="CS">Computer Science</option>
							<option value="EE">Electrical Engineering</option>
							<option value="ME">Mechanical Engineering</option>
						</select>

						<div class="controls controls-row info">
							<input type="text" class="input-medium required span3"
								placeholder="Course Number" id="inputinfo" required="required"
								name="courseNumber" rel="popover"
								data-content="please type your course number"
								onclick="return removeError()"> 
								<span id="courseNumberError" class="error"></span>
						</div>

						<input type="button" class="btn btn-success" value="Search"
							onclick="return doSearchCourses()">
						<%System.out.println(session.getAttribute("coursesReply"));
						if(session.getAttribute("coursesReply")!=null){	
						Course[] course = (Course[]) session.getAttribute("coursesReply");
						%>
					<table align="center" border="1">
						<tr align="left">
							<td>Course Number</td>
							<td>Course Name</td>
							<td>Section Number</td>
							<td>Credits</td>
							<td>Day</td>
							<td>Location</td>
							<td>Time</td>
							<td>Select</td>
						</tr>
						<%
						for(int iCount=0; iCount<course.length; iCount++){%>
						<tr>
							<td><%=course[iCount].getCourseNumber() %></td>
							<td><%=course[iCount].getCourseName() %></td>
							<td><%=course[iCount].getSection() %></td>
							<td><%=course[iCount].getCredits() %></td>
							<td><%=course[iCount].getDay() %></td>
							<td><%=course[iCount].getLocation() %></td>
							<td><%=course[iCount].getTime() %></td>
							<td><input type="checkbox" name="checkedCourses" value=<%=course[iCount].getCourseNumber()+","+course[iCount].getCourseName()+","+course[iCount].getSection()+","+course[iCount].getDay()+","+course[iCount].getTime()+","+course[iCount].getLocation()%> > </td>
						</tr>	
						
						<%}	%>
						<tr>
						<td><div class="controls controls-row info"><input type="button" name="addCourse" value="Add Courses" onclick="addCourses()"> </div></td>
						</tr>
					
					</table>
					
					<%}else{ %>
					<%} %>
					
					
					
					</form>
				</div>
			</div>
		</header>
	</div>

	<script type="text/javascript">
	function doSearchCourses(){
		var courseNumber = document.forms[0].courseNumber.value;
		
		if(courseNumber==null||courseNumber==""){
	    	document.getElementById("courseNumberError").innerHTML = "Please Enter Course Number";
	    	return false;
		}
	   document.forms[0].action = '../SearchCourses';
	   document.forms[0].submit();
	}

	function addCourses(){
	if(document.forms[0].checkedCourses.length==0)
		return false;
	
	var selctedCourseList = new Array() ;
	// Loop through all the items
	for ( var iLoop = 0; iLoop < document.forms[0].checkedCourses.length; iLoop++) {
		if (document.forms[0].checkedCourses[iLoop].checked == true) {
			// Item is found. Set its selected property, and exit the loop
			selctedCourseList = document.forms[0].checkedCourses[iLoop].value;
		}
	}

	   document.forms[0].action = '../AddCourseToStudent';
	   document.forms[0].submit();
	
	}
	</script>

</body>
</html>