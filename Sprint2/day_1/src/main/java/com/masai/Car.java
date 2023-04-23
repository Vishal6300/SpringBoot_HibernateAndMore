package com.masai;

public class Car implements Vehicle{

	public void starts() {
		System.out.println("Car started");
	}
	
	@Override
	public void go() {
		starts();
		
	}

}
