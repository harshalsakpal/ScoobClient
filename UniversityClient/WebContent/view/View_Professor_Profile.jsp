<%@page import="edu.cmpe273.univserver.beans.Person"%>
<%@page import="edu.cmpe273.univserver.beans.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Update User Details</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<%
	String context = request.getContextPath();
%>
<!-- Bootstrap -->
<link href="<%=context%>/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<%@ include file="InstructorHome.jsp"%>
<%@ include file="Proxy.jsp"%>
</head>
<%
	String state = "", department = "";
	if (session.getAttribute("instructorDetails") != null) {
		Person person = (Person) session
				.getAttribute("instructorDetails");
		state = person.getStateName();
		department = person.getDepartment();
%>
<body onLoad="preselectMyItem('<%=state%>', '<%=department%>')">
	<%
		} else {
	%>

<body>

	<%
		}
		if (session.getAttribute("userobj") == null) {
			response.sendRedirect("Login.jsp");
			return;
		}
	%>
<form method="post" name="updateProfessorData">
<input type="hidden" name="hiddensjsuid" value=""> 
	<div class="container control-group">
		<header class="row">
			<div class="span12">
				<div class="well">
					
						<%
							if (session.getAttribute("userobj") != null) {
								Person person = (Person) session
										.getAttribute("userobj");
						%>
						<table>
							<tr>
								<td>SJSU ID</td>
								<td><input type="text" value=<%=person.getSjsuid()%>
									name="sjsuidinput" disabled="disabled"></td>
							</tr>

							<tr>
								<td>First Name</td>
								<td><input type="text" value=<%=person.getFirstName()%>
									name="firstName" disabled="disabled"></td>
							</tr>

							<tr>
								<td>Last Name</td>
								<td><input type="text" value=<%=person.getLastName()%>
									name="lastName" disabled="disabled"></td>
							</tr>

							<tr>
								<td>Address Line 1</td>
								<td><input type="text" value=<%=person.getAddrLine1()%>
									name="addrLine1" disabled="disabled"></td>
							</tr>

							<tr>
								<td>Address Line 2</td>
								<td><input type="text" value=<%=person.getAddrLine2()%>
									name="addrLine2" disabled="disabled"></td>
							</tr>

							<tr>
								<td>City</td>
								<td><input type="text" value=<%=person.getCityName()%>
									name="cityName" disabled="disabled"></td>
							</tr>

							<tr>
								<td>State</td>
								<td><select class="span1" name="state" disabled="disabled">
										<option value="AL">AL</option>
										<option value="AK">AK</option>
										<option value="AZ">AZ</option>
										<option value="AR">AR</option>
										<option value="CA">CA</option>
										<option value="CO">CO</option>
										<option value="CT">CT</option>
										<option value="DE">DE</option>
										<option value="FL">FL</option>
										<option value="GA">GA</option>
										<option value="HI">HI</option>
										<option value="ID">ID</option>
										<option value="IL">IL</option>
										<option value="IN">IN</option>
										<option value="IA">IA</option>
										<option value="KS">KS</option>
										<option value="KY">KY</option>
										<option value="LA">LA</option>
										<option value="ME">ME</option>
										<option value="MD">MD</option>
										<option value="MA">MA</option>
										<option value="MI">MI</option>
										<option value="MN">MN</option>
										<option value="MS">MS</option>
										<option value="MO">MO</option>
										<option value="MT">MT</option>
										<option value="NE">NE</option>
										<option value="NV">NV</option>
										<option value="NH">NH</option>
										<option value="NJ">NJ</option>
										<option value="NM">NM</option>
										<option value="NY">NY</option>
										<option value="NC">NC</option>
										<option value="ND">ND</option>
										<option value="OH">OH</option>
										<option value="OK">OK</option>
										<option value="OR">OR</option>
										<option value="PA">PA</option>
										<option value="RI">RI</option>
										<option value="SC">SC</option>
										<option value="SD">SD</option>
										<option value="TN">TN</option>
										<option value="TX">TX</option>
										<option value="UT">UT</option>
										<option value="VT">VT</option>
										<option value="VA">VA</option>
										<option value="WA">WA</option>
										<option value="WV">WV</option>
										<option value="WI">WI</option>
										<option value="WY">WY</option>
								</select></td>
							</tr>

							<tr>
								<td>Zip</td>
								<td><input type="text" value=<%=person.getZipCode()%>
									name="zipCode" disabled="disabled" maxlength="5"></td>
							</tr>

							<tr>
								<td>Email Id</td>
								<td><input type="text" value=<%=person.getEmailid()%>
									name="emailid" disabled="disabled"></td>
							</tr>

							<tr>
								<td>Password</td>
								<td><input type="password" value=<%=person.getPassword()%>
									name="password" disabled="disabled"></td>
							</tr>
							<tr>
								<td>Date Of Birth</td>
								<td>
									<div class="input-append date" id="dp3" data-date="01-01-1989"
										title="DOB" data-date-format="mm-dd-yyyy" name="date" value="">
										<input class="span2" size="16" type="text" name="dateOfBirth"
											value=<%=person.getDateOfBirth()%> disabled="disabled">
										<span class="add-on"><i class="icon-th"></i></span>
									</div>
							</tr>
							<tr>
								<td>Gender</td>
								<td><input type="text" value=<%=person.getGender()%>
									name="gender" disabled="disabled"></td>
							</tr>
							<tr>
								<td>Department</td>
								<td><select class="selectpicker" name="department"
									title="department" disabled="disabled">
										<option value="CMPE">Computer Engineering</option>
										<option value="SE">Software Engineering</option>
										<option value="CS">Computer Science</option>
										<option value="EE">Electrical Engineering</option>
										<option value="ME">Mechanical Engineering</option>
								</select></td>
							</tr>
						</table>

						<input type="button" class="btn btn-success" value="Update"
							name="Update" onclick="doUpdate()" disabled="disabled"> <input
							type="button" class="btn btn-info" value="Edit" name="edit"
							onclick="enableFields()">

						<%
							} else if (session.getAttribute("instructorDetailsMessage") != null) {
						%>
						<%=session.getAttribute("instructorDetailsMessage")%>
						<%
							}
					
					if(session.getAttribute("updateReply")!=null){%> 
						<%=session.getAttribute("updateReply") %>	
					
					<%}	%>
				</div>
			</div>
		</header>
	</div>
