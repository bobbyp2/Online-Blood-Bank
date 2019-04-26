<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title></title>
<h1><center><b><p style="color:red;font-size:50px;">BLOOD BANK MANAGEMENT SYSTEM</p></b></center></h1>
</head>
<style>
body{
   height:100%;
   width:100%;
   background-image:url(102.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.102.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='102-.jpg',sizingMethod='scale')";
}
</style>
<body class="container-fluid"  style ="color:White">

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">

    </div>
    <ul class="nav navbar-nav">
      <li> <a href="available.jsp"><p style="font-size: 20px;"><font color="#1589FF"><b>BLOOD AVAILABILITY</b></font></p></a> </li>
      <li><a href="Reqmnt.jsp"><p style="font-size: 20px;"><font color="#1589FF"><b>BLOOD REQUIREMENT</b></font></p></a> </li>
      <li> <a href="Donation.jsp"><p style="font-size: 20px;"><font color="#1589FF"><b>BLOOD DONATION</b></font></p></a> </li>
       <li> <a href="Feedback.jsp"><p style="font-size: 20px;"><font color="#1589FF"><b>EXPERIENCE SHARING</b></font></p></a> </li>
    </ul>
  </div>
</nav>
</body>
</html>
