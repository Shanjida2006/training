package training.com.sk.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Problem5 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");

			con.setAutoCommit(false);

			pstmt = con.prepareStatement("insert into training.employee values (?, ?)");
			pstmt.setInt(1, 110);
			pstmt.setString(2, "Hasan Mahmud");
			System.out.println(pstmt.executeUpdate());

			con.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
