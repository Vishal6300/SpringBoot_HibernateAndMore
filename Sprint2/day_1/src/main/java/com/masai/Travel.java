package com.masai;

import java.util.Calendar;

public class Travel {
	
	private Vehicle v;
	private int numberOfPerson;
	private Calendar cal;
	
	
	
	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}


	public void setCal(Calendar cal) {
		this.cal = cal;
	}


	public void setV(Vehicle v) {
		this.v = v;
	}


	public void journey() {
		v.go();
		System.out.println("Journey started");
		System.out.println("Date is "+ cal);
		System.out.println("Number of person is "+ numberOfPerson);
	}
}
