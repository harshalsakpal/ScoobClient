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

<body>

	<div class="container control-group">
		<header class="row">
			<div class="span12">
			
				
					<div class="well">
						<form id="Admin-page" method="POST">
								<div>

								<select class="span3">
									<option value=""disabled selected>Department</option>
									<option>Computer Engineering</option>
									<option >Software Engineering</option>
									<option>Computer Science</option>
									<option>Electrical Engineering</option>
									<option>Mechanical Engineering</option>
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
	</div>


</body>