<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" ></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" ></script>
<style>
body{
   height:100%;
   width:100%;
   background-image:url(ga.jpg);/*your background image*/  
   background-repeat:no-repeat;/*we want to have one single image not a repeated one*/  
   background-size:cover;/*this sets the image to fullscreen covering the whole screen*/  
   /*css hack for ie*/     
   filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='.ga.jpg',sizingMethod='scale');
   -ms-filter:"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='ga-.jpg',sizingMethod='scale')";
}
</style>
<body >
<form name="blood" method="post" action ="BloodRequirementServlet" >
<div class="container">
  <center>
		<b><p style="color: tomato; font-size: 50px;">Blood Donation Form</p></b>
	</center>
  <form action="/action_page.php">
  <div class="form-group">
      <label for="bg"><font color="black"><font size="5">Blood Group:</font></font></label>
      <select name="tf1"  class="form-control">
<option value=""></option>
<option value="A+ve">A+ve</option>
<option value="B+ve">B+ve</option>
<option value="A-ve">A-ve</option>
<option value="B-ve">B-ve</option>
<option value="O+ve">O+ve</option>
<option value="O-ve">O-ve</option>
<option value="AB-ve">O-ve</option>
</select>
</div> 
<div class="form-group">
      <label for="st"><font color="black"><font size="5">State:</font></font></label>
      <select name="tf2" class="form-control">
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
      <input type="text" class="form-control" id="area" placeholder="Enter area" name="tf3" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="pn"><font color="black"><font size="5">Pin Code:</font></font></label>
      <input type="number" class="form-control" id="pn" placeholder="Enter Pin_Code" name="tf4" autocomplete="off" required>
    </div>
    <div class="form-group">
      <label for="cn"><font color="black"><font size="5">Contact Number:</font></font></label>
      <input type="number" class="form-control" id="cn" placeholder="Enter contact number" name="tf5" autocomplete="off" required>
    </div>
    <input type="submit" name="tf6" value="Submit"/>  
  

</form>
</center>
</body>
</html>