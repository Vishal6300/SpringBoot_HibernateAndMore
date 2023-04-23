package com.masai;

public class Department {
	private int deptId;
	private String deptName;
	private String location;
	private Employee employee;
	
	
	public Department(int deptId, String deptName, String location, Employee employee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + ", employee="
				+ employee + "]";
	}
	
	//use constructor injection to inject the above fields.
	//override the toString method with all the above fields
	
	
}
