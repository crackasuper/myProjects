<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delivery signup</title>
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
</style>
</head>
<body>
     <form action = "DeliverySignUp" method = "post">
              <h1>Enter All Needed Information To Sign up For Application</h1>
              <p>First Name</p><input type = "text" name = "firstName">
              <p>Last Name</p><input type = "text" name = "lastName">
              <p>Email</p> <input type  = "email" name = "Email">
              <p> phoneNumber </p><input type = "text" name = "PhoneNumber">
              <p>Password</p><input type = "password" name = "Password">
              <p>city</p><input type = "text" name = "city"><br>
              <br>
              <input type = "submit" value = "signup">
              
         
     </form>
</body>
</html>