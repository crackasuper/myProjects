
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>food ordering and delivery</title>
<style type = "text/css">
   form {
      text-align: center;
      
   }
   html {
      
      background-image: url("burer.jpg");
      padding-top: 30px;
   }
   form ul li {
      list-style-type: none;
      color:orange;
      display: inline-block;
      font-size: 30px;
      padding-right: 20px;
   }
   .log {
       
    color: red;
	font-size: 15px;
	letter-spacing: 1px;
	cursor: pointer;
	font-family: Verdana;
	
   }
   span {
      color: blue;
   }
   form h3 {
       color: orange;
       font-size: 35px;
       
   }
   form p {
      font-size: 28px;
      color: white;
   }
</style>
</head>
<body>
   <div class = "log">
       <h1>FSE<span>PROJECT</span></h1>
   
   </div> 
   <form action = "Home" method = "get">
        <h3>Food Ordering And Delivery System Project</h3>
        <ul>
          <li>Admin</li>
          <li>User</li>
          <li>Delivery</li>
          
        </ul>
        <br><br>
       <p>choose your status</p> <input type = "text" name = "status"placeholder = "your status"><br>
       <br><input type = "submit" value = "submit">
       <P> welcome to our site. we are here for server you. in order to get access through and served<br>please select your status and follow some steps with patient .<br></P>
       <ul>
         <li>0km - 3km<br>60ETB</li>
         <li>3km - 6km<br>180ETB</li>
         <li>6km - 15km<br>250ETB</li>
         <li>15km - above<br>350ETB</li>
       </ul>
   </form>
   
</body>
</html>