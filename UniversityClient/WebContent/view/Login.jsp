<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>San Jose State University System </title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="../css/style.css" rel="stylesheet" media="screen">

  </head>
  <body>
  <div class = "container">
	<div  class = "row" id = "main-content">
		<div class = "span4" id = "sidebar">
		<div class = "well">
		<form>
		<fieldset>
		
		<legend>SJSU Login</legend>
		<input type = "text" class = "input-block-level"placeholder="Username">
		<input type = "password" class = "input-block-level"placeholder="Password">

		
		<div class = "pull-right" align="center">
			<input type = "submit" class = "btn btn-primary" value = "Login">
			<input type = "reset" class = "btn btn-primary" value = "Reset">
			
		<p>	<a  href = "Register.jsp" >New user,Register here!!</a> </p>
		</div>
		</fieldset>
		</form>
		</div>
		</div>

		<div class="span8">
			<div id="slider" class="carousel slide">
				<div class="carousel-inner">
					<div class="item">
						<img src="../img/sjsu.jpg">
						<div class="carousel-caption">
							<h4> SJSU VIRTUAL TOUR </h4>

				</div>
				</div>
				<div class="item active">
						<img src="../img/bldng.jpg">
						<div class="carousel-caption">
							<h4> SJSU VIRTUAL TOUR </h4>

				</div>
				</div>
				<div class="item">
						<img src="http://placehold.it/850x500">
						<div class="carousel-caption">
							<h4> SJSU VIRTUAL TOUR </h4>

				</div>
				</div>
				<div class="item">
						<img src="http://placehold.it/850x500">
						<div class="carousel-caption">
							<h4> SJSU VIRTUAL TOUR </h4>

				</div>
				</div>
			</div>
			<a class="left carousel-control" href="#slider" data-slide="prev">&lsaquo;</a>
				<a class="right carousel-control" href="#slider" data-slide="next">&rsaquo;</a>


			</div>
			
 
 	 </div>
 	 </div>
  </div>
  
			
 

  </body>
</html>