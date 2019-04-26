<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
body{
   height:100%;
   width:100%;
   background-image:url(five.jfif);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.five.jfif',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='five.jfif',sizingMethod='scale')";
}
</style>
<body>
<form method="post" action="LoginServlet">

<div class="container">
  <center>
		<b><p style="color: black; font-size: 50px;">LOGIN PORTAL</p></b>
	</center>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="email"><font color="black"><font size="5">Email:</font></font></label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="tf1" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="pwd"><font color="black"><font size="5">Password:</font></font></label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="tf2" autocomplete="off" required>
    </div>
    <input type="submit" name="tf3" value="Submit"/>  
</form>

<%if(request.getSession().getAttribute("logstatus")==null){%>
<%} else { String status=request.getSession().getAttribute("logstatus").toString();%>
<p> <font color="red" /><%=status%> <p>
<% request.getSession().setAttribute("logstatus", null);}%> 
</body>
</html>