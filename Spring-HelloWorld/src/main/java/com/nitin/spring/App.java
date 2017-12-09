package com.nitin.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nitin.spring.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new FileSystemXmlApplicationContext("SpringBeans.xml");//"src/main/resources/SpringBeans.xml");
    	//ApplicationContext context = new ClassPathXmlApplicationContext(
			//	"SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();    }
}
