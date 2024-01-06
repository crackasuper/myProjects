<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin login page</title>
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

   
   <form action = "Admin" method = "get">
     <h1>Enter your email and password to login</h1>
      <p> User Name</p> <input type = "text" name = "userName"><br>
       <p>Password </p><input type = "password" name = "password"><br>
       <br><input type = "submit" value = "Login">
   </form>
</body>
</html>