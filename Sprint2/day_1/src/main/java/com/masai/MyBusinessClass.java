package com.masai;

public class MyBusinessClass {
	
	private int age;
	private String name;
	
	
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}



	public void funA() {	
		System.out.println("inside funA of A");
		System.out.println("Injected value of age is "+age);
		System.out.println("Injected name is "+ name);
	}
}
