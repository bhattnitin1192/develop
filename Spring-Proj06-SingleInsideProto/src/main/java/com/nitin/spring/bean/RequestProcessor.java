package com.nitin.spring.bean;

public  class RequestProcessor {

	private ResourceB resourceB;
	
	public RequestProcessor() {
		System.out.println("Request processor instance is created");
	}
	
	
	public ResourceB getResourceB() {
		System.out.println("ResourceB");
		return resourceB;
	}



	public void setResourceB(ResourceB resourceB) {
		this.resourceB = resourceB;
	}



}
