package com.nitin.spring.bean;

public class ResourceA {

	String url="https://localhost:8080";
	
	public ResourceA() {
		System.out.println("ResourceA instance is created");
	}
	
	public String getURL() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url=url;
	}
}
