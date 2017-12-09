package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitin.spring.bean.SingletonClass;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
	/*	// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "SpringBeans.xml");
//As this is singleton it will change the value also
		Person obj = (Person) context.getBean("person");
		Person obj2 = (Person) context.getBean("person");
		obj.setTaxId(231);
		obj.speak();
		Address address=(Address)context.getBean("address");
		
		System.out.println(obj);
		System.out.println(obj2);*/
		
		SingletonClass s1=(SingletonClass)context.getBean("singleton");
		System.out.println(s1);
		SingletonClass s2=(SingletonClass)context.getBean("singleton");
		System.out.println(s2);
		((ClassPathXmlApplicationContext) context).close();

	}
}
