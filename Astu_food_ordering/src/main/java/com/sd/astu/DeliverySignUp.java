package com.sd.astu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeliverySignUp
 */
@WebServlet("/DeliverySignUp")
public class DeliverySignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		  response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  
		  String first = request.getParameter("firstName");
		  String lastname = request.getParameter("lastName");
		  String email = request.getParameter("Email");
		  String phone = request.getParameter("PhoneNumber");
		  String password = request.getParameter("Password");
		  String city = request.getParameter("city");
		  
		  
		  try {
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			  PreparedStatement stm = conn.prepareStatement("insert into delivery values(?,?,?,?,?,?)");
			  stm.setString(1, first);
			  stm.setString(2, lastname);
			  stm.setString(3, email);
			  stm.setString(4, phone);
			  stm.setString(5, password);
			  stm.setString(6, city);
			  int rs = stm.executeUpdate();
			  if (rs > 0) {
				  out.println("you are signed up successfully<br>waite for our new announcement of our work...<a href = Delivery.jsp>click here to logout</a>");
			  }
			  else {
				  out.println("error occured while signing up please try again");
				  response.sendRedirect("deliverySignup.jsp");
				  
			  }
			  
		  }catch (Exception e) {
			  e.printStackTrace();
			  out.print(e);
		  }
	}

}
