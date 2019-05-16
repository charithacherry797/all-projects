package com.capgemini.inheritanceperhierarchy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.inheritanceperhierarchy.entities.ContractEmployee;
import com.capgemini.inheritanceperhierarchy.entities.Employee;
import com.capgemini.inheritanceperhierarchy.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/add")
	public Employee addEmployee() {

		ContractEmployee employee1 = new ContractEmployee(101, "Akashta", 2000, "20hours");
		service.addNew(employee1);
		
//		RegularEmployee employee2= new RegularEmployee(102, "Mahi", 240000, 10000);
//		service.addNew(employee2);
		return employee1;
		
	}
}
