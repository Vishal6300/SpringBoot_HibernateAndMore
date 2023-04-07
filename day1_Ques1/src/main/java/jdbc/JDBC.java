package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {
	
	public Connection getConnection() throws Exception{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/SB201";
		String username="root";
		String password="root";
		
		Connection conn= DriverManager.getConnection(url,username,password);
		return conn;
	}
}
