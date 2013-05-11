<%@page import="edu.cmpe273.univserver.beans.StudentCourse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Courses</title>
 <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <%@ include file="StudentHome.jsp" %>
</head>
<body>
 <div class="container">
    <div class="hero-unit"> 
    <header class="post-title">
    
    <h2 class="entry-title" id="member-title">My Courses</h2>
    
    </header>
    
    <hr>
    <%@ include file="Proxy.jsp" %>
    <form method="post" name="drop" action="DropCourseToStudent">
    	<%System.out.println("in view courses jsp >> "+(String)session.getAttribute("user"));
    	StudentCourse[] course = proxy.viewRegisteredCourse((String)session.getAttribute("user"));
    	StudentCourse i;
    	%>
    
    </div>
         
       	<%if(course!=null){%>
         	
         	
         	<table align="center" border="1">
						<tr align="left">
							<td>Course Number</td>
							<td>Section Number</td>
							
							<td>Day</td>
							<td>Location</td>
							<td>Time</td>
							<td>Select</td>
						</tr>
						<%
						for(int iCount=0; iCount<course.length; iCount++){%>
						<tr>
							<td><%=course[iCount].getCourseNumber() %></td>
							<td><%=course[iCount].getCourseSection() %></td>
							<td><%=course[iCount].getCourseDay() %></td>
							<td><%=course[iCount].getCourseLocation() %></td>
							<td><%=course[iCount].getCourseTime() %></td>
							
							<td><input type="checkbox" name="checkedCourses" value=<%=course[iCount].getCourseNumber()+","+course[iCount].getCourseSection() %>> </td>
						</tr>	
						
						<%}	%>
						<tr>
						<td><div class="controls controls-row info"><input type="submit" name="DropCourse" value="Drop Courses"> </div></td>
						</tr>
					
					</table>
                            <%} 
       					else{
                            %> <table align="center"><tr><td>Not Enrolled in Any Courses.</td></tr></table>
                          </div>
                  </div>
                 
              <%} %>
            </div>     
   </form>
		
</body>
</html>