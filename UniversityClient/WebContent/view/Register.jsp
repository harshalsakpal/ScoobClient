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
  <body>
  <div class = "container">
  <header class="row">
    <div class="span12">
	<div class = "well">
	<form id = "Register" method="POST" onsubmit="validateForm(this)">
	<p class = "label label-info">Required</p>
	<div class = "controls controls-row info">
	<input type = "text" class ="input-medium required"  placeholder = "First Name" id = "inputinfo" required="required" rel="popover" data-content="please type your first name" >
	<input type = "text" class ="input-medium required" placeholder = "Last Name" id = "inputinfo" required="required" rel="popover" data-content="please type your last name" > >
	</div>
	<div class = "controls controls-row">
	<select class = "span1" placeholder = "Gender">
	<option>Male</option>
	<option>Female</option>
	</select>
	
<!-- <select class = "span1" placeholder = "Date">
	<option>1</option>
	<option>2</option>
	<option>3</option>
	<option>4</option>
	<option>5</option>
	<option>6</option>
	<option>7</option>
	<option>8</option><option>9</option><option>10</option><option>11</option><option>12</option><option>13</option><option>14</option><option>15</option>
	<option>16</option><option>17</option><option>18</option><option>19</option><option>20</option><option>21</option><option>22</option><option>23</option><option>24</option><option>25</option>
	<option>26</option><option>27</option><option>28</option><option>29</option><option>30</option>
	<option>31</option>
	<option>2</option>
	</select>
	<select class = "span1" placeholder = "Month">
	<option>January</option>
	<option>February</option>
	<option>March</option>
	<option>April</option>
	<option>May</option>
	<option>June</option>
	<option>July</option>
	<option>August</option>
	<option>September</option>
	<option>October</option>

	<option>Novemeber</option>
	<option>December</option>
	</select>
	<select class = "span1" placeholder = " Year">
	<option>1950</option>
	<option>1951</option>
	
	</select> -->
	<div class="input-append date" id="dp3" data-date="01-01-1989" data-date-format="mm-dd-yyyy">
  <input class="span2" size="16" type="text" value="01-01-1989">
  <span class="add-on"><i class="icon-th"></i></span>
</div>
	</div>		<div class = "controls controls-group">
		<input type = "text" class ="input-medium required span8"  placeholder = "Address Line 1" id = "inputinfo" required="required" rel="popover" >
		<input type = "text" class ="span5" placeholder = "Address Line 2">
		<input type = "text" class ="input-medium required span8" placeholder = "email" id = "inputinfo" required="required" rel="popover" >
		<input type = "text" class ="input-medium required span8" class="span3" placeholder = "username" id = "inputinfo" required="required" rel="popover" >
		<input type = "password" class = "input-medium required span8"placeholder="Password" id = "inputinfo" required="required" rel="popover" >
		<input type ="password" class = "input-block-level span8"placeholder="Rewrite Password">
		</div>
		<div>
		<input type = "text" class = "span2" placeholder = "City">
		<select class = "span1" >
		<option>AR</option>
		<option>AZ</option>
		<option>CA</option>
		</select>
		<input type = "text" class = "span2" placeholder = "ZipCode">
		</div>
		
		
		<label class = "radio">
		<input type = "radio" name="a" value="a1"> STUDENT
		</label>
		<label class = "radio">
		<input type = "radio" name="a" value="a2" > INSTRUCTOR
		</label>
	
	
	
	
	</div>
	
	<button class = "btn btn-danger" data-dismiss = "modal" aria-hidden = "true">cancel</button>
	
	<!-- <a class = "btn btn-success" href = "/273/273%20lab2/bootstrap/signup.html" role = "button" data-toggle = "modal">Register</a>  -->
	<input type = "submit" class = "btn btn-success" value = "Register" action="/273/273%20lab2/bootstrap/signup.html" >
	<input type = "reset" class = "btn btn-info" value = "Reset"  >
	
	
	
  </div>
</form>
</header>
</div>	
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap-datepicker.js"></script>
    <script type="text/javascript">
    $(function() {
    $('#dp3').datepicker();
});

     </script>

	
	<script type="text/javascript">
	function validateForm(formId,erPlacement,validRules)
	{
		erPlacement= erPlacement || 'bottom';
		validRules= validRules || {};
		var eClass= 'error';
		var sClass= 'success';
		var wClass= 'warning';
		$(formId).validate({
			errorElement:"span",
			errorClass:"help-inline",
			validClass:"help-inline",
			rules:validRules,
			errorPlacement:function(error,element)
		{
			$(element).attr('rel','popover');
			var eMsg=$(element).attr('data-content') || error.html();
			$(element).attr('data-content', eMsg);
			$(element).popover({
				placement: erPlacement,
				offset:20,
				trigger: 'manual'

			});
			$(element).popover('show');
		},
		onfoucusout: function(){
			$(this.currentElements).popover('hide');
				
		},
		submitHandler: function() {    
    alert("good!)");
		},
		onsubmit: true

		});
	
	}
	</script>
	
	
	
	</div>
  </div>