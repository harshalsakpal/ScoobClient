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
    <form action="Inst_Myclass.jsp" method="post"></form>
    	<%System.out.println("in view courses jsp >> "+(String)session.getAttribute("user"));
    	StudentCourse[] ic = proxy.viewRegisteredCourse((String)session.getAttribute("user"));
    	StudentCourse i;
    	%>
    
    </div>
       </div>  
       	<%if(ic!=null){
         	for(int index=0;index < ic.length; index++)
         	{
         		i= ic[index];
         	
         	%>
         	<div class="accordion" id="questions" >
                        <div class="accordion-group">
                          <div class="accordion-heading">
                              <a class="accordian-toggle btn" data-toggle="collapse" data-parent="#questions" href="#who<%=index%>">Course Number:<%=i.getCourseNumber() %>
                            </a>

                        </div>
                          <div id="who<%=index%>" class="accordion-body collapse">
                            <div class="accordion-inner"> 
                             <p>Location:<%=i.getCourseLocation()%></p>
                             <p>Day:<%=i.getCourseDay() %></p>
                               <p>Time:<%=i.getCourseTime()%> </p>
                               <p>Section:<%=i.getCourseSection() %></p>
                            	  <a input type="submit" class="btn btn-danger" value="Drop Class" href="drop_student.jsp" >Drop CLass</a>
                           
							  </div>  
                          </div>
                            <%} 
       					}else{
                            %> <table align="center"><tr><td>Not Enrolled in Any Courses.</td></tr></table>
                          </div>
                  </div>
                 
              <%} %>
                 
      <div class="row" id="main-content"></div>
      <footer class="row">
      </footer>
         			
</body>
</html>