<%@page import="DAO.bloodDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bloodavailable"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title></title>

<style>
body {
	height: 100%;
	width: 100%;
	background-image: url(downl.png); /*your background image*/
	background-repeat: no-repeat;
	/*we want to have one single image not a repeated one*/
	background-size: cover;
	/*this sets the image to fullscreen covering the whole screen*/
	/*css hack for ie*/
	filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.download.png',
		sizingMethod='scale');
	-ms-filter:
		"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='download.png',sizingMethod='scale')";
}
</style>
</head>
<style >
.image{
align:right;
background-repeat:no repeat;


}




</style>
<body>
	

	<div class="container">
	<h2>
	<center>
		<b><p style="color: tomato; font-size: 30px;">IMMEDIATE BLOOD REQUIREMENT</p></b>
	</center>
</h2>
		<table class="table table-bordered"> <center>
			<%
				List<Bloodavailable> list = new ArrayList<>();
				list = new bloodDAOImpl().listAllRequiredBloodDetails();%>
				<th> <p style="font-size: 20px;"><font color="#1589FF"> Blood Group</font></th> <th> <p style="font-size: 20px;"><font color="#1589FF">State</font></th>  <th> <p style="font-size: 20px;"><font color="#1589FF">Area</font></th>  <th> <p style="font-size: 20px;"><font color="#1589FF">Pincode</font></th>  <th> <p style="font-size: 20px;"><font color="#1589FF">Contact Number</font></th>
				<% for (Bloodavailable temp : list) {
			%>
			<tr ><p style="font-size: 20px;">
				<td><%=temp.getBloodgroup()%></td>
				<td><%=temp.getState()%></td>
				<td><%=temp.getArea() %></td>
				<td><%=temp.getPincode() %></td>
				<td><%=temp.getContactnumber() %></td>
			</tr>
			<%
				}
			%></center>
		</table><br><br>
	</div>
		<div class="container">

		<nav class="navbar navbar-inverse">
		<div class="container">
		<h2><b><font color="#1589FF">Donate Blood</font></b> <a href="Donation1.jsp" class="btn btn-info" role="button"><b>Click here</b></a></h2>


		</div>
		</nav>

	</div>
	<br />
	</div>
	<img id="image" src="imagesg.jfif" alt="Italian Trulli" align = "right" >
</body>
</html>
