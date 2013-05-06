<%@page import="edu.cmpe273.univserver.beans.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>San Jose State University System</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="<%=request.getContextPath() %>/css/bootstrap.min.css" rel="stylesheet" media="screen">
	<link href="<%=request.getContextPath() %>/css/style.css" rel="stylesheet" media="screen">
	<%@ include file="Proxy.jsp" %>
  </head>
  <body>
  
  <%String username=request.getParameter("username");
	String password=request.getParameter("password");
  	if(!(username==null||username.equals("")||password==null||password.equals("")))
  	{
  		
  	
  
  	
	Person p=proxy.signIn(username, password);
	
	
	if(p!=null)
	{	
		session.setAttribute("user", p.getSjsuid());
		String ctx=request.getContextPath();
		if(p.getRole().equalsIgnoreCase("STUDENT"))
		{
			response.sendRedirect(ctx+"/view/StudentHome.jsp");
		}
		else
		{
			response.sendRedirect(ctx+"/view/InstructorHome.jsp");
		}
	}
	else
	{	
		out.print("");
		out.println("<span class=\"invaliduser\">Invalid Username/Password!!!</span>");
		
		}
  	}	
  %>
  <div class = "container">
	<div  class = "row" id = "main-content">
		<div class = "span4" id = "sidebar">
		<div class = "well">
		<form method="post">
		<fieldset>
		<legend>SJSU Member Login</legend>
	
		<span id="username/Password" class="error"></span>
		<input type = "text" class = "input-block-level"placeholder="Username" name="username" onkeypress="removeError()">
		<span id="errorusername" class="error"></span>
		<input type = "password" class = "input-block-level"placeholder="Password" name="password" onkeypress="removeError()">

		<span id="errorpassword" class="error"></span>
		<div class = "pull-right" align="center">
			<input type = "button" class = "btn btn-primary" value = "Login" onclick="validateForm();">
			<input type = "reset" class = "btn btn-primary" value = "Reset">
								<p>
									<a href="<%=request.getContextPath() %>/view/Register.jsp">New user,Register here!!</a>
								</p>
		
		</div>
		</fieldset>
		</form>
		</div>
		</div>
<br>
<br>
		<div class="span8">
			<div id="slider" class="carousel slide">
				<div class="carousel-inner">
					<div class="item">
						<img src="<%=request.getContextPath() %>/img/sjsu.jpg">
						<div class="carousel-caption">
							<h4> SJSU VIRTUAL TOUR </h4>

				</div>
				</div>
				<div class="item active">
						<img src="<%=request.getContextPath() %>/img/bldng.jpg">
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
  
  <script type="text/javascript">
  	function validateForm(){
  		
  		if(document.forms[0].username.value==null|| document.forms[0].username.value==""){
  			document.getElementById("errorusername").innerHTML="Username is mandatory";
  			return false;
  		}
  		if(document.forms[0].password.value==null|| document.forms[0].password.value==""){
  			document.getElementById("errorpassword").innerHTML="Password is mandatory";
  			return false;
  		}
  		//document.forms[0].action = "";
  		document.forms[0].submit();
  	}
  	
  	function removeError(){
  		if(document.forms[0].username.value!=null|| document.forms[0].username.value!="")
  			document.getElementById("errorusername").innerHTML="";
  		if(document.forms[0].password.value!=null|| document.forms[0].password.value!="")
  			document.getElementById("errorpassword").innerHTML="";
  	}
  	
  </script>
  
  </body>
</html>