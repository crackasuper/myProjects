package com.sd.astu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String Statuses = request.getParameter("status");
		if(Statuses.equals("Admin")) {
			//RequestDispatcher rd = request.getRequestDispatcher("Admin.jsp");
			//rd.forward(request, response);
			response.sendRedirect("Admin.jsp");
			
		}
		else if(Statuses.equals("User")) {
			response.sendRedirect("user.jsp");
			
		}
		else if(Statuses.equals("Delivery")) {
			response.sendRedirect("Delivery.jsp");
			
		}
		else {
			out.println("<center><h1 style =  color:red>please select from the option \n wrong status was choosed</h1></center>");
			RequestDispatcher rd = request.getRequestDispatcher("homePage.jsp");
			rd.include(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
