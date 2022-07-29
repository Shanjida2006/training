package training.com.sk.day8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Problem3 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");

			CallableStatement cstmt = con.prepareCall("{call EmployeeProcedure(?,?)}");
			cstmt.setInt(1, 108);
			cstmt.setString(2, "Tanjida");
			cstmt.execute();

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