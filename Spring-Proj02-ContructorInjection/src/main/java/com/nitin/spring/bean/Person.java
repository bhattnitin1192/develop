package com.nitin.spring.bean;

public class Person {

	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void speak() {
		System.out.println("Spring 3 ! Hello " + name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
}
