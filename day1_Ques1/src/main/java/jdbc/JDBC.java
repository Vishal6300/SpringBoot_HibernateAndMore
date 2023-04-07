package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class JDBC {
	
	public static Connection getConnection() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/SB201";
		String username="root";
		String password="root";
		
		Connection conn= DriverManager.getConnection(url,username,password);
		return conn;
	}
	

}
