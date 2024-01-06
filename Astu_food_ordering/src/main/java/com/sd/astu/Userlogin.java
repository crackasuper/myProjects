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
 * Servlet implementation class Userlogin
 */
@WebServlet("/Userlogin")
public class Userlogin extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		try {
			
			 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			 PreparedStatement stm = conn.prepareStatement("select firstName from user where firstName = ?and password = ?");
			 stm.setString(1, userName);
			 stm.setString(2, password);
			 
			 ResultSet rs = stm.executeQuery();
			 
			 if (rs.next()) {
				 
				response.sendRedirect("order.jsp");
			 }
			 else {
				 out.println("<center><h1 style = color:red>wrong username or password</h1></center>");
				 RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
				 rd.include(request, response);
			 }
			
		}catch (Exception e) {
			out.print(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
