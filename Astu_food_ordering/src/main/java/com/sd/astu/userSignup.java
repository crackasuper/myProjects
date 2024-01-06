package com.sd.astu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class userSignup
 */
@WebServlet("/userSignup")
public class userSignup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		
		
try {
	
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
	    
	    PreparedStatement stm = conn.prepareStatement("insert into user values(?,?,?,?,?,?)");
	    stm.setString(1, firstName);
	    stm.setString(2, lastName);
	    stm.setString(3, email);
	    stm.setString(4, password);
	    stm.setString(5, phone);
	    stm.setString(6, city);
	    int i = stm.executeUpdate();
	    if (i > 0) {
	    	out.println("you are signed successfull<a href = user.jsp>click here to goto user login</a>");
	    	
	    }
	    else {
	    	out.println("error was occured while signing up please try again");
	    }
			
		}catch (Exception e) {
			
			out.println(e);
		}
	}

}
