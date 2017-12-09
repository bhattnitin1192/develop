package com.nitin.spring.bean;

import java.util.List;

public class Jungle {

	private Animal largest;
	private List<Animal> animals;
	public Animal getLargest() {
		return largest;
	}
	public void setLargest(Animal largest) {
		this.largest = largest;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	public String toString() {
		StringBuilder str=new StringBuilder();
		
		str.append("Largest : "+largest);
		str.append("\n");
		str.append("Others: \n");
		
		for(Animal animal : animals) {
			str.append(animal);
			str.append("\n");
		}
		
		return str.toString();
	}
}
