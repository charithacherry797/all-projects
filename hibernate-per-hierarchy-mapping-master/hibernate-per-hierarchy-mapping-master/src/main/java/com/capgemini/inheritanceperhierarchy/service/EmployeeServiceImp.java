package com.capgemini.inheritanceperhierarchy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.inheritanceperhierarchy.dao.EmployeeDao;
import com.capgemini.inheritanceperhierarchy.entities.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public Employee addNew(Employee employee) {

	
		return dao.save(employee);
	}

	
	
}
