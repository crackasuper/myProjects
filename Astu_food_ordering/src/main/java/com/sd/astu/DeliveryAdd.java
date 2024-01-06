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
 * Servlet implementation class DeliveryAdd
 */
@WebServlet("/DeliveryAdd")
public class DeliveryAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			  String first = request.getParameter("firstName");
			  String second = request.getParameter("lastName");
			  String Email = request.getParameter("email");
			  String phone = request.getParameter("phoneNumber");
			  String Pass = request.getParameter("Password");
			  String city = request.getParameter("city");
			  
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			String sql = "insert into delivery values(?, ?, ?, ?, ?, ?)";
		    PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, first);
			stm.setString(2, second);
			stm.setString(3, Email);
			stm.setString(4, phone);
			stm.setString(5, Pass);
			stm.setString(6, city);
			int i = stm.executeUpdate();
			if(i > 0) {
				out.println("<center><h1>data was added to database successfully</h1></center>");
				RequestDispatcher rd = request.getRequestDispatcher("deliveryAdd.jsp");
				rd.include(request, response);
			}
			else {
				out.println("i hope this one does not exit ");
			}
			
		}catch(Exception e) {
			out.print(e);
			e.printStackTrace();
		}
		
	}

}
