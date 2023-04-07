package useCases;

import java.sql.Connection;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;
import exception.EmployeeException;

public class Main {
	
	public static void main(String[] args) throws Exception {
	
	EmployeeDao ed= new EmployeeDaoImpl();
	Employee employee1= new Employee(1,"Vivek","delhi",4000);

		String registerMessage;
		try {
			registerMessage = EmployeeDao.registerEmployee(employee1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(registerMessage);
		
	    System.out.println(registerMessage);
}
}
