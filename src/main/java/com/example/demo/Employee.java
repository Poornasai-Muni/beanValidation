package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotNull;

@Entity
public class Employee
{
	@Id
	
	private int id;
	@NotNull
	private String name;
	
	@NotNull
	private String Designation;
	public Employee()
	{super();}	
	public Employee( int id,String name, String designation) {
		super();
		this.name = name;
		this.id = id;
		Designation = designation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	
	
}
