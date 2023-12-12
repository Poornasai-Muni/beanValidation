package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService{
	
	@Autowired
	private EmployeeRepository repo;
	
	
	public void registerEmployee(Employee emp) 	{
		
	      repo.save(emp);
	}


	
	
	
	
	

}
