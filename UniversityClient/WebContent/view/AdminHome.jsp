<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Admin Page</title>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
  <% if(session.getAttribute("admin")==null)
	  {
	  	response.sendRedirect("AdminLogin.jsp");
	  	return;
	  }
	  %>
  
    <div class="container">
      <header class="row">
          <div class="span12">
              <nav class="navbar"> 
                  <div class="navbar-inner">
                  	   
                      <a href="#" class="brand">SJSU </a>
                      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>

                      </a>
                      <div class="nav-collapse collapse">
                    <ul class="nav"> 
                      <li class="divider-vertical"></li>
                      <li><a href="AdminHome.jsp"><i class="icon-home"></i> Home </a></li>
                      
                      <li class="divider-vertical"></li>
                      <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-book"></i>Courses 
                        <b class="caret"></b>
                          </a>
                          <ul class="dropdown-menu">
                            <li><a href="AdminAddClass.jsp"><i class="icon-folder-plus"></i>Add Course</a></li>
                            <li><a href="AdminEditClass.jsp"><i class="icon-plus"></i>Edit Course</a></li>
                            <li><a href="AdminDeleteClass.jsp"><i class="icon-remove"></i>Delete Course</a> </li>
							<li><a href="ViewAllCourses.jsp">View All Courses</a> </li>
                              </ul>
                       </li>
                      <li class="divider-vertical"></li>
                     <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-user"></i>Person
                      <b class="caret"></b> 
                    </a>
                      <ul class="dropdown-menu">
                            <li><a href="UpdateProferssorDetails.jsp">Edit User Information</a></li>
                            <li><a href="DeleteProfessorDetails.jsp">Delete Instructor</a></li>
                            <li><a href="DeleteStudentDetails.jsp">Delete Student</a></li>
                            <li><a href="ListAllStudents.jsp">List All Students</a></li>
                            <li><a href="ListAllProfessors.jsp">List All Professors</a></li>
                            <li><a href="ListAllPersons.jsp">List All Persons</a></li>
                          </ul>
                          </li>
                          
                          <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Assign
                      <b class="caret"></b> 
                    </a>
                      <ul class="dropdown-menu">
                            <li><a href="AssignCourse.jsp">Assign Course</a></li>
                            <li><a href="EditAssignCourse.jsp">Edit Assigned Course</a></li>
                          </ul>
                          </li>
                      <li class="divider-vertical"></li>
                      <li><a href="AdminLogout.jsp"><i class="icon-signout"></i>Signout </a></li>
                      <li class="divider-vertical"></li>



                    </ul>
                        </div>






				</div>
              </nav>




       </div>   
       </header>
       
       
      <div class="row" id="main-content">
      <div class="span12">
      Weclome <%=session.getAttribute("admin") %>
      </div>
      </div>
      
      <footer class="row"></footer>


    </div>
   
   
    <script src="<%=request.getContextPath() %>/js/jquery-1.9.1.js"></script>
    <script src="<%=request.getContextPath() %>/js/bootstrap.min.js"></script>
  </body>
</html>