package com.capgemini.persondemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.persondemo.dao.PersonDao;
import com.capgemini.persondemo.entity.Person;

@Service
public class PersonServiceImp implements PersonService {
	
	@Autowired
	PersonDao dao;
	
	
	
	public Person addPersonDetails() {
		Person person = new Person(101,"mahi");
		dao.save(person);
		return person;
	}


	@Override
	public Person getPersonById() {
		Person person = dao.findById(101).get();
		return person;
	}
	
	
}
