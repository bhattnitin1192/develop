package com.nitin.spring.bean;

import java.util.HashMap;
import java.util.Map;

public class Jungle {

	private Map<String, String> foods = new HashMap<String, String>();

	public void setFoods(Map<String,String> foods) {
		this.foods=foods;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();

		for(Map.Entry<String,String> entry : foods.entrySet()) {
			str.append(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		return str.toString();
	}
}
