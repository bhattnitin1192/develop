package com.nitin.spring.bean;

import java.util.List;

public class FruitBasket {

	private String name;
	
	private List<String> fruits;
	
	
	public FruitBasket(String name,List<String> fruits)
	{
		this.name=name;
		this.fruits=fruits;
	}
	
	public String toString() {
		
		StringBuilder str=new StringBuilder();
		str.append(name);
		str.append("contains : \n");
		
		for(String fruit : fruits) {
			str.append(fruit);
			str.append("\n");
		}
		return str.toString();
		
	}
}
