<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <title>Bootstrap 101 Template</title>
    <meta charset="utf-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
  </head>
  <body>
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
                      <li><a href="#"><i class="icon-home"></i> Home </a></li>
                      <li class="divider-vertical"></li>
                      <li><a href="#"><i class="icon-user"></i>Profile </a></li>
                      <li class="divider-vertical"></li>
                      <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-book"></i>Courses 
                        <b class="caret"></b>
                          </a>
                          <ul class="dropdown-menu">
                            <li><a href="viewStudentCourses.jsp"><i class="icon-folder-open-alt"></i>view enrolled courses</a></li>
                            <li><a href="#"><i class="icon-plus"></i>add course</a></li>
                            <li><a href="#"><i class="icon-remove"></i>drop course</a> </li>

                              </ul>
                       </li>
                      <li class="divider-vertical"></li>
                      <li><a href="#"><i class="icon-shopping-cart"></i>MyCart </a></li>
                      <li class="divider-vertical"></li>
                      <li><a href="#"><i class="icon-signout"></i>Signout </a></li>
                      <li class="divider-vertical"></li>

                   </ul>
                    </div>
             </nav>
          </div>
          </div>
         
       </header>
      <div class="row" id="main-content"></div>
      <footer class="row">
      </footer>

  
   
   
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>