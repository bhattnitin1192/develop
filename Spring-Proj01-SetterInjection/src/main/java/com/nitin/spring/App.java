package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nitin.spring.bean.Person;



public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "SpringBeans.xml");

		Person obj = (Person) context.getBean("person");
		obj.speak();
		System.out.println(obj);
		((ClassPathXmlApplicationContext) context).close();

	}
}
