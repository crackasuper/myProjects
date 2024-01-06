package com.sd.astu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class UpdateFood
 */
@WebServlet("/UpdateFood")
public class UpdateFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   response.setContentType("text/html");
		   PrintWriter out = response.getWriter();
		   
		   String food_name = request.getParameter("food_name");
		   int food_price = Integer.parseInt(request.getParameter("food_price"));
		   
		   try {
			   
			   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			   PreparedStatement stm = conn.prepareStatement("update  food set  food_price = ? where food_name =" + food_name);
			   
			 
			   stm.setDouble(1, food_price);
			   int i = stm.executeUpdate();
			   if ( i > 0) {
				   
				   out.println("<center><h1 style = 'color:cyan'>food price was updated successfully!!</h1></center");
				   
				   javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("updateFood.jsp");
				   rd.include(request, response);
			   }else {
				   out.println("wrong food choiced please choose correct food name and price");
				   javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("updateFood.jsp");
				   rd.include(request, response);
			   }
			   
		   }catch(Exception e) {
			   out.println(e);
		   }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
