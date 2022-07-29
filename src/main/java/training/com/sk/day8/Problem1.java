package training.com.sk.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Problem1 {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Driver myDriver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "0801");
			stmt = con.createStatement();
			
			//insert
			stmt.executeUpdate("insert into training.employee values (103, 'Shanjida')");
			stmt.executeUpdate("insert into training.employee values (104, 'Ryan')");
		
			//select
			rs = stmt.executeQuery("select * from employee");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}

			//update
			int count = stmt.executeUpdate("update employee set name = 'James' where id =102;");
			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close();
			stmt.close();
			con.close();
		}
	}

}
