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
 * Servlet implementation class AddFood
 */
@WebServlet("/AddFood")
public class AddFood extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    
		    String foodName = request.getParameter("food_name");
		    int foodPrice = Integer.parseInt(request.getParameter("food_price"));
		    
		    try {
		    	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
		    	String sql = "insert into food values(?,?)";
		    	PreparedStatement stm = conn.prepareStatement(sql);
		    	stm.setString(1, foodName);
		    	stm.setInt(2, foodPrice);
		    	int i = stm.executeUpdate();
		    	if (i > 0) {
		    		out.println("<center><h1 style = color:blue>data was added successfully</h1></center>");
		    		RequestDispatcher rd = request.getRequestDispatcher("addFood.jsp");
		    		rd.include(request, response);
		    	}
		    	else {
		    		out.print("i hope i will not see this message");
		    	}
		    	
		    }catch (Exception e) {
		    	out.println(e);
		    	e.printStackTrace();
		    }
		    
	}

}
