<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Delivery</title>
<style type = "text/css">
  
    form {
     padding-top: 200px;
      text-align: center;
      color : white;
   }
   html {
      background: silver;
      background-image: url("dd.jpg");
   }
  form h1 {
      color: blue;
      font-family: verdana;
   }
   form a {
   
        color:white;
        background-color:blue;
        font-size:20px;
   }
  
</style>
</head>
<body>
    <form action = "Deletedelivery" method = "get">
       <h1> password of delivery to be deleted</h1>
       
       <p>Password </p><input type = "password" name ="password"><br>
       <br>
       <input type = "submit" value ="delete">
       <a href = "homePage.jsp">Logout</a>
    </form>
</body>
</html>