<!DOCTYPE html>
<html lang="en">
<head>
<title>Customer Details</title>
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
					<li><a href="${contextPath}/customers">Add Customer</a></li>
					<li><a href="${contextPath}/customers/loadmenu">Load
							Customer</a></li>
					<li><a href="${contextPath}/customers/update">Update
							Customer</a></li>
					<li><a href="${contextPath}/customers/deletemenu">Delete
							Customer</a></li>
				</ul>
			</div>
			<div class="col-sm-8 text-left">
				<h1>Customer Details</h1>
				<table>
					<tr>
						<td>Customer ID:</td>
						<td>${customer.customerID}</td>
					</tr>
					<tr>
						<td>Customer Name:</td>
						<td>${customer.title}${customer.firstName}
							${customer.middleName} ${customer.lastName} ${customer.suffix}</td>
					</tr>
					<tr>
						<td>Email:</td>
						<td>${customer.email}
					</tr>
					<tr>
						<td>Company:</td>
						<td>${customer.company}
					</tr>
					<tr>
						<td>Display Name:</td>
						<td>${customer.displayName}</td>
					</tr>
					<tr>
						<td>Print on Check As:</td>
						<td>${customer.printOnCheckAs}.</td>
					</tr>
					<tr>
						<td>Other Details:</td>
						<td>${customer.otherDetails}.</td>
					</tr>
					<tr>
						<td>Billing Address:</td>
						<td>${customer.address.billingStreet}
							${customer.address.billingCity} ${customer.address.billingState}
							${customer.address.billingZIP},
							${customer.address.billingCountry}.</td>
					</tr>
					<tr>
						<td>Shipping Address:</td>
						<td>${customer.address.shippingStreet}
							${customer.address.shippingCity}
							${customer.address.shippingState}
							${customer.address.shippingZIP},
							${customer.address.shippingCountry}.</td>
					</tr>
				</table>
				<hr>
				<p>NOTE: Orders can only be made in store at the time. We are
					working on bringing our order system online thank you</p>

			</div>
		</div>
	</div>

</body>
</html>
