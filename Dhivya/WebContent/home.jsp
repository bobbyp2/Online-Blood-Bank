<%@page import="DAO.DonationDAOImpl"%>
<%@page import="Model.BloodDonation"%>
<%@page import="DAO.bloodDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bloodavailable"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >
.image{
align:right;
background-repeat:no repeat;


}




</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title></title>
<h1>
	<center>
		<b><p style="color: tomato; font-size: 50px;">WELCOME TO BLOOD
				BANK MANAGEMENT SYSTEM</p></b>
	</center>
</h1>
</head>

<body>

	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">

    </div>
    <ul class="nav navbar-nav">
      <li> <a href="index.jsp"><p style="font-size: 20px;"><font color="#1589FF">NEW USER REGISTER HERE</font></p></a> </li>
      <li><a href="login.jsp"><p style="font-size: 20px;"><font color="#1589FF">LOGIN HERE</font></p></a> </li>
    </ul>
  </div>
</nav>

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
		</table>
	</div>
	<div class="container">
	<h2>
	<center>
		<b><p style="color: tomato; font-size: 30px;">USER FEEDBACK</p></b>
	</center>
</h2>
		<table class="table table-bordered"> <center>
			<%
				List<BloodDonation> List = new ArrayList<>();
				List= new DonationDAOImpl().listAllfeedback();%>
				<th > <p style="font-size: 20px;"><font color="#1589FF">HospitalName</font></th> <th> <p style="font-size: 20px;"><font color="#1589FF">City</font></th>  <th> <p style="font-size: 20px;"><font color="#1589FF">FeedBackComments</font></th>  
				<% for (BloodDonation temp : List) {
			%>
			<tr> 
				<td><%=temp.getHospitalName()%></td>
				<td><%=temp.getCity()%></td>
				<td><%=temp.getFeedback() %></td>
				
			</tr>
			<%
				}
			%></center>
		</table>
	</div>
	<img id="image" src="imagesg.jfif" alt="Italian Trulli" align = "right" >
</body>
</html>
