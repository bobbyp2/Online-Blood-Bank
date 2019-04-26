<
<%@page import="DAO.bloodDAOImpl"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.Bloodavailable"%>
<%@page import="java.util.List"%>
<%@page import="javafx.beans.binding.ListBinding"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
		<%   
		if(request.getSession().getAttribute("Listobj")!=null){
			List<Bloodavailable> obj1 =(List<Bloodavailable>)request.getSession().getAttribute("Listobj");
		%>
		<center><table  class="table table-bordered"> 
		<h2><p style="font-size: 30px;"><font color="red">Available Blood</font></h2>
		<th><p style="font-size: 20px;"><font color="#1589FF">Blood Group</font></th> <th> <p style="font-size: 20px;"><font color="#1589FF">State</font></th>  <th><p style="font-size: 20px;"><font color="#1589FF">Area</font></th>  <th><p style="font-size: 20px;"><font color="#1589FF">Pincode</font></th>  <th><p style="font-size: 20px;"><font color="#1589FF">Contact Number</font></th>
		<% for(Bloodavailable temp: obj1 ){%>
		<tr>
		<td><%=temp.getBloodgroup() %></td>  <td><%=temp.getState() %></td>  <td><%=temp.getArea() %></td>  <td><%=temp.getPincode() %></td>  <td><%=temp.getContactnumber() %></td>
		</tr>
		<%}%>
<tr>
<%}%>


</table>
</center>
</body>
</html>