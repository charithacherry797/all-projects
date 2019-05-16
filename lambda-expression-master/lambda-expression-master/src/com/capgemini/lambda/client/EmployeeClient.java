package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String[] args) {

//		Comparator<Employee> c = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
//				return Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
//			}
//		};
		
//		Comparator<Employee> c=(e1,e2) -> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());

		
		Comparator<Employee> c2=(e1,e2) -> {
			int result= Double.compare(e1.getEmployeeSalary(), e2.getEmployeeSalary());
			if(result==0) {
				result= Integer.compare(e1.getEmployeeId(), e2.getEmployeeId());
			}
			return result;
		};
			
		
//		TreeSet<Employee> employees = new TreeSet<>((e1,e2) -> Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()));
		TreeSet<Employee> employees = new TreeSet<>(c2);
		employees.add(new Employee(101, "Alex", "HR", 34000));
		employees.add(new Employee(56, "Grant", "HR", 120000));
		employees.add(new Employee(88, "Bob", "Admin", 56000));
		employees.add(new Employee(12, "Tylor", "HR", 12000));
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
}
