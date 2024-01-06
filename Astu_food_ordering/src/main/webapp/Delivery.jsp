<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delivery login page</title>
<style type = "text/css">
   
     form {
     padding-top: 200px;
      text-align: center;
      color : white;
   }
   html {
      background: silver;
      background-image: url("shiro.jpg");
   }
  form h1 {
      color: blue;
      font-family: verdana;
   }
    form a {
       font-size: 20px;
       background-color: blue;
       color: white;
    }
   
</style>
</head>
<body>
   <form action = "DeliveryLogIn" method = "get">
        <h1> Login to get order or sign up for application</h1>
        <p> User Name </p><input type = "text" name = "Username">
        <p>Password </p><input type = "password" name = "password"><br>
        
        <br><input type = "submit"value = "Login">
       <a href = "deliverySignup.jsp">Signup</a> 
   </form>
</body>
</html>