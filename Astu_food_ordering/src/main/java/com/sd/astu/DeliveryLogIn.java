package com.sd.astu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeliveryLogIn
 */
@WebServlet("/DeliveryLogIn")
public class DeliveryLogIn extends HttpServlet {
	
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name = request.getParameter("Username");
		String Pass = request.getParameter("password");
		
		try {
			
			  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			  PreparedStatement stm = conn.prepareStatement("select * from delivery where firstName = ? and password = ?");
			  stm.setString(1, Name);
			  stm.setString(2, Pass);
			  ResultSet rs = stm.executeQuery();
			  if (rs.next()) {
				  
				  out.println("Hello" + " "+ Name + " <br>"+ "you will recieve order throw your email stay tuned <a href = Delivery.jsp>click here to logout</a>");
			  }
			  else {
				  
				  
				  out.println("<center><h1 style = color:red>wrong password or user name</p></center> ");
					RequestDispatcher rd = request.getRequestDispatcher("Delivery.jsp");
					rd.include(request, response);
			  }
			
			
		}catch (Exception e) {
			out.println(e);
			e.printStackTrace();
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
