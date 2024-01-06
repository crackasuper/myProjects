package com.sd.astu;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;
import java.sql.ResultSetMetaData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;


@WebServlet("/confirmationOrder")
public class confirmationOrder extends HttpServlet {

       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setting up content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String Name = request.getParameter("name");//name of ordered food
		int foodPrice = Integer.parseInt(request.getParameter("foodPrice"));
		int items = Integer.parseInt(request.getParameter("items"));
		int paidPrice = Integer.parseInt(request.getParameter("price"));
		String  userName = request.getParameter("userName");//name of person who ordered
		
		//condition for ordering food
		
		
		if (foodPrice*items == paidPrice*items) {
			///storing ordered data to internal server
			     try {
			    	 
			    	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			    	    String sql = "insert into orderfood values(?,?,?)";
			    	    PreparedStatement stm = conn.prepareStatement(sql);
			    	    stm.setString(1, userName);
			    	    stm.setString(2, Name);
			    	    stm.setInt(3, items);
			    	    
			    	    int i = stm.executeUpdate();
			    	    
			    	    if (i >0) {
			    	    	
			    	    	 out.println("<center><h2 style = 'color:cyan'>your order is on the way please waite a while ....<br><a href = 'order.jsp'>want to order more</a></h2></center>");
			    	    	 out.println("<center><h1>thank you for choosing us</h1><p><a href = user.jsp>logout</p></center>");
			    	    }
			    	 
			     }catch (Exception e) {
			    	 out.print(e);
			    	 e.printStackTrace();
			    	 
			     }
			
			    
			      
			       
			       
			    
		}
		else {
			out.println("<center><h1 style = 'color:red'>your balance is insufficient to pay for ordered food. please recharge and order</h1><a href = order.jsp>want to order</a><p>thank you for your apply<br><a href = user.jsp>logout</a></center>");
			//javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("order.jsp");
			//rd.forward(request, response);
		      
		}
		
		
		
		out.close();
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
