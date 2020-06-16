import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qatestingdb", "root",
				"Mera0adam9$");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'adam'");

		// or simply you can do: rs.next();
		while (rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}

	}

}
