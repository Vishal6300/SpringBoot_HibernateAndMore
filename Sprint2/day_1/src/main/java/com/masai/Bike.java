package com.masai;

public class Bike implements Vehicle{
	
	public void ride() {
		System.out.println("ride starts");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		ride();
	}

}
