package training.com.sk.day8;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Problem4 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			
			DatabaseMetaData dbData = con.getMetaData();
			
			System.out.println(dbData.getDatabaseProductVersion());
			System.out.println(dbData.getDatabaseProductName());
			System.out.println(dbData.getDefaultTransactionIsolation());

			pstmt = con.prepareStatement("select * from employee where id =103");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				ResultSetMetaData rsData = rs.getMetaData();
				System.out.println("Total Column: "+rsData.getColumnCount());
				System.out.println("First Column Type: "+rsData.getColumnName(1) + "-> " + rsData.getColumnTypeName(1));
				System.out.println("Second Column Type: "+rsData.getColumnName(2) + "-> " + rsData.getColumnTypeName(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
