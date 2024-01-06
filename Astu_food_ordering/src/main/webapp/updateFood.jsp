<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update food</title>

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
      color: white;
      font-size: 20px;
      background-color:blue;
   }
   
</style>

</head>
<body>
     
     <form action = "UpdateFood" method = "get">
         <h1>Enter Name Of Food And Price To Update</h1>
        <p>Name Of Food</p><input type = "text"name = "food_name">
        <p>Price Of Food</p><input type = "number"name = "food_price">
        <br><br><input type = "submit" value = "update">
        <a href = "homePage.jsp">Logout</a>
     </form>
</body>
</html>