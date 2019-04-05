<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script src="https://www.google.com/recaptcha/api.js" async defer></script>
<link rel="stylesheet" href="resources/css/style.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

     <div class="login">
  <div class="login-triangle"></div>
  
  <h2 class="login-header">Log in</h2>

  <form class="login-container" action="userLogin" method="post">
  
  <p style="color: red"> ${error} </p>
  
    <p><input type="text" placeholder="username" name="username" ></p>
    <p><input type="password" placeholder="Password" name="password"></p>
    
     <div class="g-recaptcha" data-sitekey="6LcnSpsUAAAAAD-MvbzRvAagg_fw6lG5DkHmqCDm"></div>
    
    <p><input type="submit" value="Log in"></p>
    
    <a href="facebook">LoginWithFacebook </a>
    
  </form>
</div>

 
</body>
</html>