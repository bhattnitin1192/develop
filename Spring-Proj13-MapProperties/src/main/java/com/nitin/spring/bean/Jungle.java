package com.nitin.spring.bean;

import java.util.HashMap;
import java.util.Map;

public class Jungle {

	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();

	
	
	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	public void setFoods(Map<String,String> foods) {
		this.foods=foods;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();

		for(Map.Entry<String,String> entry : foods.entrySet()) {
			str.append(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		
		str.append("\n");
		
		for(Map.Entry<String,Animal> entry : animals.entrySet()) {
			str.append(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		
		return str.toString();
	}
}
