<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User login</title>
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
   a {
       font-size: 20px;
       background-color: blue;
       color: white;
    }
</style>
</head>
<body>
   <form action  = "Userlogin" method = "get">
       <h1>to get ordering application and food list login. if you are new signup</h1>
      <p>User Name</p> <input type = "text" name = "userName">
      <p> Password</p> <input type = "password" name = "password"> <br>
      <br>
      <input type = "submit" value = "Login">
      <a href= "userSignup.jsp">sign up</a>
      
   </form>
</body>
</html>