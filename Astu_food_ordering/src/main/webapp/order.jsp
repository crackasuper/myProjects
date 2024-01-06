<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ordering food</title>
<style type = "text/css">
   form {
      text-align: center;
     padding-top : 30px;
     color : white;
     font-size : 35px;
      
   }
   form ul li {
       
         display : inline-block;
         list-style-type : none;
         color: white;
         padding-right : 35px;
         font-size : 25px;
         font-family : sans-serif;
   }
   html {
      
        background-image : url("dd.jpg");
   }
   form h1  {
       font-size: 40px;
       color: white;
       
   }
   form h3 {
        font-size: 35px;
        color : white;
    }
    form p {
        font-size : 60px;
        color : red;
    }
</style>
</head>
<body>
   <form action = "ordering" method = "get">
       <h1>want to eat but do not want to go far. here we are for your problems</h1>
       <h3>just order us we are at your door!</h3>
       <p>kind of food and their price</p>
       <ul>
         <li>pizza<br>price :66birr </li>
         <li>pasta<br>price : 50birr</li>
         <li>injera<br>price: 30birr</li>
         <li>meat<br>price : 120birr</li>
         <li>chechebsa<br>price : 45birr</li>
         <li>sanbusa<br>price : 20birr</li>
         <li>sandwitch<br>price : 96birr</li>
         <li>normal firfir<br>price: 60birr</li>
         <li>burger<br>price: 100birr</li>
       </ul>
       your choice 
       <input type = "text" name = "foodChoosed" placeholder = "food name">
       <br><input type = "submit" value = "submit">
       
   </form>
</body>
</html>