<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
<title>Donation Details</title>
</head>
<style>
body{
   height:100%;
   width:100%;
   background-image:url(hs.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.hs.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='hs-.jpg',sizingMethod='scale')";
}
</style>
<body >
<form name="blood" method="post" action ="BloodDonationServlet1" onsubmit="return validateForm();">
<div class="container">
  <center>
		<b><p style="color: black; font-size: 50px;">User Donation Form</p></b>
	</center>
  <form action="/action_page.php">
  <div class="form-group">
      <label for="hs"><font color="black"><font size="5">Hospital Name:</font></font></label>
      <input type="text" class="form-control" id="hs" placeholder="Enter hospital name" name="tf1" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="ct"><font color="black"><font size="5">City:</font></font></label>
      <input type="text" class="form-control" id="hs" placeholder="Enter city" name="tf2" autocomplete="off" required>
    </div>
     <div class="form-group">
      <label for="dt"><font color="black"><font size="5">Date:</font></font></label>
      <input type="date" class="form-control" id="dt"  name="tf3" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="tm"><font color="black"><font size="5">Time:</font></font></label>
      <select name="tf4"  class="form-control">
<option value=""></option>
<option value="10AM-12PM">10AM-12PM</option>
<option value="1PM-3PM">1PM-3PM</option>
<option value="4PM-6PM">4PM-6PM</option>
</select>
    </div>
    <input type="submit" name="tf5" value="Submit"/>  
</form>
</body>
</html>