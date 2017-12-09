package com.nitin.spring.bean;

public class PersonFactory {

	public  Person createPerson(int id,String name) {
		System.out.println("Bean Creation using Factory Beans");
		return new Person(id,name);
	}
}
