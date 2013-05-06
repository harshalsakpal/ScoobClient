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
</head>
<script type="text/javascript">
	
</script>
<body>
 <% if(session.getAttribute("admin")==null)
	  {
	  	response.sendRedirect("AdminLogin.jsp");
	  	return;
	  }
	  %>
	
	<div class="container control-group">
		<header class="row">
			<div class="span12">
			
				
					<div class="well">
						<form id="Admin-page" method="POST" name="addcourse" onsubmit="return validate(this)">
								<div>

								<select class="span3" name="department">
									
									<option value="CMPE">Computer Engineering</option>
									<option value="SE">Software Engineering</option>
									<option value="CS">Computer Science</option>
									<option value="EE">Electrical Engineering</option>
									<option value="ME">Mechanical Engineering</option>
								</select>
							</div>
						      
							<div class="controls controls-row info">
								<input type=text class="input-medium required span3"
									placeholder="Course Number" id="inputinfo" name="course_number"
									required="required" rel="popover"
									data-content="please type the course number">
							</div>
							<div class="controls controls-row info">
								<input type="text" class="input-medium required span3"
									placeholder="Course Name" id="inputinfo" required="required"
									name="course_name" rel="popover"
									data-content="please type your course name">
							</div>

							<div class="controls controls-row info">
								<input type="text" class="input-medium required span3"
									name="section" placeholder="Section" id="inputinfo"
									required="required" rel="popover"
									data-content="please type the course section">
							</div>
							<div class="controls controls-row info">
								<input type="text" class="input-medium required span3"
									name="credits" placeholder="Credits" id="inputinfo"
									required="required" rel="popover"
									data-content="please type the credits">
							</div>

		
						
							<div class="controls controls-row info">
								<textarea class="span3" placeholder="Course Description"
									required="required" rel="popover"
									name="description" id="description" rows="3">Course Description </textarea>
							</div>
							<div>
								<input type="submit" class="btn btn-success" value="Add Class">
							</div>
						</form>
					</div>
			</div>
		</header>


		<script src="http://code.jquery.com/jquery.js"></script>
		<script src="js/bootstrap.min.js"></script>
   <script src="../js/bootstrap-select.js"></script>


     
	</div>


</body>