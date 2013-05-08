<%@page import="edu.cmpe273.univserver.beans.InstructorCourse"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View My Classes</title>
 <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
    <%@ include file="Instructor_homepage.jsp" %>
</head>
<body>
 <div class="container">
    <div class="hero-unit"> 
    <header class="post-title">
    
    <h2 class="entry-title" id="member-title">My Classes</h2>
    
    </header>
    
    <hr>
    <%@ include file="Proxy.jsp" %>
    <form action="Inst_Myclass.jsp" method="post"></form>
    	<%
    	InstructorCourse[] ic = proxy.viewAssignedCourses("2");
    	InstructorCourse i;
    	%>
    
    </div>
       </div>  
       	<%
         	for(int index=0;index < ic.length; index++)
         	{
         		i= ic[index];
         	
         	%>
         	<div class="accordion" id="questions" >
                        <div class="accordion-group">
                          <div class="accordion-heading">
                              <a class="accordian-toggle btn" data-toggle="collapse" data-parent="#questions" href="#who<%=index%>">Course Number:<%=i.getCourseNumber()%>
                            </a>

                        </div>
                          <div id="who<%=index%>" class="accordion-body collapse">
                            <div class="accordion-inner"> 
                             <p>Location:<%=i.getLocation()%></p>
                             <p>Day:<%=i.getDay() %></p>
                               <p>Time:<%=i.getTime()%> </p>
                               <p>Section:<%=i.getSection() %></p>
                              
                           
							  </div>  
                          </div>
                            <%} %>
                          </div>
                  </div>
              
                 
      <div class="row" id="main-content"></div>
      <footer class="row">
      </footer>
         			
</body>
</html>