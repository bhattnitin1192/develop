package com.nitin.spring.bean;

public abstract class RequestProcessor {

	private ResourceB resourceB;
	
	
	
	public ResourceB getResourceB() {
		return resourceB;
	}



	public void setResourceB(ResourceB resourceB) {
		this.resourceB = resourceB;
	}



	public abstract ResourceA getResourceA();
}
