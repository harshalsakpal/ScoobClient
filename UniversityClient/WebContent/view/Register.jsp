<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">

</head>
<body padding-top: 100px; >
	<div class="container">
		<header class="row">
			<div class="span12">
				<div class="well">
					<form id="Register" method="post" name="Register">  <!-- onsubmit="return validateForm(this)"> -->
						
							<div class="controls controls-row info">First Name
								<input type="text" class="input-medium required"
									placeholder="First Name" id="inputinfo" required="required"
									rel="popover" data-content="please type your first name" name="firstname">
								Last Name<input type="text" class="input-medium required"
									placeholder="Last Name" id="inputinfo" required="required"
									rel="popover" data-content="please type your last name" name="lastname">
								
							</div>
							<div class="controls controls-row ">
									<p> GENDER </p>
								<label class="radio inline"> 
								<input type="radio" name="gender" value="male"> Male
								</label><label class="radio inline"> 
								<input type="radio" name="gender" value="female"> Female
								</label> 
							</div>
									<p> </p>
								<div class="input-append date" id="dp3" data-date="01-01-1989" title="DOB"
									data-date-format="mm-dd-yyyy" name="date" value="DOB in mm-dd-yyyy">
									<input class="span2" size="16" type="text" name="dateofbirth"> <span
										class="add-on"><i class="icon-th"></i></span>
								</div>
							
							<div class="controls controls-group">
								<input type="text" class="input-medium required span8"
									placeholder="Address Line 1" id="inputinfo" required="required"
									rel="popover" name="address1"> 
									<input type="text" class="span5" placeholder="Address Line 2" name="address2"> 
									<input type="text" class="input-medium required span8" placeholder="email" id="email" required="required" rel="popover" name="email" onkeypress="removeError()"> 
									<span id="emailerror" class="error"></span>
									<input type="password" class="input-medium required span8" placeholder="Password" id="password" required="required" rel="popover" name="password"> 
									<input type="password" class="input-block-level span8"	placeholder="Rewrite Password" id="repassword" name="repassword">
									<span id="passworderror" class="error"></span>
							</div>
							<div>
								<input type="text" class="span2" name="city" placeholder="City"> 
								<select	class="span1" name="state">
									<option value="">AL</option>
									<option value="">AK</option>
									<option value="">AZ</option>
									<option value="">AR</option>
									<option value="">CA </option>
									<option value="">CO</option>
									<option value="">CT</option>
									<option value="">DE</option>
									<option value="">FL</option>
									<option value="">GA</option>
									<option value="">HI</option>
									<option value="">ID</option>
									<option value="">IL</option>
									<option value="">IN</option>
									<option value="">IA</option>
									<option value="">KS</option>
									<option value="">KY</option>
									<option value="">LA</option>
									<option value="">ME</option>
									<option value="">MD</option>
									<option value="">MA</option>
									<option value="">MI</option>
									<option value="">MN</option>
									<option value="">MS</option>
									<option value="">MO</option>
									<option value="">MT</option>
									<option value="">NE</option>
									<option value="">NV</option>
									<option value="">NH</option>
									<option value="">NJ</option>
									<option value="">NM</option>
									<option value="">NY</option>
									<option value="">NC</option>
									<option value="">ND</option>
									<option value="">OH</option>
									<option value="">OK</option>
									<option value="">OR</option>
									<option value="">PA</option>
									<option value="">RI</option>
									<option value="">SC</option>
									<option value="">SD</option>
									<option value="">TN</option>
									<option value="">TX</option>
									<option value="">UT</option>
									<option value="">VT</option>
									<option value="">VA</option>
									<option value="">WA</option>
									<option value="">WV</option>
									<option value="">WI</option>
									<option value="">WY</option>
								</select> 
								<input type="text" class="span2" placeholder="ZipCode" name="zipcode" id="zipcode" maxlength="5" onkeypress="removeError()">
								<span id="ziperror" class="error"></span>
							</div>


							<label class="radio"> <input type="radio" name="role"
								value="STUDENT"> STUDENT
							</label> <label class="radio"> <input type="radio" name="role"
								value="INSTRUCTOR"> INSTRUCTOR
							</label> 
							<select class="selectpicker" name="department" title="department">
								<option value="CMPE">Computer Engineering</option>
								<option value="SE">Software Engineering</option>
								<option value="CS">Computer Science</option>
								<option value="EE">Electrical Engineering</option>
								<option value="ME">Mechanical Engineering</option>
							</select>
							
								<div>
				
								<button class="btn btn-danger" data-dismiss="modal"	aria-hidden="true">cancel</button>
				
								<input type="button" class="btn btn-success" value="Register" onclick="return doContinue()">
								
								<input type="reset" class="btn btn-info" value="Reset">
				
				<%
					if(session.getAttribute("registerReply")!=null){%> 
						<%=session.getAttribute("registerReply") %>	
					
					<%}	%>
				</div>
			</form>
			</div>
			</div>
		</header>
	</div>
	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#dp3').datepicker();
			 $('.selectpicker').selectpicker();
		});
	</script>


	<script type="text/javascript">
		function validateForm(formId, erPlacement, validRules) {
			erPlacement = erPlacement || 'bottom';
			validRules = validRules || {};
			var eClass = 'error';
			var sClass = 'success';
			var wClass = 'warning';
			$(formId).validate({
				errorElement : "span",
				errorClass : "help-inline",
				validClass : "help-inline",
				rules : validRules,
				errorPlacement : function(error, element) {
					$(element).attr('rel', 'popover');
					var eMsg = $(element).attr('data-content') || error.html();
					$(element).attr('data-content', eMsg);
					$(element).popover({
						placement : erPlacement,
						offset : 20,
						trigger : 'manual'

					});
					$(element).popover('show');
				},
				onfoucusout : function() {
					$(this.currentElements).popover('hide');

				},
				submitHandler : function() {
				},
				

				onsubmit : true

			});
			
			
		}//end of validate
		
		
	</script>
	<script type="text/javascript">
	function removeError() {
		if (document.forms[0].email.value != null
				|| document.forms[0].email.value != "")
			document.getElementById("emailerror").innerHTML = "";
		if (document.forms[0].zipcode.value != null
				|| document.forms[0].zipcode.value != "")
			document.getElementById("ziperror").innerHTML = "";
		
	}
	function doContinue(){
		var email = $("#email").val();
		var zipcode=$("#zipcode").val();
		var password = $("#password").val();
		var repassword = $("#repassword").val();
		if(password != repassword){
	    	document.getElementById("passworderror").innerHTML = "Password doesnot match";
	    	return false;
		}
		
		if(!validateEmailid(email)){
	    	document.getElementById("emailerror").innerHTML = "Email id is not valid";
	    	return false;
			}
		if(!validateZip(zipcode)){
			document.getElementById("ziperror").innerHTML="Zip not valid";
			return false;
			}
	    document.forms[0].action = '../RegisterServlet';
	    document.forms[0].submit();
	}

	function validateEmailid(email){
		var pattern=/^([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
	    if(pattern.test(email))         
			return true;   
	    else   
			return false; 
	}
	function validateZip(zip){
		var zip_pattern =  /(^\d{5}$)|(^\d{5}-\d{4}$)/;
			
			if(zip_pattern.test(zip))
			return true;
			else
				return false;
	}
	</script>



	