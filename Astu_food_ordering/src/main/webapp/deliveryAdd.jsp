<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add delivery</title>
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
      color: white;
      background-color: blue;
      font-size: 20px;
   }
</style>
</head>
<body>
   <form action = "DeliveryAdd" method = "post">
       <h1>Fill All Below Information To Add New Delivery</h1>
      <p>First Name</p><input type = "text" name = "firstName">
      <P>Last Name</P><input type = "text" name = "lastName">
      <P>Email</P><input type = "email" name = "email">
      <p>Phone Number</p><input type ="text" name = "phoneNumber">
      <p>Password</p><input type = "password" name = "Password">
      <p>City</p><input type = "text" name ="city"><br>
      <br>
      <input type ="submit" value = "submit">
      
      <a href = "homePage.jsp">Logout</a>
   </form>

</body>
</html>