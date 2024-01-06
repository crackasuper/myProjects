<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User sign up</title>
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
      color: white;
      font-size: 25px;
   }
</style>
</head>
<body>
  <form action = "userSignup" method = "post">
      <h1>Full fill all information to sign up</h1>
     <p>First Name </p><input type = "text"name = "firstName">
     <p>Last Name</p><input type= "text" name = "lastName">
     <p>Email </p><input type = "email" name = "Email">
     <p>Password </p><input type = "password"name = "Password">
     <p>Phone Number</p><input type = "text" name = "phone">
     <p>City </p><input type = "text" name = "city"><br>
     <br>
     <input type = "submit" value = "signup">
  </form>

</body>
</html>