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
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String Name = request.getParameter("userName");
		String Password = request.getParameter("password");
		
		try {
			
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa","root","me@sd");
			PreparedStatement stm = conn.prepareStatement("select firstName from admin where firstName = ? and password = ?");
			stm.setString(1, Name);
			stm.setString(2, Password);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				
				response.sendRedirect("adminadata.jsp");
			}
			else {
				out.println("<center><h1 style = color:red>wrong password or user name</p></center> ");
				RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
				rd.include(request, response);
			}
			
		}catch(Exception e) {
			out.println(e);
			
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
