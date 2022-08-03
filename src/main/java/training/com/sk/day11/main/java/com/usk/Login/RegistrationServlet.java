package com.usk.Login;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		String[] languages = request.getParameterValues("language");
		String duration = request.getParameter("duration");
		
		String selLang = ""; 
		for (String lang : languages){
			selLang = selLang + lang + " "; 
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			PreparedStatement pstmt = con.prepareCall("insert into training.registration values (?, ?,?,?)");
			pstmt.setString(1, userName);
			pstmt.setString(2, gender);
		    pstmt.setString(3, selLang);
			pstmt.setString(4, duration);
			pstmt.addBatch();
			pstmt.executeBatch();
	
		}catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//---------------------Problem 3---------------------------------
		PrintWriter out = response.getWriter(); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			PreparedStatement pstmt = con.prepareStatement("select * from registration");
			ResultSet rs = pstmt.executeQuery();

				while (rs.next()) {
					out.println(rs.getString("name") + " " + rs.getString("gender") + " " + rs.getString("language") + " " + rs.getString("duration"));
				}
			}catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} 
             catch (SQLException e) {
				e.printStackTrace();
		}
	}
}
