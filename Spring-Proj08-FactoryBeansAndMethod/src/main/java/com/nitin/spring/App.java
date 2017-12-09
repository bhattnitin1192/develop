package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitin.spring.bean.Address;
import com.nitin.spring.bean.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "SpringBeans.xml");
//As this is singleton it will change the value also
	//	Person obj = (Person) context.getBean("person");
		//obj.setTaxId(231);
		//obj.speak();
	//	Address address=(Address)context.getBean("address");
		
		//System.out.println(obj);
		//System.out.println(obj);
		((ClassPathXmlApplicationContext) context).close();

	}
}
