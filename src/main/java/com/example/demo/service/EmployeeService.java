package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public String getId() {
		return "123";
	}
	
	public String getSalary() {
		return "$123";
	}
}
