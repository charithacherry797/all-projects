package com.capgemini.files.client;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.model.Employee;
import com.capgemini.files.model.EmployeeDeSerialization;
import com.capgemini.files.model.EmployeeSerialization;

public class EmployeeTest {

	private Employee employee;
	@Before
	public void setUp() {
		employee = new Employee(101,"John Deo",34000);
	}
	
	
	@Test
	public void testSerialization() throws IOException, ClassNotFoundException {
		
		EmployeeSerialization writeObject= new EmployeeSerialization();
		writeObject.doSerialization(employee,"employee.ser");
		File file= new File("employee.ser");
		assertTrue(file.exists());
		
	}
	
	@Test
	public void testdeSerialzation() throws ClassNotFoundException, IOException {
		employee = new Employee(101,"John Deo",34000);
		EmployeeDeSerialization readObject = new EmployeeDeSerialization();
		 Employee employee1= (Employee) readObject.doDeSerialization("employee.ser");
		assertTrue(employee.equals(employee1));
	}
	
}
