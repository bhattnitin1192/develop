package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitin.spring.bean.RequestProcessor;
import com.nitin.spring.bean.ResourceB;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
	RequestProcessor processor=null;
	for(int i=0;i<3;i++) {
		 processor=(RequestProcessor)context.getBean("RequestProcessor");
		 processor.getResourceB();
	}
		
	for(int i=0;i<3;i++) {
		ResourceB b=processor.getResourceB();
		System.out.println(b.getURL());
		
	}
		
	
	
	}
}
