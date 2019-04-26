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
<title>Registration</title>
</head>
<style>
body{
   height:100%;
   width:100%;
   background-image:url(rg.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.rg.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='rg.jpg',sizingMethod='scale')";
}
</style>
<body >
<form name="blood" method="post" action="RegistrationServlet" >
<div class="container">
  <center>
		<b><p style="color: tomato; font-size: 50px;">Welcome To Blood Bank Management System</p></b>
	</center>
  <form action="/action_page.php">
    <div class="form-group">
      <label for="fname"><font color="black"><font size="5">First Name:</font></font></label>
      <input type="text" class="form-control" id="fname" placeholder="Enter firstname" name="tf1" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="lname"><font color="black"><font size="5">Last Name:</font></font></label>
      <input type="text" class="form-control" id="lname" placeholder="Enter lastname" name="tf2" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="age"><font color="black"><font size="5">Age:</font></font></label>
      <input type="number" class="form-control" id="age" placeholder="Enter age" name="tf3" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="gender"><font color="black"><font size="5">Gender:</font></font></label>
      <select name="tf4"  class="form-control">
<option value=""></option>
<option value="Male">Male</option>
<option value="Female">Female</option>
</select>
    </div>
    <div class="form-group">
      <label for="cn"><font color="black"><font size="5">Contact Number:</font></font></label>
      <input type="number" class="form-control" id="cn" placeholder="Enter contact number" name="tf5" autocomplete="off" required>
    </div>
     <div class="form-group">
      <label for="email"><font color="black"><font size="5">Email Id:</font></font></label>
      <input type="text" class="form-control" id="cn" placeholder="Enter email" name="tf6" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="password"><font color="black"><font size="5">Password:</font></font></label>
      <input type="text" class="form-control" id="cn" placeholder="Enter password" name="tf7" autocomplete="off" required>
    </div>
     <div class="form-group">
      <label for="wt"><font color="black"><font size="5">Weight:</font></font></label>
      <input type="number" class="form-control" id="wt" placeholder="Enter weight" name="tf8" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="st"><font color="black"><font size="5">State:</font></font></label>
      <select name="tf9" class="form-control">
<option value=""></option>
<option value="TamilNadu">TamilNadu</option>
<option value="Kerala">Kerala</option>
<option value="Andhra Pradesh">Andhra Pradesh</option>
<option value="Karnataka">Karnataka</option>
<option value="Telegana">Telegana</option>
<option value="Maharastra">Maharastra</option>
</select>
</div>
<div class="form-group">
      <label for="area"><font color="black"><font size="5">Area:</font></font></label>
      <input type="text" class="form-control" id="area" placeholder="Enter area" name="tf10" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="pn"><font color="black"><font size="5">Pin Code:</font></font></label>
      <input type="number" class="form-control" id="pn" placeholder="Enter Pin_Code" name="tf11" autocomplete="off" required>
    </div> 
    <div class="form-group">
      <label for="bg"><font color="black"><font size="5">Blood Group:</font></font></label>
      <select name="tf12"  class="form-control">
<option value=""></option>
<option value="A+ve">A+ve</option>
<option value="B+ve">B+ve</option>
<option value="A-ve">A-ve</option>
<option value="B-ve">B-ve</option>
<option value="O+ve">O+ve</option>
<option value="O-ve">O-ve</option>
<option value="AB+ve">O-ve</option>
<option value="AB-ve">O-ve</option>
</select>
</div> 
<br>
<input type="submit" name="tf13" value="Submit"/>  
</form>
</body>
</html>