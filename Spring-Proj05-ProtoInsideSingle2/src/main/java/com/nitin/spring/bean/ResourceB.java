package com.nitin.spring.bean;

public class ResourceB {

String url="https://localhost:8081";
	
	public ResourceB() {
		System.out.println("ResourceB instance is created");
	}
	
	public String getURL() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url=url;
	}
}
