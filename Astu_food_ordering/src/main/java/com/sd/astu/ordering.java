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
import javax.swing.JOptionPane;

/**
 * Servlet implementation class ordering
 */
@WebServlet("/ordering")
public class ordering extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//prepareing ordering condition in servlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("foodChoosed");
	    //request.setAttribute("food name", name);
	   
		
		//jdbc connection
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			PreparedStatement stm = conn.prepareStatement("select * from food where food_name = ?");
			stm.setString(1, name);
			ResultSet rs = stm.executeQuery();
			
			
			if (rs.next()) {
				
				int foodPrice = rs.getInt("food_price");
                
                
				//forming hidden feild to  order confirmation
				
				
			    out.println("<html style = 'background-image :url('ded.jpg')'>");
				out.println("<body style =  background-color: brown>");
				out.println("<form style = text-align:center action = 'confirmationOrder' method ='get' >" );
				out.println("<h1 style = background-color:green> confirm your order</h1>");
				out.println("<p>How many amount of food you want to order</p>");
				out.println("<input type = 'number' name = 'items'>");
				out.println("<p>Enter your credit card</p>");
				out.println("<input type = 'number' name = 'creditCard'>");
				out.println("<p>Enter your credit card secret number</p>");
				out.println("<input type = 'text'name = 'item'>");
				out.println("<p>Enter price to be paid for food</p>");
				out.println("<input type = 'number' name = 'price'>");
				out.println("<p>please Enter your username</p>");
				out.println("<input type = 'text' name = 'userName' ><br>");
				out.println("<br><input type = 'submit' value = 'submit'>");
				
				out.println("<input type = 'hidden' name = 'name' value = " + name + ">");
				out.println("<input type = 'hidden' name = 'foodPrice' value  = "+ foodPrice +">");
				out.close();			
				
			
		}
		else {
			
                ///selected food is not available in food data base
			out.println("<center><h1 style = 'color:red'>please select items from list...</h1></center");
			RequestDispatcher rd = request.getRequestDispatcher("order.jsp");
			rd.include(request, response);
		}
			
			
		}
					
	   
		  catch(Exception e) {
		  e.printStackTrace();
		  out.println(e);
	  }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
