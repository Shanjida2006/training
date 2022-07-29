package training.com.sk.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Problem6 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			
			//Statment
			stmt = con.createStatement();
			stmt.addBatch("insert into training.employee values (106, 'Esha')");
			stmt.addBatch("insert into training.employee values (107, 'Ira')");
			stmt.executeBatch();
			
			//Prepared
			PreparedStatement pstmt = con.prepareCall("insert into training.employee values (?, ?)");

			pstmt.setInt(1, 108);
			pstmt.setString(2, "Afseen");
			pstmt.addBatch();

			pstmt.setInt(1, 109);
			pstmt.setString(2, "Anisha");
			pstmt.addBatch();
			
			pstmt.executeBatch();

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
