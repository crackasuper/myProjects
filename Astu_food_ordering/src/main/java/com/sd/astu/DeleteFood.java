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
 * Servlet implementation class DeleteFood
 */
@WebServlet("/DeleteFood")
public class DeleteFood extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		                            
		String foodName = request.getParameter("food");
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			PreparedStatement stm = conn.prepareStatement("select * from food where food_name = ?");
			stm.setString(1, foodName);
			ResultSet rs = stm.executeQuery();
			
			
			if (rs.next()) {
				stm = conn.prepareStatement("delete from food where food_name = ?");
				stm.setString(1, foodName);
				int i = stm.executeUpdate();
				if (i > 0) {
					out.println("<center><h1 style = color:silver>deleted successfully</p></center> ");
					RequestDispatcher rd = request.getRequestDispatcher("deleteFood.jsp");
					 rd.include(request, response);
				}
				else {
					out.println("<center><h1 style = color:red>delete failed</p></center> ");
					RequestDispatcher rd = request.getRequestDispatcher("deleteFood.jsp");
					 rd.include(request, response);
				}
			}
			else {
				out.println("<center><h1 style = color:red>wrong food choice</p></center> ");
				RequestDispatcher rd = request.getRequestDispatcher("deleteFood.jsp");
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
