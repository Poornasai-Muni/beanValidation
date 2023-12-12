package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("Employee")
public class EmployeeController {

	
		@Autowired
		private  EmployeeService adminservice;
		
		
		@PostMapping("/register")
		public ResponseEntity<String> registerEmployee(@Valid @RequestBody Employee emp)
		{
			Employee em = new Employee(emp.getId(),emp.getName(),emp.getDesignation());
			adminservice.registerEmployee(em);
			return new ResponseEntity<>("Employee register Sucessfully",HttpStatus.CREATED);
		}

		
	
	
	
	
}
