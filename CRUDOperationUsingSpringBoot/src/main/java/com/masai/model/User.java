package com.masai.model;

import jakarta.persistence.Entity;

@Entity
public class User {

	private int id;
	
	private String name;
	private String address;
	
	private String status;
}
