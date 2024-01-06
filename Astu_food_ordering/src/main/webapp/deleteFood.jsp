<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Food</title>
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
       background-color: blue;
       font-size:20px;
   }

</style>
</head>
<body>
     
     <form action = "DeleteFood" method = "get">
         <h1>Enter Name Of Food To Delete</h1>
         <p>Name Of Food</p><input type = "text" name = "food">
         <br><br>
         <input type = "submit" value = "delete">
         <a href = "homePage.jsp">Logout</a>
     </form>
</body>
</html>