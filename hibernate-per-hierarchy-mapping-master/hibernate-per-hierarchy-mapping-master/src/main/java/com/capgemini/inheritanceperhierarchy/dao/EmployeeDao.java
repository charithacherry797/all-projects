package com.capgemini.inheritanceperhierarchy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.inheritanceperhierarchy.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
