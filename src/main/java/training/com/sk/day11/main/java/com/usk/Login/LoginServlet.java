//---------------------Problem 1---------------------------------

package com.usk.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void init(){
		System.out.println("Http Servlet");
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		
		PrintWriter out=res.getWriter();
		res.setContentType("text/html"); 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			PreparedStatement pstmt = con.prepareStatement("select * from user where user_name = ? and password = ? ");
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
	
			if(rs.next()) {
				out.println("You have successfully logged in " + userName);
			}else{
				out.println("Invalid login, Please try again ...");
			}
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