</form>	
	<script src="../js/bootstrap-datepicker.js"></script>
	<script type="text/javascript">
		function preselectMyItem(state, department) {
			// Get a reference to the drop-down
			var myDropdownList1 = document.forms[0].state;
			var myDropdownList2 = document.forms[0].department;

			// Loop through all the items
			for ( var iLoop = 0; iLoop < myDropdownList1.options.length; iLoop++) {
				if (myDropdownList1.options[iLoop].value == state) {
					// Item is found. Set its selected property, and exit the loop
					myDropdownList1.options[iLoop].selected = true;
					break;
				}
			}

			// Loop through all the items
			for ( var iLoop = 0; iLoop < myDropdownList2.options.length; iLoop++) {
				if (myDropdownList2.options[iLoop].value == department) {
					// Item is found. Set its selected property, and exit the loop
					myDropdownList2.options[iLoop].selected = true;
					break;
				}
			}

		}

		function enableFields() {
			document.updateProfessorData.Update.disabled = false;
			document.updateProfessorData.edit.disabled = true;
			document.updateProfessorData.department.disabled = false;
			document.updateProfessorData.firstName.disabled = false;
			document.updateProfessorData.lastName.disabled = false;
			document.updateProfessorData.addrLine1.disabled = false;
			document.updateProfessorData.addrLine2.disabled = false;
			document.updateProfessorData.cityName.disabled = false;
			document.updateProfessorData.state.disabled = false;
			document.updateProfessorData.zipCode.disabled = false;
			document.updateProfessorData.emailid.disabled = false;
			document.updateProfessorData.password.disabled = false;
			document.updateProfessorData.dateOfBirth.disabled = false;
		}

		function doUpdate() {
			document.updateProfessorData.hiddensjsuid.value  =document.updateProfessorData.sjsuidinput.value;
			document.forms[0].action = '../UpdateProfData';
			document.forms[0].submit();
		}
		$(function() {
			$('#dp3').datepicker();
			$('.selectpicker').selectpicker();
		});
	</script>

</body>
</html>