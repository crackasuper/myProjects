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
 * Servlet implementation class showData
 */
@WebServlet("/showData")
public class showData extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		    response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		
		   //retrieving data from the database
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataaa", "root", "me@sd");
			String sql1 = "select * from food";
			String sql2 = "select * from delivery";
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql1);
			
			ResultSetMetaData dd = rs.getMetaData();
			
			int columnNumber = dd.getColumnCount();
			
			 out.println("<html>");
			 out.println("<h1>Food Name And It's Price</h1><hr><hr>");
			 out.println("<table style = 'text-align: center'>");
			 out.println("<thead style = 'text-align: center'><tr style = 'border: 1px solid black'><th style = 'border: 1px solid black'>"+dd.getColumnName(1)+"</th><th style = 'border: 1px solid black'>"+ dd.getColumnName(2)+ "</th><th colspan = '2'style = 'border: 1px solid black'>Action</thd></tr></thead>");
			 while(rs.next()) {
				 
				out.println("<tbody><tr><td style = 'border: 1px solid black'>" + rs.getString(1)+ "</td><td style = 'border: 1px solid black'>"+ rs.getDouble(2)+ "</td><td style = 'border: 1px solid black'><a href = addFood.jsp>add</a></td><td style = 'border: 1px solid black'><a href = deleteFood.jsp>delete</a></td></tr></tbody>");
				 
			 }
			 out.println("</table");
			 out.println("</html>");
		PreparedStatement stt = conn.prepareStatement(sql2); 
		ResultSetMetaData mm = stt.getMetaData();
		
		out.println("<table>");
		out.println("<thead><tr><th>"+ mm.getColumnName(1)+ "</th><th>"+ mm.getColumnName(2)+ "</th><th>"+ mm.getColumnName(3)+ "</th><th>"+ mm.getColumnName(4)+ "</th><th>"+ mm.getColumnName(5)+ "</th><th>"+ mm.getColumnName(6)+ "</th><th colspan = '2'>Action</th></tr></thead>");
		
		
		out.println("</table>");
			
		}catch (Exception e) {
			out.println(e);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
