<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Adding Food</title>
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
    <form action = "AddFood" method = "post">
        <h1>Enter Name Of Food And Price</h1>
        <p>Name OF Food</p><input type = "text" name = "food_name">
        <p>Price OF Food</p><input type = "number" name = "food_price"><br>
        <br><input type = "submit" value = "Add">
        <a href = "homePage.jsp">Logout</a>
    </form>
</body>
</html>