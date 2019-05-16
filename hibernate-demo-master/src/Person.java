package com.capgemini.hibernate.model;

import javax.persistence.*;

@Entity
public class Person{
	@Id
	int personId;
	String personName;

	public Person(int pid, String pname){
		personId= pid ;
		personName= pname ;
	}
	
	public Person(){};

}