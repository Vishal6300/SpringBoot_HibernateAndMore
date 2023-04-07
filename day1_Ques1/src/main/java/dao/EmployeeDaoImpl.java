package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import exception.EmployeeException;
import jdbc.JDBC;
import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	public String registerEmployee(Employee employee) {
		try(Connection conn= JDBC.getConnection()) {
			PreparedStatement ps= conn.prepareStatement("Insert into employee values(?,?,?,?);");
			ps.setInt(1, 101);
			ps.setString(2, "Rehan");
			ps.setString(3, "Patna");
			ps.setInt(4, 5000);
			
			int db= ps.executeUpdate();
			if(db>0) {
				System.out.println("Inserted successfully");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee not inserted";
	}

	public Employee getEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployeeById(int empId) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
