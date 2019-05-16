package com.capgemini.hibernate.test;

import com.capgemini.hibernate.dao.*;
import com.capgemini.hibernate.dao.imp.*;
import com.capgemini.hibernate.model.*;

public class Main{
	public static void main(String args[]){
		PersonDao personDao= new PersonDaoImp();
		personDao.addPerson(new Person(106,"mehvash"));
		System.out.println("heyyyaa....");
	}
}