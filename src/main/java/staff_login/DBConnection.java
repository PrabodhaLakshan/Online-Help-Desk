package staff_login;

import java.sql.DriverManager;
import java.sql.Connection;


public class DBConnection {
	private static String url ="jdbc:mysql://localhost:3306/online_help_desk?useSSL=false&serverTimezone=UTC";
	private static String user ="root";
	private static String pass ="lakshan02";
	
	private static Connection con;
	
	public static Connection getConnection () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e) {
			System.out.println("DataBase  Not Connect pleace fix it");
		}
		return con;
	}
	
}
