package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;

@RestController
public class DemoController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value="/test1")
	public String demo() {
		return "Welcome to Apptad Ranchi";
	}
	
	@GetMapping("/getid")
	public String getEmployeeId() {
		
		return employeeService.getId();
	}
	
	@GetMapping("/getsalary")
	public String getSalary() {
		
		return employeeService.getSalary();
	}
}
