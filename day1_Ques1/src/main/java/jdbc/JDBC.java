package jdbc;

import java.sql.Connection;

public class JDBC {
	
	public Connection getConnection() throws Exception{
		
		String url="jdbc:mysql://localhost:3306/SB201";
		String username="root";
		String password="root";
		
		return conn;
	}
}
