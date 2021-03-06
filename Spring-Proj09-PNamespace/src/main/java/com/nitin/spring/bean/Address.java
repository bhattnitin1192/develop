package com.nitin.spring.bean;

public class Address {

	private String street;
	private String postcode;

	public Address() {
		
	}
	
	
	
	public String getStreet() {
		return street;
	}



	public void setStreet(String street) {
		this.street = street;
	}



	public String getPostcode() {
		return postcode;
	}



	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}



	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	
	public void init() {
		System.out.println("default init method");
	}
	
	public void destroy() {
		System.out.println("default destroy method");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

}
