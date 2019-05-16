package com.capgemini.persondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.persondemo.entity.Person;
import com.capgemini.persondemo.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	PersonService service;
	
	Person person;
	
	@RequestMapping("/add")
	public Person addPerson() {	
	person=service.addPersonDetails();
		return person;
	}
	
	@RequestMapping("/findPerson")
	public Person findPerson() {
		person= service.getPersonById();
		return person;
	}
}
