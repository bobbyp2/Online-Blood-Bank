package Model;


import java.sql.Connection;
import java.sql.DriverManager;

//singleton pattern class
public class ConnectionClass{

	private ConnectionClass() {
		// TODO Auto-generated constructor stub
	}

	public static Connection getConnection() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (Exception e) {
			System.out.println("Errror Registration Connection: " + e);
		}
		return con;

	}
}
