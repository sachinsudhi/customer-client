<!DOCTYPE html>
<html lang="en">
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<title>Customer Edit Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- Custom styles for this template -->
<link href="resources/css/global.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#myNavbar">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"
					href="http://imcsgroup.net/img/logos/home/imcs-group-grey-logo.png">IMCS</a>
			</div>
		</div>
	</nav>

	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-2 sidenav">
				<ul class="nav">
					<li class="active"><a href="${contextPath}/home">Home</a></li>
					<li><a href="${contextPath}/customers/list">Show Customer</a></li>
					<li><a href="#">Add Customer</a></li>
					<li><a href="${contextPath}/customers/load">Load Customer</a></li>
					<li><a href="${contextPath}/customers/update">Update Customer</a></li>
					<li><a href="${contextPath}/customers/delete">Delete Customer</a></li>
				</ul>
			</div>
			<div class="col-sm-8 text-left">
			
				<h1>Enter Customer Details</h1>
				<hr>
				<div class="form-group">
					<label for="Title Select">Title</label> <select
						class="form-control" id="exampleFormControlSelect1">
						<option>Mr.</option>
						<option>Mrs.</option>
						<option>Ms.</option>
						<option>Dr.</option>
						<option>None</option>
					</select>
				</div>

				<div class="form-group text-left ">
					<label class="control-label " for="fname"> First Name </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" id="fname" name="fname" type="text"
							placeHolder="First Name" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label " for="mname"> Middle Name </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" id="mname" name="mname" type="text"
							placeHolder="Middle Name" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label " for="lname"> Last Name </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" id="lname" name="lname" type="text"
							placeHolder="Last Name" />
					</div>
				</div>
				
				<div class="form-group">
					<label for="Suffix-Select">Suffix</label> <select
						class="form-control" id="suffixControlSelect">
						<option>I</option>
						<option>II</option>
						<option>Jr.</option>
						<option>Sr.</option>
						<option>None</option>
					</select>
				</div>

				<div class="form-group text-left ">
					<label class="control-label " for="email"> Email </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-envelope"></span>
						</div>
						<input class="form-control" id="email" name="email" type="text"
							placeHolder="E-mail Address" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="company">Company </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-folder-close"></span>
						</div>
						<input class="form-control" id="company" name="company" type="text"
							placeHolder="Company" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="dname">Display Name </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" id="dname" name="dname" type="text"
							placeHolder="Display Name" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="poncheck">Print on Check </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
						</div>
						<input class="form-control" id="poncheck" name="poncheck" type="text"
							placeHolder="Print on Check" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="bstreet">Billing Street </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="bstreet" name="bstreet" type="text"
							placeHolder="Billing Street" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="bcity">Billing City </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="bcity" name="bcity" type="text"
							placeHolder="Billing city" required/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="State-Select">Billing State</label> <select
						class="form-control" id="suffixControlSelect">
						<option>CA</option>
						<option>NV</option>
						<option>TX</option>
						<option>FL</option>
						<option>Other(If you choose this option, please add your state in billing city field)</option>
					</select>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="bzip">Billing ZIP </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="bzip" name="bzip" type="text"
							placeHolder="Billing ZIP" required/>
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="bcountry">Billing Country </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="bcountry" name="bcountry" type="text"
							placeHolder="Billing Country" required/>
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="sstreet">Shipping Street </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="sstreet" name="sstreet" type="text"
							placeHolder="Shipping Street" />
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="scity">Shipping City </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="scity" name="scity" type="text"
							placeHolder="Shipping city" required/>
					</div>
				</div>
				
				<div class="form-group">
					<label for="State-Select">Shipping State</label> <select
						class="form-control" id="suffixControlSelect">
						<option>CA</option>
						<option>NV</option>
						<option>TX</option>
						<option>FL</option>
						<option>Other(If you choose this option, please add your state in billing city field)</option>
					</select>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="szip">Shipping ZIP </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="szip" name="szip" type="text"
							placeHolder="Shipping ZIP" required/>
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label class="control-label" for="scountry">Shipping Country </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<input class="form-control" id="scountry" name="scountry" type="text"
							placeHolder="Shipping Country" required/>
					</div>
				</div>
				
				<div class="form-group text-left ">
					<label for="odetails">Other Details </label>
					<div class="input-group">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-road"></span>
						</div>
						<textarea id="odetails" rows="3" cols="110"> </textarea>
					</div>
				</div>
				
				<div>
				<button class="btn btn-primary btn-lg btn-warning" type="submit">Save</button>
				</div>
				
			</div>
		</div>
	</div>

</body>
</html>
