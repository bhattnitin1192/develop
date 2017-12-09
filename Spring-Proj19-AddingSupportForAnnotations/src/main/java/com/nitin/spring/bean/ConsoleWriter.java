package com.nitin.spring.bean;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Console Writer "+text);
	}

}
