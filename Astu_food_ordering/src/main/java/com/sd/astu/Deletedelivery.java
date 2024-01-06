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
 * Servlet implementation class Deletedelivery
 */
@WebServlet("/Deletedelivery")
public class Deletedelivery extends HttpServlet {
	
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("firstName");
		String Passcode = request.getParameter("password");
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			PreparedStatement stm = conn.prepareStatement("select * from delivery where password = ?");
			//stm.setString(1, userName);
			stm.setString(1, Passcode);
			
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				
				 stm = conn.prepareStatement("delete from delivery where password = ?");
				
				 stm.setString(1, Passcode);
				 int i  = stm.executeUpdate();
				 if(i > 0) {
					 out.println("<center><h1 style = color:silver>deleted successfully</p></center> ");
					 RequestDispatcher rd = request.getRequestDispatcher("deleteDelivery.jsp");
					 rd.include(request, response);
				 }
				 else {
					 out.println("<center><h1 style = color:red>delete failed</p></center> ");
					RequestDispatcher rd = request.getRequestDispatcher("deleteDelivery.jsp");
					 rd.include(request, response);
				 }
				
			}
			else {
				out.println("<center><h1 style = color:red>delivery with wrong password or user name</p></center> ");
				RequestDispatcher rd = request.getRequestDispatcher("deleteDelivery.jsp");
				 rd.include(request, response);
			}
			
			
		}catch(Exception e) {
			out.println(e);
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
