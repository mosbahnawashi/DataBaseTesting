import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCredentials {

	public static void main(String[] args) throws SQLException {

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qatestingdb", "root",
				"Mera0adam9$");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from Employeeinfo where name = 'adam'");

		while (rs.next())

		{

			WebDriver driver = new ChromeDriver();

			driver.get("https://login.salesforce.com");

			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("name"));

			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("location"));

		}

	}

}