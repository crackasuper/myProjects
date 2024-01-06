<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order confirmation</title>
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
   form p {
      
      font-family: Verdana sans-serif;
      font-size: 30px;
      font-weight: bold;
      color: white;
      word-spacing: 5px;
   }
   
</style>
</head>
<body>
    <form action = "confirmationOrder" method = "get">
        <h1>Fill All Needed Information To order</h1>
        <p>Food Amount</p><input type = "number" name = "food_amount">
        <p> Credit Card</p><input type = "number" name = "credit_card">
        <p>Secret Number</p><input type = "number" name = "secret_number">
        <p>Food Price</p><input type = "number" name = "food_price">
        <br>
        <br><input type = "submit" value = "order">
    </form>
</body>
</html>