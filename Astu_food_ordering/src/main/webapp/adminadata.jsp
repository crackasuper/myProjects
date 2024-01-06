<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Action</title>
<style type = "text/css">
   form {
     padding-top: 100px;
      text-align: center;
      color : white;
   }
   html {
      background: silver;
      background-image: url("burer.jpg");
   }
  form h1 {
      color: blue;
      font-family: verdana;
   }
   form ul li {
      
      font-family: Verdana sans-serif;
      font-size: 30px;
      font-weight: bold;
      color: red;
      word-spacing: 5px;
      list-style-type: none;
      display: inline-block;
      padding-right: 30px;
   }
   form ul li a {
      text-decoration: none;
   }
</style>
</head>
<body>
  
    <form action = "showData" method =  "get">
       <h1>Role Of Admin Are To</h1>
      
         
         <ul>
            <li><a href = "addFood.jsp">Add Food</a></li>
            <li><a href= "updateFood.jsp">Update Food</a></li>
            <li><a href = "deleteFood.jsp">Delete Food</a></li>
            <li><a href = "deliveryAdd.jsp">Add Delivery</a></li>
            <li><a href = "deleteDelivery.jsp">Delete Delivery</a></li>
            <li><input type = "submit" value = "show Information"></li> 
         </ul>
         
    
    </form>
</body>
</html>