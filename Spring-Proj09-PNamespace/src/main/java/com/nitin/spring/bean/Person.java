package com.nitin.spring.bean;

public class Person {

	private int id;
	private String name;
	private int taxId;
	private Address address;

	public Person() {
		
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//if it is default facotry ethod we have to remove the contructor args from beans.xml
//else we can pass the arguents in the ethod itself
	//public static Person getInstance() {
	public static Person getInstance(int id,String name) {
	System.out.println("Creating object from Factory Methods");
		return new Person(id,name);
	}
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Spring 3 ! Hello " + name);
	}

	public void onCreate() {
	System.out.println("Person is created "+this);	
	}
	

	public void onDestroy() {
	System.out.println("Person is Distroyed ");	
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

}
