package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nitin.spring.bean.FruitBasket;
import com.nitin.spring.bean.Jungle;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nitin/spring/beans.xml");// "src/main/resources/SpringBeans.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "SpringBeans.xml");
		
		FruitBasket basket=(FruitBasket)context.getBean("basket");
		System.out.println(basket);
		Jungle jungle =(Jungle)context.getBean("jungle");
		System.out.println(jungle);
		
		
		((ClassPathXmlApplicationContext) context).close();

	}
}
