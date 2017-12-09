package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitin.spring.bean.Logger;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "SpringBeans.xml");
		
		Logger logger =(Logger)context.getBean("logger");
		System.out.println(logger);
		
		logger.writeConsole("Hello Nitin Console");
		logger.writeFile("Hello Nitin File");
		
		
		((ClassPathXmlApplicationContext) context).close();

	}
}
