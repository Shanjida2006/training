package training.com.sk.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Problem2 {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");

			//insert
			pstmt = con.prepareStatement("insert into training.employee values (?, ?)");
			pstmt.setInt(1, 105);
			pstmt.setString(2, "Charles");
			
			//update
			int count = pstmt.executeUpdate("update employee set name = 'Jhon' where id =102;");
			System.out.println(count);

			//select
			pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
